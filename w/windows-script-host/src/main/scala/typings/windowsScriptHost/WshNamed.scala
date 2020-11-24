package typings.windowsScriptHost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the named command-line arguments
  *
  * Note that enumerating over this object returns the **names** of the arguments, not the values
  */
@js.native
trait WshNamed extends js.Object {
  
  def apply(name: String): String = js.native
  
  def Count(): Double = js.native
  
  def Exists(Key: String): Boolean = js.native
  
  def Item(name: String): String = js.native
  
  var Length: Double = js.native
}
