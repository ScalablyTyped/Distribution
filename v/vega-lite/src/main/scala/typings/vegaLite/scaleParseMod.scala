package typings.vegaLite

import typings.vegaLite.anon.IgnoreRange
import typings.vegaLite.modelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleParseMod {
  
  @JSImport("vega-lite/build/src/compile/scale/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseScaleCore(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleCore")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseScales(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScales")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseScales(model: Model, hasIgnoreRange: IgnoreRange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScales")(model.asInstanceOf[js.Any], hasIgnoreRange.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
