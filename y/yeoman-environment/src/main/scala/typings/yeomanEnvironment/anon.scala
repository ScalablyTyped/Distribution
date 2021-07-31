package typings.yeomanEnvironment

import typings.node.eventsMod.EventEmitterOptions
import typings.std.Parameters
import typings.std.Record
import typings.textTable.mod.Options
import typings.yeomanEnvironment.logMod.DefaultCategories
import typings.yeomanEnvironment.logMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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
    def apply(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    /**
      * Writes a log-message.
      */
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Console['error']> is not an array type */ args: Parameters[js.Function1[/* repeated */ js.Any, Unit]]
    ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    def apply(format: String): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    def apply(format: String, params: Record[String, js.Any]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    def apply(format: Unit, params: Record[String, js.Any]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    
    /**
      * Writes an error-message with a prepended cross mark.
      */
    def error(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    
    /**
      * Writes a success status with a check mark `✔`.
      */
    def ok(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    
    /**
      * Writes a table to the console.
      */
    var table: FnCall = js.native
    
    /**
      * Writes a log-message.
      */
    def write(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
    
    /**
      * Writes a log-message with an appended newline character.
      */
    def writeln(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
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
  
  /* Inlined yeoman-environment.yeoman-environment/lib/util/log.Logger<yeoman-environment.yeoman-environment/lib/util/log.DefaultCategories> */
  @js.native
  trait LoggerDefaultCategories extends StObject {
    
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
    def apply(): Logger[DefaultCategories] = js.native
    /**
      * Writes a log-message.
      */
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Console['error']> is not an array type */ args: Parameters[js.Function1[/* repeated */ js.Any, Unit]]
    ): Logger[DefaultCategories] = js.native
    def apply(format: String): Logger[DefaultCategories] = js.native
    def apply(format: String, params: Record[String, js.Any]): Logger[DefaultCategories] = js.native
    def apply(format: Unit, params: Record[String, js.Any]): Logger[DefaultCategories] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    var conflict: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    var create: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    /**
      * Writes an error-message with a prepended cross mark.
      */
    def error(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): Logger[DefaultCategories] = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    var force: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    def getMaxListeners(): Double = js.native
    
    var identical: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    var info: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    var invoke: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /**
      * Writes a success status with a check mark `✔`.
      */
    def ok(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): Logger[DefaultCategories] = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    var skip: js.Function1[
        /* args */ Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]], 
        Logger[DefaultCategories]
      ] = js.native
    
    /**
      * Writes a table to the console.
      */
    var table: FnCall = js.native
    
    /**
      * Writes a log-message.
      */
    def write(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): Logger[DefaultCategories] = js.native
    
    /**
      * Writes a log-message with an appended newline character.
      */
    def writeln(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ js.Any, /* repeated */ js.Any, String]]
    ): Logger[DefaultCategories] = js.native
  }
}
