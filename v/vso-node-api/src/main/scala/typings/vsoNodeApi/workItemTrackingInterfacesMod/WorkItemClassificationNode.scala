package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemClassificationNode extends WorkItemTrackingResource {
  
  /**
    * Dictionary that has node attributes like start/finish date for iteration nodes.
    */
  var attributes: StringDictionary[js.Any] = js.native
  
  /**
    * List of child nodes fetched.
    */
  var children: js.Array[WorkItemClassificationNode] = js.native
  
  /**
    * Flag that indicates if the classification node has any child nodes.
    */
  var hasChildren: Boolean = js.native
  
  /**
    * Integer ID of the classification node.
    */
  var id: Double = js.native
  
  /**
    * GUID ID of the classification node.
    */
  var identifier: String = js.native
  
  /**
    * Name of the classification node.
    */
  var name: String = js.native
  
  /**
    * Node structure type.
    */
  var structureType: TreeNodeStructureType = js.native
}
object WorkItemClassificationNode {
  
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: StringDictionary[js.Any],
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
  
  @scala.inline
  implicit class WorkItemClassificationNodeMutableBuilder[Self <: WorkItemClassificationNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[WorkItemClassificationNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: WorkItemClassificationNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureType(value: TreeNodeStructureType): Self = StObject.set(x, "structureType", value.asInstanceOf[js.Any])
  }
}
