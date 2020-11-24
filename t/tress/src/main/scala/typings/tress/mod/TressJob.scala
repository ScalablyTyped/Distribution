package typings.tress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TressJob extends js.Object {
  
  def callback(args: js.Any*): Unit = js.native
  @JSName("callback")
  var callback_Original: TressJobCallback = js.native
  
  var data: TressJobData = js.native
}
