package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDefinition extends StObject {
  
  /**
    * Gets or sets the data source.
    */
  var dataSource: js.Array[InputValue]
  
  /**
    * Gets or sets the rest end point.
    */
  var endPoint: String
  
  /**
    * Gets or sets the result template.
    */
  var resultTemplate: String
}
object ValueDefinition {
  
  @scala.inline
  def apply(dataSource: js.Array[InputValue], endPoint: String, resultTemplate: String): ValueDefinition = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefinition]
  }
  
  @scala.inline
  implicit class ValueDefinitionMutableBuilder[Self <: ValueDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[InputValue]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceVarargs(value: InputValue*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setEndPoint(value: String): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTemplate(value: String): Self = StObject.set(x, "resultTemplate", value.asInstanceOf[js.Any])
  }
}
