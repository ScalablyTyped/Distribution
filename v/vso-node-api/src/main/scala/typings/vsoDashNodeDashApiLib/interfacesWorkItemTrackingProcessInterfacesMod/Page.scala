package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /**
    * Contribution for the page.
    */
  var contribution: WitContribution
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
    * The label for the page.
    */
  var label: java.lang.String
  /**
    * A value indicating whether any user operations are permitted on this page and the contents of this page
    */
  var locked: scala.Boolean
  /**
    * Order in which the page should appear in the layout.
    */
  var order: scala.Double
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: scala.Boolean
  /**
    * The icon for the page.
    */
  var pageType: PageType
  /**
    * The sections of the page.
    */
  var sections: js.Array[Section]
  /**
    * A value indicating if the page should be hidden or not.
    */
  var visible: scala.Boolean
}

object Page {
  @scala.inline
  def apply(
    contribution: WitContribution,
    id: java.lang.String,
    inherited: scala.Boolean,
    isContribution: scala.Boolean,
    label: java.lang.String,
    locked: scala.Boolean,
    order: scala.Double,
    overridden: scala.Boolean,
    pageType: PageType,
    sections: js.Array[Section],
    visible: scala.Boolean
  ): Page = {
    val __obj = js.Dynamic.literal(contribution = contribution, id = id, inherited = inherited, isContribution = isContribution, label = label, locked = locked, order = order, overridden = overridden, pageType = pageType, sections = sections, visible = visible)
  
    __obj.asInstanceOf[Page]
  }
}

