package typings.twilioReplayEventEmitter

import typings.node.eventsMod.EventEmitter
import typings.std.Extract
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@twilio/replay-event-emitter", "ReplayEventEmitter")
  @js.native
  open class ReplayEventEmitter[Events /* <: Record[String | js.Symbol, js.Function1[/* repeated */ Any, Unit]] */] () extends EventEmitter {
    
    def addListener[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def addListenerWithReplay[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def emit[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[E]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
        ]
    ): Boolean = js.native
    
    /* private */ var eventHistory: Any = js.native
    
    def off[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def on[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def onWithReplay[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def once[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def removeListener[E /* <: Extract[/* keyof Events */ String, String] */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
  }
}
