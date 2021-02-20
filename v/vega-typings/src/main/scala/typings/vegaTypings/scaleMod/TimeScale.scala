package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeScale
  extends ContinuousScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | TimeInterval | TimeIntervalStep | SignalRef] = js.native
  
  @JSName("type")
  var type_TimeScale: time | utc = js.native
}
object TimeScale {
  
  @scala.inline
  def apply(name: String, `type`: time | utc): TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
  
  @scala.inline
  implicit class TimeScaleMutableBuilder[Self <: TimeScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNice(value: Boolean | TimeInterval | TimeIntervalStep | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setType(value: time | utc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
