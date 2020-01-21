package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemClassificationNode extends WorkItemTrackingResource {
  /**
    * Dictionary that has node attributes like start/finish date for iteration nodes.
    */
  var attributes: StringDictionary[js.Any]
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
}

