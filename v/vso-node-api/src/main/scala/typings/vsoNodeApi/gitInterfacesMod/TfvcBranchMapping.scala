package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcBranchMapping extends StObject {
  
  /**
    * Depth of the branch.
    */
  var depth: String = js.native
  
  /**
    * Server item for the branch.
    */
  var serverItem: String = js.native
  
  /**
    * Type of the branch.
    */
  var `type`: String = js.native
}
object TfvcBranchMapping {
  
  @scala.inline
  def apply(depth: String, serverItem: String, `type`: String): TfvcBranchMapping = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranchMapping]
  }
  
  @scala.inline
  implicit class TfvcBranchMappingMutableBuilder[Self <: TfvcBranchMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
