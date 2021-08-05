package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeScale
  extends StObject
     with ContinuousScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | TimeInterval | TimeIntervalStep | SignalRef] = js.undefined
  
  @JSName("type")
  var type_TimeScale: time | utc
}
object TimeScale {
  
  inline def apply(name: String, `type`: time | utc): TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
  
  extension [Self <: TimeScale](x: Self) {
    
    inline def setNice(value: Boolean | TimeInterval | TimeIntervalStep | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setType(value: time | utc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
