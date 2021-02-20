package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildLogReference extends StObject {
  
  /**
    * The ID of the log.
    */
  var id: Double = js.native
  
  /**
    * The type of the log location.
    */
  var `type`: String = js.native
  
  /**
    * A full link to the log resource.
    */
  var url: String = js.native
}
object BuildLogReference {
  
  @scala.inline
  def apply(id: Double, `type`: String, url: String): BuildLogReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLogReference]
  }
  
  @scala.inline
  implicit class BuildLogReferenceMutableBuilder[Self <: BuildLogReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
