package typings.typeorm

import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closureSubjectExecutorMod {
  
  @JSImport("typeorm/browser/persistence/tree/ClosureSubjectExecutor", "ClosureSubjectExecutor")
  @js.native
  class ClosureSubjectExecutor protected () extends StObject {
    def this(queryRunner: QueryRunner) = this()
    
    /**
      * Gets escaped table name with schema name if SqlServer or Postgres driver used with custom
      * schema name, otherwise returns escaped table name.
      */
    /* protected */ def getTableName(tablePath: String): String = js.native
    
    /**
      * Removes all children of the given subject's entity.
      async deleteChildrenOf(subject: Subject) {
      // const relationValue = subject.metadata.treeParentRelation.getEntityValue(subject.databaseEntity);
      // console.log("relationValue: ", relationValue);
      // this.queryRunner.manager
      //     .createQueryBuilder()
      //     .from(subject.metadata.closureJunctionTable.target, "tree")
      //     .where("tree.");
      }*/
    /**
      * Executes operations when subject is being inserted.
      */
    def insert(subject: Subject): js.Promise[Unit] = js.native
    
    /* protected */ var queryRunner: QueryRunner = js.native
  }
}
