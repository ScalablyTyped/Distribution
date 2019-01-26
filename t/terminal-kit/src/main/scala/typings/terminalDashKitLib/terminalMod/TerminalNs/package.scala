package typings
package terminalDashKitLib.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TerminalNs {
  type Autocompletion = (js.Function2[
    /* inputString */ java.lang.String, 
    /* callback */ terminalDashKitLib.terminalMod.Callback[java.lang.String | AutocompletionArray[java.lang.String]], 
    scala.Unit
  ]) | (js.Function1[
    /* inputString */ java.lang.String, 
    js.Promise[java.lang.String | AutocompletionArray[java.lang.String]]
  ])
  type CTerminal = terminalDashKitLib.terminalMod.Terminal with (js.Function1[/* repeated */ js.Any, terminalDashKitLib.terminalMod.Terminal])
  type Chainable[T] = T with ChainableInterface[T]
  type IFileInputOptions = InputFieldOptions with terminalDashKitLib.Anon_BaseDir
  type Palette = js.Array[terminalDashKitLib.Anon_BG]
}
