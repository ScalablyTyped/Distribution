package typings.webpackBlocksCore

import typings.std.Plugin
import typings.std.RegExp
import typings.webpackBlocksCore.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Core {
    
    @JSImport("@webpack-blocks/core", "Core.createConfig")
    @js.native
    def createConfig(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    @JSImport("@webpack-blocks/core", "Core.createConfig")
    @js.native
    def createConfig(initialContext: InitialContext, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    
    @JSImport("@webpack-blocks/core", "Core.env")
    @js.native
    def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    
    @JSImport("@webpack-blocks/core", "Core.group")
    @js.native
    def group(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    
    @JSImport("@webpack-blocks/core", "Core.when")
    @js.native
    def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    
    @JSImport("@webpack-blocks/core", "Core.match")
    @js.native
    def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    @JSImport("@webpack-blocks/core", "Core.match")
    @js.native
    def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    @JSImport("@webpack-blocks/core", "Core.match")
    @js.native
    def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
    @JSImport("@webpack-blocks/core", "Core.match")
    @js.native
    def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  }
  
  @JSImport("@webpack-blocks/core", "createConfig")
  @js.native
  def createConfig(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/core", "createConfig")
  @js.native
  def createConfig(initialContext: InitialContext, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/core", "env")
  @js.native
  def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/core", "group")
  @js.native
  def group(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/core", "when")
  @js.native
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @js.native
  trait Block[T /* <: Context */] extends ConfigSetter[T] {
    
    var post: js.UndefOr[ConfigSetter[T] | js.Array[ConfigSetter[T]]] = js.native
    
    var pre: js.UndefOr[ConfigSetter[T] | js.Array[ConfigSetter[T]]] = js.native
  }
  
  type ConfigSetter[T /* <: Context */] = js.Function2[
    /* context */ T, 
    /* util */ Util, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ /* config */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ]
  ]
  
  @js.native
  trait Context extends StObject {
    
    var `match`: Test = js.native
  }
  object Context {
    
    @scala.inline
    def apply(`match`: Test): Context = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: Test): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InitialContext extends StObject {
    
    var webpack: js.Any = js.native
    
    var webpackVersion: String = js.native
  }
  object InitialContext {
    
    @scala.inline
    def apply(webpack: js.Any, webpackVersion: String): InitialContext = {
      val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackVersion = webpackVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialContext]
    }
    
    @scala.inline
    implicit class InitialContextMutableBuilder[Self <: InitialContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWebpack(value: js.Any): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackVersion(value: String): Self = StObject.set(x, "webpackVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatchOptions extends StObject {
    
    var exclude: js.UndefOr[RegExp] = js.native
    
    var include: js.UndefOr[String] = js.native
  }
  object MatchOptions {
    
    @scala.inline
    def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    @scala.inline
    implicit class MatchOptionsMutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  @js.native
  trait Util extends StObject {
    
    def addLoader(
      loaderDefinition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuleSetRule */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
      ] = js.native
    
    def addPlugin(plugin: Plugin): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
      ] = js.native
    
    def merge(
      configSnippet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ): js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
      ] = js.native
  }
  object Util {
    
    @scala.inline
    def apply(
      addLoader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuleSetRule */ js.Any => js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
        ],
      addPlugin: Plugin => js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
        ],
      merge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any => js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
        ]
    ): Util = {
      val __obj = js.Dynamic.literal(addLoader = js.Any.fromFunction1(addLoader), addPlugin = js.Any.fromFunction1(addPlugin), merge = js.Any.fromFunction1(merge))
      __obj.asInstanceOf[Util]
    }
    
    @scala.inline
    implicit class UtilMutableBuilder[Self <: Util] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddLoader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuleSetRule */ js.Any => js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
            ]
      ): Self = StObject.set(x, "addLoader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddPlugin(
        value: Plugin => js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
            ]
      ): Self = StObject.set(x, "addPlugin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMerge(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any => js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
            ]
      ): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("@webpack-blocks/core", "match")
  @js.native
  def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/core", "match")
  @js.native
  def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/core", "match")
  @js.native
  def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/core", "match")
  @js.native
  def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}
