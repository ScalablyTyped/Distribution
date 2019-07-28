package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompactFull extends js.Object {
  /**
    * When the ToolBar is closed, the height of the ToolBar is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: String
  /**
    * When the ToolBar is closed, the height of the ToolBar is always sized to content.
    **/
  var full: String
}

object Anon_CompactFull {
  @scala.inline
  def apply(compact: String, full: String): Anon_CompactFull = {
    val __obj = js.Dynamic.literal(compact = compact, full = full)
  
    __obj.asInstanceOf[Anon_CompactFull]
  }
}

