package typings.titanium

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.titanium.mod.global.Console_
import typings.titanium.titaniumStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("console", JSImport.Namespace)
  @js.native
  val ^ : Console_ = js.native
  
  object global {
    
    @JSGlobal("console")
    @js.native
    def console: Console_ = js.native
    @scala.inline
    def console_=(x: Console_): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
    
    // This needs to be global to avoid TS2403 in case lib.dom.d.ts is present in the same build
    /**
      * Console logging facilities.
      */
    @js.native
    trait Console_ extends StObject {
      
      def assert(value: js.UndefOr[scala.Nothing], message: js.Any*): Unit = js.native
      /**
        * A simple assertion test that verifies whether value is truthy. If it is not, Assertion failed is logged. If provided, the error message is formatted using `util.format()` by passing along all message arguments. The output is used as the error message.
        */
      def assert(value: js.Any, message: js.Any*): Unit = js.native
      
      /**
        * Maintains an internal counter specific to `label` and outputs to stdout the number of times `console.count()` has been called with the given `label`.
        */
      def count(): Unit = js.native
      def count(label: String): Unit = js.native
      
      /**
        * Resets the internal counter specific to `label`.
        */
      def countReset(): Unit = js.native
      def countReset(label: String): Unit = js.native
      
      /**
        * Log a message at the `debug` level.
        */
      def debug(message: js.Any*): Unit = js.native
      
      /**
        * Log a message at the `error` level.
        */
      def error(message: js.Any*): Unit = js.native
      
      /**
        * Increases indentation of subsequent lines by spaces for `groupIndentation` length.
        */
      def group(label: js.Any*): Unit = js.native
      
      /**
        * Alias for `group()`
        */
      def groupCollapsed(label: js.Any*): Unit = js.native
      
      /**
        * Decreases indentation of subsequent lines by spaces for `groupIndentation` length.
        */
      def groupEnd(): Unit = js.native
      
      /**
        * Log a message at the `info` level.
        */
      def info(message: js.Any*): Unit = js.native
      
      /**
        * Log a message at the `info` level.
        */
      def log(message: js.Any*): Unit = js.native
      
      /**
        * Start a timer to track duration of an operation.
        */
      def time(): Unit = js.native
      def time(label: String): Unit = js.native
      
      /**
        * Stop a timer that was previously started.
        */
      def timeEnd(): Unit = js.native
      def timeEnd(label: String): Unit = js.native
      
      def timeLog(label: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
      /**
        * Log duration taken so far for an operation.
        */
      def timeLog(label: String, data: js.Any*): Unit = js.native
      
      /**
        * Log a message at the `trace` level.
        */
      def trace(message: js.Any*): Unit = js.native
      
      /**
        * Log a message at the `warn` level.
        */
      def warn(message: js.Any*): Unit = js.native
    }
    
    object Titanium {
      
      @js.native
      trait ConsoleConstructor
        extends Instantiable1[(/* options */ ConsoleConstructorOptions) | (/* stdout */ js.Object), Console_]
           with Instantiable2[/* stdout */ js.Object, /* stderr */ js.Object, Console_]
           with Instantiable3[
                  /* stdout */ js.Object, 
                  js.UndefOr[/* stderr */ js.Object], 
                  /* ignoreErrors */ Boolean, 
                  Console_
                ]
      
      @js.native
      trait ConsoleConstructorOptions extends StObject {
        
        var colorMode: js.UndefOr[Boolean | auto] = js.native
        
        var ignoreErrors: js.UndefOr[Boolean] = js.native
        
        var inspectOptions: js.UndefOr[js.Object] = js.native
        
        var stderr: js.UndefOr[js.Object] = js.native
        
        var stdout: js.Object = js.native
      }
      object ConsoleConstructorOptions {
        
        @scala.inline
        def apply(stdout: js.Object): ConsoleConstructorOptions = {
          val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
          __obj.asInstanceOf[ConsoleConstructorOptions]
        }
        
        @scala.inline
        implicit class ConsoleConstructorOptionsMutableBuilder[Self <: ConsoleConstructorOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setColorMode(value: Boolean | auto): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
          
          @scala.inline
          def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
          
          @scala.inline
          def setInspectOptions(value: js.Object): Self = StObject.set(x, "inspectOptions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInspectOptionsUndefined: Self = StObject.set(x, "inspectOptions", js.undefined)
          
          @scala.inline
          def setStderr(value: js.Object): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
          
          @scala.inline
          def setStdout(value: js.Object): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Global extends StObject {
        
        var console: Console_ = js.native
      }
      object Global {
        
        @scala.inline
        def apply(console: Console_): Global = {
          val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        @scala.inline
        implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setConsole(value: Console_): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  type _To = Console_
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Console_ = ^
}
