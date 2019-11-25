package typings.xmlDashCrypto

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.undefined
  var location: js.UndefOr[Anon_Action] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Anon_Attrs {
  @scala.inline
  def apply(
    attrs: StringDictionary[js.Any] = null,
    existingPrefixes: StringDictionary[String] = null,
    location: Anon_Action = null,
    prefix: String = null
  ): Anon_Attrs = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (existingPrefixes != null) __obj.updateDynamic("existingPrefixes")(existingPrefixes.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attrs]
  }
}

