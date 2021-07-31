package typings.tanemSvgInjector

import typings.tanemSvgInjector.svgInjectorMod.Elements
import typings.tanemSvgInjector.svgInjectorMod.OptionalArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tanem/svg-injector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def SVGInjector(elements: Elements): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SVGInjector")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def SVGInjector(
    elements: Elements,
    hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsRenumerateIRIElements: OptionalArgs
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SVGInjector")(elements.asInstanceOf[js.Any], hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsRenumerateIRIElements.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
