package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cursor extends js.Object {
  var cursor: scala.Double
  var value: java.lang.String
}

object Anon_Cursor {
  @scala.inline
  def apply(cursor: scala.Double, value: java.lang.String): Anon_Cursor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cursor")(cursor)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Cursor]
  }
}

