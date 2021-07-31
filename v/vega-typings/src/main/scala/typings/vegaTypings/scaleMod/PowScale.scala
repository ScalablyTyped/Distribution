package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.pow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowScale
  extends StObject
     with NumericScale
     with Scale {
  
  var exponent: Double | SignalRef
  
  @JSName("type")
  var type_PowScale: pow
}
object PowScale {
  
  @scala.inline
  def apply(exponent: Double | SignalRef, name: String): PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pow")
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
