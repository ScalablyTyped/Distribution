package typings.vegaLite

import typings.vegaLite.compileFacetMod.FacetModel
import typings.vegaLite.vegaLiteStrings.footer
import typings.vegaLite.vegaLiteStrings.header
import typings.vegaTypings.axisMod.AxisOrient
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerParseMod {
  
  @JSImport("vega-lite/build/src/compile/header/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getHeaderType(orient: AxisOrient): footer | header = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderType")(orient.asInstanceOf[js.Any]).asInstanceOf[footer | header]
  @scala.inline
  def getHeaderType(orient: SignalRef): footer | header = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderType")(orient.asInstanceOf[js.Any]).asInstanceOf[footer | header]
  
  @scala.inline
  def parseFacetHeaders(model: FacetModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFacetHeaders")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
