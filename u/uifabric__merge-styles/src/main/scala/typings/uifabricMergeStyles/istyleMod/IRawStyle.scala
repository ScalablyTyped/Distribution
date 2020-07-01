package typings.uifabricMergeStyles.istyleMod

import org.scalablytyped.runtime.StringDictionary
import typings.uifabricMergeStyles.irawstylebaseMod.IRawStyleBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawStyle
  extends IRawStyleBase
     with /**
  * Allow css variables, strings, objects. While we should have more strict typing
  * here, partners are broken in many unpredictable cases where typescript can't infer
  * the right typing. Loosening the typing to both allow for css variables and other things.
  */
/* key */ StringDictionary[js.Any]
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
    StringDictionary: /**
    * Allow css variables, strings, objects. While we should have more strict typing
    * here, partners are broken in many unpredictable cases where typescript can't infer
    * the right typing. Loosening the typing to both allow for css variables and other things.
    */
  /* key */ StringDictionary[js.Any] = null,
    _IStyleBase: _IStyleBase = null,
    displayName: String = null,
    selectors: StringDictionary[IStyle] = null
  ): IRawStyle = {
    val __obj = js.Dynamic.literal()
    if (IRawStyleBase != null) js.Dynamic.global.Object.assign(__obj, IRawStyleBase)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_IStyleBase != null) js.Dynamic.global.Object.assign(__obj, _IStyleBase)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawStyle]
  }
}

