package typings.stylelint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylelintMod {
  import typings.postcss.postcssMod.Result
  import typings.postcss.postcssMod.Root

  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.stylelintStrings.json
    - typings.stylelint.stylelintStrings.string
    - typings.stylelint.stylelintStrings.verbose
    - typings.stylelint.stylelintStrings.compact
    - typings.stylelint.stylelintStrings.unix
    - js.Function1[
  / * results * / js.Array[typings.stylelint.stylelintMod.LintResult], 
  java.lang.String]
  */
  type FormatterType = _FormatterType | (js.Function1[/* results */ js.Array[LintResult], String])
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[/* root */ Root, /* result */ Result, Unit | js.Thenable[Unit]]
  ]
  type RuleMessageValue = String | (js.Function1[/* repeated */ js.Any, String])
}
