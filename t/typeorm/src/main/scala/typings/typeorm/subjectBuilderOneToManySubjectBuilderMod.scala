package typings.typeorm

import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.persistenceSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/persistence/subject-builder/OneToManySubjectBuilder", JSImport.Namespace)
@js.native
object subjectBuilderOneToManySubjectBuilderMod extends js.Object {
  
  @js.native
  class OneToManySubjectBuilder protected () extends js.Object {
    def this(subjects: js.Array[Subject]) = this()
    
    /**
      * Builds all required operations.
      */
    def build(): Unit = js.native
    
    /**
      * Builds operations for a given subject and relation.
      *
      * by example: subject is "post" entity we are saving here and relation is "categories" inside it here.
      */
    /* protected */ def buildForSubjectRelation(subject: Subject, relation: RelationMetadata): Unit = js.native
    
    var subjects: js.Array[Subject] = js.native
  }
}
