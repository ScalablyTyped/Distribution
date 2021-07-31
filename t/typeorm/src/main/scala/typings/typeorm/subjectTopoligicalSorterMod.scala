package typings.typeorm

import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.subjectMod.Subject
import typings.typeorm.typeormStrings.delete
import typings.typeorm.typeormStrings.insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectTopoligicalSorterMod {
  
  @JSImport("typeorm/browser/persistence/SubjectTopoligicalSorter", "SubjectTopoligicalSorter")
  @js.native
  class SubjectTopoligicalSorter protected () extends StObject {
    def this(subjects: js.Array[Subject]) = this()
    
    /**
      * Gets dependency tree for all entity metadatas with non-nullable relations.
      * We need to execute insertions first for entities which non-nullable relations.
      */
    /* protected */ def getDependencies(): js.Array[js.Array[String]] = js.native
    
    /**
      * Gets dependency tree for all entity metadatas with non-nullable relations.
      * We need to execute insertions first for entities which non-nullable relations.
      */
    /* protected */ def getNonNullableDependencies(): js.Array[js.Array[String]] = js.native
    
    /**
      * Extracts all unique metadatas from the given subjects.
      */
    /* protected */ def getUniqueMetadatas(subjects: js.Array[Subject]): js.Array[EntityMetadata] = js.native
    
    /**
      * Unique list of entity metadatas of this subject.
      */
    var metadatas: js.Array[EntityMetadata] = js.native
    
    /**
      * Removes already sorted subjects from this.subjects list of subjects.
      */
    /* protected */ def removeAlreadySorted(subjects: js.Array[Subject]): Unit = js.native
    
    @JSName("sort")
    def sort_delete(direction: delete): js.Array[Subject] = js.native
    /**
      * Sorts (orders) subjects in their topological order.
      */
    @JSName("sort")
    def sort_insert(direction: insert): js.Array[Subject] = js.native
    
    /**
      * Insert subjects needs to be sorted.
      */
    var subjects: js.Array[Subject] = js.native
    
    /**
      * Sorts given graph using topological sorting algorithm.
      *
      * Algorithm is kindly taken from https://github.com/marcelklehr/toposort repository.
      */
    /* protected */ def toposort(edges: js.Array[js.Array[js.Any]]): js.Array[js.Any] = js.native
  }
}
