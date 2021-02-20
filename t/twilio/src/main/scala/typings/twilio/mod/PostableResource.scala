package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostableResource extends Resource {
  
  def post(args: js.Any): Promise[_] = js.native
  def post(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def post(callback: RequestCallback): Promise[_] = js.native
  @JSName("post")
  var post_Original: RestMethod = js.native
}
