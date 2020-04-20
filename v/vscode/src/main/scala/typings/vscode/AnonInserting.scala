package typings.vscode

import typings.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInserting extends js.Object {
  var inserting: Range
  var replacing: Range
}

object AnonInserting {
  @scala.inline
  def apply(inserting: Range, replacing: Range): AnonInserting = {
    val __obj = js.Dynamic.literal(inserting = inserting.asInstanceOf[js.Any], replacing = replacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInserting]
  }
}

