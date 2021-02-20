package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleColumnMenuResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var promise: js.Promise[SingleColumnMenuResponse] = js.native
}
object `2` {
  
  @scala.inline
  def apply(promise: js.Promise[SingleColumnMenuResponse]): `2` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: js.Promise[SingleColumnMenuResponse]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
