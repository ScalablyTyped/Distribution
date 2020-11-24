package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.anon.Args
import typings.typeorm.anon.SkipNulls
import typings.typeorm.browserMod.SelectQueryBuilder
import typings.typeorm.checkMetadataMod.CheckMetadata
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.embeddedMetadataMod.EmbeddedMetadata
import typings.typeorm.entityListenerMetadataMod.EntityListenerMetadata
import typings.typeorm.exclusionMetadataMod.ExclusionMetadata
import typings.typeorm.foreignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.indexMetadataMod.IndexMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.orderByConditionMod.OrderByCondition
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.relationCountMetadataMod.RelationCountMetadata
import typings.typeorm.relationIdMetadataMod.RelationIdMetadata
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.tableMetadataArgsMod.TableMetadataArgs
import typings.typeorm.tableTypesMod.TableType
import typings.typeorm.treeTypesMod.TreeType
import typings.typeorm.typeormStrings.STI
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata/EntityMetadata", JSImport.Namespace)
@js.native
object entityMetadataMod extends js.Object {
  
  @js.native
  class EntityMetadata protected () extends js.Object {
    def this(options: Args) = this()
    
    /**
      * Listener metadatas with "AFTER INSERT" type.
      */
    var afterInsertListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Listener metadatas with "AFTER LOAD" type.
      */
    var afterLoadListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Listener metadatas with "AFTER REMOVE" type.
      */
    var afterRemoveListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Listener metadatas with "AFTER UPDATE" type.
      */
    var afterUpdateListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * All embeddeds - embeddeds from this entity metadata and from all child embeddeds, etc.
      */
    var allEmbeddeds: js.Array[EmbeddedMetadata] = js.native
    
    /**
      * Ancestor columns used only in closure junction tables.
      */
    var ancestorColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Listener metadatas with "AFTER INSERT" type.
      */
    var beforeInsertListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Listener metadatas with "AFTER REMOVE" type.
      */
    var beforeRemoveListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Listener metadatas with "AFTER UPDATE" type.
      */
    var beforeUpdateListeners: js.Array[EntityListenerMetadata] = js.native
    
    def build(): Unit = js.native
    
    /**
      * Builds table path using schema name and database name.
      */
    /* protected */ def buildSchemaPath(): js.UndefOr[String] = js.native
    
    /**
      * Builds table path using database name, schema name and table name.
      */
    /* protected */ def buildTablePath(): String = js.native
    
    /**
      * Entity's check metadatas.
      */
    var checks: js.Array[CheckMetadata] = js.native
    
    /**
      * Children entity metadatas. Used in inheritance patterns.
      */
    var childEntityMetadatas: js.Array[EntityMetadata] = js.native
    
    /**
      * If entity's table is a closure-typed table, then this entity will have a closure junction table metadata.
      */
    var closureJunctionTable: EntityMetadata = js.native
    
    /**
      * Columns of the entity, including columns that are coming from the embeddeds of this entity.
      */
    var columns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Compares two different entities by their ids.
      * Returns true if they match, false otherwise.
      */
    def compareEntities(firstEntity: ObjectLiteral, secondEntity: ObjectLiteral): Boolean = js.native
    
    /**
      * Connection where this entity metadata is created.
      */
    var connection: Connection = js.native
    
    /**
      * Creates a new entity.
      */
    def create(): js.Any = js.native
    def create(queryRunner: QueryRunner): js.Any = js.native
    
    /**
      * Gets entity column which contains a create date value.
      */
    var createDateColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Creates a special object - all columns and relations of the object (plus columns and relations from embeds)
      * in a special format - { propertyName: propertyName }.
      *
      * example: Post{ id: number, name: string, counterEmbed: { count: number }, category: Category }.
      * This method will create following object:
      * { id: "id", counterEmbed: { count: "counterEmbed.count" }, category: "category" }
      */
    def createPropertiesMap(): StringDictionary[String | js.Any] = js.native
    
    /**
      * Database name.
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Gets entity column which contains a delete date value.
      */
    var deleteDateColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Descendant columns used only in closure junction tables.
      */
    var descendantColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets the discriminator column used to store entity identificator in single-table inheritance tables.
      */
    var discriminatorColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * If this entity metadata is a child table of some table, it should have a discriminator value.
      * Used to store a value in a discriminator column.
      */
    var discriminatorValue: js.UndefOr[String] = js.native
    
