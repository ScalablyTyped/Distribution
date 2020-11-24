package typings.webcola.anon

import typings.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowStart extends js.Object {
  
  var arrowStart: Point = js.native
  
  var sourceIntersection: Point = js.native
  
  var targetIntersection: Point = js.native
}
object ArrowStart {
  
  @scala.inline
  def apply(arrowStart: Point, sourceIntersection: Point, targetIntersection: Point): ArrowStart = {
    val __obj = js.Dynamic.literal(arrowStart = arrowStart.asInstanceOf[js.Any], sourceIntersection = sourceIntersection.asInstanceOf[js.Any], targetIntersection = targetIntersection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStart]
  }
  
  @scala.inline
  implicit class ArrowStartOps[Self <: ArrowStart] (val x: Self) extends AnyVal {
    
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
    def setArrowStart(value: Point): Self = this.set("arrowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIntersection(value: Point): Self = this.set("sourceIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIntersection(value: Point): Self = this.set("targetIntersection", value.asInstanceOf[js.Any])
  }
}
