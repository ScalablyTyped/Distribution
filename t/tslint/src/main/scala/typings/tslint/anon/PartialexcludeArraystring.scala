package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  exclude  :std.Array<string>,   format  :string}> */
trait PartialexcludeArraystring extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
}

object PartialexcludeArraystring {
  @scala.inline
  def apply(exclude: js.Array[String] = null, format: String = null): PartialexcludeArraystring = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialexcludeArraystring]
  }
}

