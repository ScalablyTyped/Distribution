package typings.windowsScriptHost

import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader
import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* was `typeof WScript` */
  object WSH {
    
    @JSGlobal("WSH")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("WSH.Arguments")
    @js.native
    def Arguments: WshArguments = js.native
    inline def Arguments(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Arguments")(index.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def Arguments_=(x: WshArguments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(x.asInstanceOf[js.Any])
    
    /**
      * The Windows Script Host build version number.
      */
    @JSGlobal("WSH.BuildVersion")
    @js.native
    def BuildVersion: Double = js.native
    inline def BuildVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BuildVersion")(x.asInstanceOf[js.Any])
    
    /**
      * Connects a COM object's event sources to functions named with a given prefix, in the form prefix_event.
      */
    inline def ConnectObject(objEventSource: js.Any, strPrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ConnectObject")(objEventSource.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a COM object.
      * @param strProgiID
      * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
      */
    inline def CreateObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strProgID: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateObject")(strProgID.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    inline def CreateObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strProgID: K, strPrefix: String): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateObject")(strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    
    /**
      * Disconnects a COM object from its event sources.
      */
    inline def DisconnectObject(obj: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DisconnectObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Outputs text to either a message box (under WScript.exe) or the command console window followed by
      * a newline (under CScript.exe).
      */
    inline def Echo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Echo")().asInstanceOf[Unit]
    inline def Echo(s: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Echo")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Fully qualified path of the host executable.
      */
    @JSGlobal("WSH.FullName")
    @js.native
    def FullName: String = js.native
    inline def FullName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullName")(x.asInstanceOf[js.Any])
    
    inline def GetObject(strPathname: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def GetObject(strPathname: String, strProgID: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def GetObject(strPathname: String, strProgID: String, strPrefix: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def GetObject(strPathname: String, strProgID: Unit, strPrefix: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    /**
      * Retrieves an existing object with the specified ProgID from memory, or creates a new one from a file.
      * @param strPathname Fully qualified path to the file containing the object persisted to disk.
      *                       For objects in memory, pass a zero-length string.
      * @param strProgID
      * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
      */
    inline def GetObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strPathname: String, strProgID: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    inline def GetObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strPathname: String, strProgID: K, strPrefix: String): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    
    /**
      * Gets/sets the script mode - interactive(true) or batch(false).
      */
    @JSGlobal("WSH.Interactive")
    @js.native
    def Interactive: Boolean = js.native
    inline def Interactive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Interactive")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the host executable (WScript.exe or CScript.exe).
      */
    @JSGlobal("WSH.Name")
    @js.native
    def Name: String = js.native
    inline def Name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /**
      * Path of the directory containing the host executable.
      */
    @JSGlobal("WSH.Path")
    @js.native
    def Path: String = js.native
    inline def Path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    /**
      * Forces the script to stop immediately, with an optional exit code.
      */
    inline def Quit(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Quit")().asInstanceOf[Double]
    inline def Quit(exitCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Quit")(exitCode.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *  The full path of the currently running script.
      */
    @JSGlobal("WSH.ScriptFullName")
    @js.native
    def ScriptFullName: String = js.native
    inline def ScriptFullName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptFullName")(x.asInstanceOf[js.Any])
    
    /**
      * The filename of the currently running script.
      */
    @JSGlobal("WSH.ScriptName")
    @js.native
    def ScriptName: String = js.native
    inline def ScriptName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptName")(x.asInstanceOf[js.Any])
    
    /**
      * Suspends script execution for a specified length of time, then continues execution.
      * @param intTime Interval (in milliseconds) to suspend script execution.
      */
    inline def Sleep(intTime: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Sleep")(intTime.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Exposes the write-only error output stream for the current script.
      * Can be accessed only while using CScript.exe.
      */
    @JSGlobal("WSH.StdErr")
    @js.native
    def StdErr: TextStreamWriter = js.native
    inline def StdErr_=(x: TextStreamWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StdErr")(x.asInstanceOf[js.Any])
    
    /**
      * Exposes the read-only input stream for the current script.
      * Can be accessed only while using CScript.exe.
      */
    @JSGlobal("WSH.StdIn")
    @js.native
    def StdIn: TextStreamReader = js.native
    inline def StdIn_=(x: TextStreamReader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StdIn")(x.asInstanceOf[js.Any])
    
    /**
      * Exposes the write-only output stream for the current script.
      * Can be accessed only while using CScript.exe.
      */
    @JSGlobal("WSH.StdOut")
    @js.native
    def StdOut: TextStreamWriter = js.native
    inline def StdOut_=(x: TextStreamWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StdOut")(x.asInstanceOf[js.Any])
    
    /**
      * Windows Script Host version
      */
    @JSGlobal("WSH.Version")
    @js.native
    def Version: String = js.native
    inline def Version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
  }
  
  object WScript {
    
    @JSGlobal("WScript")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("WScript.Arguments")
    @js.native
    def Arguments: WshArguments = js.native
    inline def Arguments(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Arguments")(index.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def Arguments_=(x: WshArguments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(x.asInstanceOf[js.Any])
    
    /**
      * The Windows Script Host build version number.
      */
    @JSGlobal("WScript.BuildVersion")
    @js.native
    def BuildVersion: Double = js.native
    inline def BuildVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BuildVersion")(x.asInstanceOf[js.Any])
    
    /**
      * Connects a COM object's event sources to functions named with a given prefix, in the form prefix_event.
      */
    inline def ConnectObject(objEventSource: js.Any, strPrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ConnectObject")(objEventSource.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a COM object.
      * @param strProgiID
      * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
      */
    inline def CreateObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strProgID: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateObject")(strProgID.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    inline def CreateObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strProgID: K, strPrefix: String): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateObject")(strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    
    /**
      * Disconnects a COM object from its event sources.
      */
    inline def DisconnectObject(obj: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DisconnectObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Outputs text to either a message box (under WScript.exe) or the command console window followed by
      * a newline (under CScript.exe).
      */
    inline def Echo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Echo")().asInstanceOf[Unit]
    inline def Echo(s: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Echo")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Fully qualified path of the host executable.
      */
    @JSGlobal("WScript.FullName")
    @js.native
    def FullName: String = js.native
    inline def FullName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullName")(x.asInstanceOf[js.Any])
    
    inline def GetObject(strPathname: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def GetObject(strPathname: String, strProgID: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def GetObject(strPathname: String, strProgID: String, strPrefix: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def GetObject(strPathname: String, strProgID: Unit, strPrefix: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    /**
      * Retrieves an existing object with the specified ProgID from memory, or creates a new one from a file.
      * @param strPathname Fully qualified path to the file containing the object persisted to disk.
      *                       For objects in memory, pass a zero-length string.
      * @param strProgID
      * @param strPrefix Function names in the form prefix_event will be bound to this object's COM events.
      */
    inline def GetObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strPathname: String, strProgID: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    inline def GetObject[K /* <: /* keyof activex-interop.ActiveXObjectNameMap */ String */](strPathname: String, strProgID: K, strPrefix: String): /* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetObject")(strPathname.asInstanceOf[js.Any], strProgID.asInstanceOf[js.Any], strPrefix.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: activex-interop.ActiveXObjectNameMap[K] */ js.Any]
    
    /**
      * Gets/sets the script mode - interactive(true) or batch(false).
      */
    @JSGlobal("WScript.Interactive")
    @js.native
    def Interactive: Boolean = js.native
    inline def Interactive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Interactive")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the host executable (WScript.exe or CScript.exe).
      */
    @JSGlobal("WScript.Name")
    @js.native
    def Name: String = js.native
    inline def Name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /**
      * Path of the directory containing the host executable.
      */
    @JSGlobal("WScript.Path")
    @js.native
    def Path: String = js.native
    inline def Path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    /**
      * Forces the script to stop immediately, with an optional exit code.
      */
    inline def Quit(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Quit")().asInstanceOf[Double]
    inline def Quit(exitCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Quit")(exitCode.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      *  The full path of the currently running script.
      */
    @JSGlobal("WScript.ScriptFullName")
    @js.native
    def ScriptFullName: String = js.native
    inline def ScriptFullName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptFullName")(x.asInstanceOf[js.Any])
    
    /**
      * The filename of the currently running script.
      */
    @JSGlobal("WScript.ScriptName")
    @js.native
    def ScriptName: String = js.native
    inline def ScriptName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptName")(x.asInstanceOf[js.Any])
    
    /**
      * Suspends script execution for a specified length of time, then continues execution.
      * @param intTime Interval (in milliseconds) to suspend script execution.
      */
    inline def Sleep(intTime: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Sleep")(intTime.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Exposes the write-only error output stream for the current script.
      * Can be accessed only while using CScript.exe.
      */
    @JSGlobal("WScript.StdErr")
    @js.native
    def StdErr: TextStreamWriter = js.native
    inline def StdErr_=(x: TextStreamWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StdErr")(x.asInstanceOf[js.Any])
    
    /**
      * Exposes the read-only input stream for the current script.
      * Can be accessed only while using CScript.exe.
      */
    @JSGlobal("WScript.StdIn")
    @js.native
    def StdIn: TextStreamReader = js.native
    inline def StdIn_=(x: TextStreamReader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StdIn")(x.asInstanceOf[js.Any])
    
    /**
      * Exposes the write-only output stream for the current script.
      * Can be accessed only while using CScript.exe.
      */
    @JSGlobal("WScript.StdOut")
    @js.native
    def StdOut: TextStreamWriter = js.native
    inline def StdOut_=(x: TextStreamWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StdOut")(x.asInstanceOf[js.Any])
    
    /**
      * Windows Script Host version
      */
    @JSGlobal("WScript.Version")
    @js.native
    def Version: String = js.native
    inline def Version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
  }
}
