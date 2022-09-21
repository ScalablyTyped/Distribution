package typings.windowsService

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def add(name: String, opts: AddOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def run(stdoutLogStream: Writable, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(stdoutLogStream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def run(stdoutLogStream: Writable, stderrLogStream: Writable, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(stdoutLogStream.asInstanceOf[js.Any], stderrLogStream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  inline def stop(rcode: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(rcode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AddOptions extends StObject {
    
    /**
      * The services display name, defaults to the name parameter
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings specifying parameters to pass to nodePath, defaults to []
      */
    var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The fully qualified path to the node binary used to run the service (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
      */
    var nodePath: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings specifying parameters to pass to programPath, defaults to []
      */
    var programArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The program to run using nodePath, defaults to the value of process.argv[1]
      */
    var programPath: js.UndefOr[String] = js.undefined
  }
  object AddOptions {
    
    inline def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    extension [Self <: AddOptions](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      inline def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      inline def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value*))
      
      inline def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
      
      inline def setNodePathUndefined: Self = StObject.set(x, "nodePath", js.undefined)
      
      inline def setProgramArgs(value: js.Array[String]): Self = StObject.set(x, "programArgs", value.asInstanceOf[js.Any])
      
      inline def setProgramArgsUndefined: Self = StObject.set(x, "programArgs", js.undefined)
      
      inline def setProgramArgsVarargs(value: String*): Self = StObject.set(x, "programArgs", js.Array(value*))
      
      inline def setProgramPath(value: String): Self = StObject.set(x, "programPath", value.asInstanceOf[js.Any])
      
      inline def setProgramPathUndefined: Self = StObject.set(x, "programPath", js.undefined)
    }
  }
}
