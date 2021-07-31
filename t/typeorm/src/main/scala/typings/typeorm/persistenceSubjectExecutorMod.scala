package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.persistenceSubjectMod.Subject
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.repositoryRemoveOptionsMod.RemoveOptions
import typings.typeorm.repositorySaveOptionsMod.SaveOptions
import typings.typeorm.subscriberBroadcasterResultMod.BroadcasterResult
import typings.typeorm.typeormStrings.delete
import typings.typeorm.typeormStrings.insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistenceSubjectExecutorMod {
  
  @JSImport("typeorm/persistence/SubjectExecutor", "SubjectExecutor")
  @js.native
  class SubjectExecutor protected () extends StObject {
    def this(queryRunner: QueryRunner, subjects: js.Array[Subject]) = this()
    def this(queryRunner: QueryRunner, subjects: js.Array[Subject], options: SaveOptions & RemoveOptions) = this()
    
    /**
      * All subjects that needs to be operated.
      */
    var allSubjects: js.Array[Subject] = js.native
    
    /**
      * Broadcasts "AFTER_INSERT", "AFTER_UPDATE", "AFTER_REMOVE" events for all given subjects.
      * Returns void if there wasn't any listener or subscriber executed.
      * Note: this method has a performance-optimized code organization.
      */
    /* protected */ def broadcastAfterEventsForAll(): BroadcasterResult = js.native
    
    /**
      * Broadcasts "BEFORE_INSERT", "BEFORE_UPDATE", "BEFORE_REMOVE" events for all given subjects.
      */
    /* protected */ def broadcastBeforeEventsForAll(): BroadcasterResult = js.native
    
    /**
      * Executes all operations over given array of subjects.
      * Executes queries using given query runner.
      */
    def execute(): js.Promise[Unit] = js.native
    
    /**
      * Executes insert operations.
      */
    /* protected */ def executeInsertOperations(): js.Promise[Unit] = js.native
    
    /**
      * Recovers all given subjects in the database.
      */
    /* protected */ def executeRecoverOperations(): js.Promise[Unit] = js.native
    
    /**
      * Removes all given subjects from the database.
      *
      * todo: we need to apply topological sort here as well
      */
    /* protected */ def executeRemoveOperations(): js.Promise[Unit] = js.native
    
    /**
      * Soft-removes all given subjects in the database.
      */
    /* protected */ def executeSoftRemoveOperations(): js.Promise[Unit] = js.native
    
    /**
      * Updates all given subjects in the database.
      */
    /* protected */ def executeUpdateOperations(): js.Promise[Unit] = js.native
    
    @JSName("groupBulkSubjects")
    /* protected */ def groupBulkSubjects_delete(subjects: js.Array[Subject], `type`: delete): js.Tuple2[StringDictionary[js.Array[Subject]], js.Array[String]] = js.native
    /**
      * Groups subjects by metadata names (by tables) to make bulk insertions and deletions possible.
      * However there are some limitations with bulk insertions of data into tables with generated (increment) columns
      * in some drivers. Some drivers like mysql and sqlite does not support returning multiple generated columns
      * after insertion and can only return a single generated column value, that's why its not possible to do bulk insertion,
      * because it breaks insertion result's generatedMap and leads to problems when this subject is used in other subjects saves.
      * That's why we only support bulking in junction tables for those drivers.
      *
      * Other drivers like postgres and sql server support RETURNING / OUTPUT statement which allows to return generated
      * id for each inserted row, that's why bulk insertion is not limited to junction tables in there.
      */
    @JSName("groupBulkSubjects")
    /* protected */ def groupBulkSubjects_insert(subjects: js.Array[Subject], `type`: insert): js.Tuple2[StringDictionary[js.Array[Subject]], js.Array[String]] = js.native
    
    /**
      * Indicates if executor has any operations to execute (e.g. has insert / update / delete operations to be executed).
      */
    var hasExecutableOperations: Boolean = js.native
    
    /**
      * Subjects that must be inserted.
      */
    var insertSubjects: js.Array[Subject] = js.native
    
    /**
      * Persistence options.
      */
    var options: js.UndefOr[SaveOptions & RemoveOptions] = js.native
    
    /**
      * QueryRunner used to execute all queries with a given subjects.
      */
    var queryRunner: QueryRunner = js.native
    
    /**
      * Performs entity re-computations - finds changed columns, re-builds insert/update/remove subjects.
      */
    /* protected */ def recompute(): Unit = js.native
    
    /**
      * Subjects that must be recovered.
      */
    var recoverSubjects: js.Array[Subject] = js.native
    
    /**
      * Subjects that must be removed.
      */
    var removeSubjects: js.Array[Subject] = js.native
    
    /**
      * Subjects that must be soft-removed.
      */
    var softRemoveSubjects: js.Array[Subject] = js.native
    
    /**
      * Updates all special columns of the saving entities (create date, update date, version, etc.).
      * Also updates nullable columns and columns with default values.
      */
    /* protected */ def updateSpecialColumnsInInsertedAndUpdatedEntities(subjects: js.Array[Subject]): Unit = js.native
    
    /**
      * Updates all special columns of the saving entities (create date, update date, version, etc.).
      * Also updates nullable columns and columns with default values.
      */
    /* protected */ def updateSpecialColumnsInPersistedEntities(): Unit = js.native
    
    /**
      * Subjects that must be updated.
      */
    var updateSubjects: js.Array[Subject] = js.native
    
    /**
      * Validates all given subjects.
      */
    /* protected */ def validate(): Unit = js.native
  }
}
