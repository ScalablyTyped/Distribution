package typings.winjs.WinJS.Binding

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Properties
//#endregion Properties
//#region Objects
/**
  * Allows you to add bindable properties dynamically.
  **/
@JSGlobal("WinJS.Binding.dynamicObservableMixin")
@js.native
object dynamicObservableMixin extends js.Object {
  //#region Methods
  /**
    * Adds a property with change notification to this object, including a ECMAScript5 property definition.
    * @param name The name of the property to add.
    * @param value This object is returned.
    **/
  def addProperty(name: String, value: js.Any): Unit = js.native
  /**
    * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
    * @param name The name of the property to which to bind the action.
    * @param action The function to invoke asynchronously when the property may have changed.
    * @returns This object is returned.
    **/
  def bind(name: String, action: js.Any): js.Function = js.native
  /**
    * Gets a property value by name.
    * @param name The name of the property to get.
    * @returns The value of the property as an observable object.
    **/
  def getProperty(name: String): js.Any = js.native
  /**
    * Notifies listeners that a property value was updated.
    * @param name The name of the property that is being updated.
    * @param newValue The new value for the property.
    * @param oldValue The old value for the property.
    * @returns A promise that is completed when the notifications are complete.
    **/
  def notify(name: String, newValue: String, oldValue: String): Promise[_] = js.native
  /**
    * Removes a property value.
    * @param name The name of the property to remove.
    * @returns This object is returned.
    **/
  def removeProperty(name: String): js.Any = js.native
  /**
    * Updates a property value and notifies any listeners.
    * @param name The name of the property to update.
    * @param value The new value of the property.
    * @returns This object is returned.
    **/
  def setProperty(name: String, value: js.Any): js.Any = js.native
  /**
    * Removes one or more listeners from the notification list for a given property.
    * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
    * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
    * @returns This object is returned.
    **/
  def unbind(name: String, action: js.Function): js.Any = js.native
  /**
    * Updates a property value and notifies any listeners.
    * @param name The name of the property to update.
    * @param value The new value of the property.
    * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
    **/
  def updateProperty(name: String, value: js.Any): Promise[_] = js.native
}

