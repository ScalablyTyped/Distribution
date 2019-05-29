package typings
package atUifabricMergeDashStylesLib.libIStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawStyle
  extends atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IRawStyleBase
     with _IStyleBase {
  /**
    * Display name for the style.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom selectors for the style.
    */
  var selectors: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IStyle]] = js.undefined
}

object IRawStyle {
  @scala.inline
  def apply(
    IRawStyleBase: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IRawStyleBase = null,
    _IStyleBase: _IStyleBase = null,
    displayName: java.lang.String = null,
    selectors: org.scalablytyped.runtime.StringDictionary[IStyle] = null
  ): IRawStyle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IRawStyleBase)
    js.Dynamic.global.Object.assign(__obj, _IStyleBase)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[IRawStyle]
  }
}

