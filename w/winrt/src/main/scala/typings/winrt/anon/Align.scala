package typings.winrt.anon

import typings.winrt.Windows.UI.Text.TabAlignment
import typings.winrt.Windows.UI.Text.TabLeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: TabAlignment
  var leader: TabLeader
  var position: Double
}

object Align {
  @scala.inline
  def apply(align: TabAlignment, leader: TabLeader, position: Double): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

