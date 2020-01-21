package typings.superagentProxy.mod.superagentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def proxy(url: String): this.type
}

object Request {
  @scala.inline
  def apply(proxy: String => Request): Request = {
    val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
  
    __obj.asInstanceOf[Request]
  }
}

