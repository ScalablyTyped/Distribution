package typings.vegaLite

import typings.vegaLite.concatMod.ConcatModel
import typings.vegaLite.modelMod.Model
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutsizeParseMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", "parseChildrenLayoutSize")
  @js.native
  def parseChildrenLayoutSize(model: Model): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", "parseConcatLayoutSize")
  @js.native
  def parseConcatLayoutSize(model: ConcatModel): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", "parseLayerLayoutSize")
  @js.native
  def parseLayerLayoutSize(model: Model): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", "parseRepeatLayoutSize")
  @js.native
  val parseRepeatLayoutSize: js.Function1[/* model */ ConcatModel, Unit] = js.native
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", "parseUnitLayoutSize")
  @js.native
  def parseUnitLayoutSize(model: UnitModel): Unit = js.native
}
