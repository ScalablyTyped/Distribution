package typings.websiteScraper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDirectory extends js.Object {
  var directory: String
  var extensions: js.Array[String]
}

object SubDirectory {
  @scala.inline
  def apply(directory: String, extensions: js.Array[String]): SubDirectory = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDirectory]
  }
}

