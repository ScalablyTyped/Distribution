package typings
package windowsDashScriptDashHostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * WSH is an alias for WScript under Windows Script Host
 */
@JSGlobal("WSH")
@js.native
object WSH extends js.Object {
  var Arguments: windowsDashScriptDashHostLib.WshArguments = js.native
  /**
       * The Windows Script Host build version number.
       */
  var BuildVersion: scala.Double = js.native
  /**
       * Fully qualified path of the host executable.
       */
  var FullName: java.lang.String = js.native
  /**
       * Gets/sets the script mode - interactive(true) or batch(false).
       */
  var Interactive: scala.Boolean = js.native
  /**
       * The name of the host executable (WScript.exe or CScript.exe).
       */
  var Name: java.lang.String = js.native
  /**
       * Path of the directory containing the host executable.
       */
  var Path: java.lang.String = js.native
  /**
       *  The full path of the currently running script.
       */
  var ScriptFullName: java.lang.String = js.native
  /**
       * The filename of the currently running script.
       */
  var ScriptName: java.lang.String = js.native
  /**
       * Exposes the write-only error output stream for the current script.
       * Can be accessed only while using CScript.exe.
       */
  var StdErr: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.TextStreamWriter = js.native
  /**
       * Exposes the read-only input stream for the current script.
       * Can be accessed only while using CScript.exe.
       */
  var StdIn: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.TextStreamReader = js.native
  /**
       * Exposes the write-only output stream for the current script.
       * Can be accessed only while using CScript.exe.
       */
  var StdOut: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.TextStreamWriter = js.native
  /**
       * Windows Script Host version
       */
  var Version: java.lang.String = js.native
  /**
       * Connects a COM object's event sources to functions named with a given prefix, in the form prefix_event.
       */
  def ConnectObject(objEventSource: js.Any, strPrefix: java.lang.String): scala.Unit = js.native
  /**
       * Creates a COM object.
       * @param strProgiID
       * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
       */
  def CreateObject[K /* <: java.lang.String */](strProgID: K): js.Any = js.native
  /**
       * Creates a COM object.
       * @param strProgiID
       * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
       */
  def CreateObject[K /* <: java.lang.String */](strProgID: K, strPrefix: java.lang.String): js.Any = js.native
  /**
       * Disconnects a COM object from its event sources.
       */
  def DisconnectObject(obj: js.Any): scala.Unit = js.native
  /**
       * Outputs text to either a message box (under WScript.exe) or the command console window followed by
       * a newline (under CScript.exe).
       */
  def Echo(): scala.Unit = js.native
  /**
       * Outputs text to either a message box (under WScript.exe) or the command console window followed by
       * a newline (under CScript.exe).
       */
  def Echo(s: js.Any): scala.Unit = js.native
  def GetObject(strPathname: java.lang.String): js.Any = js.native
  def GetObject(strPathname: java.lang.String, strProgID: java.lang.String): js.Any = js.native
  def GetObject(strPathname: java.lang.String, strProgID: java.lang.String, strPrefix: java.lang.String): js.Any = js.native
  /**
       * Retrieves an existing object with the specified ProgID from memory, or creates a new one from a file.
       * @param strPathname Fully qualified path to the file containing the object persisted to disk.
       *                       For objects in memory, pass a zero-length string.
       * @param strProgID
       * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
       */
  def GetObject[K /* <: java.lang.String */](strPathname: java.lang.String, strProgID: K): js.Any = js.native
  /**
       * Retrieves an existing object with the specified ProgID from memory, or creates a new one from a file.
       * @param strPathname Fully qualified path to the file containing the object persisted to disk.
       *                       For objects in memory, pass a zero-length string.
       * @param strProgID
       * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
       */
  def GetObject[K /* <: java.lang.String */](strPathname: java.lang.String, strProgID: K, strPrefix: java.lang.String): js.Any = js.native
  /**
       * Forces the script to stop immediately, with an optional exit code.
       */
  def Quit(): scala.Double = js.native
  /**
       * Forces the script to stop immediately, with an optional exit code.
       */
  def Quit(exitCode: scala.Double): scala.Double = js.native
  /**
       * Suspends script execution for a specified length of time, then continues execution.
       * @param intTime Interval (in milliseconds) to suspend script execution.
       */
  def Sleep(intTime: scala.Double): scala.Unit = js.native
}

