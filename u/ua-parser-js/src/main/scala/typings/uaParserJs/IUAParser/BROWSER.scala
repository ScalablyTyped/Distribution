package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BROWSER extends js.Object {
  
  /**
    * @deprecated
    */
  var MAJOR: String = js.native
  
  var NAME: String = js.native
  
  var VERSION: String = js.native
}
object BROWSER {
  
  @scala.inline
  def apply(MAJOR: String, NAME: String, VERSION: String): BROWSER = {
    val __obj = js.Dynamic.literal(MAJOR = MAJOR.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[BROWSER]
  }
  
  @scala.inline
  implicit class BROWSEROps[Self <: BROWSER] (val x: Self) extends AnyVal {
    
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
    def setMAJOR(value: String): Self = this.set("MAJOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNAME(value: String): Self = this.set("NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
  }
}
