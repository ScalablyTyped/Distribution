package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpStack extends js.Object {
  def createRequest(method: String, url: String): HttpRequest
  def getName(): String
}

object HttpStack {
  @scala.inline
  def apply(createRequest: (String, String) => HttpRequest, getName: () => String): HttpStack = {
    val __obj = js.Dynamic.literal(createRequest = js.Any.fromFunction2(createRequest), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[HttpStack]
  }
}

