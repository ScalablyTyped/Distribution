package typings.telejson

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExpMatchArray
import typings.telejson.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("telejson", "isJSON")
  @js.native
  def isJSON(input: String): RegExpMatchArray | Null = js.native
  
  @JSImport("telejson", "parse")
  @js.native
  def parse(data: String): js.Any = js.native
  @JSImport("telejson", "parse")
  @js.native
  def parse(data: String, options: PartialOptions): js.Any = js.native
  
  @JSImport("telejson", "replacer")
  @js.native
  def replacer(options: Options): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = js.native
  
  @JSImport("telejson", "reviver")
  @js.native
  def reviver(options: Options): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ ValueContainer | String, _] = js.native
  
  @JSImport("telejson", "stringify")
  @js.native
  def stringify(data: js.Any): String = js.native
  @JSImport("telejson", "stringify")
  @js.native
  def stringify(data: js.Any, options: PartialOptions): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var allowClass: Boolean = js.native
    
    var allowDate: Boolean = js.native
    
    var allowFunction: Boolean = js.native
    
    var allowRegExp: Boolean = js.native
    
    var allowSymbol: Boolean = js.native
    
    var allowUndefined: Boolean = js.native
    
    var lazyEval: Boolean = js.native
    
    var maxDepth: Double = js.native
    
    var space: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait ValueContainer
    extends /* keys */ StringDictionary[js.Any] {
    
    var `_constructor-name_`: js.UndefOr[String] = js.native
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
