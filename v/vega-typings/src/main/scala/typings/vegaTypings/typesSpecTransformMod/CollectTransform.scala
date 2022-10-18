package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecMarkMod.Compare
import typings.vegaTypings.vegaTypingsStrings.collect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectTransform
  extends StObject
     with Transforms {
  
  var sort: Compare
  
  var `type`: collect
}
object CollectTransform {
  
  inline def apply(sort: Compare): CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[CollectTransform]
  }
  
  extension [Self <: CollectTransform](x: Self) {
    
    inline def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setType(value: collect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
