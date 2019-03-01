package typings
package useragentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
  var family: java.lang.String
  var major: js.UndefOr[java.lang.String]
  var minor: js.UndefOr[java.lang.String]
  var patch: js.UndefOr[java.lang.String]
}

object Anon_Family {
  @scala.inline
  def apply(
    family: java.lang.String,
    major: java.lang.String = null,
    minor: java.lang.String = null,
    patch: java.lang.String = null
  ): Anon_Family = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("family")(family)
    if (major != null) __obj.updateDynamic("major")(major)
    if (minor != null) __obj.updateDynamic("minor")(minor)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_Family]
  }
}

