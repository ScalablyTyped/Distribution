package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  /**
    * Pane is positioned below the SplitView's content.
    **/
  var bottom: String
  /**
    * Pane is positioned left of the SplitView's content.
    **/
  var left: String
  /**
    * Pane is positioned right of the SplitView's content.
    **/
  var right: String
  /**
    * Pane is positioned above the SplitView's content.
    **/
  var top: String
}

object Left {
  @scala.inline
  def apply(bottom: String, left: String, right: String, top: String): Left = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

