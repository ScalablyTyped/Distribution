package typings.winrtUwp.Windows.Globalization.Collation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
@js.native
trait CharacterGrouping extends js.Object {
  
  /** Gets the first item that appears in the grouping under this index. */
  var first: String = js.native
  
  /** Gets the label that is associated with this index. */
  var label: String = js.native
}
object CharacterGrouping {
  
  @scala.inline
  def apply(first: String, label: String): CharacterGrouping = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterGrouping]
  }
  
  @scala.inline
  implicit class CharacterGroupingOps[Self <: CharacterGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
