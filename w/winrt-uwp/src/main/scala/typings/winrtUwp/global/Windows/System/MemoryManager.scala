package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.winrtUwpStrings.appmemoryusagedecreased
import typings.winrtUwp.winrtUwpStrings.appmemoryusageincreased
import typings.winrtUwp.winrtUwpStrings.appmemoryusagelimitchanging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to information on an app's memory usage. */
@JSGlobal("Windows.System.MemoryManager")
@js.native
abstract class MemoryManager ()
  extends typings.winrtUwp.Windows.System.MemoryManager
object MemoryManager {
  
  @JSGlobal("Windows.System.MemoryManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* unmapped type */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.addEventListener")
  @js.native
  def addEventListener_appmemoryusagedecreased(`type`: appmemoryusagedecreased, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.addEventListener")
  @js.native
  def addEventListener_appmemoryusageincreased(`type`: appmemoryusageincreased, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.addEventListener")
  @js.native
  def addEventListener_appmemoryusagelimitchanging(`type`: appmemoryusagelimitchanging, listener: EventHandler[_]): Unit = js.native
  
  /** Gets the app's current memory usage. */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.appMemoryUsage")
  @js.native
  def appMemoryUsage: Double = js.native
  
  /** Gets the app's memory usage level. */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.appMemoryUsageLevel")
  @js.native
  def appMemoryUsageLevel: typings.winrtUwp.Windows.System.AppMemoryUsageLevel = js.native
  @scala.inline
  def appMemoryUsageLevel_=(x: typings.winrtUwp.Windows.System.AppMemoryUsageLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appMemoryUsageLevel")(x.asInstanceOf[js.Any])
  
  /** Gets the app's memory usage limit. */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.appMemoryUsageLimit")
  @js.native
  def appMemoryUsageLimit: Double = js.native
  @scala.inline
  def appMemoryUsageLimit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appMemoryUsageLimit")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def appMemoryUsage_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appMemoryUsage")(x.asInstanceOf[js.Any])
  
  /**
    * Gets an AppMemoryReport for the app, which provides information about its memory usage.
    * @return Information about the process' memory usage.
    */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.getAppMemoryReport")
  @js.native
  def getAppMemoryReport(): typings.winrtUwp.Windows.System.AppMemoryReport = js.native
  
  /**
    * Gets a ProcessMemoryReport for a process, which provides information about its memory usage.
    * @return Information about the process' memory usage.
    */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.getProcessMemoryReport")
  @js.native
  def getProcessMemoryReport(): typings.winrtUwp.Windows.System.ProcessMemoryReport = js.native
  
  /** Raised when the app's memory consumption has decreased to a lower value in the AppMemoryUsageLevel enumeration. */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.onappmemoryusagedecreased")
  @js.native
  def onappmemoryusagedecreased: EventHandler[js.Any] = js.native
  @scala.inline
  def onappmemoryusagedecreased_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onappmemoryusagedecreased")(x.asInstanceOf[js.Any])
  
  /** Raised when the app's memory consumption has increased to a higher value in the AppMemoryUsageLevel enumeration. */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.onappmemoryusageincreased")
  @js.native
  def onappmemoryusageincreased: EventHandler[js.Any] = js.native
  @scala.inline
  def onappmemoryusageincreased_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onappmemoryusageincreased")(x.asInstanceOf[js.Any])
  
  /** Raised just before the limit of how much total memory the app can use is changed. */
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.onappmemoryusagelimitchanging")
  @js.native
  def onappmemoryusagelimitchanging: EventHandler[js.Any] = js.native
  @scala.inline
  def onappmemoryusagelimitchanging_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onappmemoryusagelimitchanging")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.removeEventListener")
  @js.native
  def removeEventListener_appmemoryusagedecreased(`type`: appmemoryusagedecreased, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.removeEventListener")
  @js.native
  def removeEventListener_appmemoryusageincreased(`type`: appmemoryusageincreased, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.removeEventListener")
  @js.native
  def removeEventListener_appmemoryusagelimitchanging(`type`: appmemoryusagelimitchanging, listener: EventHandler[_]): Unit = js.native
  
  /* static member */
  @JSGlobal("Windows.System.MemoryManager.trySetAppMemoryUsageLimit")
  @js.native
  def trySetAppMemoryUsageLimit: js.Any = js.native
  @scala.inline
  def trySetAppMemoryUsageLimit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trySetAppMemoryUsageLimit")(x.asInstanceOf[js.Any])
}
