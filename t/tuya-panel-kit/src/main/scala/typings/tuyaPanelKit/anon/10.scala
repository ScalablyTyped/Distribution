package typings.tuyaPanelKit.anon

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10`[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: EventName = js.native
}
object `10` {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](`type`: EventName): `10`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`[EventName]]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`[_], EventName /* <: Extract[/* keyof {} */ String, String] */] (val x: Self with `10`[EventName]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
