package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientationOrientation extends js.Object {
  
  var orientation: typings.unsplashJs.mod.Orientation = js.native
}
object OrientationOrientation {
  
  @scala.inline
  def apply(orientation: typings.unsplashJs.mod.Orientation): OrientationOrientation = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationOrientation]
  }
  
  @scala.inline
  implicit class OrientationOrientationOps[Self <: OrientationOrientation] (val x: Self) extends AnyVal {
    
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
    def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
  }
}
