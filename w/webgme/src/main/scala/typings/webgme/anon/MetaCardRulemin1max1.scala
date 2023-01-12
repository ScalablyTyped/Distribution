package typings.webgme.anon

import typings.webgme.GmeCommon.Path
import typings.webgme.webgmeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webgme.GmeCommon.MetaCardRule & {  min :1,   max :1} */
trait MetaCardRulemin1max1 extends StObject {
  
  var items: js.Array[Path]
  
  var max: `1`
  
  var maxItems: js.Array[Double]
  
  var min: `1`
  
  var minItems: js.Array[Double]
}
object MetaCardRulemin1max1 {
  
  inline def apply(items: js.Array[Path], maxItems: js.Array[Double], minItems: js.Array[Double]): MetaCardRulemin1max1 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = 1, maxItems = maxItems.asInstanceOf[js.Any], min = 1, minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRulemin1max1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaCardRulemin1max1] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Path]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Path*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMax(value: `1`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: js.Array[Double]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsVarargs(value: Double*): Self = StObject.set(x, "maxItems", js.Array(value*))
    
    inline def setMin(value: `1`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinItems(value: js.Array[Double]): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsVarargs(value: Double*): Self = StObject.set(x, "minItems", js.Array(value*))
  }
}
