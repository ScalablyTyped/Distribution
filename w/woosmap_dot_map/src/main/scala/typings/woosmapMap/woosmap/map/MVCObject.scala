package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constructor for MVCObject.
  */
@js.native
trait MVCObject extends StObject {
  
  /**
    * Adds a listener for eventName.
    */
  def addListener(eventName: String, handler: js.Function1[/* repeated */ Any, Any]): MapEventListener = js.native
  
  /**
    * Binds the property identified by 'key' to the specified target.
    */
  def bindTo(key: String, target: js.Object): Unit = js.native
  def bindTo(key: String, target: js.Object, targetKey: String): Unit = js.native
  def bindTo(key: String, target: js.Object, targetKey: String, notify: Boolean): Unit = js.native
  def bindTo(key: String, target: js.Object, targetKey: Unit, notify: Boolean): Unit = js.native
  
  /**
    * Returns the value of the property specified by `key`
    */
  def get(key: String): Any = js.native
  
  /**
    * Is this property a complex object - is it bound as either observer or target
    */
  def isPropertyBound(key: String): Boolean = js.native
  
  /**
    * Sets `value` to `key` on `this`.
    */
  def set(key: String, value: Any): Unit = js.native
  def set(key: String, value: Any, forceCallback: Boolean): Unit = js.native
  
  /**
    * Set all the values of the properties contained in `keyValuePairs`
    */
  def setOptions(keyValuePairs: js.Object): Unit = js.native
  
  /**
    * Un-bind the property identified by `key` from its current target
    */
  def unbind(key: String): Unit = js.native
  
  /**
    * Unbind all bound properties on this object
    */
  def unbindAll(): Any = js.native
}
