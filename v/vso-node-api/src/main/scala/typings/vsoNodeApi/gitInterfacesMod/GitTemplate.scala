package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTemplate extends StObject {
  
  /**
    * Name of the Template
    */
  var name: String = js.native
  
  /**
    * Type of the Template
    */
  var `type`: String = js.native
}
object GitTemplate {
  
  @scala.inline
  def apply(name: String, `type`: String): GitTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTemplate]
  }
  
  @scala.inline
  implicit class GitTemplateMutableBuilder[Self <: GitTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
