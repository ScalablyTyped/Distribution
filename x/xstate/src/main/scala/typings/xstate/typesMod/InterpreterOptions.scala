package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.anon.ContextAny
import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpreterOptions
  extends /* option */ StringDictionary[js.Any] {
  
  var clock: Clock = js.native
  
  /**
    * If `true`, defers processing of sent events until the service
    * is initialized (`.start()`). Otherwise, an error will be thrown
    * for events sent to an uninitialized service.
    *
    * Default: `true`
    */
  var deferEvents: Boolean = js.native
  
  /**
    * If `true`, states and events will be logged to Redux DevTools.
    *
    * Default: `false`
    */
  var devTools: Boolean | js.Object = js.native
  
  /**
    * Whether state actions should be executed immediately upon transition. Defaults to `true`.
    */
  var execute: Boolean = js.native
  
  /**
    * The custom `id` for referencing this service.
    */
  var id: js.UndefOr[String] = js.native
  
  def logger(args: js.Any*): Unit = js.native
  
  var parent: js.UndefOr[Interpreter[_, _, _, ContextAny]] = js.native
}
object InterpreterOptions {
  
  @scala.inline
  def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit
  ): InterpreterOptions = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    __obj.asInstanceOf[InterpreterOptions]
  }
  
  @scala.inline
  implicit class InterpreterOptionsMutableBuilder[Self <: InterpreterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevTools(value: Boolean | js.Object): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: Interpreter[_, _, _, ContextAny]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
