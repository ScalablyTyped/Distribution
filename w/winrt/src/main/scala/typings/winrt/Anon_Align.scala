package typings.winrt

import typings.winrt.WindowsNs.UINs.TextNs.TabAlignment
import typings.winrt.WindowsNs.UINs.TextNs.TabLeader
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

