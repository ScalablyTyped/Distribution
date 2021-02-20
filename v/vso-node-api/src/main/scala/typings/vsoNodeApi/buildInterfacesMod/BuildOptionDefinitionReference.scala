package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptionDefinitionReference extends StObject {
  
  /**
    * The ID of the referenced build option.
    */
  var id: String = js.native
}
object BuildOptionDefinitionReference {
  
  @scala.inline
  def apply(id: String): BuildOptionDefinitionReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionDefinitionReference]
  }
  
  @scala.inline
  implicit class BuildOptionDefinitionReferenceMutableBuilder[Self <: BuildOptionDefinitionReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
