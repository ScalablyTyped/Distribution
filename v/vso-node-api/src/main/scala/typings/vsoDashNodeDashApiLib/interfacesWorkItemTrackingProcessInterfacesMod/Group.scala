package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Group extends js.Object {
  /**
       * Contribution for the group.
       */
  var contribution: WitContribution
  /**
       * Controls to be put in the group.
       */
  var controls: js.Array[Control]
  /**
       * The height for the contribution.
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
       * A value indicating if the layout node is contribution are not.
       */
  var isContribution: scala.Boolean
  /**
       * Label for the group.
       */
  var label: java.lang.String
  /**
       * Order in which the group should appear in the section.
       */
  var order: scala.Double
  /**
       * A value indicating whether this layout node has been overridden by a child layout.
       */
  var overridden: scala.Boolean
  /**
       * A value indicating if the group should be hidden or not.
       */
  var visible: scala.Boolean
}

