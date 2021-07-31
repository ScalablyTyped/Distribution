package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaLite.specConcatMod.NormalizedConcatSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("vega-lite/build/src/compile/concat", "ConcatModel")
  @js.native
  class ConcatModel protected () extends Model {
    def this(spec: NormalizedConcatSpec, parent: Model, parentGivenName: String, config: Config[SignalRef]) = this()
    
    var getChildren: js.Any = js.native
    
    def parseAxisGroup(): Unit = js.native
  }
}
