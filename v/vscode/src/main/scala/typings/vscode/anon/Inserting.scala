package typings.vscode.anon

import typings.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inserting extends js.Object {
  var inserting: Range
  var replacing: Range
}

object Inserting {
  @scala.inline
  def apply(inserting: Range, replacing: Range): Inserting = {
    val __obj = js.Dynamic.literal(inserting = inserting.asInstanceOf[js.Any], replacing = replacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inserting]
  }
}

