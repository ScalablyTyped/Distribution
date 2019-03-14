package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlResourceDecorations extends SourceControlResourceThemableDecorations {
  /**
  		 * The dark theme decorations.
  		 */
  val dark: js.UndefOr[SourceControlResourceThemableDecorations] = js.undefined
  /**
  		 * Whether the [source control resource state](#SourceControlResourceState) should
  		 * be faded in the UI.
  		 */
  val faded: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * The light theme decorations.
  		 */
  val light: js.UndefOr[SourceControlResourceThemableDecorations] = js.undefined
  /**
  		 * Whether the [source control resource state](#SourceControlResourceState) should
  		 * be striked-through in the UI.
  		 */
  val strikeThrough: js.UndefOr[scala.Boolean] = js.undefined
}

object SourceControlResourceDecorations {
  @scala.inline
  def apply(
    dark: SourceControlResourceThemableDecorations = null,
    faded: js.UndefOr[scala.Boolean] = js.undefined,
    iconPath: java.lang.String | Uri = null,
    light: SourceControlResourceThemableDecorations = null,
    strikeThrough: js.UndefOr[scala.Boolean] = js.undefined
  ): SourceControlResourceDecorations = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (!js.isUndefined(faded)) __obj.updateDynamic("faded")(faded)
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light)
    if (!js.isUndefined(strikeThrough)) __obj.updateDynamic("strikeThrough")(strikeThrough)
    __obj.asInstanceOf[SourceControlResourceDecorations]
  }
}

