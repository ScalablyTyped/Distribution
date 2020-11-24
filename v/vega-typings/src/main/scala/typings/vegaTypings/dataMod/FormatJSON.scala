package typings.vegaTypings.dataMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatJSON extends _Format {
  
  var copy: js.UndefOr[Boolean] = js.native
  
  var parse: js.UndefOr[Parse] = js.native
  
  var property: js.UndefOr[String | SignalRef] = js.native
  
  var `type`: json = js.native
}
object FormatJSON {
  
  @scala.inline
  def apply(`type`: json): FormatJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatJSON]
  }
  
  @scala.inline
  implicit class FormatJSONOps[Self <: FormatJSON] (val x: Self) extends AnyVal {
    
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
    def setType(value: json): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setParse(value: Parse): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setProperty(value: String | SignalRef): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
}
