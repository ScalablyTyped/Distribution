package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Silverlight control.
  * @see {@link Control}
  * @deprecated The Silverlight WebResource is deprecated on the web client, and is not supported on the new Unified Interface in v9.
  * Instead of silverlight, use custom controls created using the HTML web resources with HTML5 to create UI components to visualize and interact with data.
  */
trait SilverlightControl extends Control {
  /**
    * Gets the query string value passed to Silverlight.
    * @returns The data.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getData(): java.lang.String
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): stdLib.HTMLObjectElement
  /**
    * Sets the query string value passed to Silverlight.
    * @param data The data.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setData(data: java.lang.String): scala.Unit
}

object SilverlightControl {
  @scala.inline
  def apply(
    getControlType: () => ControlType | java.lang.String,
    getData: () => java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getObject: () => stdLib.HTMLObjectElement,
    getParent: () => Section,
    getVisible: () => scala.Boolean,
    setData: java.lang.String => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getData = js.Any.fromFunction0(getData), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setData = js.Any.fromFunction1(setData), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[SilverlightControl]
  }
}

