package typings.typeorm

import typings.typeorm.anon.Left
import typings.typeorm.tableMod.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/naming-strategy/NamingStrategyInterface", JSImport.Namespace)
@js.native
object namingStrategyInterfaceMod extends js.Object {
  
  @js.native
  trait NamingStrategyInterface extends js.Object {
    
    def checkConstraintName(tableOrName: String, expression: String): String = js.native
    /**
      * Gets the name of the check constraint.
      */
    def checkConstraintName(tableOrName: Table, expression: String): String = js.native
    
    /**
      * Creates a table name for a junction table of a closure table.
      *
      * @param originalClosureTableName Name of the closure table which owns this junction table.
      */
    def closureJunctionTableName(originalClosureTableName: String): String = js.native
    
    def columnName(propertyName: String, customName: js.UndefOr[scala.Nothing], embeddedPrefixes: js.Array[String]): String = js.native
    /**
      * Gets the table's column name from the given property name.
      */
    def columnName(propertyName: String, customName: String, embeddedPrefixes: js.Array[String]): String = js.native
    
    def defaultConstraintName(tableOrName: String, columnName: String): String = js.native
    /**
      * Gets the table's default constraint name from the given table name and column name.
      */
    def defaultConstraintName(tableOrName: Table, columnName: String): String = js.native
    
    /**
      * Gets the name of the alias used for relation joins.
      */
    def eagerJoinRelationAlias(alias: String, propertyPath: String): String = js.native
    
    def exclusionConstraintName(tableOrName: String, expression: String): String = js.native
    /**
      * Gets the name of the exclusion constraint.
      */
    def exclusionConstraintName(tableOrName: Table, expression: String): String = js.native
    
    def foreignKeyName(tableOrName: String, columnNames: js.Array[String]): String = js.native
    def foreignKeyName(
      tableOrName: String,
      columnNames: js.Array[String],
      referencedTablePath: js.UndefOr[scala.Nothing],
      referencedColumnNames: js.Array[String]
    ): String = js.native
    def foreignKeyName(tableOrName: String, columnNames: js.Array[String], referencedTablePath: String): String = js.native
    def foreignKeyName(
      tableOrName: String,
      columnNames: js.Array[String],
      referencedTablePath: String,
      referencedColumnNames: js.Array[String]
    ): String = js.native
    /**
      * Gets the name of the foreign key.
      */
    def foreignKeyName(tableOrName: Table, columnNames: js.Array[String]): String = js.native
    def foreignKeyName(
      tableOrName: Table,
      columnNames: js.Array[String],
      referencedTablePath: js.UndefOr[scala.Nothing],
      referencedColumnNames: js.Array[String]
    ): String = js.native
    def foreignKeyName(tableOrName: Table, columnNames: js.Array[String], referencedTablePath: String): String = js.native
    def foreignKeyName(
      tableOrName: Table,
      columnNames: js.Array[String],
      referencedTablePath: String,
      referencedColumnNames: js.Array[String]
    ): String = js.native
    
    def indexName(tableOrName: String, columns: js.Array[String]): String = js.native
    def indexName(tableOrName: String, columns: js.Array[String], where: String): String = js.native
    /**
      * Gets the name of the index - simple and compose index.
      */
    def indexName(tableOrName: Table, columns: js.Array[String]): String = js.native
    def indexName(tableOrName: Table, columns: js.Array[String], where: String): String = js.native
    
    /**
      * Gets the name of the join column used in the one-to-one and many-to-one relations.
      */
    def joinColumnName(relationName: String, referencedColumnName: String): String = js.native
    
    /**
      * Columns in join tables can have duplicate names in case of self-referencing.
      * This method provide a resolution for such column names.
      */
    def joinTableColumnDuplicationPrefix(columnName: String, index: Double): String = js.native
    
    /**
      * Gets the name of the column used for columns in the junction tables.
      *
      * The reverse?:boolean parameter denotes if the joinTableColumnName is called for the junctionColumn (false)
      * or the inverseJunctionColumns (true)
      */
    def joinTableColumnName(tableName: String, propertyName: String): String = js.native
    def joinTableColumnName(tableName: String, propertyName: String, columnName: String): String = js.native
    
    /**
      * Gets the name of the column used for columns in the junction tables from the invers side of the relationship.
      */
    def joinTableInverseColumnName(tableName: String, propertyName: String): String = js.native
    def joinTableInverseColumnName(tableName: String, propertyName: String, columnName: String): String = js.native
    
    /**
      * Gets the name of the join table used in the many-to-many relations.
      */
    def joinTableName(
      firstTableName: String,
      secondTableName: String,
      firstPropertyName: String,
      secondPropertyName: String
    ): String = js.native
    
    /**
      * Column name for materialized paths.
      */
    var materializedPathColumnName: String = js.native
    
    /**
      * Naming strategy name.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Column names for nested sets.
      */
    var nestedSetColumnNames: Left = js.native
    
    /**
      * Adds globally set prefix to the table name.
      * This method is executed no matter if prefix was set or not.
      * Table name is either user's given table name, either name generated from entity target.
      * Note that table name comes here already normalized by #tableName method.
      */
    def prefixTableName(prefix: String, tableName: String): String = js.native
    
    def primaryKeyName(tableOrName: String, columnNames: js.Array[String]): String = js.native
    /**
      * Gets the table's primary key name from the given table name and column names.
      */
    def primaryKeyName(tableOrName: Table, columnNames: js.Array[String]): String = js.native
    
    def relationConstraintName(tableOrName: String, columnNames: js.Array[String]): String = js.native
    def relationConstraintName(tableOrName: String, columnNames: js.Array[String], where: String): String = js.native
    /**
      * Gets the relation constraint (UNIQUE or UNIQUE INDEX) name from the given table name, column names
      * and WHERE condition, if UNIQUE INDEX used.
      */
    def relationConstraintName(tableOrName: Table, columnNames: js.Array[String]): String = js.native
    def relationConstraintName(tableOrName: Table, columnNames: js.Array[String], where: String): String = js.native
    
    /**
      * Gets the table's relation name from the given property name.
      */
    def relationName(propertyName: String): String = js.native
    
    /**
      * Normalizes table name.
      *
      * @param targetName Name of the target entity that can be used to generate a table name.
      * @param userSpecifiedName For example if user specified a table name in a decorator, e.g. @Entity("name")
      */
    def tableName(targetName: String): String = js.native
    def tableName(targetName: String, userSpecifiedName: String): String = js.native
    
    def uniqueConstraintName(tableOrName: String, columnNames: js.Array[String]): String = js.native
    /**
      * Gets the table's unique constraint name from the given table name and column names.
      */
    def uniqueConstraintName(tableOrName: Table, columnNames: js.Array[String]): String = js.native
  }
}
