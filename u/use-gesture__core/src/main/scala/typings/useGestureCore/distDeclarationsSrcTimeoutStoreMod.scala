package typings.useGestureCore

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTimeoutStoreMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/TimeoutStore", "TimeoutStore")
  @js.native
  open class TimeoutStore () extends StObject {
    
    /* private */ var _timeouts: Any = js.native
    
    def add[FunctionType /* <: js.Function1[/* repeated */ Any, Any] */](
      key: String,
      callback: FunctionType,
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FunctionType> is not an array type */ args: Parameters[FunctionType]
    ): Unit = js.native
    def add[FunctionType /* <: js.Function1[/* repeated */ Any, Any] */](
      key: String,
      callback: FunctionType,
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FunctionType> is not an array type */ args: Parameters[FunctionType]
    ): Unit = js.native
    
    def clean(): Unit = js.native
    
    def remove(key: String): Unit = js.native
  }
}
