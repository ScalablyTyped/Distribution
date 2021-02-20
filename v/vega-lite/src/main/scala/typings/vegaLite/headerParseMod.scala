package typings.vegaLite

import typings.vegaLite.compileFacetMod.FacetModel
import typings.vegaLite.vegaLiteStrings.footer
import typings.vegaLite.vegaLiteStrings.header
import typings.vegaTypings.axisMod.AxisOrient
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerParseMod {
  
  @JSImport("vega-lite/build/src/compile/header/parse", "getHeaderType")
  @js.native
  def getHeaderType(orient: AxisOrient): footer | header = js.native
  @JSImport("vega-lite/build/src/compile/header/parse", "getHeaderType")
  @js.native
  def getHeaderType(orient: SignalRef): footer | header = js.native
  
  @JSImport("vega-lite/build/src/compile/header/parse", "parseFacetHeaders")
  @js.native
  def parseFacetHeaders(model: FacetModel): Unit = js.native
}
