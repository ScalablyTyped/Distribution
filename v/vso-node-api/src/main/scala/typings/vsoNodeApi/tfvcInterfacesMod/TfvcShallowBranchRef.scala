package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcShallowBranchRef extends StObject {
  
  /**
    * Path for the branch.
    */
  var path: String
}
object TfvcShallowBranchRef {
  
  @scala.inline
  def apply(path: String): TfvcShallowBranchRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShallowBranchRef]
  }
  
  @scala.inline
  implicit class TfvcShallowBranchRefMutableBuilder[Self <: TfvcShallowBranchRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
