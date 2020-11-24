package typings.typeorm.eventRemoveEventMod

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveEvent[Entity] extends js.Object {
  
  /**
    * Connection used in the event.
    */
  var connection: Connection = js.native
  
  /**
    * Database representation of entity that is being removed.
    */
  var databaseEntity: Entity = js.native
  
  /**
    * Entity that is being removed.
    * This may absent if entity is removed without being loaded (for examples by cascades).
    */
  var entity: js.UndefOr[Entity] = js.native
  
  /**
    * Id or ids of the entity that is being removed.
    */
  var entityId: js.UndefOr[js.Any] = js.native
  
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
object RemoveEvent {
  
  @scala.inline
  def apply[Entity](
    connection: Connection,
    databaseEntity: Entity,
    manager: EntityManager,
    metadata: EntityMetadata,
    queryRunner: QueryRunner
  ): RemoveEvent[Entity] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], databaseEntity = databaseEntity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryRunner = queryRunner.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveEvent[Entity]]
  }
  
  @scala.inline
  implicit class RemoveEventOps[Self <: RemoveEvent[_], Entity] (val x: Self with RemoveEvent[Entity]) extends AnyVal {
    
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
    def setDatabaseEntity(value: Entity): Self = this.set("databaseEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: EntityManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: EntityMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRunner(value: QueryRunner): Self = this.set("queryRunner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setEntityId(value: js.Any): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
  }
}
