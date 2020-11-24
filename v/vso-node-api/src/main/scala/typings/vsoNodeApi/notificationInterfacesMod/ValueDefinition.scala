package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueDefinition extends js.Object {
  
  /**
    * Gets or sets the data source.
    */
  var dataSource: js.Array[InputValue] = js.native
  
  /**
    * Gets or sets the rest end point.
    */
  var endPoint: String = js.native
  
  /**
    * Gets or sets the result template.
    */
  var resultTemplate: String = js.native
}
object ValueDefinition {
  
  @scala.inline
  def apply(dataSource: js.Array[InputValue], endPoint: String, resultTemplate: String): ValueDefinition = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefinition]
  }
  
  @scala.inline
  implicit class ValueDefinitionOps[Self <: ValueDefinition] (val x: Self) extends AnyVal {
    
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
    def setDataSourceVarargs(value: InputValue*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[InputValue]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPoint(value: String): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTemplate(value: String): Self = this.set("resultTemplate", value.asInstanceOf[js.Any])
  }
}
