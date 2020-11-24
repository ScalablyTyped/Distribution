package typings.typeorm.updateEventMod

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEvent[Entity] extends js.Object {
  
  /**
    * Connection used in the event.
    */
  var connection: Connection = js.native
  
  /**
    * Updating entity in the database.
    */
  var databaseEntity: Entity = js.native
  
  /**
    * Updating entity.
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
  
  /**
    * List of updated columns. In query builder has no affected
    */
  var updatedColumns: js.Array[ColumnMetadata] = js.native
  
  /**
    * List of updated relations. In query builder has no affected
    */
  var updatedRelations: js.Array[RelationMetadata] = js.native
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
  implicit class UpdateEventOps[Self <: UpdateEvent[_], Entity] (val x: Self with UpdateEvent[Entity]) extends AnyVal {
    
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
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: EntityManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: EntityMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRunner(value: QueryRunner): Self = this.set("queryRunner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedColumnsVarargs(value: ColumnMetadata*): Self = this.set("updatedColumns", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedColumns(value: js.Array[ColumnMetadata]): Self = this.set("updatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRelationsVarargs(value: RelationMetadata*): Self = this.set("updatedRelations", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedRelations(value: js.Array[RelationMetadata]): Self = this.set("updatedRelations", value.asInstanceOf[js.Any])
  }
}
