package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.subscriberBroadcasterResultMod.BroadcasterResult
import typings.typeorm.subscriberEntitySubscriberInterfaceMod.EntitySubscriberInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberBroadcasterMod {
  
  @JSImport("typeorm/subscriber/Broadcaster", "Broadcaster")
  @js.native
  class Broadcaster protected () extends StObject {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Broadcasts "AFTER_INSERT" event.
      * After insert event is executed after entity is being persisted to the database for the first time.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastAfterInsertEvent(result: BroadcasterResult, metadata: EntityMetadata): Unit = js.native
    def broadcastAfterInsertEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: ObjectLiteral): Unit = js.native
    
    /**
      * Broadcasts "AFTER_REMOVE" event.
      * After remove event is executed after entity is being removed from the database.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastAfterRemoveEvent(result: BroadcasterResult, metadata: EntityMetadata): Unit = js.native
    def broadcastAfterRemoveEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: Unit, databaseEntity: ObjectLiteral): Unit = js.native
    def broadcastAfterRemoveEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: ObjectLiteral): Unit = js.native
    def broadcastAfterRemoveEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral
    ): Unit = js.native
    
    /**
      * Broadcasts "AFTER_TRANSACTION_COMMIT" event.
      */
    def broadcastAfterTransactionCommitEvent(result: BroadcasterResult): Unit = js.native
    
    /**
      * Broadcasts "AFTER_TRANSACTION_ROLLBACK" event.
      */
    def broadcastAfterTransactionRollbackEvent(result: BroadcasterResult): Unit = js.native
    
    /**
      * Broadcasts "AFTER_TRANSACTION_START" event.
      */
    def broadcastAfterTransactionStartEvent(result: BroadcasterResult): Unit = js.native
    
    /**
      * Broadcasts "AFTER_UPDATE" event.
      * After update event is executed after entity is being updated in the database.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastAfterUpdateEvent(result: BroadcasterResult, metadata: EntityMetadata): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: Unit,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: Unit, databaseEntity: ObjectLiteral): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: ObjectLiteral,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: ObjectLiteral): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: Unit,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastAfterUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    
    /**
      * Broadcasts "BEFORE_INSERT" event.
      * Before insert event is executed before entity is being inserted to the database for the first time.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastBeforeInsertEvent(result: BroadcasterResult, metadata: EntityMetadata): Unit = js.native
    def broadcastBeforeInsertEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: ObjectLiteral): Unit = js.native
    
    /**
      * Broadcasts "BEFORE_REMOVE" event.
      * Before remove event is executed before entity is being removed from the database.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastBeforeRemoveEvent(result: BroadcasterResult, metadata: EntityMetadata): Unit = js.native
    def broadcastBeforeRemoveEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: Unit, databaseEntity: ObjectLiteral): Unit = js.native
    def broadcastBeforeRemoveEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: ObjectLiteral): Unit = js.native
    def broadcastBeforeRemoveEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral
    ): Unit = js.native
    
    /**
      * Broadcasts "BEFORE_TRANSACTION_COMMIT" event.
      */
    def broadcastBeforeTransactionCommitEvent(result: BroadcasterResult): Unit = js.native
    
    /**
      * Broadcasts "BEFORE_TRANSACTION_ROLLBACK" event.
      */
    def broadcastBeforeTransactionRollbackEvent(result: BroadcasterResult): Unit = js.native
    
    /**
      * Broadcasts "BEFORE_TRANSACTION_START" event.
      */
    def broadcastBeforeTransactionStartEvent(result: BroadcasterResult): Unit = js.native
    
    /**
      * Broadcasts "BEFORE_UPDATE" event.
      * Before update event is executed before entity is being updated in the database.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastBeforeUpdateEvent(result: BroadcasterResult, metadata: EntityMetadata): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: Unit,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: Unit, databaseEntity: ObjectLiteral): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: Unit,
      databaseEntity: ObjectLiteral,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(result: BroadcasterResult, metadata: EntityMetadata, entity: ObjectLiteral): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: Unit,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: Unit,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    def broadcastBeforeUpdateEvent(
      result: BroadcasterResult,
      metadata: EntityMetadata,
      entity: ObjectLiteral,
      databaseEntity: ObjectLiteral,
      updatedColumns: Unit,
      updatedRelations: js.Array[RelationMetadata]
    ): Unit = js.native
    
    /**
      * Broadcasts "AFTER_LOAD" event for all given entities, and their sub-entities.
      * After load event is executed after entity has been loaded from the database.
      * All subscribers and entity listeners who listened to this event will be executed at this point.
      * Subscribers and entity listeners can return promises, it will wait until they are resolved.
      *
      * Note: this method has a performance-optimized code organization, do not change code structure.
      */
    def broadcastLoadEventsForAll(result: BroadcasterResult, metadata: EntityMetadata, entities: js.Array[ObjectLiteral]): Unit = js.native
    
    /* protected */ def isAllowedSubscriber(subscriber: EntitySubscriberInterface[js.Any], target: String): Boolean = js.native
    /**
      * Checks if subscriber's methods can be executed by checking if its don't listen to the particular entity,
      * or listens our entity.
      */
    /* protected */ def isAllowedSubscriber(subscriber: EntitySubscriberInterface[js.Any], target: js.Function): Boolean = js.native
    
    /* private */ var queryRunner: js.Any = js.native
  }
}
