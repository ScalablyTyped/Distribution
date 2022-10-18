package typings.webpackMerge

import org.scalablytyped.runtime.StringDictionary
import typings.webpackMerge.distTypesMod.CustomizeRule
import typings.webpackMerge.distTypesMod.CustomizeRuleString
import typings.webpackMerge.distTypesMod.ICustomizeOptions
import typings.webpackMerge.distTypesMod.Key
import typings.webpackMerge.webpackMergeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Configuration /* <: js.Object */](firstConfiguration: Configuration, configurations: Configuration*): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(firstConfiguration.asInstanceOf[js.Any]).`++`(configurations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Configuration]
  inline def default[Configuration /* <: js.Object */](firstConfiguration: js.Array[Configuration], configurations: Configuration*): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(firstConfiguration.asInstanceOf[js.Any]).`++`(configurations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Configuration]
  
  @JSImport("webpack-merge", "CustomizeRule")
  @js.native
  object CustomizeRule extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.webpackMerge.distTypesMod.CustomizeRule & String] = js.native
    
    /* "append" */ val Append: typings.webpackMerge.distTypesMod.CustomizeRule.Append & String = js.native
    
    /* "match" */ val Match: typings.webpackMerge.distTypesMod.CustomizeRule.Match & String = js.native
    
    /* "merge" */ val Merge: typings.webpackMerge.distTypesMod.CustomizeRule.Merge & String = js.native
    
    /* "prepend" */ val Prepend: typings.webpackMerge.distTypesMod.CustomizeRule.Prepend & String = js.native
    
    /* "replace" */ val Replace: typings.webpackMerge.distTypesMod.CustomizeRule.Replace & String = js.native
  }
  
  inline def customizeArray(rules: StringDictionary[CustomizeRule | CustomizeRuleString]): js.Function3[/* a */ Any, /* b */ Any, /* key */ Key, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("customizeArray")(rules.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ Any, /* b */ Any, /* key */ Key, Any]]
  
  inline def customizeObject(rules: StringDictionary[CustomizeRule | CustomizeRuleString]): js.Function3[/* a */ Any, /* b */ Any, /* key */ Key, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("customizeObject")(rules.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ Any, /* b */ Any, /* key */ Key, Any]]
  
  inline def merge[Configuration /* <: js.Object */](firstConfiguration: Configuration, configurations: Configuration*): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(firstConfiguration.asInstanceOf[js.Any]).`++`(configurations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Configuration]
  inline def merge[Configuration /* <: js.Object */](firstConfiguration: js.Array[Configuration], configurations: Configuration*): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(firstConfiguration.asInstanceOf[js.Any]).`++`(configurations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Configuration]
  
  inline def mergeWithCustomize[Configuration /* <: js.Object */](options: ICustomizeOptions): js.Function2[
    /* firstConfiguration */ Configuration | js.Array[Configuration], 
    /* repeated */ Configuration, 
    Configuration
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeWithCustomize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* firstConfiguration */ Configuration | js.Array[Configuration], 
    /* repeated */ Configuration, 
    Configuration
  ]]
  
  inline def mergeWithRules(rules: Rules): js.Function2[
    /* firstConfiguration */ js.Object | js.Array[js.Object], 
    /* repeated */ js.Object, 
    js.Object
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeWithRules")(rules.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* firstConfiguration */ js.Object | js.Array[js.Object], 
    /* repeated */ js.Object, 
    js.Object
  ]]
  
  inline def unique(key: String, uniques: js.Array[String], getter: js.Function1[/* a */ js.Object, String]): js.Function3[/* a */ js.Array[Any], /* b */ js.Array[Any], /* k */ String, `false` | js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(key.asInstanceOf[js.Any], uniques.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* a */ js.Array[Any], /* b */ js.Array[Any], /* k */ String, `false` | js.Array[Any]]]
  
  trait Rules
    extends StObject
       with /* s */ StringDictionary[CustomizeRule | CustomizeRuleString | Rules]
  object Rules {
    
    inline def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
  }
}
