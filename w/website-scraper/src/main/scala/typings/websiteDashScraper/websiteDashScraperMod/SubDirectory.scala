package typings.websiteDashScraper.websiteDashScraperMod

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
    val __obj = js.Dynamic.literal(directory = directory, extensions = extensions)
  
    __obj.asInstanceOf[SubDirectory]
  }
}

