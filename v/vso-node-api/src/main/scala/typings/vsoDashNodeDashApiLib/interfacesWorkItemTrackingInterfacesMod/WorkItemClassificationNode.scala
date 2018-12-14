package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkItemClassificationNode extends WorkItemTrackingResource {
  /**
       * Dictionary that has node attributes like start/finish date for iteration nodes.
       */
  var attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
       * List of child nodes fetched.
       */
  var children: js.Array[WorkItemClassificationNode]
  /**
       * Flag that indicates if the classification node has any child nodes.
       */
  var hasChildren: scala.Boolean
  /**
       * Integer ID of the classification node.
       */
  var id: scala.Double
  /**
       * GUID ID of the classification node.
       */
  var identifier: java.lang.String
  /**
       * Name of the classification node.
       */
  var name: java.lang.String
  /**
       * Node structure type.
       */
  var structureType: TreeNodeStructureType
}

