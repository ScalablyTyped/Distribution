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
  
  @scala.inline
  def isJSON(input: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSON")(input.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  @scala.inline
  def parse(data: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(data: String, options: PartialOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def replacer(options: Options): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("replacer")(options.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]]
  
  @scala.inline
  def reviver(options: Options): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ ValueContainer | String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reviver")(options.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ ValueContainer | String, js.Any]]
  
  @scala.inline
  def stringify(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(data: js.Any, options: PartialOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClass(value: Boolean): Self = StObject.set(x, "allowClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRegExp(value: Boolean): Self = StObject.set(x, "allowRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSymbol(value: Boolean): Self = StObject.set(x, "allowSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyEval(value: Boolean): Self = StObject.set(x, "lazyEval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  trait ValueContainer
    extends StObject
       with /* keys */ StringDictionary[js.Any] {
    
    var `_constructor-name_`: js.UndefOr[String] = js.undefined
  }
  object ValueContainer {
    
    @scala.inline
    def apply(): ValueContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueContainer]
    }
    
    @scala.inline
    implicit class ValueContainerMutableBuilder[Self <: ValueContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set_constructor-name_`(value: String): Self = StObject.set(x, "_constructor-name_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set_constructor-name_Undefined`: Self = StObject.set(x, "_constructor-name_", js.undefined)
    }
  }
}
