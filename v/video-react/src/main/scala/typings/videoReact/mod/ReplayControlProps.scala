package typings.videoReact.mod

import typings.videoReact.videoReactInts.`10`
import typings.videoReact.videoReactInts.`30`
import typings.videoReact.videoReactInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayControlProps extends StObject {
  
  /**
    * How many seconds to go forward, default: `10`
    */
  var seconds: js.UndefOr[`5` | `10` | `30`] = js.undefined
}
object ReplayControlProps {
  
  inline def apply(): ReplayControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplayControlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayControlProps] (val x: Self) extends AnyVal {
    
    inline def setSeconds(value: `5` | `10` | `30`): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
