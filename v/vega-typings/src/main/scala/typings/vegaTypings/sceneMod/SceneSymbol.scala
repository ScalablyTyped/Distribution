package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  fill :string,   shape :string,   size :number,   strokeWidth :number} */
@js.native
trait SceneSymbol extends js.Object {
  
  var bounds: Bounds = js.native
  
  var datum: js.UndefOr[js.Object] = js.native
  
  var fill: String = js.native
  
  var mark: Role = js.native
  
  var shape: String = js.native
  
  var size: Double = js.native
  
  var strokeWidth: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SceneSymbol {
  
  @scala.inline
  def apply(
    bounds: Bounds,
    fill: String,
    mark: Role,
    shape: String,
    size: Double,
    strokeWidth: Double,
    x: Double,
    y: Double
  ): SceneSymbol = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneSymbol]
  }
  
  @scala.inline
  implicit class SceneSymbolOps[Self <: SceneSymbol] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMark(value: Role): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
  }
}
