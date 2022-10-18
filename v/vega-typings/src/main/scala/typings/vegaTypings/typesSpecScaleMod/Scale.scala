package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecScaleMod.OrdinalScale
  - typings.vegaTypings.typesSpecScaleMod.BandScale
  - typings.vegaTypings.typesSpecScaleMod.PointScale
  - typings.vegaTypings.typesSpecScaleMod.SequentialScale
  - typings.vegaTypings.typesSpecScaleMod.TimeScale
  - typings.vegaTypings.typesSpecScaleMod.IdentityScale
  - typings.vegaTypings.typesSpecScaleMod.LinearScale
  - typings.vegaTypings.typesSpecScaleMod.LogScale
  - typings.vegaTypings.typesSpecScaleMod.SymLogScale
  - typings.vegaTypings.typesSpecScaleMod.PowScale
  - typings.vegaTypings.typesSpecScaleMod.SqrtScale
  - typings.vegaTypings.typesSpecScaleMod.QuantileScale
  - typings.vegaTypings.typesSpecScaleMod.QuantizeScale
  - typings.vegaTypings.typesSpecScaleMod.ThresholdScale
  - typings.vegaTypings.typesSpecScaleMod.BinOrdinalScale
*/
trait Scale extends StObject
object Scale {
  
  inline def BandScale(name: String): typings.vegaTypings.typesSpecScaleMod.BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("band")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.BandScale]
  }
  
  inline def BinOrdinalScale(name: String): typings.vegaTypings.typesSpecScaleMod.BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin-ordinal")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.BinOrdinalScale]
  }
  
  inline def IdentityScale(name: String): typings.vegaTypings.typesSpecScaleMod.IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.IdentityScale]
  }
  
  inline def LinearScale(name: String): typings.vegaTypings.typesSpecScaleMod.LinearScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.LinearScale]
  }
  
  inline def LogScale(name: String): typings.vegaTypings.typesSpecScaleMod.LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.LogScale]
  }
  
  inline def OrdinalScale(name: String): typings.vegaTypings.typesSpecScaleMod.OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordinal")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.OrdinalScale]
  }
  
  inline def PointScale(name: String): typings.vegaTypings.typesSpecScaleMod.PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.PointScale]
  }
  
  inline def PowScale(exponent: Double | SignalRef, name: String): typings.vegaTypings.typesSpecScaleMod.PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pow")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.PowScale]
  }
  
  inline def QuantileScale(name: String): typings.vegaTypings.typesSpecScaleMod.QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.QuantileScale]
  }
  
  inline def QuantizeScale(name: String): typings.vegaTypings.typesSpecScaleMod.QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.QuantizeScale]
  }
  
  inline def SequentialScale(name: String): typings.vegaTypings.typesSpecScaleMod.SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequential")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.SequentialScale]
  }
  
  inline def SqrtScale(name: String): typings.vegaTypings.typesSpecScaleMod.SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sqrt")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.SqrtScale]
  }
  
  inline def SymLogScale(name: String): typings.vegaTypings.typesSpecScaleMod.SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symlog")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.SymLogScale]
  }
  
  inline def ThresholdScale(name: String): typings.vegaTypings.typesSpecScaleMod.ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.ThresholdScale]
  }
  
  inline def TimeScale(name: String, `type`: time | utc): typings.vegaTypings.typesSpecScaleMod.TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecScaleMod.TimeScale]
  }
}
