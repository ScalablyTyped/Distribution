package typings.xrm.Xrm.Controls

import typings.std.HTMLObjectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Silverlight control.
  * @see {@link Control}
  * @deprecated The Silverlight WebResource is deprecated on the web client, and is not supported on the new Unified Interface in v9.
  * Instead of silverlight, use custom controls created using the HTML web resources with HTML5 to create UI components to visualize and interact with data.
  */
trait SilverlightControl
  extends StObject
     with Control {
  
  /**
    * Gets the query string value passed to Silverlight.
    * @returns The data.
    * @deprecated Silverlight is no longer supported. These methods won't be available after October 2020.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getData(): String
  
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLObjectElement
  
  /**
    * Sets the query string value passed to Silverlight.
    * @param data The data.
    * @deprecated Silverlight is no longer supported. These methods won't be available after October 2020.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setData(data: String): Unit
}
object SilverlightControl {
  
  inline def apply(
    getControlType: () => ControlType | String,
    getData: () => String,
    getLabel: () => String,
    getName: () => String,
    getObject: () => HTMLObjectElement,
    getParent: () => Section,
    getVisible: () => Boolean,
    setData: String => Unit,
    setLabel: String => Unit
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getData = js.Any.fromFunction0(getData), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getObject = js.Any.fromFunction0(getObject), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setData = js.Any.fromFunction1(setData), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[SilverlightControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SilverlightControl] (val x: Self) extends AnyVal {
    
    inline def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetObject(value: () => HTMLObjectElement): Self = StObject.set(x, "getObject", js.Any.fromFunction0(value))
    
    inline def setSetData(value: String => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
