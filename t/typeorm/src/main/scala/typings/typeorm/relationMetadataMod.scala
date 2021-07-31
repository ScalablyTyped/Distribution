package typings.typeorm

import typings.typeorm.anon.ArgsEmbeddedMetadata
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.deferrableTypeMod.DeferrableType
import typings.typeorm.embeddedMetadataMod.EmbeddedMetadata
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.foreignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import typings.typeorm.propertyTypeInFunctionMod.PropertyTypeFactory
import typings.typeorm.relationTypesMod.RelationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationMetadataMod {
  
  @JSImport("typeorm/browser/metadata/RelationMetadata", "RelationMetadata")
  @js.native
  class RelationMetadata protected () extends StObject {
    def this(options: ArgsEmbeddedMetadata) = this()
    
    /**
      * Builds some depend relation metadata properties.
      * This builder method should be used only after embedded metadata tree was build.
      */
    def build(): Unit = js.native
    
    /**
      * Builds inverse side property path based on given inverse side property factory.
      * This builder method should be used only after properties map of the inverse entity metadata was build.
      */
    def buildInverseSidePropertyPath(): String = js.native
    
    /**
      * Builds relation's property path based on its embedded tree.
      */
    def buildPropertyPath(): String = js.native
    
    /**
      * Creates entity id map from the given entity ids array.
      */
    def createValueMap(value: js.Any): js.Any = js.native
    
    /**
      * What to do with a relation on update of the row containing a foreign key.
      */
    var deferrable: js.UndefOr[DeferrableType] = js.native
    
    /**
      * Embedded metadata where this relation is.
      * If this relation is not in embed then this property value is undefined.
      */
    var embeddedMetadata: js.UndefOr[EmbeddedMetadata] = js.native
    
    /**
      * Ensures that given object is an entity id map.
      * If given id is an object then it means its already id map.
      * If given id isn't an object then it means its a value of the id column
      * and it creates a new id map with this value and name of the primary column.
      */
    def ensureRelationIdMap(id: js.Any): ObjectLiteral = js.native
    
    /**
      * Entity metadata of the entity where this relation is placed.
      *
      * For example for @ManyToMany(type => Category) in Post, entityMetadata will be metadata of Post entity.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Foreign keys created for this relation.
      */
    var foreignKeys: js.Array[ForeignKeyMetadata] = js.native
    
    /**
      * Extracts column value from the given entity.
      * If column is in embedded (or recursive embedded) it extracts its value from there.
      */
    def getEntityValue(entity: ObjectLiteral): js.UndefOr[js.Any] = js.native
    def getEntityValue(entity: ObjectLiteral, getLazyRelationsPromiseValue: Boolean): js.UndefOr[js.Any] = js.native
    
    /**
      * Creates join column ids map from the given related entity ids array.
      */
    def getRelationIdMap(entity: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Inverse side of the relation set by user.
      *
      * Inverse side set in the relation can be either string - property name of the column on inverse side,
      * either can be a function that accepts a map of properties with the object and returns one of them.
      * Second approach is used to achieve type-safety.
      */
    var givenInverseSidePropertyFactory: PropertyTypeFactory[js.Any] = js.native
    
    /**
      * Entity metadata of the entity that is targeted by this relation.
      *
      * For example for @ManyToMany(type => Category) in Post, inverseEntityMetadata will be metadata of Category entity.
      */
    var inverseEntityMetadata: EntityMetadata = js.native
    
    /**
      * Inverse join table columns.
      * Inverse join columns are supported only for many-to-many relations
      * and can be obtained only from owner side of the relation.
      * From non-owner side of the relation join columns will be undefined.
      */
    var inverseJoinColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets the relation metadata of the inverse side of this relation.
      */
    var inverseRelation: js.UndefOr[RelationMetadata] = js.native
    
    /**
      * Gets the property path of the inverse side of the relation.
      */
    var inverseSidePropertyPath: String = js.native
    
    /**
      * If set to true then related objects are allowed to be inserted to the database.
      */
    var isCascadeInsert: Boolean = js.native
    
    /**
      * If set to true then related objects are allowed to be recovered from the database.
      */
    var isCascadeRecover: Boolean = js.native
    
    /**
      * If set to true then related objects are allowed to be remove from the database.
      */
    var isCascadeRemove: Boolean = js.native
    
    /**
      * If set to true then related objects are allowed to be soft-removed from the database.
      */
    var isCascadeSoftRemove: Boolean = js.native
    
    /**
      * If set to true then related objects are allowed to be updated in the database.
      */
    var isCascadeUpdate: Boolean = js.native
    
    /**
      * Indicates if this relation is eagerly loaded.
      */
    var isEager: Boolean = js.native
    
    /**
      * Indicates if this relation is lazily loaded.
      */
    var isLazy: Boolean = js.native
    
    /**
      * Checks if this relation's type is "many-to-many".
      */
    var isManyToMany: Boolean = js.native
    
    /**
      * Checks if this relation's type is "many-to-many", and is NOT owner side of the relationship.
      * Not owner side means this side of relation does not have a join table.
      */
    var isManyToManyNotOwner: Boolean = js.native
    
    /**
      * Checks if this relation's type is "many-to-many", and is owner side of the relationship.
      * Owner side means this side of relation has a join table.
      */
    var isManyToManyOwner: Boolean = js.native
    
    /**
      * Checks if this relation's type is "many-to-one".
      */
    var isManyToOne: Boolean = js.native
    
    /**
      * Indicates if relation column value can be nullable or not.
      */
    var isNullable: Boolean = js.native
    
    /**
      * Checks if this relation's type is "one-to-many".
      */
    var isOneToMany: Boolean = js.native
    
    /**
      * Checks if this relation's type is "one-to-one".
      */
    var isOneToOne: Boolean = js.native
    
    /**
      * Checks if this relation is NOT owner side of the "one-to-one" relation.
      * NOT owner side means this side of relation does not have a join column in the table.
      */
    var isOneToOneNotOwner: Boolean = js.native
    
    /**
      * Checks if this relation is owner side of the "one-to-one" relation.
      * Owner side means this side of relation has a join column in the table.
      */
    var isOneToOneOwner: Boolean = js.native
    
    /**
      * Indicates if this side is an owner of this relation.
      */
    var isOwning: Boolean = js.native
    
    /**
      * Indicates if this relation's column is a primary key.
      * Can be used only for many-to-one and owner one-to-one relations.
      */
    var isPrimary: Boolean = js.native
    
    /**
      * Indicates if this is a children (can be only one-to-many relation) relation in the tree tables.
      */
    var isTreeChildren: Boolean = js.native
    
    /**
      * Indicates if this is a parent (can be only many-to-one relation) relation in the tree tables.
      */
    var isTreeParent: Boolean = js.native
    
    /**
      * Checks if this relation has a join column (e.g. is it many-to-one or one-to-one owner side).
      */
    var isWithJoinColumn: Boolean = js.native
    
    /**
      * Join table columns.
      * Join columns can be obtained only from owner side of the relation.
      * From non-owner side of the relation join columns will be empty.
      * If this relation is a many-to-one/one-to-one then it takes join columns from the current entity.
      * If this relation is many-to-many then it takes all owner join columns from the junction entity.
      */
    var joinColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Join table name.
      */
    var joinTableName: String = js.native
    
    /**
      * Entity metadata of the junction table.
      * Junction tables have their own entity metadata objects.
      * Defined only for many-to-many relations.
      */
    var junctionEntityMetadata: js.UndefOr[EntityMetadata] = js.native
    
    /**
      * What to do with a relation on deletion of the row containing a foreign key.
      */
    var onDelete: js.UndefOr[OnDeleteType] = js.native
    
    /**
      * What to do with a relation on update of the row containing a foreign key.
      */
    var onUpdate: js.UndefOr[OnUpdateType] = js.native
    
    /**
      * Indicates if persistence is enabled for the relation.
      * By default its enabled, but if you want to avoid any changes in the relation to be reflected in the database you can disable it.
      * If its disabled you can only change a relation from inverse side of a relation or using relation query builder functionality.
      * This is useful for performance optimization since its disabling avoid multiple extra queries during entity save.
      */
    var persistenceEnabled: Boolean = js.native
    
    /**
      * Target's property name to which relation decorator is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Gets full path to this column property (including relation name).
      * Full path is relevant when column is used in embeds (one or multiple nested).
      * For example it will return "counters.subcounters.likes".
      * If property is not in embeds then it returns just property name of the column.
      */
    var propertyPath: String = js.native
    
    /**
      * Registers given foreign keys in the relation.
      * This builder method should be used to register foreign key in the relation.
      */
    def registerForeignKeys(foreignKeys: ForeignKeyMetadata*): Unit = js.native
    
    /**
      * Registers a given junction entity metadata.
      * This builder method can be called after junction entity metadata for the many-to-many relation was created.
      */
    def registerJunctionEntityMetadata(junctionEntityMetadata: EntityMetadata): Unit = js.native
    
    /**
      * Relation type, e.g. is it one-to-one, one-to-many, many-to-one or many-to-many.
      */
    var relationType: RelationType = js.native
    
    /**
      * Sets given entity's relation's value.
      * Using of this method helps to set entity relation's value of the lazy and non-lazy relations.
      *
      * If merge is set to true, it merges given value into currently
      */
    def setEntityValue(entity: ObjectLiteral, value: js.Any): Unit = js.native
    
    /**
      * Target entity to which this relation is applied.
      * Target IS NOT equal to entityMetadata.target, because relation
      *
      * For example for @ManyToMany(type => Category) in Post, target will be Post.
      * If @ManyToMany(type => Category) is in Counters which is embedded into Post, target will be Counters.
      * If @ManyToMany(type => Category) is in abstract class BaseUser which Post extends, target will be BaseUser.
      * Target can be string if its defined in entity schema instead of class.
      */
    var target: js.Function | String = js.native
    
    /**
      * Gets the property's type to which this relation is applied.
      *
      * For example for @ManyToMany(type => Category) in Post, target will be Category.
      */
    var `type`: js.Function | String = js.native
  }
}
