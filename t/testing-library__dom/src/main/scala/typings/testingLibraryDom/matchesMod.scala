package typings.testingLibraryDom

import typings.ariaQuery.mod.ARIARole
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  @JSImport("@testing-library/dom/types/matches", "getDefaultNormalizer")
  @js.native
  def getDefaultNormalizer(): NormalizerFn = js.native
  @JSImport("@testing-library/dom/types/matches", "getDefaultNormalizer")
  @js.native
  def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = js.native
  
  type ByRoleMatcher = ARIARole | MatcherFunction | js.Object
  
  @js.native
  trait DefaultNormalizerOptions extends StObject {
    
    var collapseWhitespace: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
  }
  object DefaultNormalizerOptions {
    
    @scala.inline
    def apply(): DefaultNormalizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultNormalizerOptions]
    }
    
    @scala.inline
    implicit class DefaultNormalizerOptionsMutableBuilder[Self <: DefaultNormalizerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseWhitespace(value: Boolean): Self = StObject.set(x, "collapseWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseWhitespaceUndefined: Self = StObject.set(x, "collapseWhitespace", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  type Match = js.Function4[
    /* textToMatch */ String, 
    /* node */ HTMLElement | Null, 
    /* matcher */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    Boolean
  ]
  
  type Matcher = MatcherFunction | js.Object
  
  type MatcherFunction = js.Function2[/* content */ String, /* element */ HTMLElement, Boolean]
  
  @js.native
  trait MatcherOptions extends StObject {
    
    /** Use normalizer with getDefaultNormalizer instead */
    var collapseWhitespace: js.UndefOr[Boolean] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var normalizer: js.UndefOr[NormalizerFn] = js.native
    
    /** suppress suggestions for a specific query */
    var suggest: js.UndefOr[Boolean] = js.native
    
    /** Use normalizer with getDefaultNormalizer instead */
    var trim: js.UndefOr[Boolean] = js.native
  }
  object MatcherOptions {
    
    @scala.inline
    def apply(): MatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatcherOptions]
    }
    
    @scala.inline
    implicit class MatcherOptionsMutableBuilder[Self <: MatcherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseWhitespace(value: Boolean): Self = StObject.set(x, "collapseWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseWhitespaceUndefined: Self = StObject.set(x, "collapseWhitespace", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setNormalizer(value: /* text */ String => String): Self = StObject.set(x, "normalizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
      
      @scala.inline
      def setSuggest(value: Boolean): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  type NormalizerFn = js.Function1[/* text */ String, String]
}
