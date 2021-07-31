package typings.vegaLite

import typings.vegaLite.modelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionParseMod {
  
  @JSImport("vega-lite/build/src/compile/projection/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseProjection(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseProjection")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
