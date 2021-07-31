package typings.typeorm

import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.subjectMod.Subject
import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.save
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascadesSubjectBuilderMod {
  
  @JSImport("typeorm/browser/persistence/subject-builder/CascadesSubjectBuilder", "CascadesSubjectBuilder")
  @js.native
  class CascadesSubjectBuilder protected () extends StObject {
    def this(allSubjects: js.Array[Subject]) = this()
    
    var allSubjects: js.Array[Subject] = js.native
    
    @JSName("build")
    def build_recover(subject: Subject, operationType: recover): Unit = js.native
    @JSName("build")
    def build_remove(subject: Subject, operationType: remove): Unit = js.native
    /**
      * Builds a cascade subjects tree and pushes them in into the given array of subjects.
      */
    @JSName("build")
    def build_save(subject: Subject, operationType: save): Unit = js.native
    @JSName("build")
    def build_softremove(subject: Subject, operationType: `soft-remove`): Unit = js.native
    
    /* protected */ def findByPersistEntityLike(entityTarget: String, entity: ObjectLiteral): js.UndefOr[Subject] = js.native
    /**
      * Finds subject where entity like given subject's entity.
      * Comparision made by entity id.
      */
    /* protected */ def findByPersistEntityLike(entityTarget: js.Function, entity: ObjectLiteral): js.UndefOr[Subject] = js.native
  }
}
