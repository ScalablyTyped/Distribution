package typings.whatwgUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotStripQMark extends js.Object {
  
  var doNotStripQMark: js.UndefOr[Boolean] = js.native
}
object DoNotStripQMark {
  
  @scala.inline
  def apply(): DoNotStripQMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoNotStripQMark]
  }
  
  @scala.inline
  implicit class DoNotStripQMarkOps[Self <: DoNotStripQMark] (val x: Self) extends AnyVal {
    
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
    def setDoNotStripQMark(value: Boolean): Self = this.set("doNotStripQMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotStripQMark: Self = this.set("doNotStripQMark", js.undefined)
  }
}
