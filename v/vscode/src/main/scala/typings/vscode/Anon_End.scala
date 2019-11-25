package typings.vscode

import typings.vscode.vscodeMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[Position] = js.undefined
  var start: js.UndefOr[Position] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(end: Position = null, start: Position = null): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

