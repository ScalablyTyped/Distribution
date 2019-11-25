package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Excludes extends js.Object {
  var excludes: js.Array[String]
  var recursive: Boolean
}

object Anon_Excludes {
  @scala.inline
  def apply(excludes: js.Array[String], recursive: Boolean): Anon_Excludes = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Excludes]
  }
}

