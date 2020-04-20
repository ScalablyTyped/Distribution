package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnonymous extends js.Object {
  var anonymous: String
  var asyncArrow: String
  var constructor: String
  var method: String
  var named: String
}

object AnonAnonymous {
  @scala.inline
  def apply(anonymous: String, asyncArrow: String, constructor: String, method: String, named: String): AnonAnonymous = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], asyncArrow = asyncArrow.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnonymous]
  }
}

