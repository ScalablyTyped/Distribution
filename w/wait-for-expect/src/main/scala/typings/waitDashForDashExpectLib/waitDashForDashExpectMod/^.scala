package typings
package waitDashForDashExpectLib.waitDashForDashExpectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wait-for-expect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Waits for the expectation to pass and returns a Promise
    *
    * @param  expectation  Function  Expectation that has to complete without throwing
    * @param  timeout  Number  Maximum wait interval, 4500ms by default
    * @param  interval  Number  Wait-between-retries interval, 50ms by default
    * @return  Promise  Promise to return a callback result
    */
  def default(expectation: js.Function0[scala.Unit]): js.Promise[js.Object] = js.native
  def default(expectation: js.Function0[scala.Unit], timeout: scala.Double): js.Promise[js.Object] = js.native
  def default(expectation: js.Function0[scala.Unit], timeout: scala.Double, interval: scala.Double): js.Promise[js.Object] = js.native
}

