package typings.wordpressA11y

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNativeMod {
  
  @JSImport("@wordpress/a11y/build-types/index.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def speak(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("speak")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def speak(message: String, ariaLive: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(message.asInstanceOf[js.Any], ariaLive.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
