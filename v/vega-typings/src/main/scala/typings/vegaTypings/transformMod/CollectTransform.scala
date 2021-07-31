package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.vegaTypingsStrings.collect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectTransform
  extends StObject
     with _Transforms {
  
  var sort: Compare
  
  var `type`: collect
}
object CollectTransform {
  
  @scala.inline
  def apply(sort: Compare): CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[CollectTransform]
  }
  
  @scala.inline
  implicit class CollectTransformMutableBuilder[Self <: CollectTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: collect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
