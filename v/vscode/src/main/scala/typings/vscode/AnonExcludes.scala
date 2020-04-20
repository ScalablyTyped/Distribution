package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludes extends js.Object {
  var excludes: js.Array[String]
  var recursive: Boolean
}

object AnonExcludes {
  @scala.inline
  def apply(excludes: js.Array[String], recursive: Boolean): AnonExcludes = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludes]
  }
}

