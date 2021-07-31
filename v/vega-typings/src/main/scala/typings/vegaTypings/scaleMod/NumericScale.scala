package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericScale
  extends StObject
     with ContinuousScale {
  
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.undefined
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}
object NumericScale {
  
  @scala.inline
  def apply(name: String): NumericScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericScale]
  }
  
  @scala.inline
  implicit class NumericScaleMutableBuilder[Self <: NumericScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNice(value: Boolean | Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
