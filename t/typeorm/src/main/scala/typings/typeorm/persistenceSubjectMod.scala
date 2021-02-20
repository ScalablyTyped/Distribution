package typings.typeorm

import typings.typeorm.anon.CanBeRecovered
import typings.typeorm.anon.Value
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.persistenceSubjectChangeMapMod.SubjectChangeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistenceSubjectMod {
  
  @JSImport("typeorm/persistence/Subject", "Subject")
  @js.native
  class Subject protected () extends StObject {
    def this(options: CanBeRecovered) = this()
    
    /**
      * Indicates if this subject can be inserted into the database.
      * This means that this subject either is newly persisted, either can be inserted by cascades.
      */
    var canBeInserted: Boolean = js.native
    
    /**
      * Indicates if this subject can be recovered from the database.
      * This means that this subject either was recovered, either was recovered by cascades.
      */
    var canBeRecovered: Boolean = js.native
    
    /**
      * Indicates if this subject can be soft-removed from the database.
      * This means that this subject either was soft-removed, either was soft-removed by cascades.
      */
    var canBeSoftRemoved: Boolean = js.native
    
    /**
      * Indicates if this subject can be updated in the database.
      * This means that this subject either was persisted, either can be updated by cascades.
      */
    var canBeUpdated: Boolean = js.native
    
    /**
      * Changes needs to be applied in the database for the given subject.
      */
    var changeMaps: js.Array[SubjectChangeMap] = js.native
    
    /**
      * Creates a value set needs to be inserted / updated in the database.
      * Value set is based on the entity and change maps of the subject.
      * Important note: this method pops data from this subject's change maps.
      */
    def createValueSetAndPopChangeMap(): ObjectLiteral = js.native
    
    /**
      * Database entity.
      * THIS IS NOT RAW ENTITY DATA, its a real entity.
      */
    var databaseEntity: js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Indicates if database entity was loaded.
      * No matter if it was found or not, it indicates the fact of loading.
      */
    var databaseEntityLoaded: Boolean = js.native
    
    /**
      * List of updated columns
      */
    var diffColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * List of updated relations
      */
    var diffRelations: js.Array[RelationMetadata] = js.native
    
    /**
      * Gets entity sent to the persistence (e.g. changed entity).
      * If entity is not set then this subject is created only for the entity loaded from the database,
      * or this subject is used for the junction operation (junction operations are relying only on identifier).
      */
    var entity: js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Copy of entity but with relational ids fulfilled.
      */
    var entityWithFulfilledIds: js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Generated values returned by a database (for example generated id or default values).
      * Used in insert and update operations.
      * Has entity-like structure (not just column database name and values).
      */
    var generatedMap: js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Subject identifier.
      * This identifier is not limited to table entity primary columns.
      * This can be entity id or ids as well as some unique entity properties, like name or title.
      * Insert / Update / Remove operation will be executed by a given identifier.
      */
    var identifier: js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Inserted values with updated values of special and default columns.
      * Has entity-like structure (not just column database name and values).
      */
    var insertedValueSet: js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Entity metadata of the subject entity.
      */
    var metadata: EntityMetadata = js.native
    
    /**
      * Checks if this subject must be inserted into the database.
      * Subject can be inserted into the database if it is allowed to be inserted (explicitly persisted or by cascades)
      * and if it does not have database entity set.
      */
    val mustBeInserted: Boolean = js.native
    
    /**
      * Checks if this subject must be recovered into the database.
      * Subject can be updated in the database if it is allowed to be recovered (explicitly persisted or by cascades)
      * and if it does have differentiated columns or relations.
      */
    val mustBeRecovered: js.UndefOr[Boolean | ObjectLiteral] = js.native
    
    /**
      * Indicates if this subject MUST be removed from the database.
      * This means that this subject either was removed, either was removed by cascades.
      */
    var mustBeRemoved: Boolean = js.native
    
    /**
      * Checks if this subject must be soft-removed into the database.
      * Subject can be updated in the database if it is allowed to be soft-removed (explicitly persisted or by cascades)
      * and if it does have differentiated columns or relations.
      */
    val mustBeSoftRemoved: js.UndefOr[Boolean | ObjectLiteral] = js.native
    
    /**
      * Checks if this subject must be updated into the database.
      * Subject can be updated in the database if it is allowed to be updated (explicitly persisted or by cascades)
      * and if it does have differentiated columns or relations.
      */
    val mustBeUpdated: js.UndefOr[Boolean] = js.native
    
    /**
      * If subject was created by cascades this property will contain subject
      * from where this subject was created.
      */
    var parentSubject: js.UndefOr[Subject] = js.native
    
    /**
      * Recomputes entityWithFulfilledIds and identifier when entity changes.
      */
    def recompute(): Unit = js.native
    
    /**
      * Relations updated by the change maps.
      */
    var updatedRelationMaps: js.Array[Value] = js.native
  }
}
