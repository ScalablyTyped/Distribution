package typings.telejson

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExpMatchArray
import typings.telejson.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("telejson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJSON(input: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSON")(input.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def parse(data: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parse(data: String, options: PartialOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def replacer(options: Options): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("replacer")(options.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]]
  
  inline def reviver(options: Options): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ ValueContainer | String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reviver")(options.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ ValueContainer | String, js.Any]]
  
  inline def stringify(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(data: js.Any, options: PartialOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var allowClass: Boolean
    
    var allowDate: Boolean
    
    var allowFunction: Boolean
    
    var allowRegExp: Boolean
    
    var allowSymbol: Boolean
    
    var allowUndefined: Boolean
    
    var lazyEval: Boolean
    
    var maxDepth: Double
    
    var space: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(
      allowClass: Boolean,
      allowDate: Boolean,
      allowFunction: Boolean,
      allowRegExp: Boolean,
      allowSymbol: Boolean,
      allowUndefined: Boolean,
      lazyEval: Boolean,
      maxDepth: Double
    ): Options = {
      val __obj = js.Dynamic.literal(allowClass = allowClass.asInstanceOf[js.Any], allowDate = allowDate.asInstanceOf[js.Any], allowFunction = allowFunction.asInstanceOf[js.Any], allowRegExp = allowRegExp.asInstanceOf[js.Any], allowSymbol = allowSymbol.asInstanceOf[js.Any], allowUndefined = allowUndefined.asInstanceOf[js.Any], lazyEval = lazyEval.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowClass(value: Boolean): Self = StObject.set(x, "allowClass", value.asInstanceOf[js.Any])
      
      inline def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
      
      inline def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowRegExp(value: Boolean): Self = StObject.set(x, "allowRegExp", value.asInstanceOf[js.Any])
      
      inline def setAllowSymbol(value: Boolean): Self = StObject.set(x, "allowSymbol", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
      
      inline def setLazyEval(value: Boolean): Self = StObject.set(x, "lazyEval", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  trait ValueContainer
    extends StObject
       with /* keys */ StringDictionary[js.Any] {
    
    var `_constructor-name_`: js.UndefOr[String] = js.undefined
  }
  object ValueContainer {
    
    inline def apply(): ValueContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueContainer]
    }
    
    extension [Self <: ValueContainer](x: Self) {
      
      inline def `set_constructor-name_`(value: String): Self = StObject.set(x, "_constructor-name_", value.asInstanceOf[js.Any])
      
      inline def `set_constructor-name_Undefined`: Self = StObject.set(x, "_constructor-name_", js.undefined)
    }
  }
}
