package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`true`
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerStrings.line
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * SFC parser related types
  */
trait SFCParserOptions extends js.Object {
  var deindent: js.UndefOr[Boolean] = js.undefined
  var pad: js.UndefOr[`true` | line | space] = js.undefined
}

object SFCParserOptions {
  @scala.inline
  def apply(deindent: js.UndefOr[Boolean] = js.undefined, pad: `true` | line | space = null): SFCParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deindent)) __obj.updateDynamic("deindent")(deindent.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCParserOptions]
  }
}

