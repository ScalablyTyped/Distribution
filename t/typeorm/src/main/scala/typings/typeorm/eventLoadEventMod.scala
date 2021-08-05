package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventLoadEventMod {
  
  trait LoadEvent[Entity] extends StObject {
    
    /**
      * Connection used in the event.
      */
    var connection: Connection
    
    /**
      * Loaded entity.
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
  }
  object LoadEvent {
    
    inline def apply[Entity](
      connection: Connection,
      entity: Entity,
      manager: EntityManager,
      metadata: EntityMetadata,
      queryRunner: QueryRunner
    ): LoadEvent[Entity] = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadEvent[Entity]]
    }
    
    extension [Self <: LoadEvent[?], Entity](x: Self & LoadEvent[Entity]) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setManager(value: EntityManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setQueryRunner(value: QueryRunner): Self = StObject.set(x, "queryRunner", value.asInstanceOf[js.Any])
    }
  }
}
