package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`10`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`12`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`13`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`14`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`15`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`16`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`17`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`1`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`3`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`4`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`5`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`6`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`7`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoadSpeedBase extends StObject {
  
  var roadCategory: js.UndefOr[
    `16` | `3` | `13` | `17` | `4` | `7` | `5` | `15` | `12` | `6` | `10` | `8` | `1` | `14`
  ] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object RoadSpeedBase {
  
  inline def apply(): RoadSpeedBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoadSpeedBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoadSpeedBase] (val x: Self) extends AnyVal {
    
    inline def setRoadCategory(value: `16` | `3` | `13` | `17` | `4` | `7` | `5` | `15` | `12` | `6` | `10` | `8` | `1` | `14`): Self = StObject.set(x, "roadCategory", value.asInstanceOf[js.Any])
    
    inline def setRoadCategoryUndefined: Self = StObject.set(x, "roadCategory", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
