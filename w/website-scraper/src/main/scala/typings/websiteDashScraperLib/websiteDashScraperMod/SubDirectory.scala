package typings
package websiteDashScraperLib.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDirectory extends js.Object {
  var directory: java.lang.String
  var extensions: js.Array[java.lang.String]
}

object SubDirectory {
  @scala.inline
  def apply(directory: java.lang.String, extensions: js.Array[java.lang.String]): SubDirectory = {
    val __obj = js.Dynamic.literal(directory = directory, extensions = extensions)
  
    __obj.asInstanceOf[SubDirectory]
  }
}

