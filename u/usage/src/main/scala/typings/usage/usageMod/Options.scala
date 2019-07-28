package typings.usage.usageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var keepHistory: Boolean
}

object Options {
  @scala.inline
  def apply(keepHistory: Boolean): Options = {
    val __obj = js.Dynamic.literal(keepHistory = keepHistory)
  
    __obj.asInstanceOf[Options]
  }
}

