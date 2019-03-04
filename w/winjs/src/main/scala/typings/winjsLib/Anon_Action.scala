package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  //#region Methods
  /**
    * Adds a property with change notification to this object, including a ECMAScript5 property definition.
    * @param name The name of the property to add.
    * @param value This object is returned.
    **/
  def addProperty(name: java.lang.String, value: js.Any): scala.Unit
  /**
    * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
    * @param name The name of the property to which to bind the action.
    * @param action The function to invoke asynchronously when the property may have changed.
    * @returns This object is returned.
    **/
  def bind(name: java.lang.String, action: js.Any): js.Function
  /**
    * Gets a property value by name.
    * @param name The name of the property to get.
    * @returns The value of the property as an observable object.
    **/
  def getProperty(name: java.lang.String): js.Any
  /**
    * Notifies listeners that a property value was updated.
    * @param name The name of the property that is being updated.
    * @param newValue The new value for the property.
    * @param oldValue The old value for the property.
    * @returns A promise that is completed when the notifications are complete.
    **/
  def notify(name: java.lang.String, newValue: java.lang.String, oldValue: java.lang.String): winjsLib.WinJSNs.Promise[_]
  /**
    * Removes a property value.
    * @param name The name of the property to remove.
    * @returns This object is returned.
    **/
  def removeProperty(name: java.lang.String): js.Any
  /**
    * Updates a property value and notifies any listeners.
    * @param name The name of the property to update.
    * @param value The new value of the property.
    * @returns This object is returned.
    **/
  def setProperty(name: java.lang.String, value: js.Any): js.Any
  /**
    * Removes one or more listeners from the notification list for a given property.
    * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
    * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
    * @returns This object is returned.
    **/
  def unbind(name: java.lang.String, action: js.Function): js.Any
  /**
    * Updates a property value and notifies any listeners.
    * @param name The name of the property to update.
    * @param value The new value of the property.
    * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
    **/
  def updateProperty(name: java.lang.String, value: js.Any): winjsLib.WinJSNs.Promise[_]
}

object Anon_Action {
  @scala.inline
  def apply(
    addProperty: js.Function2[java.lang.String, js.Any, scala.Unit],
    bind: js.Function2[java.lang.String, js.Any, js.Function],
    getProperty: js.Function1[java.lang.String, js.Any],
    notify: js.Function3[java.lang.String, java.lang.String, java.lang.String, winjsLib.WinJSNs.Promise[_]],
    removeProperty: js.Function1[java.lang.String, js.Any],
    setProperty: js.Function2[java.lang.String, js.Any, js.Any],
    unbind: js.Function2[java.lang.String, js.Function, js.Any],
    updateProperty: js.Function2[java.lang.String, js.Any, winjsLib.WinJSNs.Promise[_]]
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(addProperty = addProperty, bind = bind, getProperty = getProperty, notify = notify, removeProperty = removeProperty, setProperty = setProperty, unbind = unbind, updateProperty = updateProperty)
  
    __obj.asInstanceOf[Anon_Action]
  }
}

