package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogScale
  extends StObject
     with ContinuousScale
     with Scale {
  
  var base: js.UndefOr[Double | SignalRef] = js.undefined
  
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.undefined
  
  @JSName("type")
  var type_LogScale: log
  
  var zero: js.UndefOr[`false`] = js.undefined
}
object LogScale {
  
  @scala.inline
  def apply(name: String): LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[LogScale]
  }
  
  @scala.inline
  implicit class LogScaleMutableBuilder[Self <: LogScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double | SignalRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setNice(value: Boolean | Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZero(value: `false`): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
