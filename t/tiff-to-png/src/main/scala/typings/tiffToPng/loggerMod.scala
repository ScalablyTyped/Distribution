package typings.tiffToPng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("tiff-to-png/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debugError(target: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debugError")(target.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("tiff-to-png/logger", "level")
  @js.native
  def level: Double = js.native
  inline def level_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
  
  @JSImport("tiff-to-png/logger", "padding")
  @js.native
  def padding: String = js.native
  inline def padding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
  
  inline def space(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("space")().asInstanceOf[Unit]
  
  inline def success(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tabbed(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tabbed")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def tabbed(message: String, success: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tabbed")(message.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def title(title: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("title")(title.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def title(title: String, comment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(title.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
