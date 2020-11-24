package typings.tiffToPng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tiff-to-png/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  def debugError(target: String, stack: String): Unit = js.native
  
  def error(message: String): Unit = js.native
  
  def fail(message: String): Unit = js.native
  
  var level: Double = js.native
  
  var padding: String = js.native
  
  def space(): Unit = js.native
  
  def success(message: String): Unit = js.native
  
  def tabbed(message: String): Unit = js.native
  def tabbed(message: String, success: Boolean): Unit = js.native
  
  def title(title: String): Unit = js.native
  def title(title: String, comment: String): Unit = js.native
}
