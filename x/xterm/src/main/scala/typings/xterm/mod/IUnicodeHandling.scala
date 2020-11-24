package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUnicodeHandling extends js.Object {
  
  /**
    * Getter/setter for active Unicode version.
    */
  var activeVersion: String = js.native
  
  /**
    * Register a custom Unicode version provider.
    */
  def register(provider: IUnicodeVersionProvider): Unit = js.native
  
  /**
    * Registered Unicode versions.
    */
  val versions: js.Array[String] = js.native
}
object IUnicodeHandling {
  
  @scala.inline
  def apply(activeVersion: String, register: IUnicodeVersionProvider => Unit, versions: js.Array[String]): IUnicodeHandling = {
    val __obj = js.Dynamic.literal(activeVersion = activeVersion.asInstanceOf[js.Any], register = js.Any.fromFunction1(register), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnicodeHandling]
  }
  
  @scala.inline
  implicit class IUnicodeHandlingOps[Self <: IUnicodeHandling] (val x: Self) extends AnyVal {
    
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
    def setActiveVersion(value: String): Self = this.set("activeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: IUnicodeVersionProvider => Unit): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
