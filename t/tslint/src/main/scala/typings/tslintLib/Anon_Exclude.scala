package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  var exclude: js.Array[java.lang.String]
  var format: java.lang.String
}

object Anon_Exclude {
  @scala.inline
  def apply(exclude: js.Array[java.lang.String], format: java.lang.String): Anon_Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Anon_Exclude]
  }
}

