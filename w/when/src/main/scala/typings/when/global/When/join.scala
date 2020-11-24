package typings.when.global.When

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("When.join")
@js.native
object join extends js.Object {
  
  /**
    * Joins multiple promises into a single returned promise.
    * @return a promise that will fulfill when *all* the input promises
    * have fulfilled, or will reject when *any one* of the input promises rejects.
    */
  def apply[T](promises: (js.Any | Promise[T])*): Promise[js.Array[T]] = js.native
}
