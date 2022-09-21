package typings.stylableRuntime

import typings.stylableRuntime.typesMod.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectStylesMod {
  
  @JSImport("@stylable/runtime/dist/inject-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectStyles(host: Host): Host = ^.asInstanceOf[js.Dynamic].applyDynamic("injectStyles")(host.asInstanceOf[js.Any]).asInstanceOf[Host]
}
