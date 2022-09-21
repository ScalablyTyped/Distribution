package typings.yeomanEnvironment

import typings.std.Parameters
import typings.std.Record
import typings.textTable.mod.Options
import typings.yeomanEnvironment.logMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[TCategories /* <: String | Double | js.Symbol */] extends StObject {
    
    /**
      * Writes a log-message.
      *
      * @param format
      * The format of the log-messages.
      * See <https://github.com/mikeal/logref> for more info.
      *
      * @param params
      * The parameters to replace variables with.
      */
    def apply(): Logger[TCategories] = js.native
    /**
      * Writes a log-message.
      */
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Console['error']> is not an array type */ args: Parameters[js.Function1[/* repeated */ Any, Unit]]
    ): Logger[TCategories] = js.native
    def apply(format: String): Logger[TCategories] = js.native
    def apply(format: String, params: Record[String, Any]): Logger[TCategories] = js.native
    def apply(format: Unit, params: Record[String, Any]): Logger[TCategories] = js.native
    
    /**
      * Writes an error-message with a prepended cross mark.
      */
    def error(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[FnCall]
    ): Logger[TCategories] = js.native
    
    /**
      * Writes a success status with a check mark `✔`.
      */
    def ok(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[FnCall]
    ): Logger[TCategories] = js.native
    
    /**
      * Writes a table to the console.
      */
    var table: FnCallRowsOptions = js.native
    
    /**
      * Writes a log-message.
      */
    def write(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[FnCall]
    ): Logger[TCategories] = js.native
    
    /**
      * Writes a log-message with an appended newline character.
      */
    def writeln(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[FnCall]
    ): Logger[TCategories] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(format: Any, param: Any*): String = js.native
    def apply(format: Unit, param: Any*): String = js.native
  }
  
  @js.native
  trait FnCallRowsOptions extends StObject {
    
    def apply(
      /** An array of arrays containing strings, numbers, or other printable values. */
    rows: js.Array[js.Array[js.Object]]
    ): String = js.native
    def apply(
      /** An array of arrays containing strings, numbers, or other printable values. */
    rows: js.Array[js.Array[js.Object]],
      /** A configuration object to customize table output. */
    options: Options
    ): String = js.native
  }
}
