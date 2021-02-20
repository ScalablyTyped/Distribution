package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<xstate.xstate/lib/types.InterpreterOptions> */
@js.native
trait PartialInterpreterOptions extends StObject {
  
  var clock: js.UndefOr[Clock] = js.native
  
  var deferEvents: js.UndefOr[Boolean] = js.native
  
  var devTools: js.UndefOr[Boolean | js.Object] = js.native
  
  var execute: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var parent: js.UndefOr[Interpreter[_, _, _, ContextAny]] = js.native
}
object PartialInterpreterOptions {
  
  @scala.inline
  def apply(): PartialInterpreterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterpreterOptions]
  }
  
  @scala.inline
  implicit class PartialInterpreterOptionsMutableBuilder[Self <: PartialInterpreterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    @scala.inline
    def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferEventsUndefined: Self = StObject.set(x, "deferEvents", js.undefined)
    
    @scala.inline
    def setDevTools(value: Boolean | js.Object): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
    
    @scala.inline
    def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setParent(value: Interpreter[_, _, _, ContextAny]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
