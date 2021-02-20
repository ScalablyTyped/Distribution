package typings.webgme.anon

import typings.webgme.GmeCommon.Path
import typings.webgme.webgmeNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webgme.GmeCommon.MetaCardRule & {  min :1,   max :1} */
@js.native
trait MetaCardRulemin1max1 extends StObject {
  
  var items: js.Array[Path] = js.native
  
  var max: `1` = js.native
  
  var maxItems: js.Array[Double] = js.native
  
  var min: `1` = js.native
  
  var minItems: js.Array[Double] = js.native
}
object MetaCardRulemin1max1 {
  
  @scala.inline
  def apply(items: js.Array[Path], max: `1`, maxItems: js.Array[Double], min: `1`, minItems: js.Array[Double]): MetaCardRulemin1max1 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRulemin1max1]
  }
  
  @scala.inline
  implicit class MetaCardRulemin1max1MutableBuilder[Self <: MetaCardRulemin1max1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Path]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Path*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: `1`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: js.Array[Double]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsVarargs(value: Double*): Self = StObject.set(x, "maxItems", js.Array(value :_*))
    
    @scala.inline
    def setMin(value: `1`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItems(value: js.Array[Double]): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItemsVarargs(value: Double*): Self = StObject.set(x, "minItems", js.Array(value :_*))
  }
}
