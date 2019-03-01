package typings
package urlencodeLib.urlencodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait charsetParam extends js.Object {
  var charset: java.lang.String
}

object charsetParam {
  @scala.inline
  def apply(charset: java.lang.String): charsetParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charset")(charset)
    __obj.asInstanceOf[charsetParam]
  }
}

