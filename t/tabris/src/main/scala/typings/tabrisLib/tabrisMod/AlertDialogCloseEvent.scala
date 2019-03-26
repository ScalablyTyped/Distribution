package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertDialogCloseEvent extends EventObject[AlertDialog] {
  val button: tabrisLib.tabrisLibStrings.ok | tabrisLib.tabrisLibStrings.cancel | tabrisLib.tabrisLibStrings.neutral | tabrisLib.tabrisLibStrings.Empty = js.native
}

