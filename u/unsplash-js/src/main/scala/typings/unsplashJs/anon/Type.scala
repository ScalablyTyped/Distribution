package typings.unsplashJs.anon

import typings.unsplashJs.distMethodsCollectionsTypesMod.Basic
import typings.unsplashJs.distMethodsPhotosTypesMod.RelatedCollectionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var results: js.Array[Basic]
  
  var total: Double
  
  var `type`: RelatedCollectionsType
}
object Type {
  
  inline def apply(results: js.Array[Basic], total: Double, `type`: RelatedCollectionsType): Type = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[Basic]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Basic*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setType(value: RelatedCollectionsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
