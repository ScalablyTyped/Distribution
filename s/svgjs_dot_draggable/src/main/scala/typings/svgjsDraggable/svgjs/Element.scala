package typings.svgjsDraggable.svgjs

import typings.std.MouseEvent
import typings.svgjsDraggable.svgjs.draggable.DragDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  def beforedrag(event: MouseEvent): js.Any = js.native
  
  def dragend(delta: DragDelta, event: MouseEvent): js.Any = js.native
  
  def draggable(): this.type = js.native
  def draggable(obj: js.Object): this.type = js.native
  
  def dragmove(delta: DragDelta, event: MouseEvent): js.Any = js.native
  
  def dragstart(delta: DragDelta, event: MouseEvent): js.Any = js.native
  
  def fixed(): this.type = js.native
}
