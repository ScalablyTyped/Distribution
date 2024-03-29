package typings.typeorm

import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manyToManySubjectBuilderMod {
  
  @JSImport("typeorm/browser/persistence/subject-builder/ManyToManySubjectBuilder", "ManyToManySubjectBuilder")
  @js.native
  class ManyToManySubjectBuilder protected () extends StObject {
    def this(subjects: js.Array[Subject]) = this()
    
    /**
      * Builds operations for any changes in the many-to-many relations of the subjects.
      */
    def build(): Unit = js.native
    
    /**
      * Builds operations for removal of all many-to-many records of all many-to-many relations of the given subject.
      */
    def buildForAllRemoval(subject: Subject): Unit = js.native
    
    /**
      * Builds operations for a given subject and relation.
      *
      * by example: subject is "post" entity we are saving here and relation is "categories" inside it here.
      */
    /* protected */ def buildForSubjectRelation(subject: Subject, relation: RelationMetadata): Unit = js.native
    
    /**
      * Creates identifiers for junction table.
      * Example: { postId: 1, categoryId: 2 }
      */
    /* protected */ def buildJunctionIdentifier(subject: Subject, relation: RelationMetadata, relationId: ObjectLiteral): ObjectLiteral = js.native
    
    /* protected */ var subjects: js.Array[Subject] = js.native
  }
}
