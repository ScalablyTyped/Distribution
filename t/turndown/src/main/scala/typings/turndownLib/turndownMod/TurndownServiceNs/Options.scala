package typings
package turndownLib.turndownMod.TurndownServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blankReplacement: js.UndefOr[ReplacementFunction] = js.undefined
  var br: js.UndefOr[java.lang.String] = js.undefined
  var bulletListMarker: js.UndefOr[
    turndownLib.turndownLibStrings.`-` | turndownLib.turndownLibStrings.`+` | turndownLib.turndownLibStrings.`*`
  ] = js.undefined
  var codeBlockStyle: js.UndefOr[turndownLib.turndownLibStrings.indented | turndownLib.turndownLibStrings.fenced] = js.undefined
  var defaultReplacement: js.UndefOr[ReplacementFunction] = js.undefined
  var emDelimiter: js.UndefOr[turndownLib.turndownLibStrings.Underscore | turndownLib.turndownLibStrings.`*`] = js.undefined
  var fence: js.UndefOr[
    turndownLib.turndownLibStrings.BACKTICKBACKTICKBACKTICK | turndownLib.turndownLibStrings.`~~~`
  ] = js.undefined
  var headingStyle: js.UndefOr[turndownLib.turndownLibStrings.setext | turndownLib.turndownLibStrings.atx] = js.undefined
  var hr: js.UndefOr[java.lang.String] = js.undefined
  var keepReplacement: js.UndefOr[ReplacementFunction] = js.undefined
  var linkReferenceStyle: js.UndefOr[
    turndownLib.turndownLibStrings.full | turndownLib.turndownLibStrings.collapsed | turndownLib.turndownLibStrings.shortcut
  ] = js.undefined
  var linkStyle: js.UndefOr[
    turndownLib.turndownLibStrings.inlined | turndownLib.turndownLibStrings.referenced
  ] = js.undefined
  var strongDelimiter: js.UndefOr[turndownLib.turndownLibStrings.__ | turndownLib.turndownLibStrings.`**`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    blankReplacement: ReplacementFunction = null,
    br: java.lang.String = null,
    bulletListMarker: turndownLib.turndownLibStrings.`-` | turndownLib.turndownLibStrings.`+` | turndownLib.turndownLibStrings.`*` = null,
    codeBlockStyle: turndownLib.turndownLibStrings.indented | turndownLib.turndownLibStrings.fenced = null,
    defaultReplacement: ReplacementFunction = null,
    emDelimiter: turndownLib.turndownLibStrings.Underscore | turndownLib.turndownLibStrings.`*` = null,
    fence: turndownLib.turndownLibStrings.BACKTICKBACKTICKBACKTICK | turndownLib.turndownLibStrings.`~~~` = null,
    headingStyle: turndownLib.turndownLibStrings.setext | turndownLib.turndownLibStrings.atx = null,
    hr: java.lang.String = null,
    keepReplacement: ReplacementFunction = null,
    linkReferenceStyle: turndownLib.turndownLibStrings.full | turndownLib.turndownLibStrings.collapsed | turndownLib.turndownLibStrings.shortcut = null,
    linkStyle: turndownLib.turndownLibStrings.inlined | turndownLib.turndownLibStrings.referenced = null,
    strongDelimiter: turndownLib.turndownLibStrings.__ | turndownLib.turndownLibStrings.`**` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (blankReplacement != null) __obj.updateDynamic("blankReplacement")(blankReplacement)
    if (br != null) __obj.updateDynamic("br")(br)
    if (bulletListMarker != null) __obj.updateDynamic("bulletListMarker")(bulletListMarker.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (defaultReplacement != null) __obj.updateDynamic("defaultReplacement")(defaultReplacement)
    if (emDelimiter != null) __obj.updateDynamic("emDelimiter")(emDelimiter.asInstanceOf[js.Any])
    if (fence != null) __obj.updateDynamic("fence")(fence.asInstanceOf[js.Any])
    if (headingStyle != null) __obj.updateDynamic("headingStyle")(headingStyle.asInstanceOf[js.Any])
    if (hr != null) __obj.updateDynamic("hr")(hr)
    if (keepReplacement != null) __obj.updateDynamic("keepReplacement")(keepReplacement)
    if (linkReferenceStyle != null) __obj.updateDynamic("linkReferenceStyle")(linkReferenceStyle.asInstanceOf[js.Any])
    if (linkStyle != null) __obj.updateDynamic("linkStyle")(linkStyle.asInstanceOf[js.Any])
    if (strongDelimiter != null) __obj.updateDynamic("strongDelimiter")(strongDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

