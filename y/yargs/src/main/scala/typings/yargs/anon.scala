package typings.yargs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictargName
    extends StObject
       with /** All remaining options */
  /* argName */ StringDictionary[Any] {
    
    /** The script name or node command */
    @JSName("$0")
    var $0: String
    
    /** Non-option arguments */
    @JSName("_")
    var _underscore: js.Array[String | Double]
  }
  object DictargName {
    
    inline def apply($0: String, _underscore: js.Array[String | Double]): DictargName = {
      val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictargName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictargName] (val x: Self) extends AnyVal {
      
      inline def set$0(value: String): Self = StObject.set(x, "$0", value.asInstanceOf[js.Any])
      
      inline def set_underscore(value: js.Array[String | Double]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: (String | Double)*): Self = StObject.set(x, "_", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<yargs.yargs.ParserConfigurationOptions> */
  trait PartialParserConfiguratio extends StObject {
    
    var `boolean-negation`: js.UndefOr[Boolean] = js.undefined
    
    var `camel-case-expansion`: js.UndefOr[Boolean] = js.undefined
    
    var `combine-arrays`: js.UndefOr[Boolean] = js.undefined
    
    var `dot-notation`: js.UndefOr[Boolean] = js.undefined
    
    var `duplicate-arguments-array`: js.UndefOr[Boolean] = js.undefined
    
    var `flatten-duplicate-arrays`: js.UndefOr[Boolean] = js.undefined
    
    var `greedy-arrays`: js.UndefOr[Boolean] = js.undefined
    
    var `halt-at-non-option`: js.UndefOr[Boolean] = js.undefined
    
    var `nargs-eats-options`: js.UndefOr[Boolean] = js.undefined
    
    var `negation-prefix`: js.UndefOr[String] = js.undefined
    
    var `parse-numbers`: js.UndefOr[Boolean] = js.undefined
    
    var `parse-positional-numbers`: js.UndefOr[Boolean] = js.undefined
    
    var `populate--`: js.UndefOr[Boolean] = js.undefined
    
    var `set-placeholder-key`: js.UndefOr[Boolean] = js.undefined
    
    var `short-option-groups`: js.UndefOr[Boolean] = js.undefined
    
    var `sort-commands`: js.UndefOr[Boolean] = js.undefined
    
    var `strip-aliased`: js.UndefOr[Boolean] = js.undefined
    
    var `strip-dashed`: js.UndefOr[Boolean] = js.undefined
    
    var `unknown-options-as-args`: js.UndefOr[Boolean] = js.undefined
  }
  object PartialParserConfiguratio {
    
    inline def apply(): PartialParserConfiguratio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParserConfiguratio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialParserConfiguratio] (val x: Self) extends AnyVal {
      
      inline def `setBoolean-negation`(value: Boolean): Self = StObject.set(x, "boolean-negation", value.asInstanceOf[js.Any])
      
      inline def `setBoolean-negationUndefined`: Self = StObject.set(x, "boolean-negation", js.undefined)
      
      inline def `setCamel-case-expansion`(value: Boolean): Self = StObject.set(x, "camel-case-expansion", value.asInstanceOf[js.Any])
      
      inline def `setCamel-case-expansionUndefined`: Self = StObject.set(x, "camel-case-expansion", js.undefined)
      
      inline def `setCombine-arrays`(value: Boolean): Self = StObject.set(x, "combine-arrays", value.asInstanceOf[js.Any])
      
      inline def `setCombine-arraysUndefined`: Self = StObject.set(x, "combine-arrays", js.undefined)
      
      inline def `setDot-notation`(value: Boolean): Self = StObject.set(x, "dot-notation", value.asInstanceOf[js.Any])
      
      inline def `setDot-notationUndefined`: Self = StObject.set(x, "dot-notation", js.undefined)
      
      inline def `setDuplicate-arguments-array`(value: Boolean): Self = StObject.set(x, "duplicate-arguments-array", value.asInstanceOf[js.Any])
      
      inline def `setDuplicate-arguments-arrayUndefined`: Self = StObject.set(x, "duplicate-arguments-array", js.undefined)
      
      inline def `setFlatten-duplicate-arrays`(value: Boolean): Self = StObject.set(x, "flatten-duplicate-arrays", value.asInstanceOf[js.Any])
      
      inline def `setFlatten-duplicate-arraysUndefined`: Self = StObject.set(x, "flatten-duplicate-arrays", js.undefined)
      
      inline def `setGreedy-arrays`(value: Boolean): Self = StObject.set(x, "greedy-arrays", value.asInstanceOf[js.Any])
      
      inline def `setGreedy-arraysUndefined`: Self = StObject.set(x, "greedy-arrays", js.undefined)
      
      inline def `setHalt-at-non-option`(value: Boolean): Self = StObject.set(x, "halt-at-non-option", value.asInstanceOf[js.Any])
      
      inline def `setHalt-at-non-optionUndefined`: Self = StObject.set(x, "halt-at-non-option", js.undefined)
      
      inline def `setNargs-eats-options`(value: Boolean): Self = StObject.set(x, "nargs-eats-options", value.asInstanceOf[js.Any])
      
      inline def `setNargs-eats-optionsUndefined`: Self = StObject.set(x, "nargs-eats-options", js.undefined)
      
      inline def `setNegation-prefix`(value: String): Self = StObject.set(x, "negation-prefix", value.asInstanceOf[js.Any])
      
      inline def `setNegation-prefixUndefined`: Self = StObject.set(x, "negation-prefix", js.undefined)
      
      inline def `setParse-numbers`(value: Boolean): Self = StObject.set(x, "parse-numbers", value.asInstanceOf[js.Any])
      
      inline def `setParse-numbersUndefined`: Self = StObject.set(x, "parse-numbers", js.undefined)
      
      inline def `setParse-positional-numbers`(value: Boolean): Self = StObject.set(x, "parse-positional-numbers", value.asInstanceOf[js.Any])
      
      inline def `setParse-positional-numbersUndefined`: Self = StObject.set(x, "parse-positional-numbers", js.undefined)
      
      inline def `setPopulate--`(value: Boolean): Self = StObject.set(x, "populate--", value.asInstanceOf[js.Any])
      
      inline def `setPopulate--Undefined`: Self = StObject.set(x, "populate--", js.undefined)
      
      inline def `setSet-placeholder-key`(value: Boolean): Self = StObject.set(x, "set-placeholder-key", value.asInstanceOf[js.Any])
      
      inline def `setSet-placeholder-keyUndefined`: Self = StObject.set(x, "set-placeholder-key", js.undefined)
      
      inline def `setShort-option-groups`(value: Boolean): Self = StObject.set(x, "short-option-groups", value.asInstanceOf[js.Any])
      
      inline def `setShort-option-groupsUndefined`: Self = StObject.set(x, "short-option-groups", js.undefined)
      
      inline def `setSort-commands`(value: Boolean): Self = StObject.set(x, "sort-commands", value.asInstanceOf[js.Any])
      
      inline def `setSort-commandsUndefined`: Self = StObject.set(x, "sort-commands", js.undefined)
      
      inline def `setStrip-aliased`(value: Boolean): Self = StObject.set(x, "strip-aliased", value.asInstanceOf[js.Any])
      
      inline def `setStrip-aliasedUndefined`: Self = StObject.set(x, "strip-aliased", js.undefined)
      
      inline def `setStrip-dashed`(value: Boolean): Self = StObject.set(x, "strip-dashed", value.asInstanceOf[js.Any])
      
      inline def `setStrip-dashedUndefined`: Self = StObject.set(x, "strip-dashed", js.undefined)
      
      inline def `setUnknown-options-as-args`(value: Boolean): Self = StObject.set(x, "unknown-options-as-args", value.asInstanceOf[js.Any])
      
      inline def `setUnknown-options-as-argsUndefined`: Self = StObject.set(x, "unknown-options-as-args", js.undefined)
    }
  }
}
