package typings.tabris.mod

import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.neutral
import typings.tabris.tabrisStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertDialogCloseEvent[Target] extends EventObject[Target] {
  val button: ok | cancel | neutral | Null = js.native
  val texts: js.Array[String] = js.native
}

