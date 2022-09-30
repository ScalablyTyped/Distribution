package typings.webdriverio

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEqualMod {
  
  @JSImport("webdriverio/build/commands/element/isEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(el: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
