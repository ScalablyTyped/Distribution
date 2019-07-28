package typings.useragent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
  var family: String
  var major: js.UndefOr[String] = js.undefined
  var minor: js.UndefOr[String] = js.undefined
  var patch: js.UndefOr[String] = js.undefined
}

object Anon_Family {
  @scala.inline
  def apply(family: String, major: String = null, minor: String = null, patch: String = null): Anon_Family = {
    val __obj = js.Dynamic.literal(family = family)
    if (major != null) __obj.updateDynamic("major")(major)
    if (minor != null) __obj.updateDynamic("minor")(minor)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_Family]
  }
}

