package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Excludes extends js.Object {
  var excludes: js.Array[String]
  var recursive: Boolean
}

object Excludes {
  @scala.inline
  def apply(excludes: js.Array[String], recursive: Boolean): Excludes = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludes]
  }
}

