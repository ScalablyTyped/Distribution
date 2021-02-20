package typings.wdioRepl

import typings.node.replMod.REPLEval
import typings.node.vmMod.Context
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/repl", JSImport.Default)
  @js.native
  class default () extends WDIORepl {
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
    @scala.inline
    def introMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("introMessage")(x.asInstanceOf[js.Any])
  }
  
  type ReplCallback = js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
  
  @js.native
  trait ReplConfig extends StObject {
    
    var commandTimeout: Double = js.native
    
    def eval(
      evalCmd: String,
      context: Context,
      file: String,
      cb: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
    ): Unit = js.native
    @JSName("eval")
    var eval_Original: REPLEval = js.native
    
    var prompt: String = js.native
    
    var useColor: Boolean = js.native
    
    var useGlobal: Boolean = js.native
  }
  
  @js.native
  trait WDIORepl extends StObject {
    
    var _config: js.Any = js.native
    
    var _handleResult: js.Any = js.native
    
    var _isCommandRunning: js.Any = js.native
    
    var _replServer: js.Any = js.native
    
    var _runCmd: js.Any = js.native
    
    def eval(cmd: String, context: Context, filename: js.UndefOr[scala.Nothing], callback: ReplCallback): Unit | js.Promise[_] = js.native
    def eval(cmd: String, context: Context, filename: String, callback: ReplCallback): Unit | js.Promise[_] = js.native
    
    def start(): js.Promise[_] = js.native
    def start(context: Context): js.Promise[_] = js.native
  }
}
