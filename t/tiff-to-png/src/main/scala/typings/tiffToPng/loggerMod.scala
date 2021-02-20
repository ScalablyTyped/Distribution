package typings.tiffToPng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("tiff-to-png/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tiff-to-png/logger", "debugError")
  @js.native
  def debugError(target: String, stack: String): Unit = js.native
  
  @JSImport("tiff-to-png/logger", "error")
  @js.native
  def error(message: String): Unit = js.native
  
  @JSImport("tiff-to-png/logger", "fail")
  @js.native
  def fail(message: String): Unit = js.native
  
  @JSImport("tiff-to-png/logger", "level")
  @js.native
  def level: Double = js.native
  @scala.inline
  def level_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
  
  @JSImport("tiff-to-png/logger", "padding")
  @js.native
  def padding: String = js.native
  @scala.inline
  def padding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
  
  @JSImport("tiff-to-png/logger", "space")
  @js.native
  def space(): Unit = js.native
  
  @JSImport("tiff-to-png/logger", "success")
  @js.native
  def success(message: String): Unit = js.native
  
  @JSImport("tiff-to-png/logger", "tabbed")
  @js.native
  def tabbed(message: String): Unit = js.native
  @JSImport("tiff-to-png/logger", "tabbed")
  @js.native
  def tabbed(message: String, success: Boolean): Unit = js.native
  
  @JSImport("tiff-to-png/logger", "title")
  @js.native
  def title(title: String): Unit = js.native
  @JSImport("tiff-to-png/logger", "title")
  @js.native
  def title(title: String, comment: String): Unit = js.native
}
