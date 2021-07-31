package typings.webgme.anon

import typings.webgme.GmeCommon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webgme.GmeCommon.MetaCardRule & {  min :number,   max :number} */
trait MetaCardRuleminnumbermaxn extends StObject {
  
  var items: js.Array[Path]
  
  var max: Double
  
  var maxItems: js.Array[Double]
  
  var min: Double
  
  var minItems: js.Array[Double]
}
object MetaCardRuleminnumbermaxn {
  
  @scala.inline
  def apply(
    items: js.Array[Path],
    max: Double,
    maxItems: js.Array[Double],
    min: Double,
    minItems: js.Array[Double]
  ): MetaCardRuleminnumbermaxn = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRuleminnumbermaxn]
  }
  
  @scala.inline
  implicit class MetaCardRuleminnumbermaxnMutableBuilder[Self <: MetaCardRuleminnumbermaxn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Path]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Path*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: js.Array[Double]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsVarargs(value: Double*): Self = StObject.set(x, "maxItems", js.Array(value :_*))
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItems(value: js.Array[Double]): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItemsVarargs(value: Double*): Self = StObject.set(x, "minItems", js.Array(value :_*))
  }
}
