package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

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
  var onmapchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, _] = js.native
  /** This method is reserved for internal use and is not intended to be used in your code. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
  /** This method is reserved for internal use and is not intended to be used in your code. */
  def clear(): scala.Unit = js.native
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
  def hasKey(key: java.lang.String): js.Any = js.native
   /* unmapped return type */ /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    * @param value Reserved.
    */
  def insert(key: java.lang.String, value: js.Any): js.Any = js.native
   /* unmapped return type */ /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def lookup(key: java.lang.String): js.Any = js.native
   /* unmapped return type */ /** This method is reserved for internal use and is not intended to be used in your code. */
  def onmapchanged(
    ev: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapChangedEventArgs[java.lang.String] with (winrtDashUwpLib.WindowsNs.WinRTEvent[
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableMap[java.lang.String, _]
    ])
  ): scala.Unit = js.native
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def remove(key: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
}

