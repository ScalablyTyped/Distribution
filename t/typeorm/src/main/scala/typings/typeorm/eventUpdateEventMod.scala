package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventUpdateEventMod {
  
  trait UpdateEvent[Entity] extends StObject {
    
    /**
      * Connection used in the event.
      */
    var connection: Connection
    
    /**
      * Updating entity in the database.
      */
    var databaseEntity: Entity
    
    /**
      * Updating entity.
      */
    var entity: Entity
    
    /**
      * EntityManager used in the event transaction.
      * All database operations in the subscribed event listener should be performed using this entity manager instance.
      */
    var manager: EntityManager
    
    /**
      * Metadata of the entity.
      */
    var metadata: EntityMetadata
    
    /**
      * QueryRunner used in the event transaction.
      * All database operations in the subscribed event listener should be performed using this query runner instance.
      */
    var queryRunner: QueryRunner
    
    /**
      * List of updated columns. In query builder has no affected
      */
    var updatedColumns: js.Array[ColumnMetadata]
    
    /**
      * List of updated relations. In query builder has no affected
      */
    var updatedRelations: js.Array[RelationMetadata]
  }
  object UpdateEvent {
    
    @scala.inline
    def apply[Entity](
      connection: Connection,
      databaseEntity: Entity,
      entity: Entity,
      manager: EntityManager,
      metadata: EntityMetadata,
      queryRunner: QueryRunner,
      updatedColumns: js.Array[ColumnMetadata],
      updatedRelations: js.Array[RelationMetadata]
    ): UpdateEvent[Entity] = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], databaseEntity = databaseEntity.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any], updatedColumns = updatedColumns.asInstanceOf[js.Any], updatedRelations = updatedRelations.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateEvent[Entity]]
    }
    
    @scala.inline
    implicit class UpdateEventMutableBuilder[Self <: UpdateEvent[?], Entity] (val x: Self & UpdateEvent[Entity]) extends AnyVal {
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseEntity(value: Entity): Self = StObject.set(x, "databaseEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManager(value: EntityManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryRunner(value: QueryRunner): Self = StObject.set(x, "queryRunner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "updatedColumns", js.Array(value :_*))
      
      @scala.inline
      def setUpdatedRelations(value: js.Array[RelationMetadata]): Self = StObject.set(x, "updatedRelations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedRelationsVarargs(value: RelationMetadata*): Self = StObject.set(x, "updatedRelations", js.Array(value :_*))
    }
  }
}
