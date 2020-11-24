package typings.stylelint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.stylelintStrings.json
    - typings.stylelint.stylelintStrings.string
    - typings.stylelint.stylelintStrings.verbose
    - typings.stylelint.stylelintStrings.compact
    - typings.stylelint.stylelintStrings.unix
    - js.Function1[/ * results * / js.Array[typings.stylelint.mod.LintResult], java.lang.String]
  */
  type FormatterType = typings.stylelint.mod._FormatterType | (js.Function1[/* results */ js.Array[typings.stylelint.mod.LintResult], java.lang.String])
  
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[
      /* root */ typings.postcss.mod.Root_, 
      /* result */ typings.postcss.mod.Result, 
      scala.Unit | js.Thenable[scala.Unit]
    ]
  ]
  
  type RuleMessageValue = java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])
}
