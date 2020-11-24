package typings.stylableCore.stylableValueParsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedClass extends js.Object {
  
  var `-st-extends`: js.UndefOr[String] = js.native
  
  var `-st-root`: js.UndefOr[Boolean] = js.native
  
  var `-st-states`: js.UndefOr[js.Array[String] | MappedStates] = js.native
}
object TypedClass {
  
  @scala.inline
  def apply(): TypedClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedClass]
  }
  
  @scala.inline
  implicit class TypedClassOps[Self <: TypedClass] (val x: Self) extends AnyVal {
    
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
    def `set-st-extends`(value: String): Self = this.set("-st-extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-extends`: Self = this.set("-st-extends", js.undefined)
    
    @scala.inline
    def `set-st-root`(value: Boolean): Self = this.set("-st-root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-root`: Self = this.set("-st-root", js.undefined)
    
    @scala.inline
    def `set-st-statesVarargs`(value: String*): Self = this.set("-st-states", js.Array(value :_*))
    
    @scala.inline
    def `set-st-states`(value: js.Array[String] | MappedStates): Self = this.set("-st-states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-states`: Self = this.set("-st-states", js.undefined)
  }
}
