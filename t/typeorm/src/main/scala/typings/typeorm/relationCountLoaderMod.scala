package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.relationCountAttributeMod.RelationCountAttribute
import typings.typeorm.relationCountLoadResultMod.RelationCountLoadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountLoaderMod {
  
  @JSImport("typeorm/browser/query-builder/relation-count/RelationCountLoader", "RelationCountLoader")
  @js.native
  class RelationCountLoader protected () extends StObject {
    def this(
      connection: Connection,
      queryRunner: Unit,
      relationCountAttributes: js.Array[RelationCountAttribute]
    ) = this()
    def this(
      connection: Connection,
      queryRunner: QueryRunner,
      relationCountAttributes: js.Array[RelationCountAttribute]
    ) = this()
    
    /* protected */ var connection: Connection = js.native
    
    def load(rawEntities: js.Array[js.Any]): js.Promise[js.Array[RelationCountLoadResult]] = js.native
    
    /* protected */ var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /* protected */ var relationCountAttributes: js.Array[RelationCountAttribute] = js.native
  }
}
