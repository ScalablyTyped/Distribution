package typings.universalCookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpts extends js.Object {
  /**
    * do not convert the cookie into an object no matter what
    */
  var doNotParse: Boolean
}

object GetOpts {
  @scala.inline
  def apply(doNotParse: Boolean): GetOpts = {
    val __obj = js.Dynamic.literal(doNotParse = doNotParse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOpts]
  }
}

