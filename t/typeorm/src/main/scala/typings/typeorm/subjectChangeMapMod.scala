package typings.typeorm

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectChangeMapMod {
  
  @js.native
  trait SubjectChangeMap extends StObject {
    
    /**
      * Column that needs to be changed.
      * Either column, either relation must be set in the change.
      */
    var column: js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * Relation that needs to be changed.
      * Either column, either relation must be set in the change.
      */
    var relation: js.UndefOr[RelationMetadata] = js.native
    
    /**
      * Value needs to be inserted into given column.
      * This value can also be another subject, when this column has a referenced column.
      */
    var value: Subject | js.Any = js.native
  }
  object SubjectChangeMap {
    
    @scala.inline
    def apply(value: Subject | js.Any): SubjectChangeMap = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectChangeMap]
    }
    
    @scala.inline
    implicit class SubjectChangeMapMutableBuilder[Self <: SubjectChangeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnMetadata): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
      
      @scala.inline
      def setValue(value: Subject | js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
