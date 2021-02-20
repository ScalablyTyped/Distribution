package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleLineMenuResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromisePromise extends StObject {
  
  var promise: js.Promise[SingleLineMenuResponse] = js.native
}
object PromisePromise {
  
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): PromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisePromise]
  }
  
  @scala.inline
  implicit class PromisePromiseMutableBuilder[Self <: PromisePromise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: js.Promise[SingleLineMenuResponse]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
