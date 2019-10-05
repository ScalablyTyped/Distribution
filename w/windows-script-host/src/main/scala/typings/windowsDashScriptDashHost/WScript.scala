package typings.windowsDashScriptDashHost

import typings.activexDashIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader
import typings.activexDashIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WScript")
@js.native
object WScript extends js.Object {
  @JSName("Arguments")
  var Arguments_Original: WshArguments = js.native
  /**
    * The Windows Script Host build version number.
    */
  var BuildVersion: Double = js.native
  /**
    * Fully qualified path of the host executable.
    */
  var FullName: String = js.native
  /**
    * Gets/sets the script mode - interactive(true) or batch(false).
    */
  var Interactive: Boolean = js.native
  /**
    * The name of the host executable (WScript.exe or CScript.exe).
    */
  var Name: String = js.native
  /**
    * Path of the directory containing the host executable.
    */
  var Path: String = js.native
  /**
    *  The full path of the currently running script.
    */
  var ScriptFullName: String = js.native
  /**
    * The filename of the currently running script.
    */
  var ScriptName: String = js.native
  /**
    * Exposes the write-only error output stream for the current script.
    * Can be accessed only while using CScript.exe.
    */
  var StdErr: TextStreamWriter = js.native
  /**
    * Exposes the read-only input stream for the current script.
    * Can be accessed only while using CScript.exe.
    */
  var StdIn: TextStreamReader = js.native
  /**
    * Exposes the write-only output stream for the current script.
    * Can be accessed only while using CScript.exe.
    */
  var StdOut: TextStreamWriter = js.native
  /**
    * Windows Script Host version
    */
  var Version: String = js.native
  def Arguments(index: Double): String = js.native
  /**
    * Connects a COM object's event sources to functions named with a given prefix, in the form prefix_event.
    */
  def ConnectObject(objEventSource: js.Any, strPrefix: String): Unit = js.native
  /**
    * Creates a COM object.
    * @param strProgiID
    * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
    */
  def CreateObject[K /* <: String */](strProgID: K): /* import warning: ImportType.apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = js.native
  def CreateObject[K /* <: String */](strProgID: K, strPrefix: String): /* import warning: ImportType.apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = js.native
  /**
    * Disconnects a COM object from its event sources.
    */
  def DisconnectObject(obj: js.Any): Unit = js.native
  /**
    * Outputs text to either a message box (under WScript.exe) or the command console window followed by
    * a newline (under CScript.exe).
    */
  def Echo(): Unit = js.native
  def Echo(s: js.Any): Unit = js.native
  def GetObject(strPathname: String): js.Any = js.native
  def GetObject(strPathname: String, strProgID: String): js.Any = js.native
  def GetObject(strPathname: String, strProgID: String, strPrefix: String): js.Any = js.native
  /**
    * Retrieves an existing object with the specified ProgID from memory, or creates a new one from a file.
    * @param strPathname Fully qualified path to the file containing the object persisted to disk.
    *                       For objects in memory, pass a zero-length string.
    * @param strProgID
    * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
    */
  def GetObject[K /* <: String */](strPathname: String, strProgID: K): /* import warning: ImportType.apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = js.native
  def GetObject[K /* <: String */](strPathname: String, strProgID: K, strPrefix: String): /* import warning: ImportType.apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = js.native
  /**
    * Forces the script to stop immediately, with an optional exit code.
    */
  def Quit(): Double = js.native
  def Quit(exitCode: Double): Double = js.native
  /**
    * Suspends script execution for a specified length of time, then continues execution.
    * @param intTime Interval (in milliseconds) to suspend script execution.
    */
  def Sleep(intTime: Double): Unit = js.native
}

