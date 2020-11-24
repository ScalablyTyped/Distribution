package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  context :vega-typings.vega-typings/types/runtime/scene.SceneContext,   items :std.Array<vega-typings.vega-typings/types/runtime/scene.SceneItem>,   height :number,   width :number,   stroke :string | undefined} */
@js.native
trait SceneGroup extends js.Object {
  
  var bounds: Bounds = js.native
  
  var context: SceneContext = js.native
  
  var datum: js.UndefOr[js.Object] = js.native
  
  var height: Double = js.native
  
  var items: js.Array[SceneItem] = js.native
  
  var mark: Role = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SceneGroup {
  
  @scala.inline
  def apply(
    bounds: Bounds,
    context: SceneContext,
    height: Double,
    items: js.Array[SceneItem],
    mark: Role,
    width: Double,
    x: Double,
    y: Double
  ): SceneGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneGroup]
  }
  
  @scala.inline
  implicit class SceneGroupOps[Self <: SceneGroup] (val x: Self) extends AnyVal {
    
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
    def setContext(value: SceneContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: SceneItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SceneItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMark(value: Role): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
