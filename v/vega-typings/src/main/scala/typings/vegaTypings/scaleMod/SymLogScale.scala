package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.symlog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymLogScale
  extends NumericScale
     with Scale {
  
  var constant: js.UndefOr[Double | SignalRef] = js.native
  
  @JSName("type")
  var type_SymLogScale: symlog = js.native
}
object SymLogScale {
  
  @scala.inline
  def apply(name: String, `type`: symlog): SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymLogScale]
  }
  
  @scala.inline
  implicit class SymLogScaleMutableBuilder[Self <: SymLogScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstant(value: Double | SignalRef): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
    
    @scala.inline
    def setType(value: symlog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
