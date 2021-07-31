package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestVariable extends StObject {
  
  /**
    * Description of the test variable
    */
  var description: String
  
  /**
    * Id of the test variable
    */
  var id: Double
  
  /**
    * Name of the test variable
    */
  var name: String
  
  /**
    * Project to which the test variable belongs
    */
  var project: ShallowReference
  
  /**
    * Revision
    */
  var revision: Double
  
  /**
    * Url of the test variable
    */
  var url: String
  
  /**
    * List of allowed values
    */
  var values: js.Array[String]
}
object TestVariable {
  
  @scala.inline
  def apply(
    description: String,
    id: Double,
    name: String,
    project: ShallowReference,
    revision: Double,
    url: String,
    values: js.Array[String]
  ): TestVariable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestVariable]
  }
  
  @scala.inline
  implicit class TestVariableMutableBuilder[Self <: TestVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
