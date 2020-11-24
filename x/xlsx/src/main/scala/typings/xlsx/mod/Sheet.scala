package typings.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet
  extends /**
  * Indexing with a cell address string maps to a cell object
  * Special keys start with '!'
  */
/* cell */ StringDictionary[CellObject | SheetKeys | js.Any] {
  
  /** Page Margins */
  @JSName("!margins")
  var Exclamationmarkmargins: js.UndefOr[MarginInfo] = js.native
  
  /** Sheet Range */
  @JSName("!ref")
  var Exclamationmarkref: js.UndefOr[String] = js.native
  
  /** Sheet type */
  @JSName("!type")
  var Exclamationmarktype: js.UndefOr[SheetType] = js.native
}
object Sheet {
  
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
    
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
    def setExclamationmarkmargins(value: MarginInfo): Self = this.set("!margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclamationmarkmargins: Self = this.set("!margins", js.undefined)
    
    @scala.inline
    def setExclamationmarkref(value: String): Self = this.set("!ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclamationmarkref: Self = this.set("!ref", js.undefined)
    
    @scala.inline
    def setExclamationmarktype(value: SheetType): Self = this.set("!type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclamationmarktype: Self = this.set("!type", js.undefined)
  }
}
