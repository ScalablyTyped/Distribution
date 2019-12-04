package typings.tablesorter.systemHeaderResizeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderResizeOptions extends js.Object {
  /**
    * The interval to look for header-changes in miliseconds.
    */
  var timer: Double
}

object HeaderResizeOptions {
  @scala.inline
  def apply(timer: Double): HeaderResizeOptions = {
    val __obj = js.Dynamic.literal(timer = timer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderResizeOptions]
  }
}

