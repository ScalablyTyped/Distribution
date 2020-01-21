package typings.winrt

import typings.winrt.Windows.UI.Text.TabAlignment
import typings.winrt.Windows.UI.Text.TabLeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: TabAlignment
  var leader: TabLeader
  var position: Double
}

object AnonAlign {
  @scala.inline
  def apply(align: TabAlignment, leader: TabLeader, position: Double): AnonAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlign]
  }
}

