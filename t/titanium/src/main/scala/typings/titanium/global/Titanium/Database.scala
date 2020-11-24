package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level `Database` module, used for creating and accessing the
  * in-application SQLite database.
  */
@JSGlobal("Titanium.Database")
@js.native
class Database ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top-level `Database` module, used for creating and accessing the
  * in-application SQLite database.
  */
/* static members */
@JSGlobal("Titanium.Database")
@js.native
object Database extends js.Object {
  
  /**
    * Constant for requesting a column's value returned in double form.
    */
  val FIELD_TYPE_DOUBLE: Double = js.native
  
  /**
    * Constant for requesting a column's value returned in float form.
    */
  val FIELD_TYPE_FLOAT: Double = js.native
  
  /**
    * Constant for requesting a column's value returned in integer form.
    */
  val FIELD_TYPE_INT: Double = js.native
  
  /**
    * Constant for requesting a column's value returned in string form.
    */
  val FIELD_TYPE_STRING: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Database.apiName> property.
    * @deprecated Access <Titanium.Database.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Database.bubbleParent> property.
    * @deprecated Access <Titanium.Database.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Database.lifecycleContainer> property.
    * @deprecated Access <Titanium.Database.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Installs an SQLite database to device's internal storage.
    */
  def install(path: String, dbName: String): typings.titanium.Titanium.Database.DB = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Opens an SQLite database.
    */
  def open(dbName: String): typings.titanium.Titanium.Database.DB = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Database.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Database.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Database.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Database.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * The `Database` instance returned by <Titanium.Database.open> or <Titanium.Database.install>.
    */
  @js.native
  class DB ()
    extends typings.titanium.Titanium.Database.DB
  
  /**
    * The ResultSet instance returned by <Titanium.Database.DB.execute>.
    */
  @js.native
  class ResultSet ()
    extends typings.titanium.Titanium.Database.ResultSet
}
