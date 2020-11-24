package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compact extends js.Object {
  
  /**
    * When the AppBar is closed, its height is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: String = js.native
  
  /**
    * When the AppBar is closed, its height is always sized to content.
    **/
  var full: String = js.native
  
  /**
    * When the AppBar is closed, its height is reduced to the minimal height required to display only its overflowbutton. All other content in the AppBar is not displayed.
    **/
  var minimal: String = js.native
  
  /**
    * When the AppBar is closed, it is not visible and doesn't take up any space.
    **/
  var none: String = js.native
}
object Compact {
  
  @scala.inline
  def apply(compact: String, full: String, minimal: String, none: String): Compact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
  
  @scala.inline
  implicit class CompactOps[Self <: Compact] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: String): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimal(value: String): Self = this.set("minimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: String): Self = this.set("none", value.asInstanceOf[js.Any])
  }
}
