package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tree State
  */
trait ITreeState extends StObject {
  
  //The currently loaded root node reference - depending on the section loaded this could be a section root or a normal root.
  //We keep this reference so we can lookup nodes to interact with in the UI via the tree service
  var currentRootNode: js.Any
  
  //The currently selected node
  var selectedNode: js.Any
}
object ITreeState {
  
  inline def apply(currentRootNode: js.Any, selectedNode: js.Any): ITreeState = {
    val __obj = js.Dynamic.literal(currentRootNode = currentRootNode.asInstanceOf[js.Any], selectedNode = selectedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeState]
  }
  
  extension [Self <: ITreeState](x: Self) {
    
    inline def setCurrentRootNode(value: js.Any): Self = StObject.set(x, "currentRootNode", value.asInstanceOf[js.Any])
    
    inline def setSelectedNode(value: js.Any): Self = StObject.set(x, "selectedNode", value.asInstanceOf[js.Any])
  }
}
