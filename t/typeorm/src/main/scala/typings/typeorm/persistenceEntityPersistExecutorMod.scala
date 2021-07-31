package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.repositoryRemoveOptionsMod.RemoveOptions
import typings.typeorm.repositorySaveOptionsMod.SaveOptions
import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.save
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistenceEntityPersistExecutorMod {
  
  @JSImport("typeorm/persistence/EntityPersistExecutor", "EntityPersistExecutor")
  @js.native
  class EntityPersistExecutor protected () extends StObject {
    def this(
      connection: Connection,
      queryRunner: js.UndefOr[QueryRunner],
      mode: save | remove | `soft-remove` | recover,
      target: js.UndefOr[js.Function | String],
      entity: ObjectLiteral | js.Array[ObjectLiteral],
      options: js.UndefOr[SaveOptions & RemoveOptions]
    ) = this()
    
    var connection: Connection = js.native
    
    var entity: ObjectLiteral | js.Array[ObjectLiteral] = js.native
    
    /**
      * Executes persistence operation ob given entity or entities.
      */
    def execute(): js.Promise[Unit] = js.native
    
    var mode: save | remove | `soft-remove` | recover = js.native
    
    var options: js.UndefOr[SaveOptions & RemoveOptions] = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    var target: js.UndefOr[js.Function | String] = js.native
  }
}
