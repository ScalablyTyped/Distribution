package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.PositionFieldDef
import typings.vegaLite.channeldefMod.SecondaryFieldDef
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousAxis extends StObject {
  
  var continuousAxis: x | y = js.native
  
  var continuousAxisChannelDef: PositionFieldDef[String] = js.native
  
  var continuousAxisChannelDef2: SecondaryFieldDef[String] = js.native
  
  var continuousAxisChannelDefError: SecondaryFieldDef[String] = js.native
  
  var continuousAxisChannelDefError2: SecondaryFieldDef[String] = js.native
}
object ContinuousAxis {
  
  @scala.inline
  def apply(
    continuousAxis: x | y,
    continuousAxisChannelDef: PositionFieldDef[String],
    continuousAxisChannelDef2: SecondaryFieldDef[String],
    continuousAxisChannelDefError: SecondaryFieldDef[String],
    continuousAxisChannelDefError2: SecondaryFieldDef[String]
  ): ContinuousAxis = {
    val __obj = js.Dynamic.literal(continuousAxis = continuousAxis.asInstanceOf[js.Any], continuousAxisChannelDef = continuousAxisChannelDef.asInstanceOf[js.Any], continuousAxisChannelDef2 = continuousAxisChannelDef2.asInstanceOf[js.Any], continuousAxisChannelDefError = continuousAxisChannelDefError.asInstanceOf[js.Any], continuousAxisChannelDefError2 = continuousAxisChannelDefError2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousAxis]
  }
  
  @scala.inline
  implicit class ContinuousAxisMutableBuilder[Self <: ContinuousAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuousAxis(value: typings.vegaLite.vegaLiteStrings.x | y): Self = StObject.set(x, "continuousAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousAxisChannelDef(value: PositionFieldDef[String]): Self = StObject.set(x, "continuousAxisChannelDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousAxisChannelDef2(value: SecondaryFieldDef[String]): Self = StObject.set(x, "continuousAxisChannelDef2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousAxisChannelDefError(value: SecondaryFieldDef[String]): Self = StObject.set(x, "continuousAxisChannelDefError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousAxisChannelDefError2(value: SecondaryFieldDef[String]): Self = StObject.set(x, "continuousAxisChannelDefError2", value.asInstanceOf[js.Any])
  }
}
