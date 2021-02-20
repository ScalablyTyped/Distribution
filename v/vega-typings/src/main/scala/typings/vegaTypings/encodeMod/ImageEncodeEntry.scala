package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEncodeEntry
  extends EncodeEntry
     with AlignProperty {
  
  var aspect: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  
  var baseline: js.UndefOr[ProductionRule[ScaledValueRef[Baseline]]] = js.native
  
  var smooth: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  
  var url: js.UndefOr[ProductionRule[StringValueRef]] = js.native
}
object ImageEncodeEntry {
  
  @scala.inline
  def apply(): ImageEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEncodeEntry]
  }
  
  @scala.inline
  implicit class ImageEncodeEntryMutableBuilder[Self <: ImageEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setAspectVarargs(value: (Test with BooleanValueRef)*): Self = StObject.set(x, "aspect", js.Array(value :_*))
    
    @scala.inline
    def setBaseline(value: ProductionRule[ScaledValueRef[Baseline]]): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBaselineVarargs(value: (Test with ScaledValueRef[Baseline])*): Self = StObject.set(x, "baseline", js.Array(value :_*))
    
    @scala.inline
    def setSmooth(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setSmoothVarargs(value: (Test with BooleanValueRef)*): Self = StObject.set(x, "smooth", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: (Test with StringValueRef)*): Self = StObject.set(x, "url", js.Array(value :_*))
  }
}
