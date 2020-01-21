package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingOptions
  extends /**
		 * Signature for further properties.
		 */
/* key */ StringDictionary[Boolean | Double | String] {
  /**
  		 * Prefer spaces over tabs.
  		 */
  var insertSpaces: Boolean
  /**
  		 * Size of a tab in spaces.
  		 */
  var tabSize: Double
}

object FormattingOptions {
  @scala.inline
  def apply(
    insertSpaces: Boolean,
    tabSize: Double,
    StringDictionary: /**
  		 * Signature for further properties.
  		 */
  /* key */ StringDictionary[Boolean | Double | String] = null
  ): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FormattingOptions]
  }
}

