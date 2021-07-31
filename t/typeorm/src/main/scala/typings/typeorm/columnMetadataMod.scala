package typings.typeorm

import typings.typeorm.anon.ClosureType
import typings.typeorm.anon.SkipNulls
import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.connectionMod.Connection
import typings.typeorm.embeddedMetadataMod.EmbeddedMetadata
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.`object`
import typings.typeorm.typeormStrings.ancestor
import typings.typeorm.typeormStrings.descendant
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.string
import typings.typeorm.typeormStrings.uuid
import typings.typeorm.valueTransformerMod.ValueTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMetadataMod {
  
  @JSImport("typeorm/browser/metadata/ColumnMetadata", "ColumnMetadata")
  @js.native
  class ColumnMetadata protected () extends StObject {
    def this(options: ClosureType) = this()
    
    /**
      * Default database value.
      */
    var default: js.UndefOr[js.Any] = js.native
    
    /**
      * Generated column expression. Supports only in MySQL.
      */
    var asExpression: js.UndefOr[String] = js.native
    
    def build(connection: Connection): this.type = js.native
    
    /* protected */ def buildDatabaseName(connection: Connection): String = js.native
    
    /* protected */ def buildDatabasePath(): String = js.native
    
    /* protected */ def buildPropertyPath(): String = js.native
    
    /**
      * Defines column character set.
      */
    var charset: js.UndefOr[String] = js.native
    
    /**
      * Column type in the case if this column is in the closure table.
      * Column can be ancestor or descendant in the closure tables.
      */
    var closureType: js.UndefOr[ancestor | descendant] = js.native
    
    /**
      * Defines column collation.
      */
    var collation: js.UndefOr[String] = js.native
    
    /**
      * Column comment.
      * This feature is not supported by all databases.
      */
    var comment: String = js.native
    
    /**
      * Creates entity id map from the given entity ids array.
      */
    def createValueMap(value: js.Any): js.Any = js.native
    def createValueMap(value: js.Any, useDatabaseName: Boolean): js.Any = js.native
    
    /**
      * Complete column name in the database including its embedded prefixes.
      */
    var databaseName: String = js.native
    
    /**
      * Database name in the database without embedded prefixes applied.
      */
    var databaseNameWithoutPrefixes: String = js.native
    
    /**
      * Gets full path to this column database name (including column database name).
      * Full path is relevant when column is used in embeds (one or multiple nested).
      * For example it will return "counters.subcounters.likes".
      * If property is not in embeds then it returns just database name of the column.
      */
    var databasePath: String = js.native
    
    /**
      * Embedded metadata where this column metadata is.
      * If this column is not in embed then this property value is undefined.
      */
    var embeddedMetadata: js.UndefOr[EmbeddedMetadata] = js.native
    
    /**
      * Entity metadata where this column metadata is.
      *
      * For example for @Column() name: string in Post, entityMetadata will be metadata of Post entity.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Array of possible enumerated values.
      *
      * `postgres` and `mysql` store enum values as strings but we want to keep support
      * for numeric and heterogeneous based typescript enums, so we need (string|number)[]
      */
    var `enum`: js.UndefOr[js.Array[String | Double]] = js.native
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.native
    
    /**
      * Generated column type. Supports only in MySQL.
      */
    var generatedType: js.UndefOr[VIRTUAL | STORED] = js.native
    
    /**
      * Specifies generation strategy if this column will use auto increment.
      */
    var generationStrategy: js.UndefOr[uuid | increment | rowid] = js.native
    
    /**
      * Extracts column value from the given entity.
      * If column is in embedded (or recursive embedded) it extracts its value from there.
      */
    def getEntityValue(entity: ObjectLiteral): js.UndefOr[js.Any] = js.native
    def getEntityValue(entity: ObjectLiteral, transform: Boolean): js.UndefOr[js.Any] = js.native
    
    /**
      * Extracts column value and returns its column name with this value in a literal object.
      * If column is in embedded (or recursive embedded) it returns complex literal object.
      *
      * Examples what this method can return depend if this column is in embeds.
      * { id: 1 } or { title: "hello" }, { counters: { code: 1 } }, { data: { information: { counters: { code: 1 } } } }
      */
    def getEntityValueMap(entity: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    def getEntityValueMap(entity: ObjectLiteral, options: SkipNulls): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Database name set by entity metadata builder, not yet passed naming strategy process and without embedded prefixes.
      */
    var givenDatabaseName: js.UndefOr[String] = js.native
    
    /**
      * Return type of HSTORE column.
      * Returns value as string or as object.
      */
    var hstoreType: js.UndefOr[`object` | string] = js.native
    
    /**
      * Indicates if this column is an array.
      */
    var isArray: Boolean = js.native
    
    /**
      * Indicates if this column contains an entity creation date.
      */
    var isCreateDate: Boolean = js.native
    
    /**
      * Indicates if this column contains an entity delete date.
      */
    var isDeleteDate: Boolean = js.native
    
    /**
      * Indicates if column is discriminator. Discriminator columns are not mapped to the entity.
      */
    var isDiscriminator: Boolean = js.native
    
    /**
      * Indicates if this column is generated (auto increment or generated other way).
      */
    var isGenerated: Boolean = js.native
    
    /**
      * Indicates if column is inserted by default or not.
      */
    var isInsert: Boolean = js.native
    
    /**
      * Indicates if this column is materialized path's path column.
      * Used only in tree entities with materialized path type.
      */
    var isMaterializedPath: Boolean = js.native
    
    /**
      * Indicates if this column is nested set's left column.
      * Used only in tree entities with nested-set type.
      */
    var isNestedSetLeft: Boolean = js.native
    
    /**
      * Indicates if this column is nested set's right column.
      * Used only in tree entities with nested-set type.
      */
    var isNestedSetRight: Boolean = js.native
    
    /**
      * Indicates if column can contain nulls or not.
      */
    var isNullable: Boolean = js.native
    
    /**
      * Indicates if this column contains an object id.
      */
    var isObjectId: Boolean = js.native
    
    /**
      * Indicates if this column is a primary key.
      */
    var isPrimary: Boolean = js.native
    
    /**
      * Indicates if column is selected by query builder or not.
      */
    var isSelect: Boolean = js.native
    
    /**
      * Indicates if column is tree-level column. Tree-level columns are used in closure entities.
      */
    var isTreeLevel: Boolean = js.native
    
    /**
      * Indicates if column allows updates or not.
      */
    var isUpdate: Boolean = js.native
    
    /**
      * Indicates if this column contains an entity update date.
      */
    var isUpdateDate: Boolean = js.native
    
    /**
      * Indicates if this column contains an entity version.
      */
    var isVersion: Boolean = js.native
    
    /**
      * Indicates if column is virtual. Virtual columns are not mapped to the entity.
      */
    var isVirtual: Boolean = js.native
    
    /**
      * Type's length in the database.
      */
    var length: String = js.native
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.native
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column),
      * which is the maximum number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double | Null] = js.native
    
    /**
      * Same as property path, but dots are replaced with '_'.
      * Used in query builder statements.
      */
    var propertyAliasName: String = js.native
    
    /**
      * Class's property name on which this column is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Gets full path to this column property (including column property name).
      * Full path is relevant when column is used in embeds (one or multiple nested).
      * For example it will return "counters.subcounters.likes".
      * If property is not in embeds then it returns just property name of the column.
      */
    var propertyPath: String = js.native
    
    /**
      * If this column is foreign key then it references some other column,
      * and this property will contain reference to this column.
      */
    var referencedColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * If column is a foreign key of some relation then this relation's metadata will be there.
      * If this column does not have a foreign key then this property value is undefined.
      */
    var relationMetadata: js.UndefOr[RelationMetadata] = js.native
    
    /**
      * The scale for a decimal (exact numeric) column (applies only for decimal column),
      * which represents the number of digits to the right of the decimal point and must not be greater than precision.
      */
    var scale: js.UndefOr[Double] = js.native
    
    /**
      * Sets given entity's column value.
      * Using of this method helps to set entity relation's value of the lazy and non-lazy relations.
      */
    def setEntityValue(entity: ObjectLiteral, value: js.Any): Unit = js.native
    
    /**
      * Spatial Feature Type (Geometry, Point, Polygon, etc.)
      */
    var spatialFeatureType: js.UndefOr[String] = js.native
    
    /**
      * SRID (Spatial Reference ID (EPSG code))
      */
    var srid: js.UndefOr[Double] = js.native
    
    /**
      * Target class where column decorator is used.
      * This may not be always equal to entity metadata (for example embeds or inheritance cases).
      */
    var target: js.Function | String = js.native
    
    /**
      * Specifies a value transformer that is to be used to (un)marshal
      * this column when reading or writing to the database.
      */
    var transformer: js.UndefOr[ValueTransformer | js.Array[ValueTransformer]] = js.native
    
    /**
      * The database type of the column.
      */
    var `type`: ColumnType = js.native
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: Boolean = js.native
    
    /**
      * Type's display width in the database.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
      */
    var zerofill: Boolean = js.native
  }
}
