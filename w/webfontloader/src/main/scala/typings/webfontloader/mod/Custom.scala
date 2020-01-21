package typings.webfontloader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends js.Object {
  var families: js.UndefOr[js.Array[String]] = js.undefined
  var testStrings: js.UndefOr[StringDictionary[String]] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object Custom {
  @scala.inline
  def apply(
    families: js.Array[String] = null,
    testStrings: StringDictionary[String] = null,
    urls: js.Array[String] = null
  ): Custom = {
    val __obj = js.Dynamic.literal()
    if (families != null) __obj.updateDynamic("families")(families.asInstanceOf[js.Any])
    if (testStrings != null) __obj.updateDynamic("testStrings")(testStrings.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}

