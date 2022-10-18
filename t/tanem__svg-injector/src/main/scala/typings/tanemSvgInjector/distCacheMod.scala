package typings.tanemSvgInjector

import org.scalablytyped.runtime.Shortcut
import typings.std.Map
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheMod extends Shortcut {
  
  @JSImport("@tanem/svg-injector/dist/cache", JSImport.Default)
  @js.native
  val default: Map[String, js.UndefOr[js.Error | SVGSVGElement]] = js.native
  
  type _To = Map[String, js.UndefOr[js.Error | SVGSVGElement]]
  
  /* This means you don't have to write `default`, but can instead just say `distCacheMod.foo` */
  override def _to: Map[String, js.UndefOr[js.Error | SVGSVGElement]] = default
}
