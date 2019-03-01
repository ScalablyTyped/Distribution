package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingOptions
  extends /**
  * Signature for further properties.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String] {
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: scala.Boolean
  /**
    * Size of a tab in spaces.
    */
  var tabSize: scala.Double
}

object FormattingOptions {
  @scala.inline
  def apply(
    insertSpaces: scala.Boolean,
    tabSize: scala.Double,
    StringDictionary: /**
    * Signature for further properties.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String] = null
  ): FormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insertSpaces")(insertSpaces)
    __obj.updateDynamic("tabSize")(tabSize)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FormattingOptions]
  }
}

