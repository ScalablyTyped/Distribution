package typings.stylelint

import typings.postcss.postcssMod.Result
import typings.postcss.postcssMod.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylelintMod {
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[/* root */ Root, /* result */ Result, Unit | js.Thenable[Unit]]
  ]
  type RuleMessageValue = String | (js.Function1[/* repeated */ js.Any, String])
}
