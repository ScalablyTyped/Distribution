package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callMod {
  
  @JSImport("webdriverio/build/commands/browser/call", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](fn: js.Function0[T]): T | js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[T | js.Promise[T]]
}
