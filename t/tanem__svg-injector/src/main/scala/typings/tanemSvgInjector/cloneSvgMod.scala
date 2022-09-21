package typings.tanemSvgInjector

import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneSvgMod {
  
  @JSImport("@tanem/svg-injector/dist/clone-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sourceSvg: SVGSVGElement): SVGSVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceSvg.asInstanceOf[js.Any]).asInstanceOf[SVGSVGElement]
}
