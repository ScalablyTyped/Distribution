package typings.xmlcreate.xmlDtdParamEntityRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDtdParamEntityRefOptions extends js.Object {
  
  /**
    * The name of the entity to be referenced.
    */
  var name: String = js.native
}
object IXmlDtdParamEntityRefOptions {
  
  @scala.inline
  def apply(name: String): IXmlDtdParamEntityRefOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDtdParamEntityRefOptions]
  }
  
  @scala.inline
  implicit class IXmlDtdParamEntityRefOptionsOps[Self <: IXmlDtdParamEntityRefOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
