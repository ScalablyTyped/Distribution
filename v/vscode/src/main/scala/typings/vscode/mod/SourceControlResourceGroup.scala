package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlResourceGroup extends StObject {
  
  /**
  		 * Dispose this source control resource group.
  		 */
  def dispose(): Unit
  
  /**
  		 * Whether this source control resource group is hidden when it contains
  		 * no {@link SourceControlResourceState source control resource states}.
  		 */
  var hideWhenEmpty: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The id of this source control resource group.
  		 */
  val id: String
  
  /**
  		 * The label of this source control resource group.
  		 */
  var label: String
  
  /**
  		 * This group's collection of
  		 * {@link SourceControlResourceState source control resource states}.
  		 */
  var resourceStates: js.Array[SourceControlResourceState]
}
object SourceControlResourceGroup {
  
  inline def apply(
    dispose: () => Unit,
    id: String,
    label: String,
    resourceStates: js.Array[SourceControlResourceState]
  ): SourceControlResourceGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], resourceStates = resourceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceControlResourceGroup] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setHideWhenEmpty(value: Boolean): Self = StObject.set(x, "hideWhenEmpty", value.asInstanceOf[js.Any])
    
    inline def setHideWhenEmptyUndefined: Self = StObject.set(x, "hideWhenEmpty", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setResourceStates(value: js.Array[SourceControlResourceState]): Self = StObject.set(x, "resourceStates", value.asInstanceOf[js.Any])
    
    inline def setResourceStatesVarargs(value: SourceControlResourceState*): Self = StObject.set(x, "resourceStates", js.Array(value*))
  }
}
