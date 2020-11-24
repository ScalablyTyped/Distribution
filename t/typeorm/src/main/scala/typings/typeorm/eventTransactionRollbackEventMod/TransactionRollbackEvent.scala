package typings.typeorm.eventTransactionRollbackEventMod

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionRollbackEvent extends js.Object {
  
  /**
    * Connection used in the event.
    */
  var connection: Connection = js.native
  
  /**
    * EntityManager used in the event transaction.
    * All database operations in the subscribed event listener should be performed using this entity manager instance.
    */
  var manager: EntityManager = js.native
  
  /**
    * QueryRunner used in the event transaction.
    * All database operations in the subscribed event listener should be performed using this query runner instance.
    */
  var queryRunner: QueryRunner = js.native
}
object TransactionRollbackEvent {
  
  @scala.inline
  def apply(connection: Connection, manager: EntityManager, queryRunner: QueryRunner): TransactionRollbackEvent = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRollbackEvent]
  }
  
  @scala.inline
  implicit class TransactionRollbackEventOps[Self <: TransactionRollbackEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: EntityManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRunner(value: QueryRunner): Self = this.set("queryRunner", value.asInstanceOf[js.Any])
  }
}
