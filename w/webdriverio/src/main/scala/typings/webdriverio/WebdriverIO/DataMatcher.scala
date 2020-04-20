package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMatcher extends js.Object {
  var args: js.Array[String]
  var name: String
}

object DataMatcher {
  @scala.inline
  def apply(args: js.Array[String], name: String): DataMatcher = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMatcher]
  }
}

