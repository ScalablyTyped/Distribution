package typings.yargsParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Boolean extends StObject {
    
    var boolean: js.UndefOr[scala.Boolean] = js.native
    
    var key: String = js.native
    
    var number: js.UndefOr[scala.Boolean] = js.native
  }
  object Boolean {
    
    @scala.inline
    def apply(key: String): Boolean = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boolean]
    }
    
    @scala.inline
    implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: scala.Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: scala.Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yargs-parser.yargs-parser.Configuration> */
  @js.native
  trait PartialConfiguration extends StObject {
    
    var `boolean-negation`: js.UndefOr[scala.Boolean] = js.native
    
    var `camel-case-expansion`: js.UndefOr[scala.Boolean] = js.native
    
    var `combine-arrays`: js.UndefOr[scala.Boolean] = js.native
    
    var `dot-notation`: js.UndefOr[scala.Boolean] = js.native
    
    var `duplicate-arguments-array`: js.UndefOr[scala.Boolean] = js.native
    
    var `flatten-duplicate-arrays`: js.UndefOr[scala.Boolean] = js.native
    
    var `halt-at-non-option`: js.UndefOr[scala.Boolean] = js.native
    
    var `negation-prefix`: js.UndefOr[String] = js.native
    
    var `parse-numbers`: js.UndefOr[scala.Boolean] = js.native
    
    var `populate--`: js.UndefOr[scala.Boolean] = js.native
    
    var `set-placeholder-key`: js.UndefOr[scala.Boolean] = js.native
    
    var `short-option-groups`: js.UndefOr[scala.Boolean] = js.native
    
    var `strip-aliased`: js.UndefOr[scala.Boolean] = js.native
    
    var `strip-dashed`: js.UndefOr[scala.Boolean] = js.native
    
    var `unknown-options-as-args`: js.UndefOr[scala.Boolean] = js.native
  }
  object PartialConfiguration {
    
    @scala.inline
    def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    @scala.inline
    implicit class PartialConfigurationMutableBuilder[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBoolean-negation`(value: scala.Boolean): Self = StObject.set(x, "boolean-negation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBoolean-negationUndefined`: Self = StObject.set(x, "boolean-negation", js.undefined)
      
      @scala.inline
      def `setCamel-case-expansion`(value: scala.Boolean): Self = StObject.set(x, "camel-case-expansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCamel-case-expansionUndefined`: Self = StObject.set(x, "camel-case-expansion", js.undefined)
      
      @scala.inline
      def `setCombine-arrays`(value: scala.Boolean): Self = StObject.set(x, "combine-arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCombine-arraysUndefined`: Self = StObject.set(x, "combine-arrays", js.undefined)
      
      @scala.inline
      def `setDot-notation`(value: scala.Boolean): Self = StObject.set(x, "dot-notation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDot-notationUndefined`: Self = StObject.set(x, "dot-notation", js.undefined)
      
      @scala.inline
      def `setDuplicate-arguments-array`(value: scala.Boolean): Self = StObject.set(x, "duplicate-arguments-array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDuplicate-arguments-arrayUndefined`: Self = StObject.set(x, "duplicate-arguments-array", js.undefined)
      
      @scala.inline
      def `setFlatten-duplicate-arrays`(value: scala.Boolean): Self = StObject.set(x, "flatten-duplicate-arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlatten-duplicate-arraysUndefined`: Self = StObject.set(x, "flatten-duplicate-arrays", js.undefined)
      
      @scala.inline
      def `setHalt-at-non-option`(value: scala.Boolean): Self = StObject.set(x, "halt-at-non-option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHalt-at-non-optionUndefined`: Self = StObject.set(x, "halt-at-non-option", js.undefined)
      
      @scala.inline
      def `setNegation-prefix`(value: String): Self = StObject.set(x, "negation-prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNegation-prefixUndefined`: Self = StObject.set(x, "negation-prefix", js.undefined)
      
      @scala.inline
      def `setParse-numbers`(value: scala.Boolean): Self = StObject.set(x, "parse-numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setParse-numbersUndefined`: Self = StObject.set(x, "parse-numbers", js.undefined)
      
      @scala.inline
      def `setPopulate--`(value: scala.Boolean): Self = StObject.set(x, "populate--", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPopulate--Undefined`: Self = StObject.set(x, "populate--", js.undefined)
      
      @scala.inline
      def `setSet-placeholder-key`(value: scala.Boolean): Self = StObject.set(x, "set-placeholder-key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSet-placeholder-keyUndefined`: Self = StObject.set(x, "set-placeholder-key", js.undefined)
      
      @scala.inline
      def `setShort-option-groups`(value: scala.Boolean): Self = StObject.set(x, "short-option-groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-option-groupsUndefined`: Self = StObject.set(x, "short-option-groups", js.undefined)
      
      @scala.inline
      def `setStrip-aliased`(value: scala.Boolean): Self = StObject.set(x, "strip-aliased", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-aliasedUndefined`: Self = StObject.set(x, "strip-aliased", js.undefined)
      
      @scala.inline
      def `setStrip-dashed`(value: scala.Boolean): Self = StObject.set(x, "strip-dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-dashedUndefined`: Self = StObject.set(x, "strip-dashed", js.undefined)
      
      @scala.inline
      def `setUnknown-options-as-args`(value: scala.Boolean): Self = StObject.set(x, "unknown-options-as-args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUnknown-options-as-argsUndefined`: Self = StObject.set(x, "unknown-options-as-args", js.undefined)
    }
  }
}
