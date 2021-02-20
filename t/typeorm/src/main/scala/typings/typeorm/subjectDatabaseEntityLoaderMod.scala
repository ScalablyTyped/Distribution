package typings.typeorm

import typings.typeorm.anon.Subjects
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.subjectMod.Subject
import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.save
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectDatabaseEntityLoaderMod {
  
  @JSImport("typeorm/browser/persistence/SubjectDatabaseEntityLoader", "SubjectDatabaseEntityLoader")
  @js.native
  class SubjectDatabaseEntityLoader protected () extends StObject {
    def this(queryRunner: QueryRunner, subjects: js.Array[Subject]) = this()
    
    /* protected */ def findByPersistEntityLike(entityTarget: String, entity: ObjectLiteral): js.Array[Subject] = js.native
    /**
      * Finds subjects where entity like given subject's entity.
      * Comparision made by entity id.
      * Multiple subjects may be returned if duplicates are present in the subject array.
      * This will likely result in the same row being updated multiple times during a transaction.
      */
    /* protected */ def findByPersistEntityLike(entityTarget: js.Function, entity: ObjectLiteral): js.Array[Subject] = js.native
    
    /**
      * Groups given Subject objects into groups separated by entity targets.
      */
    /* protected */ def groupByEntityTargets(): js.Array[Subjects] = js.native
    
    @JSName("load")
    def load_recover(operationType: recover): js.Promise[Unit] = js.native
    @JSName("load")
    def load_remove(operationType: remove): js.Promise[Unit] = js.native
    /**
      * Loads database entities for all subjects.
      *
      * loadAllRelations flag is used to load all relation ids of the object, no matter if they present in subject entity or not.
      * This option is used for deletion.
      */
    @JSName("load")
    def load_save(operationType: save): js.Promise[Unit] = js.native
    @JSName("load")
    def load_softremove(operationType: `soft-remove`): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
    
    var subjects: js.Array[Subject] = js.native
  }
}
