package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventRemoveEventMod {
  
  trait RemoveEvent[Entity] extends StObject {
    
    /**
      * Connection used in the event.
      */
    var connection: Connection
    
    /**
      * Database representation of entity that is being removed.
      */
    var databaseEntity: Entity
    
    /**
      * Entity that is being removed.
      * This may absent if entity is removed without being loaded (for examples by cascades).
      */
    var entity: js.UndefOr[Entity] = js.undefined
    
    /**
      * Id or ids of the entity that is being removed.
      */
    var entityId: js.UndefOr[js.Any] = js.undefined
    
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
  }
  object RemoveEvent {
    
    inline def apply[Entity](
      connection: Connection,
      databaseEntity: Entity,
      manager: EntityManager,
      metadata: EntityMetadata,
      queryRunner: QueryRunner
    ): RemoveEvent[Entity] = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], databaseEntity = databaseEntity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveEvent[Entity]]
    }
    
    extension [Self <: RemoveEvent[?], Entity](x: Self & RemoveEvent[Entity]) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setDatabaseEntity(value: Entity): Self = StObject.set(x, "databaseEntity", value.asInstanceOf[js.Any])
      
      inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityId(value: js.Any): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setManager(value: EntityManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setQueryRunner(value: QueryRunner): Self = StObject.set(x, "queryRunner", value.asInstanceOf[js.Any])
    }
  }
}
