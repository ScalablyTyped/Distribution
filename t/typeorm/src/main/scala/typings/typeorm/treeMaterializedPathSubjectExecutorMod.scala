package typings.typeorm

import typings.typeorm.persistenceSubjectMod.Subject
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMaterializedPathSubjectExecutorMod {
  
  @JSImport("typeorm/persistence/tree/MaterializedPathSubjectExecutor", "MaterializedPathSubjectExecutor")
  @js.native
  class MaterializedPathSubjectExecutor protected () extends StObject {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    /* protected */ var queryRunner: QueryRunner = js.native
  }
}
