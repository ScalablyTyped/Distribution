package typings.vegaLite

import typings.vegaLite.anon.IgnoreRange
import typings.vegaLite.modelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleParseMod {
  
  @JSImport("vega-lite/build/src/compile/scale/parse", "parseScaleCore")
  @js.native
  def parseScaleCore(model: Model): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/parse", "parseScales")
  @js.native
  def parseScales(model: Model): Unit = js.native
  @JSImport("vega-lite/build/src/compile/scale/parse", "parseScales")
  @js.native
  def parseScales(model: Model, hasIgnoreRange: IgnoreRange): Unit = js.native
}
