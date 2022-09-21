package typings.webpackBlocksCore

import typings.webpack.mod.Configuration
import typings.webpack.mod.Plugin
import typings.webpack.mod.RuleSetRule
import typings.webpackBlocksCore.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Core {
    
    @JSImport("@webpack-blocks/core", "Core")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createConfig(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
    inline def createConfig(initialContext: InitialContext, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(initialContext.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
    
    inline def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("env")(envName.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
    
    inline def group(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
    
    inline def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
    inline def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
    inline def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
    inline def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
    
    inline def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  }
  
  inline def createConfig(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  inline def createConfig(initialContext: InitialContext, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(initialContext.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("env")(envName.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def group(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  @js.native
  trait Block[T /* <: Context */] extends ConfigSetter[T] {
    
    var post: js.UndefOr[ConfigSetter[T] | js.Array[ConfigSetter[T]]] = js.native
    
    var pre: js.UndefOr[ConfigSetter[T] | js.Array[ConfigSetter[T]]] = js.native
  }
  
  type ConfigSetter[T /* <: Context */] = js.Function2[
    /* context */ T, 
    /* util */ Util, 
    js.Function1[/* config */ Configuration, Configuration]
  ]
  
  trait Context extends StObject {
    
    var `match`: Test
  }
  object Context {
    
    inline def apply(`match`: Test): Context = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setMatch(value: Test): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialContext extends StObject {
    
    var webpack: Any
    
    var webpackVersion: String
  }
  object InitialContext {
    
    inline def apply(webpack: Any, webpackVersion: String): InitialContext = {
      val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackVersion = webpackVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialContext]
    }
    
    extension [Self <: InitialContext](x: Self) {
      
      inline def setWebpack(value: Any): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
      
      inline def setWebpackVersion(value: String): Self = StObject.set(x, "webpackVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatchOptions extends StObject {
    
    var exclude: js.UndefOr[js.RegExp] = js.undefined
    
    var include: js.UndefOr[String] = js.undefined
  }
  object MatchOptions {
    
    inline def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    extension [Self <: MatchOptions](x: Self) {
      
      inline def setExclude(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  trait Util extends StObject {
    
    def addLoader(loaderDefinition: RuleSetRule): js.Function0[Configuration]
    
    def addPlugin(plugin: Plugin): js.Function0[Configuration]
    
    def merge(configSnippet: Configuration): js.Function0[Configuration]
  }
  object Util {
    
    inline def apply(
      addLoader: RuleSetRule => js.Function0[Configuration],
      addPlugin: Plugin => js.Function0[Configuration],
      merge: Configuration => js.Function0[Configuration]
    ): Util = {
      val __obj = js.Dynamic.literal(addLoader = js.Any.fromFunction1(addLoader), addPlugin = js.Any.fromFunction1(addPlugin), merge = js.Any.fromFunction1(merge))
      __obj.asInstanceOf[Util]
    }
    
    extension [Self <: Util](x: Self) {
      
      inline def setAddLoader(value: RuleSetRule => js.Function0[Configuration]): Self = StObject.set(x, "addLoader", js.Any.fromFunction1(value))
      
      inline def setAddPlugin(value: Plugin => js.Function0[Configuration]): Self = StObject.set(x, "addPlugin", js.Any.fromFunction1(value))
      
      inline def setMerge(value: Configuration => js.Function0[Configuration]): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    }
  }
}
