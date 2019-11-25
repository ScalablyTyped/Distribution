package typings.vscode.vscodeMod

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
  val faded: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The light theme decorations.
  		 */
  val light: js.UndefOr[SourceControlResourceThemableDecorations] = js.undefined
  /**
  		 * Whether the [source control resource state](#SourceControlResourceState) should
  		 * be striked-through in the UI.
  		 */
  val strikeThrough: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The title for a specific
  		 * [source control resource state](#SourceControlResourceState).
  		 */
  val tooltip: js.UndefOr[String] = js.undefined
}

object SourceControlResourceDecorations {
  @scala.inline
  def apply(
    dark: SourceControlResourceThemableDecorations = null,
    faded: js.UndefOr[Boolean] = js.undefined,
    iconPath: String | Uri = null,
    light: SourceControlResourceThemableDecorations = null,
    strikeThrough: js.UndefOr[Boolean] = js.undefined,
    tooltip: String = null
  ): SourceControlResourceDecorations = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (!js.isUndefined(faded)) __obj.updateDynamic("faded")(faded.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(strikeThrough)) __obj.updateDynamic("strikeThrough")(strikeThrough.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceDecorations]
  }
}

