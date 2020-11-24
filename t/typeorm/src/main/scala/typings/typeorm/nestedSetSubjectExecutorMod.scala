package typings.typeorm

import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/persistence/tree/NestedSetSubjectExecutor", JSImport.Namespace)
@js.native
object nestedSetSubjectExecutorMod extends js.Object {
  
  @js.native
  class NestedSetSubjectExecutor protected () extends js.Object {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Gets escaped table name with schema name if SqlServer or Postgres driver used with custom
      * schema name, otherwise returns escaped table name.
      */
    /* protected */ def getTableName(tablePath: String): String = js.native
    
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
  }
}
