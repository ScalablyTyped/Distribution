package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs
import typings.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typings.winrtUwp.Windows.Foundation.Collections.MapChangedEventHandler
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mapchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the password credential property store. This class and its members are reserved for internal use and are not intended to be used in your code. */
@JSGlobal("Windows.Security.Credentials.PasswordCredentialPropertyStore")
@js.native
/** This method is reserved for internal use and is not intended to be used in your code. */
class PasswordCredentialPropertyStore () extends js.Object {
   /* unmapped return type */ /** This method is reserved for internal use and is not intended to be used in your code. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, _] = js.native
  /** This method is reserved for internal use and is not intended to be used in your code. */
  var size: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  /** This method is reserved for internal use and is not intended to be used in your code. */
  def clear(): Unit = js.native
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    */
  def first(): js.Any = js.native
   /* unmapped return type */ /**
    * This method is reserved for internal use and is not intended to be used in your code.
    */
  def getView(): js.Any = js.native
   /* unmapped return type */ /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def hasKey(key: String): js.Any = js.native
   /* unmapped return type */ /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    * @param value Reserved.
    */
  def insert(key: String, value: js.Any): js.Any = js.native
   /* unmapped return type */ /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def lookup(key: String): js.Any = js.native
   /* unmapped return type */ /** This method is reserved for internal use and is not intended to be used in your code. */
  def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, _]])): Unit = js.native
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def remove(key: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
}

