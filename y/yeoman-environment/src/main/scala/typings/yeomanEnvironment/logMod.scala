package typings.yeomanEnvironment

import org.scalablytyped.runtime.TopLevel
import typings.node.eventsMod.EventEmitter
import typings.node.ttyMod.WriteStream
import typings.std.Console
import typings.yeomanEnvironment.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  /**
    * Creates a new `Logger` instance with the specified `options`.
    *
    * @param options
    * The options for creating the new logger.
    */
  inline def apply[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Logger[TCategories]]
  
  @JSImport("yeoman-environment/lib/util/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides a set of colors.
    */
  type ColorMap[TKeys /* <: String | Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in TKeys ]: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color * / any | / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Modifiers * / any}
    */ typings.yeomanEnvironment.yeomanEnvironmentStrings.ColorMap & TopLevel[Any]
  
  /**
    * Provides default color-categories.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.skip
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.force
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.create
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.invoke
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.conflict
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.identical
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.info
  */
  trait DefaultCategories extends StObject
  object DefaultCategories {
    
    inline def conflict: typings.yeomanEnvironment.yeomanEnvironmentStrings.conflict = "conflict".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.conflict]
    
    inline def create: typings.yeomanEnvironment.yeomanEnvironmentStrings.create = "create".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.create]
    
    inline def force: typings.yeomanEnvironment.yeomanEnvironmentStrings.force = "force".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.force]
    
    inline def identical: typings.yeomanEnvironment.yeomanEnvironmentStrings.identical = "identical".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.identical]
    
    inline def info: typings.yeomanEnvironment.yeomanEnvironmentStrings.info = "info".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.info]
    
    inline def invoke: typings.yeomanEnvironment.yeomanEnvironmentStrings.invoke = "invoke".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.invoke]
    
    inline def skip: typings.yeomanEnvironment.yeomanEnvironmentStrings.skip = "skip".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.skip]
  }
  
  /**
    * Provides the functionality to log messages.
    */
  type Logger[TCategories /* <: String | Double | js.Symbol */] = EventEmitter & typings.yeomanEnvironment.yeomanEnvironmentStrings.Logger & TopLevel[Any] & Call[TCategories]
  
  /**
    * Provides options for creating a logger.
    */
  trait LoggerOptions[TCategories /* <: String | Double | js.Symbol */] extends StObject {
    
    /**
      * A set of categories and assigned `chalk`-formats.
      */
    var colors: js.UndefOr[ColorMap[TCategories]] = js.undefined
    
    /**
      * The console to write log-messages to.
      */
    var console: js.UndefOr[Console] = js.undefined
    
    /**
      * The stream to write other messages to.
      */
    var stderr: js.UndefOr[WriteStream] = js.undefined
    
    /**
      * The stream to write other messages to.
      */
    var stdout: js.UndefOr[WriteStream] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply[TCategories /* <: String | Double | js.Symbol */](): LoggerOptions[TCategories] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions[TCategories]]
    }
    
    extension [Self <: LoggerOptions[?], TCategories /* <: String | Double | js.Symbol */](x: Self & LoggerOptions[TCategories]) {
      
      inline def setColors(value: ColorMap[TCategories]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
