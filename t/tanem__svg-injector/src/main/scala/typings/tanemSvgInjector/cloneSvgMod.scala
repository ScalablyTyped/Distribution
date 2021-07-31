package typings.tanemSvgInjector

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneSvgMod {
  
  @JSImport("@tanem/svg-injector/dist/clone-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(sourceSvg: SVGElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceSvg.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
}