    /**
      * List of eager relations this metadata has.
      */
    var eagerRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Entity's embedded metadatas.
      */
    var embeddeds: js.Array[EmbeddedMetadata] = js.native
    
    /**
      * Table's database engine type (like "InnoDB", "MyISAM", etc).
      */
    var engine: js.UndefOr[String] = js.native
    
    /**
      * Ensures that given object is an entity id map.
      * If given id is an object then it means its already id map.
      * If given id isn't an object then it means its a value of the id column
      * and it creates a new id map with this value and name of the primary column.
      */
    def ensureEntityIdMap(id: js.Any): ObjectLiteral = js.native
    
    /**
      * Entity's exclusion metadatas.
      */
    var exclusions: js.Array[ExclusionMetadata] = js.native
    
    /**
      * View's expression.
      * Used in views
      */
    var expression: js.UndefOr[String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])] = js.native
    
    /**
      * Iterates through entity and finds and extracts all values from relations in the entity.
      * If relation value is an array its being flattened.
      */
    def extractRelationValuesFromEntity(entity: ObjectLiteral, relations: js.Array[RelationMetadata]): js.Array[js.Tuple3[RelationMetadata, _, EntityMetadata]] = js.native
    
    /**
      * Finds column with a given database name.
      */
    def findColumnWithDatabaseName(databaseName: String): js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Finds column with a given property name.
      */
    def findColumnWithPropertyName(propertyName: String): js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Finds column with a given property path.
      */
    def findColumnWithPropertyPath(propertyPath: String): js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Finds columns with a given property path.
      * Property path can match a relation, and relations can contain multiple columns.
      */
    def findColumnsWithPropertyPath(propertyPath: String): js.Array[ColumnMetadata] = js.native
    
    /**
      * Finds embedded with a given property path.
      */
    def findEmbeddedWithPropertyPath(propertyPath: String): js.UndefOr[EmbeddedMetadata] = js.native
    
    /**
      * Finds relation with the given property path.
      */
    def findRelationWithPropertyPath(propertyPath: String): js.UndefOr[RelationMetadata] = js.native
    
    /**
      * Entity's foreign key metadatas.
      */
    var foreignKeys: js.Array[ForeignKeyMetadata] = js.native
    
    /**
      * Gets the column with generated flag.
      */
    var generatedColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets primary keys of the entity and returns them in a literal object.
      * For example, for Post{ id: 1, title: "hello" } where id is primary it will return { id: 1 }
      * For multiple primary keys it returns multiple keys in object.
      * For primary keys inside embeds it returns complex object literal with keys in them.
      */
    def getEntityIdMap(): js.UndefOr[ObjectLiteral] = js.native
    def getEntityIdMap(entity: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Creates a "mixed id map".
      * If entity has multiple primary keys (ids) then it will return just regular id map, like what getEntityIdMap returns.
      * But if entity has a single primary key then it will return just value of the id column of the entity, just value.
      * This is called mixed id map.
      */
    def getEntityIdMixedMap(): js.UndefOr[ObjectLiteral] = js.native
    def getEntityIdMixedMap(entity: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    var getInverseEntityMetadata: js.Any = js.native
    
    /**
      * Original user-given table name (taken from schema or @Entity(tableName) decorator).
      * If user haven't specified a table name this property will be undefined.
      */
    var givenTableName: js.UndefOr[String] = js.native
    
    /**
      * Checks if given entity / object contains ALL primary keys entity must have.
      * Returns true if it contains all of them, false if at least one of them is not defined.
      */
    def hasAllPrimaryKeys(entity: ObjectLiteral): Boolean = js.native
    
    /**
      * Checks if there is an embedded with a given property path.
      */
    def hasEmbeddedWithPropertyPath(propertyPath: String): Boolean = js.native
    
    /**
      * Checks if given entity has an id.
      */
    def hasId(entity: ObjectLiteral): Boolean = js.native
    
    /**
      * Checks if entity's table has multiple primary columns.
      */
    var hasMultiplePrimaryKeys: Boolean = js.native
    
    /**
      * Checks if there any non-nullable column exist in this entity.
      */
    var hasNonNullableRelations: Boolean = js.native
    
    /**
      * Indicates if this entity metadata has uuid generated columns.
      */
    var hasUUIDGeneratedColumns: Boolean = js.native
    
    /**
      * Entity's index metadatas.
      */
    var indices: js.Array[IndexMetadata] = js.native
    
    /**
      * If this entity metadata's table using one of the inheritance patterns,
      * then this will contain what pattern it uses.
      */
    var inheritancePattern: js.UndefOr[STI] = js.native
    
    /**
      * All "inheritance tree" from a target entity.
      * For example for target Post < ContentModel < Unit it will be an array of [Post, ContentModel, Unit].
      * It also contains child entities for single table inheritance.
      */
    var inheritanceTree: js.Array[js.Function] = js.native
    
    /**
      * In the case if this entity metadata is junction table's entity metadata,
      * this will contain all referenced columns of inverse entity.
      */
    var inverseColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Checks if this table is a junction table of the closure table.
      * This type is for tables that contain junction metadata of the closure tables.
      */
    var isClosureJunction: Boolean = js.native
    
    /**
      * Indicates if this entity metadata of a junction table, or not.
      * Junction table is a table created by many-to-many relationship.
      *
      * Its also possible to understand if entity is junction via tableType.
      */
    var isJunction: Boolean = js.native
    
    /**
      * List of eager relations this metadata has.
      */
    var lazyRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Entity listener metadatas.
      */
    var listeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Gets only many-to-many relations of the entity.
      */
    var manyToManyRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Gets only many-to-one relations of the entity.
      */
    var manyToOneRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Materialized path column.
      * Used only in tree entities with materialized path pattern applied.
      */
    var materializedPathColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Entity's name.
      * Equal to entity target class's name if target is set to table.
      * If target class is not then then it equals to table name.
      */
    var name: String = js.native
    
    /**
      * Nested set's left value column.
      * Used only in tree entities with nested set pattern applied.
      */
    var nestedSetLeftColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Nested set's right value column.
      * Used only in tree entities with nested set pattern applied.
      */
    var nestedSetRightColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * All columns except for virtual columns.
      */
    var nonVirtualColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets the object id column used with mongodb database.
      */
    var objectIdColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Gets only one-to-many relations of the entity.
      */
    var oneToManyRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Gets only one-to-one relations of the entity.
      */
    var oneToOneRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Specifies a default order by used for queries from this table when no explicit order by is specified.
      */
    var orderBy: js.UndefOr[OrderByCondition] = js.native
    
    /**
      * Entity's column metadatas defined by user.
      */
    var ownColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Entity's own indices.
      */
    var ownIndices: js.Array[IndexMetadata] = js.native
    
    /**
      * Entity's own listener metadatas.
      */
    var ownListeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Entity's relation metadatas.
      */
    var ownRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Entity's own uniques.
      */
    var ownUniques: js.Array[UniqueMetadata] = js.native
    
    /**
      * In the case if this entity metadata is junction table's entity metadata,
      * this will contain all referenced columns of owner entity.
      */
    var ownerColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets only owner many-to-many relations of the entity.
      */
    var ownerManyToManyRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Gets only owner one-to-one relations of the entity.
      */
    var ownerOneToOneRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * If this is entity metadata for a junction closure table then its owner closure table metadata will be set here.
      */
    var parentClosureEntityMetadata: EntityMetadata = js.native
    
    /**
      * Parent's entity metadata. Used in inheritance patterns.
      */
    var parentEntityMetadata: EntityMetadata = js.native
    
    /**
      * Gets the primary columns.
      */
    var primaryColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Map of columns and relations of the entity.
      *
      * example: Post{ id: number, name: string, counterEmbed: { count: number }, category: Category }.
      * This method will create following object:
      * { id: "id", counterEmbed: { count: "counterEmbed.count" }, category: "category" }
      */
    var propertiesMap: ObjectLiteral = js.native
    
    /**
      * Registers a new column in the entity and recomputes all depend properties.
      */
    def registerColumn(column: ColumnMetadata): Unit = js.native
    
    /**
      * Entity's relation id metadatas.
      */
    var relationCounts: js.Array[RelationCountMetadata] = js.native
    
    /**
      * Entity's relation id metadatas.
      */
    var relationIds: js.Array[RelationIdMetadata] = js.native
    
    /**
      * Relations of the entity, including relations that are coming from the embeddeds of this entity.
      */
    var relations: js.Array[RelationMetadata] = js.native
    
    /**
      * Gets only owner one-to-one and many-to-one relations.
      */
    var relationsWithJoinColumns: js.Array[RelationMetadata] = js.native
    
    /**
      * Schema name. Used in Postgres and Sql Server.
      */
    var schema: js.UndefOr[String] = js.native
    
    /**
      * Entity schema path. Contains database name and schema name.
      * E.g. myDB.mySchema
      */
    var schemaPath: js.UndefOr[String] = js.native
    
    /**
      * Indicates if schema will be synchronized for this entity or not.
      */
    var synchronize: Boolean = js.native
    
    /**
      * Metadata arguments used to build this entity metadata.
      */
    var tableMetadataArgs: TableMetadataArgs = js.native
    
    /**
      * Entity table name in the database.
      * This is final table name of the entity.
      * This name already passed naming strategy, and generated based on
      * multiple criteria, including user table name and global table prefix.
      */
    var tableName: String = js.native
    
    /**
      * Gets the table name without global table prefix.
      * When querying table you need a table name with prefix, but in some scenarios,
      * for example when you want to name a junction table that contains names of two other tables,
      * you may want a table name without prefix.
      */
    var tableNameWithoutPrefix: String = js.native
    
    /**
      * Entity table path. Contains database name, schema name and table name.
      * E.g. myDB.mySchema.myTable
      */
    var tablePath: String = js.native
    
    /**
      * Table type. Tables can be abstract, closure, junction, embedded, etc.
      */
    var tableType: TableType = js.native
    
    /**
      * Target class to which this entity metadata is bind.
      * Note, that when using table inheritance patterns target can be different rather then table's target.
      * For virtual tables which lack of real entity (like junction tables) target is equal to their table name.
      */
    var target: js.Function | String = js.native
    
    /**
      * Gets the name of the target.
      */
    var targetName: String = js.native
    
    /**
      * Tree children relation. Used only in tree-tables.
      */
    var treeChildrenRelation: js.UndefOr[RelationMetadata] = js.native
    
    /**
      * Special column that stores tree level in tree entities.
      */
    var treeLevelColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Tree parent relation. Used only in tree-tables.
      */
    var treeParentRelation: js.UndefOr[RelationMetadata] = js.native
    
    /**
      * Indicates if this entity is a tree, what type of tree it is.
      */
    var treeType: js.UndefOr[TreeType] = js.native
    
    /**
      * Entity's unique metadatas.
      */
    var uniques: js.Array[UniqueMetadata] = js.native
    
    /**
      * Gets entity column which contains an update date value.
      */
    var updateDateColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Gets entity column which contains an entity version.
      */
    var versionColumn: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Enables Sqlite "WITHOUT ROWID" modifier for the "CREATE TABLE" statement
      */
    var withoutRowid: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  @js.native
  object EntityMetadata extends js.Object {
    
    /**
      * Creates a property paths for a given entity.
      */
    def createPropertyPath(metadata: EntityMetadata, entity: ObjectLiteral): js.Array[String] = js.native
    def createPropertyPath(metadata: EntityMetadata, entity: ObjectLiteral, prefix: String): js.Array[String] = js.native
    
    /**
      * Finds difference between two entity id maps.
      * Returns items that exist in the first array and absent in the second array.
      */
    def difference(firstIdMaps: js.Array[ObjectLiteral], secondIdMaps: js.Array[ObjectLiteral]): js.Array[ObjectLiteral] = js.native
    
    /**
      * Creates value map from the given values and columns.
      * Examples of usages are primary columns map and join columns map.
      */
    def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata]): js.UndefOr[ObjectLiteral] = js.native
    def getValueMap(entity: ObjectLiteral, columns: js.Array[ColumnMetadata], options: SkipNulls): js.UndefOr[ObjectLiteral] = js.native
  }
}
