package typings.ukCoWorkingedgePhonegapPluginIstablet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  /**
    * Indicates whether the current device is a tablet or a phone.
    * True if the device is a tablet; false if the device is a phone.
    */
  var isTablet: Boolean = js.native
}
object Window {
  
  @scala.inline
  def apply(isTablet: Boolean): Window = {
    val __obj = js.Dynamic.literal(isTablet = isTablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setIsTablet(value: Boolean): Self = this.set("isTablet", value.asInstanceOf[js.Any])
  }
}
