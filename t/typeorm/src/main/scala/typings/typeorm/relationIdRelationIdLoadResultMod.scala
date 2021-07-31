package typings.typeorm

import typings.typeorm.relationIdRelationIdAttributeMod.RelationIdAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationIdRelationIdLoadResultMod {
  
  trait RelationIdLoadResult extends StObject {
    
    var relationIdAttribute: RelationIdAttribute
    
    var results: js.Array[js.Any]
  }
  object RelationIdLoadResult {
    
    @scala.inline
    def apply(relationIdAttribute: RelationIdAttribute, results: js.Array[js.Any]): RelationIdLoadResult = {
      val __obj = js.Dynamic.literal(relationIdAttribute = relationIdAttribute.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationIdLoadResult]
    }
    
    @scala.inline
    implicit class RelationIdLoadResultMutableBuilder[Self <: RelationIdLoadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelationIdAttribute(value: RelationIdAttribute): Self = StObject.set(x, "relationIdAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: js.Any*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
}
