package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.relationIdRelationIdAttributeMod.RelationIdAttribute
import typings.typeorm.relationIdRelationIdLoadResultMod.RelationIdLoadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/relation-id/RelationIdLoader", JSImport.Namespace)
@js.native
object relationIdRelationIdLoaderMod extends js.Object {
  
  @js.native
  class RelationIdLoader protected () extends js.Object {
    def this(
      connection: Connection,
      queryRunner: js.UndefOr[scala.Nothing],
      relationIdAttributes: js.Array[RelationIdAttribute]
    ) = this()
    def this(
      connection: Connection,
      queryRunner: QueryRunner,
      relationIdAttributes: js.Array[RelationIdAttribute]
    ) = this()
    
    var connection: Connection = js.native
    
    def load(rawEntities: js.Array[_]): js.Promise[js.Array[RelationIdLoadResult]] = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    var relationIdAttributes: js.Array[RelationIdAttribute] = js.native
  }
}
