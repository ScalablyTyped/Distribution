package typings.vegaLite

import typings.vegaLite.concatMod.ConcatModel
import typings.vegaLite.modelMod.Model
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutsizeParseMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseChildrenLayoutSize(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseChildrenLayoutSize")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseConcatLayoutSize(model: ConcatModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConcatLayoutSize")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseLayerLayoutSize(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLayerLayoutSize")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("vega-lite/build/src/compile/layoutsize/parse", "parseRepeatLayoutSize")
  @js.native
  val parseRepeatLayoutSize: js.Function1[/* model */ ConcatModel, Unit] = js.native
  
  inline def parseUnitLayoutSize(model: UnitModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitLayoutSize")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
