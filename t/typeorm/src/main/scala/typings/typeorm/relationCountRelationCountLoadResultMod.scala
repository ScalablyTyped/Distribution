package typings.typeorm

import typings.typeorm.anon.Cnt
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountRelationCountLoadResultMod {
  
  trait RelationCountLoadResult extends StObject {
    
    var relationCountAttribute: RelationCountAttribute
    
    var results: js.Array[Cnt]
  }
  object RelationCountLoadResult {
    
    inline def apply(relationCountAttribute: RelationCountAttribute, results: js.Array[Cnt]): RelationCountLoadResult = {
      val __obj = js.Dynamic.literal(relationCountAttribute = relationCountAttribute.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationCountLoadResult]
    }
    
    extension [Self <: RelationCountLoadResult](x: Self) {
      
      inline def setRelationCountAttribute(value: RelationCountAttribute): Self = StObject.set(x, "relationCountAttribute", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[Cnt]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: Cnt*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
}
