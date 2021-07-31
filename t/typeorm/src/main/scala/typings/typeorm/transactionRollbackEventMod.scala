package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionRollbackEventMod {
  
  trait TransactionRollbackEvent extends StObject {
    
    /**
      * Connection used in the event.
      */
    var connection: Connection
    
    /**
      * EntityManager used in the event transaction.
      * All database operations in the subscribed event listener should be performed using this entity manager instance.
      */
    var manager: EntityManager
    
    /**
      * QueryRunner used in the event transaction.
      * All database operations in the subscribed event listener should be performed using this query runner instance.
      */
    var queryRunner: QueryRunner
  }
  object TransactionRollbackEvent {
    
    @scala.inline
    def apply(connection: Connection, manager: EntityManager, queryRunner: QueryRunner): TransactionRollbackEvent = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionRollbackEvent]
    }
    
    @scala.inline
    implicit class TransactionRollbackEventMutableBuilder[Self <: TransactionRollbackEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManager(value: EntityManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryRunner(value: QueryRunner): Self = StObject.set(x, "queryRunner", value.asInstanceOf[js.Any])
    }
  }
}
