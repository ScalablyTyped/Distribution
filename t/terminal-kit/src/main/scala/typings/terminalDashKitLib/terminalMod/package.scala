package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terminalMod {
  type Autocompletion = (js.Function2[
    /* inputString */ java.lang.String, 
    /* callback */ Callback[java.lang.String | AutocompletionArray[java.lang.String]], 
    scala.Unit
  ]) | (js.Function1[
    /* inputString */ java.lang.String, 
    js.Promise[java.lang.String | AutocompletionArray[java.lang.String]]
  ])
  type CTerminal = Terminal with (js.Function1[/* repeated */ js.Any, Terminal])
  type Callback[T] = (js.Function1[/* err */ js.Any, scala.Unit]) | (js.Function2[/* err */ js.UndefOr[scala.Nothing], /* arg */ T, scala.Unit])
  type Chainable[T] = T with ChainableInterface[T]
  type IFileInputOptions = InputFieldOptions with terminalDashKitLib.Anon_BaseDir
  type Palette = js.Array[terminalDashKitLib.Anon_BG]
  type Terminal = Impl with nextgenDashEventsLib.nextgenDashEventsMod.^ 
}
