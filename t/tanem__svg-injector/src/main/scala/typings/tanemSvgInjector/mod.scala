package typings.tanemSvgInjector

import typings.tanemSvgInjector.distSvgInjectorMod.Elements
import typings.tanemSvgInjector.distSvgInjectorMod.OptionalArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tanem/svg-injector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SVGInjector(elements: Elements): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SVGInjector")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def SVGInjector(
    elements: Elements,
    hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsHttpRequestWithCredentialsRenumerateIRIElements: OptionalArgs
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SVGInjector")(elements.asInstanceOf[js.Any], hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsHttpRequestWithCredentialsRenumerateIRIElements.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
