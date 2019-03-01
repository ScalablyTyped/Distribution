package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var name: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(content: java.lang.String, name: java.lang.String): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Content]
  }
}

