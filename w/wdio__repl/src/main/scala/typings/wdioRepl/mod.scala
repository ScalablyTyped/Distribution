package typings.wdioRepl

import typings.node.replMod.REPLEval
import typings.node.vmMod.Context
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wdio/repl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait ReplConfig extends js.Object {
    
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
  trait WDIORepl extends js.Object {
    
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
  
  @js.native
  class default () extends WDIORepl {
    def this(config: ReplConfig) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var introMessage: String = js.native
  }
  
  type ReplCallback = js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
}
