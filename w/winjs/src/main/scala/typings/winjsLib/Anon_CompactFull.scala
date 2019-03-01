package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompactFull extends js.Object {
  /**
    * When the ToolBar is closed, the height of the ToolBar is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: java.lang.String
  /**
    * When the ToolBar is closed, the height of the ToolBar is always sized to content.
    **/
  var full: java.lang.String
}

object Anon_CompactFull {
  @scala.inline
  def apply(compact: java.lang.String, full: java.lang.String): Anon_CompactFull = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("full")(full)
    __obj.asInstanceOf[Anon_CompactFull]
  }
}

