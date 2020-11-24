package typings.twig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Twigoptions extends js.Object {
  
  var `twig options`: js.Any = js.native
  
  var views: js.Any = js.native
}
object Twigoptions {
  
  @scala.inline
  def apply(`twig options`: js.Any, views: js.Any): Twigoptions = {
    val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("twig options")((`twig options`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Twigoptions]
  }
  
  @scala.inline
  implicit class TwigoptionsOps[Self <: Twigoptions] (val x: Self) extends AnyVal {
    
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
    def `setTwig options`(value: js.Any): Self = this.set("twig options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: js.Any): Self = this.set("views", value.asInstanceOf[js.Any])
  }
}
