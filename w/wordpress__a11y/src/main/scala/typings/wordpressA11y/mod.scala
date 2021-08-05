package typings.wordpressA11y

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/a11y", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  
  inline def speak(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("speak")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def speak(message: String, ariaLive: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(message.asInstanceOf[js.Any], ariaLive.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
