package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insertEventMod {
  
  trait InsertEvent[Entity] extends StObject {
    
    /**
      * Connection used in the event.
      */
    var connection: Connection
    
    /**
      * Inserting event.
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
  object InsertEvent {
    
    inline def apply[Entity](
      connection: Connection,
      entity: Entity,
      manager: EntityManager,
      metadata: EntityMetadata,
      queryRunner: QueryRunner
    ): InsertEvent[Entity] = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertEvent[Entity]]
    }
    
    extension [Self <: InsertEvent[?], Entity](x: Self & InsertEvent[Entity]) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setManager(value: EntityManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setQueryRunner(value: QueryRunner): Self = StObject.set(x, "queryRunner", value.asInstanceOf[js.Any])
    }
  }
}
