package typings.waitForExpect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wait-for-expect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    var defaults: AnonInterval = js.native
    def apply(expectation: js.Function0[Unit]): js.Promise[js.Object] = js.native
    def apply(expectation: js.Function0[Unit], timeout: Double): js.Promise[js.Object] = js.native
    def apply(expectation: js.Function0[Unit], timeout: Double, interval: Double): js.Promise[js.Object] = js.native
  }
  
}

