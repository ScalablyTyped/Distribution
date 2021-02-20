package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUnicodeHandling extends StObject {
  
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
  implicit class IUnicodeHandlingMutableBuilder[Self <: IUnicodeHandling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVersion(value: String): Self = StObject.set(x, "activeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: IUnicodeVersionProvider => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
