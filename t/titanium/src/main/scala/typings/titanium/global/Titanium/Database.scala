package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
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
object Database {
  
  @JSGlobal("Titanium.Database")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `Database` instance returned by <Titanium.Database.open> or <Titanium.Database.install>.
    */
  @JSGlobal("Titanium.Database.DB")
  @js.native
  class DB ()
    extends typings.titanium.Titanium.Database.DB
  
  /**
    * Constant for requesting a column's value returned in double form.
    */
  @JSGlobal("Titanium.Database.FIELD_TYPE_DOUBLE")
  @js.native
  val FIELD_TYPE_DOUBLE: Double = js.native
  
  /**
    * Constant for requesting a column's value returned in float form.
    */
  @JSGlobal("Titanium.Database.FIELD_TYPE_FLOAT")
  @js.native
  val FIELD_TYPE_FLOAT: Double = js.native
  
  /**
    * Constant for requesting a column's value returned in integer form.
    */
  @JSGlobal("Titanium.Database.FIELD_TYPE_INT")
  @js.native
  val FIELD_TYPE_INT: Double = js.native
  
  /**
    * Constant for requesting a column's value returned in string form.
    */
  @JSGlobal("Titanium.Database.FIELD_TYPE_STRING")
  @js.native
  val FIELD_TYPE_STRING: Double = js.native
  
  /**
    * The ResultSet instance returned by <Titanium.Database.DB.execute>.
    */
  @JSGlobal("Titanium.Database.ResultSet")
  @js.native
  class ResultSet ()
    extends typings.titanium.Titanium.Database.ResultSet
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Database.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Database.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Database.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Database.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Database.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Database.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Database.apiName> property.
    * @deprecated Access <Titanium.Database.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Database.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Database.bubbleParent> property.
    * @deprecated Access <Titanium.Database.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Database.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Database.lifecycleContainer> property.
    * @deprecated Access <Titanium.Database.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Database.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Installs an SQLite database to device's internal storage.
    */
  /* static member */
  @JSGlobal("Titanium.Database.install")
  @js.native
  def install(path: String, dbName: String): typings.titanium.Titanium.Database.DB = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Database.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Opens an SQLite database.
    */
  /* static member */
  @JSGlobal("Titanium.Database.open")
  @js.native
  def open(dbName: String): typings.titanium.Titanium.Database.DB = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Database.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Database.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Database.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Database.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Database.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Database.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Database.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Database.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
