package typings.webpackMerge

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("webpack-merge", JSImport.Namespace)
  @js.native
  val ^ : WebpackMerge = js.native
  
  type ConfigurationMergeConfigFunction = js.Function1[/* customizeOptions */ CustomizeOptions, ConfigurationMergeFunction]
  
  @js.native
  trait ConfigurationMergeFunction extends StObject {
    
    def apply(
      configs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any)*
    ): js.Any = js.native
  }
  
  type CustomizeArrayFunction = js.Function3[
    /* a */ js.Array[js.Any], 
    /* b */ js.Array[js.Any], 
    /* key */ String, 
    js.UndefOr[js.Array[js.Any] | Null]
  ]
  
  type CustomizeObjectFunction = js.Function3[/* a */ js.Object, /* b */ js.Object, /* key */ String, js.UndefOr[js.Object | Null]]
  
  trait CustomizeOptions extends StObject {
    
    var customizeArray: js.UndefOr[CustomizeArrayFunction | UniqueFunction] = js.undefined
    
    var customizeObject: js.UndefOr[CustomizeObjectFunction] = js.undefined
  }
  object CustomizeOptions {
    
    @scala.inline
    def apply(): CustomizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomizeOptions]
    }
    
    @scala.inline
    implicit class CustomizeOptionsMutableBuilder[Self <: CustomizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizeArray(
        value: ((/* a */ js.Array[js.Any]) | (/* field */ String), /* b */ js.Array[js.Any | String], (/* keyFn */ js.Function1[/* field */ js.Any, String]) | (/* key */ String)) => js.UndefOr[js.Array[js.Any] | CustomizeArrayFunction | Null]
      ): Self = StObject.set(x, "customizeArray", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCustomizeArrayUndefined: Self = StObject.set(x, "customizeArray", js.undefined)
      
      @scala.inline
      def setCustomizeObject(value: (/* a */ js.Object, /* b */ js.Object, /* key */ String) => js.UndefOr[js.Object | Null]): Self = StObject.set(x, "customizeObject", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCustomizeObjectUndefined: Self = StObject.set(x, "customizeObject", js.undefined)
    }
  }
  
  type MergeFunction = ConfigurationMergeFunction | ConfigurationMergeConfigFunction
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackMerge.webpackMergeStrings.prepend
    - typings.webpackMerge.webpackMergeStrings.append
    - typings.webpackMerge.webpackMergeStrings.replace
  */
  trait MergeStrategy extends StObject
  object MergeStrategy {
    
    @scala.inline
    def append: typings.webpackMerge.webpackMergeStrings.append = "append".asInstanceOf[typings.webpackMerge.webpackMergeStrings.append]
    
    @scala.inline
    def prepend: typings.webpackMerge.webpackMergeStrings.prepend = "prepend".asInstanceOf[typings.webpackMerge.webpackMergeStrings.prepend]
    
    @scala.inline
    def replace: typings.webpackMerge.webpackMergeStrings.replace = "replace".asInstanceOf[typings.webpackMerge.webpackMergeStrings.replace]
  }
  
  type MultipleConfiguration = StringDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ]
  
  @js.native
  trait MultipleConfigurationMergeFunction extends StObject {
    
    def apply(configs: MultipleConfiguration*): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
      ] = js.native
  }
  
  type UniqueFunction = js.Function3[
    /* field */ String, 
    /* fields */ js.Array[String], 
    /* keyFn */ js.Function1[/* field */ js.Any, String], 
    CustomizeArrayFunction
  ]
  
  @js.native
  trait WebpackMerge extends StObject {
    
    def apply(
      configs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any)*
    ): js.Any = js.native
    def apply(customizeOptions: CustomizeOptions): ConfigurationMergeFunction = js.native
    
    def multiple(configs: MultipleConfiguration*): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
      ] = js.native
    @JSName("multiple")
    var multiple_Original: MultipleConfigurationMergeFunction = js.native
    
    def smart(
      configs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any)*
    ): js.Any = js.native
    
    def smartStrategy(options: StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
    
    @JSName("smart")
    var smart_Original: ConfigurationMergeFunction = js.native
    
    def strategy(options: StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
    
    def unique(field: String, fields: js.Array[String], keyFn: js.Function1[/* field */ js.Any, String]): CustomizeArrayFunction = js.native
    @JSName("unique")
    var unique_Original: UniqueFunction = js.native
  }
  
  type _To = WebpackMerge
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: WebpackMerge = ^
}
