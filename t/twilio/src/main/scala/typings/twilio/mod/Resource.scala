package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  def get(args: js.Any): Promise[_] = js.native
  def get(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def get(callback: RequestCallback): Promise[_] = js.native
  @JSName("get")
  var get_Original: RestMethod = js.native
}
