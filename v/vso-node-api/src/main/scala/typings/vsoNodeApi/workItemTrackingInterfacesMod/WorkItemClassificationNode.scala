package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemClassificationNode
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * Dictionary that has node attributes like start/finish date for iteration nodes.
    */
  var attributes: StringDictionary[Any]
  
  /**
    * List of child nodes fetched.
    */
  var children: js.Array[WorkItemClassificationNode]
  
  /**
    * Flag that indicates if the classification node has any child nodes.
    */
  var hasChildren: Boolean
  
  /**
    * Integer ID of the classification node.
    */
  var id: Double
  
  /**
    * GUID ID of the classification node.
    */
  var identifier: String
  
  /**
    * Name of the classification node.
    */
  var name: String
  
  /**
    * Node structure type.
    */
  var structureType: TreeNodeStructureType
}
object WorkItemClassificationNode {
  
  inline def apply(
    _links: Any,
    attributes: StringDictionary[Any],
    children: js.Array[WorkItemClassificationNode],
    hasChildren: Boolean,
    id: Double,
    identifier: String,
    name: String,
    structureType: TreeNodeStructureType,
    url: String
  ): WorkItemClassificationNode = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemClassificationNode]
  }
  
  extension [Self <: WorkItemClassificationNode](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[WorkItemClassificationNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: WorkItemClassificationNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStructureType(value: TreeNodeStructureType): Self = StObject.set(x, "structureType", value.asInstanceOf[js.Any])
  }
}
