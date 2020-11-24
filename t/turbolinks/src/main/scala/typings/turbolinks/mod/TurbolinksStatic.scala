package typings.turbolinks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TurbolinksStatic extends js.Object {
  
  def clearCache(): Unit = js.native
  
  def setProgressBarDelay(delayInMilliseconds: Double): Unit = js.native
  
  def start(): Unit = js.native
  
  var supported: Boolean = js.native
  
  def visit(location: String): Unit = js.native
  def visit(location: String, options: Action): Unit = js.native
}
