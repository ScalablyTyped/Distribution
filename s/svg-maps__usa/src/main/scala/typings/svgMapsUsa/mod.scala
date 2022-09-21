package typings.svgMapsUsa

import org.scalablytyped.runtime.Shortcut
import typings.svgMapsCommon.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@svg-maps/usa", JSImport.Default)
  @js.native
  val default: Map = js.native
  
  type _To = Map
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Map = default
}
