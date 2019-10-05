package typings.winrt

import typings.winrt.Windows.UI.Text.TabAlignment
import typings.winrt.Windows.UI.Text.TabLeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: TabAlignment
  var leader: TabLeader
  var position: Double
}

object Anon_Align {
  @scala.inline
  def apply(align: TabAlignment, leader: TabLeader, position: Double): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align, leader = leader, position = position)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

