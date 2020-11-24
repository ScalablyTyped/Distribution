package typings.typeorm

import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/persistence/subject-builder/OneToOneInverseSideSubjectBuilder", JSImport.Namespace)
@js.native
object oneToOneInverseSideSubjectBuilderMod extends js.Object {
  
  @js.native
  class OneToOneInverseSideSubjectBuilder protected () extends js.Object {
    def this(subjects: js.Array[Subject]) = this()
    
    /**
      * Builds all required operations.
      */
    def build(): Unit = js.native
    
    /**
      * Builds operations for a given subject and relation.
      *
      * by example: subject is "post" entity we are saving here and relation is "category" inside it here.
      */
    /* protected */ def buildForSubjectRelation(subject: Subject, relation: RelationMetadata): Unit = js.native
    
    var subjects: js.Array[Subject] = js.native
  }
}
