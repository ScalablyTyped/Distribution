package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import typings.vegaTypings.vegaTypingsStrings.band
import typings.vegaTypings.vegaTypingsStrings.identity
import typings.vegaTypings.vegaTypingsStrings.log
import typings.vegaTypings.vegaTypingsStrings.ordinal
import typings.vegaTypings.vegaTypingsStrings.point
import typings.vegaTypings.vegaTypingsStrings.pow
import typings.vegaTypings.vegaTypingsStrings.sequential
import typings.vegaTypings.vegaTypingsStrings.sqrt
import typings.vegaTypings.vegaTypingsStrings.symlog
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait Scale extends js.Object
object Scale {
  
  @scala.inline
  def PowScale(exponent: Double | SignalRef, name: String, `type`: pow): Scale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def PointScale(name: String, `type`: point): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def LinearScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def SqrtScale(name: String, `type`: sqrt): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def SymLogScale(name: String, `type`: symlog): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def TimeScale(name: String, `type`: time | utc): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def QuantizeScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def BandScale(name: String, `type`: band): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def BinOrdinalScale(name: String, `type`: `bin-ordinal`): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def QuantileScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def OrdinalScale(name: String, `type`: ordinal): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def LogScale(name: String, `type`: log): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def SequentialScale(name: String, `type`: sequential): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def IdentityScale(name: String, `type`: identity): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def ThresholdScale(name: String): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}
