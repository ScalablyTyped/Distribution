package typings.wdioRepl

import typings.node.replMod.REPLEval
import typings.node.vmMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/repl", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with WDIORepl {
    def this(config: ReplConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@wdio/repl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/repl", "default.introMessage")
    @js.native
    def introMessage: String = js.native
    inline def introMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("introMessage")(x.asInstanceOf[js.Any])
  }
  
  type ReplCallback = js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]
  
  trait ReplConfig extends StObject {
    
    var commandTimeout: Double
    
    def eval(
      evalCmd: String,
      context: Context,
      file: String,
      cb: js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]
    ): Unit
    @JSName("eval")
    var eval_Original: REPLEval
    
    var prompt: String
    
    var useColor: Boolean
    
    var useGlobal: Boolean
  }
  object ReplConfig {
    
    inline def apply(commandTimeout: Double, eval: REPLEval, prompt: String, useColor: Boolean, useGlobal: Boolean): ReplConfig = {
      val __obj = js.Dynamic.literal(commandTimeout = commandTimeout.asInstanceOf[js.Any], eval = eval.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], useColor = useColor.asInstanceOf[js.Any], useGlobal = useGlobal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplConfig] (val x: Self) extends AnyVal {
      
      inline def setCommandTimeout(value: Double): Self = StObject.set(x, "commandTimeout", value.asInstanceOf[js.Any])
      
      inline def setEval(value: REPLEval): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setUseColor(value: Boolean): Self = StObject.set(x, "useColor", value.asInstanceOf[js.Any])
      
      inline def setUseGlobal(value: Boolean): Self = StObject.set(x, "useGlobal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WDIORepl extends StObject {
    
    /* private */ var _config: Any = js.native
    
    /* private */ var _handleResult: Any = js.native
    
    /* private */ var _isCommandRunning: Any = js.native
    
    /* private */ var _replServer: Any = js.native
    
    /* private */ var _runCmd: Any = js.native
    
    def eval(cmd: String, context: Context, filename: String, callback: ReplCallback): Unit | js.Promise[Any] = js.native
    def eval(cmd: String, context: Context, filename: Unit, callback: ReplCallback): Unit | js.Promise[Any] = js.native
    
    def start(): js.Promise[Any] = js.native
    def start(context: Context): js.Promise[Any] = js.native
  }
}
