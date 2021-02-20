package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.pow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowScale
  extends NumericScale
     with Scale {
  
  var exponent: Double | SignalRef = js.native
  
  @JSName("type")
  var type_PowScale: pow = js.native
}
object PowScale {
  
  @scala.inline
  def apply(exponent: Double | SignalRef, name: String, `type`: pow): PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowScale]
  }
  
  @scala.inline
  implicit class PowScaleMutableBuilder[Self <: PowScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExponent(value: Double | SignalRef): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
