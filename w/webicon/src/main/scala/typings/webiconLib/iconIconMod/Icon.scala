package typings
package webiconLib.iconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  /**
    * Parses the input to an icon-id.
    *
    * @param id
    * The id of the icon to get.
    *
    * @param params
    * Additional parameters for getting the icon.
    *
    * @return
    * The id of the icon to get.
    */
  var iconIdParser: js.UndefOr[
    js.Function2[/* id */ java.lang.String, /* params */ js.Array[java.lang.String], java.lang.String]
  ] = js.undefined
}

object Icon {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null
  ): Icon = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    __obj.asInstanceOf[Icon]
  }
}

