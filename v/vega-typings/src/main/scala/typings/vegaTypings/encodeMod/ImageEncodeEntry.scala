package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
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
  implicit class ImageEncodeEntryOps[Self <: ImageEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAspectVarargs(value: (Test with BooleanValueRef)*): Self = this.set("aspect", js.Array(value :_*))
    
    @scala.inline
    def setAspect(value: ProductionRule[BooleanValueRef]): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setBaselineVarargs(value: (Test with ScaledValueRef[Baseline])*): Self = this.set("baseline", js.Array(value :_*))
    
    @scala.inline
    def setBaseline(value: ProductionRule[ScaledValueRef[Baseline]]): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    
    @scala.inline
    def setSmoothVarargs(value: (Test with BooleanValueRef)*): Self = this.set("smooth", js.Array(value :_*))
    
    @scala.inline
    def setSmooth(value: ProductionRule[BooleanValueRef]): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: (Test with StringValueRef)*): Self = this.set("url", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: ProductionRule[StringValueRef]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
