package typings.webpackMerge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  sealed trait CustomizeRule extends StObject
  @JSImport("webpack-merge/dist/types", "CustomizeRule")
  @js.native
  object CustomizeRule extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CustomizeRule & String] = js.native
    
    @js.native
    sealed trait Append
      extends StObject
         with CustomizeRule
    /* "append" */ val Append: typings.webpackMerge.distTypesMod.CustomizeRule.Append & String = js.native
    
    @js.native
    sealed trait Match
      extends StObject
         with CustomizeRule
    /* "match" */ val Match: typings.webpackMerge.distTypesMod.CustomizeRule.Match & String = js.native
    
    @js.native
    sealed trait Merge
      extends StObject
         with CustomizeRule
    /* "merge" */ val Merge: typings.webpackMerge.distTypesMod.CustomizeRule.Merge & String = js.native
    
    @js.native
    sealed trait Prepend
      extends StObject
         with CustomizeRule
    /* "prepend" */ val Prepend: typings.webpackMerge.distTypesMod.CustomizeRule.Prepend & String = js.native
    
    @js.native
    sealed trait Replace
      extends StObject
         with CustomizeRule
    /* "replace" */ val Replace: typings.webpackMerge.distTypesMod.CustomizeRule.Replace & String = js.native
  }
  
  type Customize = js.Function3[/* a */ Any, /* b */ Any, /* key */ Key, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackMerge.webpackMergeStrings.`match`
    - typings.webpackMerge.webpackMergeStrings.merge
    - typings.webpackMerge.webpackMergeStrings.append
    - typings.webpackMerge.webpackMergeStrings.prepend
    - typings.webpackMerge.webpackMergeStrings.replace
  */
  trait CustomizeRuleString extends StObject
  object CustomizeRuleString {
    
    inline def append: typings.webpackMerge.webpackMergeStrings.append = "append".asInstanceOf[typings.webpackMerge.webpackMergeStrings.append]
    
    inline def `match`: typings.webpackMerge.webpackMergeStrings.`match` = "match".asInstanceOf[typings.webpackMerge.webpackMergeStrings.`match`]
    
    inline def merge: typings.webpackMerge.webpackMergeStrings.merge = "merge".asInstanceOf[typings.webpackMerge.webpackMergeStrings.merge]
    
    inline def prepend: typings.webpackMerge.webpackMergeStrings.prepend = "prepend".asInstanceOf[typings.webpackMerge.webpackMergeStrings.prepend]
    
    inline def replace: typings.webpackMerge.webpackMergeStrings.replace = "replace".asInstanceOf[typings.webpackMerge.webpackMergeStrings.replace]
  }
  
  trait ICustomizeOptions extends StObject {
    
    var customizeArray: js.UndefOr[Customize] = js.undefined
    
    var customizeObject: js.UndefOr[Customize] = js.undefined
  }
  object ICustomizeOptions {
    
    inline def apply(): ICustomizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICustomizeOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomizeArray(value: (/* a */ Any, /* b */ Any, /* key */ Key) => Any): Self = StObject.set(x, "customizeArray", js.Any.fromFunction3(value))
      
      inline def setCustomizeArrayUndefined: Self = StObject.set(x, "customizeArray", js.undefined)
      
      inline def setCustomizeObject(value: (/* a */ Any, /* b */ Any, /* key */ Key) => Any): Self = StObject.set(x, "customizeObject", js.Any.fromFunction3(value))
      
      inline def setCustomizeObjectUndefined: Self = StObject.set(x, "customizeObject", js.undefined)
    }
  }
  
  type Key = String
}
