package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to information on an app's memory usage. */
@JSGlobal("Windows.System.MemoryManager")
@js.native
abstract class MemoryManager () extends js.Object

/** Provides access to information on an app's memory usage. */
@JSGlobal("Windows.System.MemoryManager")
@js.native
object MemoryManager extends js.Object {
  /** Gets the app's current memory usage. */
  var appMemoryUsage: scala.Double = js.native
  /** Gets the app's memory usage level. */
  var appMemoryUsageLevel: winrtDashUwpLib.WindowsNs.SystemNs.AppMemoryUsageLevel = js.native
  /** Gets the app's memory usage limit. */
  var appMemoryUsageLimit: scala.Double = js.native
  /** Raised when the app's memory consumption has decreased to a lower value in the AppMemoryUsageLevel enumeration. */
  @JSName("onappmemoryusagedecreased")
  var onappmemoryusagedecreased_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Raised when the app's memory consumption has increased to a higher value in the AppMemoryUsageLevel enumeration. */
  @JSName("onappmemoryusageincreased")
  var onappmemoryusageincreased_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Raised just before the limit of how much total memory the app can use is changed. */
  @JSName("onappmemoryusagelimitchanging")
  var onappmemoryusagelimitchanging_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  var trySetAppMemoryUsageLimit: js.Any = js.native
   /* unmapped type */ def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_appmemoryusagedecreased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.appmemoryusagedecreased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_appmemoryusageincreased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.appmemoryusageincreased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_appmemoryusagelimitchanging(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.appmemoryusagelimitchanging,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Gets an AppMemoryReport for the app, which provides information about its memory usage.
    * @return Information about the process' memory usage.
    */
  def getAppMemoryReport(): winrtDashUwpLib.WindowsNs.SystemNs.AppMemoryReport = js.native
  /**
    * Gets a ProcessMemoryReport for a process, which provides information about its memory usage.
    * @return Information about the process' memory usage.
    */
  def getProcessMemoryReport(): winrtDashUwpLib.WindowsNs.SystemNs.ProcessMemoryReport = js.native
  /** Raised when the app's memory consumption has decreased to a lower value in the AppMemoryUsageLevel enumeration. */
  def onappmemoryusagedecreased(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Raised when the app's memory consumption has increased to a higher value in the AppMemoryUsageLevel enumeration. */
  def onappmemoryusageincreased(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Raised just before the limit of how much total memory the app can use is changed. */
  def onappmemoryusagelimitchanging(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_appmemoryusagedecreased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.appmemoryusagedecreased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_appmemoryusageincreased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.appmemoryusageincreased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_appmemoryusagelimitchanging(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.appmemoryusagelimitchanging,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
}

