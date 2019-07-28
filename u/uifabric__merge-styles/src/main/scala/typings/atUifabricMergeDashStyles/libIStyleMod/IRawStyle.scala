package typings.atUifabricMergeDashStyles.libIStyleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.IRawStyleBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawStyle
  extends IRawStyleBase
     with _IStyleBase {
  /**
    * Display name for the style.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Custom selectors for the style.
    */
  var selectors: js.UndefOr[StringDictionary[IStyle]] = js.undefined
}

object IRawStyle {
  @scala.inline
  def apply(
    IRawStyleBase: IRawStyleBase = null,
    _IStyleBase: _IStyleBase = null,
    displayName: String = null,
    selectors: StringDictionary[IStyle] = null
  ): IRawStyle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IRawStyleBase)
    js.Dynamic.global.Object.assign(__obj, _IStyleBase)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[IRawStyle]
  }
}

