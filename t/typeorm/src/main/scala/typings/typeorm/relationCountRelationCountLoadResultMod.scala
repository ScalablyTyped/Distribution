package typings.typeorm

import typings.typeorm.anon.Cnt
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountRelationCountLoadResultMod {
  
  @js.native
  trait RelationCountLoadResult extends StObject {
    
    var relationCountAttribute: RelationCountAttribute = js.native
    
    var results: js.Array[Cnt] = js.native
  }
  object RelationCountLoadResult {
    
    @scala.inline
    def apply(relationCountAttribute: RelationCountAttribute, results: js.Array[Cnt]): RelationCountLoadResult = {
      val __obj = js.Dynamic.literal(relationCountAttribute = relationCountAttribute.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationCountLoadResult]
    }
    
    @scala.inline
    implicit class RelationCountLoadResultMutableBuilder[Self <: RelationCountLoadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelationCountAttribute(value: RelationCountAttribute): Self = StObject.set(x, "relationCountAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[Cnt]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: Cnt*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
}
