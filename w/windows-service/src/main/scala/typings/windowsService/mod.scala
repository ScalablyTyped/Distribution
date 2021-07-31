package typings.windowsService

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def add(name: String, opts: AddOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def run(stdoutLogStream: Writable, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(stdoutLogStream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(stdoutLogStream: Writable, stderrLogStream: Writable, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(stdoutLogStream.asInstanceOf[js.Any], stderrLogStream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  @scala.inline
  def stop(rcode: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(rcode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    @scala.inline
    def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    @scala.inline
    implicit class AddOptionsMutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      @scala.inline
      def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value :_*))
      
      @scala.inline
      def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodePathUndefined: Self = StObject.set(x, "nodePath", js.undefined)
      
      @scala.inline
      def setProgramArgs(value: js.Array[String]): Self = StObject.set(x, "programArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramArgsUndefined: Self = StObject.set(x, "programArgs", js.undefined)
      
      @scala.inline
      def setProgramArgsVarargs(value: String*): Self = StObject.set(x, "programArgs", js.Array(value :_*))
      
      @scala.inline
      def setProgramPath(value: String): Self = StObject.set(x, "programPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramPathUndefined: Self = StObject.set(x, "programPath", js.undefined)
    }
  }
}
