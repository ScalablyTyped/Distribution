package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Control extends js.Object {
  /**
       * Contribution for the control.
       */
  var contribution: WitContribution
  /**
       * Type of the control.
       */
  var controlType: java.lang.String
  /**
       * Height of the control, for html controls.
       */
  var height: scala.Double
  /**
       * The id for the layout node.
       */
  var id: java.lang.String
  /**
       * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
       */
  var inherited: scala.Boolean
  /**
       * A value indicating if the layout node is contribution or not.
       */
  var isContribution: scala.Boolean
  /**
       * Label for the field
       */
  var label: java.lang.String
  /**
       * Inner text of the control.
       */
  var metadata: java.lang.String
  var order: scala.Double
  /**
       * A value indicating whether this layout node has been overridden by a child layout.
       */
  var overridden: scala.Boolean
  /**
       * A value indicating if the control is readonly.
       */
  var readOnly: scala.Boolean
  /**
       * A value indicating if the control should be hidden or not.
       */
  var visible: scala.Boolean
  /**
       * Watermark text for the textbox.
       */
  var watermark: java.lang.String
}

