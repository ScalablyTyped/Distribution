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
    getControlType: js.Function0[ControlType | java.lang.String],
    getData: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getObject: js.Function0[stdLib.HTMLObjectElement],
    getParent: js.Function0[Section],
    getVisible: js.Function0[scala.Boolean],
    setData: js.Function1[java.lang.String, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal(getControlType = getControlType, getData = getData, getLabel = getLabel, getName = getName, getObject = getObject, getParent = getParent, getVisible = getVisible, setData = setData, setLabel = setLabel)
  
    __obj.asInstanceOf[SilverlightControl]
  }
}

