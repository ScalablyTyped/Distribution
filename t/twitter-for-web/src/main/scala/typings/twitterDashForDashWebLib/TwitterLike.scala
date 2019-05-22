package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterLike extends js.Object {
  /**
    * All JavaScript code depending on widgets.js should execute on or after this function.
    *
    * @param callback A callback function which will be invoked when widgets.js is ready.
    */
  def ready(callback: js.Function1[/* twttr */ Twitter, scala.Unit]): scala.Unit
}

object TwitterLike {
  @scala.inline
  def apply(ready: js.Function1[/* twttr */ Twitter, scala.Unit] => scala.Unit): TwitterLike = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1(ready))
  
    __obj.asInstanceOf[TwitterLike]
  }
}

