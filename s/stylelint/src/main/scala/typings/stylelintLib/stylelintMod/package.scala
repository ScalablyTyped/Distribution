package typings
package stylelintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylelintMod {
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[
      /* root */ postcssLib.postcssMod.Root, 
      /* result */ postcssLib.postcssMod.Result, 
      scala.Unit | js.Thenable[scala.Unit]
    ]
  ]
  type RuleMessageValue = java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])
}
