package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
trait ITreeResource extends StObject {
  
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: Any): Unit
  
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: Any): Unit
  
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: Any): Unit
}
object ITreeResource {
  
  inline def apply(loadApplication: Any => Unit, loadMenu: Any => Unit, loadNodes: Any => Unit): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1(loadApplication), loadMenu = js.Any.fromFunction1(loadMenu), loadNodes = js.Any.fromFunction1(loadNodes))
    __obj.asInstanceOf[ITreeResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITreeResource] (val x: Self) extends AnyVal {
    
    inline def setLoadApplication(value: Any => Unit): Self = StObject.set(x, "loadApplication", js.Any.fromFunction1(value))
    
    inline def setLoadMenu(value: Any => Unit): Self = StObject.set(x, "loadMenu", js.Any.fromFunction1(value))
    
    inline def setLoadNodes(value: Any => Unit): Self = StObject.set(x, "loadNodes", js.Any.fromFunction1(value))
  }
}
