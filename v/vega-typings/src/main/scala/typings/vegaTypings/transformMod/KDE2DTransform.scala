package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KDE2DTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var bandwidth: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  
  var cellSize: js.UndefOr[Double | SignalRef] = js.native
  
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var counts: js.UndefOr[Boolean | SignalRef] = js.native
  
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.native
  
  var size: (js.Array[Double | SignalRef]) | SignalRef = js.native
  
  var `type`: kde2d = js.native
  
  var weight: js.UndefOr[String | TransformField] = js.native
  
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var x: String | TransformField = js.native
  
  var y: String | TransformField = js.native
}
object KDE2DTransform {
  
  @scala.inline
  def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField
  ): KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDE2DTransform]
  }
  
  @scala.inline
  implicit class KDE2DTransformOps[Self <: KDE2DTransform] (val x: Self) extends AnyVal {
    
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
    def setSizeVarargs(value: (Double | SignalRef)*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: kde2d): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String | TransformField): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | TransformField): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBandwidthVarargs(value: (Double | SignalRef)*): Self = this.set("bandwidth", js.Array(value :_*))
    
    @scala.inline
    def setBandwidth(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setCellSize(value: Double | SignalRef): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSize: Self = this.set("cellSize", js.undefined)
    
    @scala.inline
    def setCounts(value: Boolean | SignalRef): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: (String | TransformField)*): Self = this.set("groupby", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: (js.Array[String | TransformField]) | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    
    @scala.inline
    def setWeight(value: String | TransformField): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
