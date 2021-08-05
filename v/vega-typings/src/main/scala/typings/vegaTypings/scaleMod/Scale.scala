package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.scaleMod.OrdinalScale
  - typings.vegaTypings.scaleMod.BandScale
  - typings.vegaTypings.scaleMod.PointScale
  - typings.vegaTypings.scaleMod.SequentialScale
  - typings.vegaTypings.scaleMod.TimeScale
  - typings.vegaTypings.scaleMod.IdentityScale
  - typings.vegaTypings.scaleMod.LinearScale
  - typings.vegaTypings.scaleMod.LogScale
  - typings.vegaTypings.scaleMod.SymLogScale
  - typings.vegaTypings.scaleMod.PowScale
  - typings.vegaTypings.scaleMod.SqrtScale
  - typings.vegaTypings.scaleMod.QuantileScale
  - typings.vegaTypings.scaleMod.QuantizeScale
  - typings.vegaTypings.scaleMod.ThresholdScale
  - typings.vegaTypings.scaleMod.BinOrdinalScale
*/
trait Scale extends StObject
object Scale {
  
  inline def BandScale(name: String): typings.vegaTypings.scaleMod.BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("band")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.BandScale]
  }
  
  inline def BinOrdinalScale(name: String): typings.vegaTypings.scaleMod.BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin-ordinal")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.BinOrdinalScale]
  }
  
  inline def IdentityScale(name: String): typings.vegaTypings.scaleMod.IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.IdentityScale]
  }
  
  inline def LinearScale(name: String): typings.vegaTypings.scaleMod.LinearScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.LinearScale]
  }
  
  inline def LogScale(name: String): typings.vegaTypings.scaleMod.LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.LogScale]
  }
  
  inline def OrdinalScale(name: String): typings.vegaTypings.scaleMod.OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordinal")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.OrdinalScale]
  }
  
  inline def PointScale(name: String): typings.vegaTypings.scaleMod.PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.PointScale]
  }
  
  inline def PowScale(exponent: Double | SignalRef, name: String): typings.vegaTypings.scaleMod.PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pow")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.PowScale]
  }
  
  inline def QuantileScale(name: String): typings.vegaTypings.scaleMod.QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.QuantileScale]
  }
  
  inline def QuantizeScale(name: String): typings.vegaTypings.scaleMod.QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.QuantizeScale]
  }
  
  inline def SequentialScale(name: String): typings.vegaTypings.scaleMod.SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequential")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.SequentialScale]
  }
  
  inline def SqrtScale(name: String): typings.vegaTypings.scaleMod.SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sqrt")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.SqrtScale]
  }
  
  inline def SymLogScale(name: String): typings.vegaTypings.scaleMod.SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symlog")
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.SymLogScale]
  }
  
  inline def ThresholdScale(name: String): typings.vegaTypings.scaleMod.ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.ThresholdScale]
  }
  
  inline def TimeScale(name: String, `type`: time | utc): typings.vegaTypings.scaleMod.TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.TimeScale]
  }
}
