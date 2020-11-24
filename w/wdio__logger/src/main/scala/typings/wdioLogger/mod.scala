package typings.wdioLogger

import typings.loglevel.mod.LogLevelDesc
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wdio/logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(name: String): typings.loglevel.mod.Logger = js.native
    
    var clearLogger: js.Function0[Unit] = js.native
    
    var setLevel: js.Function2[/* name */ String, /* level */ LogLevelDesc, Unit] = js.native
    
    var setLogLevelsConfig: js.Function2[
        /* logLevels */ js.UndefOr[Record[String, LogLevelDesc]], 
        /* wdioLogLevel */ js.UndefOr[LogLevelDesc], 
        Unit
      ] = js.native
    
    var waitForBuffer: js.Function0[js.Promise[js.Any]] = js.native
  }
  
  type Logger = typings.loglevel.mod.Logger
}
