package typings.xstream.fromDiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromDiagramOptions extends js.Object {
  
  var errorValue: js.UndefOr[js.Any] = js.native
  
  var timeUnit: js.UndefOr[Double] = js.native
  
  var values: js.UndefOr[js.Object] = js.native
}
object FromDiagramOptions {
  
  @scala.inline
  def apply(): FromDiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromDiagramOptions]
  }
  
  @scala.inline
  implicit class FromDiagramOptionsOps[Self <: FromDiagramOptions] (val x: Self) extends AnyVal {
    
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
    def setErrorValue(value: js.Any): Self = this.set("errorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorValue: Self = this.set("errorValue", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: Double): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUnit: Self = this.set("timeUnit", js.undefined)
    
    @scala.inline
    def setValues(value: js.Object): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
