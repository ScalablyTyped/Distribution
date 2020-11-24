package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaEncodeEntry extends LineEncodeEntry {
  
  var orient: js.UndefOr[ProductionRule[ScaledValueRef[Orientation]]] = js.native
}
object AreaEncodeEntry {
  
  @scala.inline
  def apply(): AreaEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaEncodeEntry]
  }
  
  @scala.inline
  implicit class AreaEncodeEntryOps[Self <: AreaEncodeEntry] (val x: Self) extends AnyVal {
    
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
    def setOrientVarargs(value: (Test with ScaledValueRef[Orientation])*): Self = this.set("orient", js.Array(value :_*))
    
    @scala.inline
    def setOrient(value: ProductionRule[ScaledValueRef[Orientation]]): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
  }
}
