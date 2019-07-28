package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Replace extends js.Object {
  var replace: js.UndefOr[String | Boolean] = js.undefined
}

object Anon_Replace {
  @scala.inline
  def apply(replace: String | Boolean = null): Anon_Replace = {
    val __obj = js.Dynamic.literal()
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Replace]
  }
}

