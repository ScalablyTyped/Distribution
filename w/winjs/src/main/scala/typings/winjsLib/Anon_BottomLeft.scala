package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomLeft extends js.Object {
  /**
    * Pane is positioned below the SplitView's content.
    **/
  var bottom: java.lang.String
  /**
    * Pane is positioned left of the SplitView's content.
    **/
  var left: java.lang.String
  /**
    * Pane is positioned right of the SplitView's content.
    **/
  var right: java.lang.String
  /**
    * Pane is positioned above the SplitView's content.
    **/
  var top: java.lang.String
}

object Anon_BottomLeft {
  @scala.inline
  def apply(bottom: java.lang.String, left: java.lang.String, right: java.lang.String, top: java.lang.String): Anon_BottomLeft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Anon_BottomLeft]
  }
}

