package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.transformsMod.TransformCompiler
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalesMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/scales", JSImport.Default)
  @js.native
  val default: TransformCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/scales", "domain")
  @js.native
  def domain(model: UnitModel, channel: ScaleChannel): String = js.native
  
  type _To = TransformCompiler
  
  /* This means you don't have to write `default`, but can instead just say `scalesMod.foo` */
  override def _to: TransformCompiler = default
}
