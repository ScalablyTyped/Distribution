package typings
package vegaDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.Array[java.lang.String]
  var fname: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(fields: js.Array[java.lang.String], fname: java.lang.String = null): Anon_Fields = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (fname != null) __obj.updateDynamic("fname")(fname)
    __obj.asInstanceOf[Anon_Fields]
  }
}

