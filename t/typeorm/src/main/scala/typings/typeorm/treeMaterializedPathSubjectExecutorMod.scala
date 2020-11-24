package typings.typeorm

import typings.typeorm.persistenceSubjectMod.Subject
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/persistence/tree/MaterializedPathSubjectExecutor", JSImport.Namespace)
@js.native
object treeMaterializedPathSubjectExecutorMod extends js.Object {
  
  @js.native
  class MaterializedPathSubjectExecutor protected () extends js.Object {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
  }
}
