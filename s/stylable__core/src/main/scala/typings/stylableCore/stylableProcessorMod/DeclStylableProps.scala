package typings.stylableCore.stylableProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclStylableProps extends js.Object {
  
  var sourceValue: String = js.native
}
object DeclStylableProps {
  
  @scala.inline
  def apply(sourceValue: String): DeclStylableProps = {
    val __obj = js.Dynamic.literal(sourceValue = sourceValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclStylableProps]
  }
  
  @scala.inline
  implicit class DeclStylablePropsOps[Self <: DeclStylableProps] (val x: Self) extends AnyVal {
    
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
    def setSourceValue(value: String): Self = this.set("sourceValue", value.asInstanceOf[js.Any])
  }
}
