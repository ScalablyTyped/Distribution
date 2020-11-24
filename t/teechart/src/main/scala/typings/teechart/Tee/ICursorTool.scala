package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICursorTool extends ITool {
  
  var direction: String = js.native
  
  var dragging: Double = js.native
  
  var followMouse: Boolean = js.native
  
  var format: IFormat = js.native
  
  var horizAxis: IAxis = js.native
  
  def over(point: IPoint): Boolean = js.native
  
  var render: String = js.native
  
  def setRender(render: String): Unit = js.native
  
  var size: IPoint = js.native
  
  var vertAxis: IAxis = js.native
}
object ICursorTool {
  
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    direction: String,
    dragging: Double,
    draw: () => Unit,
    followMouse: Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    over: IPoint => Boolean,
    render: String,
    setRender: String => Unit,
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], draw = js.Any.fromFunction0(draw), followMouse = followMouse.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], horizAxis = horizAxis.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), over = js.Any.fromFunction1(over), render = render.asInstanceOf[js.Any], setRender = js.Any.fromFunction1(setRender), size = size.asInstanceOf[js.Any], vertAxis = vertAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorTool]
  }
  
  @scala.inline
  implicit class ICursorToolOps[Self <: ICursorTool] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Double): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowMouse(value: Boolean): Self = this.set("followMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizAxis(value: IAxis): Self = this.set("horizAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOver(value: IPoint => Boolean): Self = this.set("over", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: String): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRender(value: String => Unit): Self = this.set("setRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: IPoint): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertAxis(value: IAxis): Self = this.set("vertAxis", value.asInstanceOf[js.Any])
  }
}
