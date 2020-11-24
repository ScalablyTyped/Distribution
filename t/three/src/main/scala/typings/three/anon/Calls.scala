package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calls extends js.Object {
  
  var calls: Double = js.native
  
  var frame: Double = js.native
  
  var lines: Double = js.native
  
  var points: Double = js.native
  
  var triangles: Double = js.native
}
object Calls {
  
  @scala.inline
  def apply(calls: Double, frame: Double, lines: Double, points: Double, triangles: Double): Calls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls]
  }
  
  @scala.inline
  implicit class CallsOps[Self <: Calls] (val x: Self) extends AnyVal {
    
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
    def setCalls(value: Double): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: Double): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: Double): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangles(value: Double): Self = this.set("triangles", value.asInstanceOf[js.Any])
  }
}
