package typings.wegameApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
}

object `1` {
  @scala.inline
  def apply(header: StringDictionary[String] = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

