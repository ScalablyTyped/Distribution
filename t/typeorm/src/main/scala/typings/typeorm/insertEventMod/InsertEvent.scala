package typings.typeorm.insertEventMod

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertEvent[Entity] extends js.Object {
  
  /**
    * Connection used in the event.
    */
  var connection: Connection = js.native
  
  /**
    * Inserting event.
    */
  var entity: Entity = js.native
  
  /**
    * EntityManager used in the event transaction.
    * All database operations in the subscribed event listener should be performed using this entity manager instance.
    */
  var manager: EntityManager = js.native
  
  /**
    * Metadata of the entity.
    */
  var metadata: EntityMetadata = js.native
  
  /**
    * QueryRunner used in the event transaction.
    * All database operations in the subscribed event listener should be performed using this query runner instance.
    */
  var queryRunner: QueryRunner = js.native
}
object InsertEvent {
  
  @scala.inline
  def apply[Entity](
    connection: Connection,
    entity: Entity,
    manager: EntityManager,
    metadata: EntityMetadata,
    queryRunner: QueryRunner
  ): InsertEvent[Entity] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertEvent[Entity]]
  }
  
  @scala.inline
  implicit class InsertEventOps[Self <: InsertEvent[_], Entity] (val x: Self with InsertEvent[Entity]) extends AnyVal {
    
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
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: EntityManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: EntityMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRunner(value: QueryRunner): Self = this.set("queryRunner", value.asInstanceOf[js.Any])
  }
}
