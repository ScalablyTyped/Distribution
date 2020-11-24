package typings.windowsScriptHost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the unnamed command-line arguments */
@js.native
trait WshUnnamed extends js.Object {
  
  def apply(index: Double): String = js.native
  
  def Count(): Double = js.native
  
  def Item(index: Double): String = js.native
  
  var Length: Double = js.native
}
