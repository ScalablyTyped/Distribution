package typings.winrt.anon

import typings.winrt.Windows.UI.Text.TabAlignment
import typings.winrt.Windows.UI.Text.TabLeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends StObject {
  
  var align: TabAlignment = js.native
  
  var leader: TabLeader = js.native
  
  var position: Double = js.native
}
object Align {
  
  @scala.inline
  def apply(align: TabAlignment, leader: TabLeader, position: Double): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: TabAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeader(value: TabLeader): Self = StObject.set(x, "leader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
