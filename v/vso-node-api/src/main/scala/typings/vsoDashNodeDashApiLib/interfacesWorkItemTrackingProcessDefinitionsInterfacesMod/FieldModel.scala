package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FieldModel extends js.Object {
  /**
       * Description about field
       */
  var description: java.lang.String
  /**
       * ID of the field
       */
  var id: java.lang.String
  /**
       * Name of the field
       */
  var name: java.lang.String
  /**
       * Reference to picklist in this field
       */
  var pickList: PickListMetadataModel
  /**
       * Type of field
       */
  var `type`: FieldType
  /**
       * Url to the field
       */
  var url: java.lang.String
}

