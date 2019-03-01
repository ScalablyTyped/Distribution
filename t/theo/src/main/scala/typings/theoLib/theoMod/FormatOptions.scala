package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  var options: js.UndefOr[
    js.Function2[
      /* options */ js.Object, 
      /* transformPropName */ js.UndefOr[js.Function1[/* name */ java.lang.String, java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
  var `type`: Format
}

object FormatOptions {
  @scala.inline
  def apply(
    `type`: Format,
    options: js.Function2[
      /* options */ js.Object, 
      /* transformPropName */ js.UndefOr[js.Function1[/* name */ java.lang.String, java.lang.String]], 
      scala.Unit
    ] = null
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[FormatOptions]
  }
}

