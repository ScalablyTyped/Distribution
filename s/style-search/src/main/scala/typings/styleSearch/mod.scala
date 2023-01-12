package typings.styleSearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options, callback: StyleSearchCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("style-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Syntax feature options all accept three keywords:"skip", "check", "only".
    * An error will be thrown if you use "only" more than once
    */
  trait Options extends StObject {
    
    /**
      * This includes both standard `/ * CSS comments *\/`
      * and non-standard but widely used `// single line comments`.
      * @default 'skip'
      */
    var comments: js.UndefOr[SyntaxFeatureOption] = js.undefined
    
    /**
      * @default 'check'
      */
    var functionArguments: js.UndefOr[SyntaxFeatureOption] = js.undefined
    
    /**
      * @default 'skip'
      */
    var functionNames: js.UndefOr[SyntaxFeatureOption] = js.undefined
    
    /**
      * If true, the search will stop after one match is found.
      * @default false
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This designates anything inside parentheses, which includes standard functions,but also Sass maps and other non-standard constructs.
      * `parentheticals` is a broader category than `functionArguments`
      * @default 'check'
      */
    var parentheticals: js.UndefOr[SyntaxFeatureOption] = js.undefined
    
    /** The source string to search through. */
    var source: String
    
    /**
      * @default 'skip'
      */
    var strings: js.UndefOr[SyntaxFeatureOption] = js.undefined
    
    /**
      * The target of the search. Can be
      * - a single character
      * - a string with some length
      * - an array of strings, all of which count as matches
      * (the match object passed to the callback will differentiate which string in the array
      * got matched via its target property)
      */
    var target: String | js.Array[String]
  }
  object Options {
    
    inline def apply(source: String, target: String | js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setComments(value: SyntaxFeatureOption): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setFunctionArguments(value: SyntaxFeatureOption): Self = StObject.set(x, "functionArguments", value.asInstanceOf[js.Any])
      
      inline def setFunctionArgumentsUndefined: Self = StObject.set(x, "functionArguments", js.undefined)
      
      inline def setFunctionNames(value: SyntaxFeatureOption): Self = StObject.set(x, "functionNames", value.asInstanceOf[js.Any])
      
      inline def setFunctionNamesUndefined: Self = StObject.set(x, "functionNames", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setParentheticals(value: SyntaxFeatureOption): Self = StObject.set(x, "parentheticals", value.asInstanceOf[js.Any])
      
      inline def setParentheticalsUndefined: Self = StObject.set(x, "parentheticals", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: SyntaxFeatureOption): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  /**
    * For every match found your callback is invoked with:
    * - `match` object
    * - `count` The count of how many matches have been found up to this point
    */
  type StyleSearchCallback = js.Function2[/* match */ StyleSearchMatch, /* count */ Double, Unit]
  
  trait StyleSearchMatch extends StObject {
    
    /** where the match ends */
    val endIndex: Double
    
    /** whether the match is inside a comment */
    val insideComment: Boolean
    
    /** whether the match is inside a function — this includes the parentheses around the arguments */
    val insideFunctionArguments: Boolean
    
    /** whether the match is inside parenthesis */
    val insideParens: Boolean
    
    /** whether the match is inside a string */
    val insideString: Boolean
    
    /** where the match begins */
    val startIndex: Double
    
    /** what got matched (useful if your target option is an array instead of a single string) */
    val target: String
  }
  object StyleSearchMatch {
    
    inline def apply(
      endIndex: Double,
      insideComment: Boolean,
      insideFunctionArguments: Boolean,
      insideParens: Boolean,
      insideString: Boolean,
      startIndex: Double,
      target: String
    ): StyleSearchMatch = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], insideComment = insideComment.asInstanceOf[js.Any], insideFunctionArguments = insideFunctionArguments.asInstanceOf[js.Any], insideParens = insideParens.asInstanceOf[js.Any], insideString = insideString.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSearchMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleSearchMatch] (val x: Self) extends AnyVal {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setInsideComment(value: Boolean): Self = StObject.set(x, "insideComment", value.asInstanceOf[js.Any])
      
      inline def setInsideFunctionArguments(value: Boolean): Self = StObject.set(x, "insideFunctionArguments", value.asInstanceOf[js.Any])
      
      inline def setInsideParens(value: Boolean): Self = StObject.set(x, "insideParens", value.asInstanceOf[js.Any])
      
      inline def setInsideString(value: Boolean): Self = StObject.set(x, "insideString", value.asInstanceOf[js.Any])
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Syntax feature options.
    * An error will be thrown if you use `only` more than once
    */
  /* Rewritten from type alias, can be one of: 
    - typings.styleSearch.styleSearchStrings.skip
    - typings.styleSearch.styleSearchStrings.check
    - typings.styleSearch.styleSearchStrings.only
  */
  trait SyntaxFeatureOption extends StObject
  object SyntaxFeatureOption {
    
    inline def check: typings.styleSearch.styleSearchStrings.check = "check".asInstanceOf[typings.styleSearch.styleSearchStrings.check]
    
    inline def only: typings.styleSearch.styleSearchStrings.only = "only".asInstanceOf[typings.styleSearch.styleSearchStrings.only]
    
    inline def skip: typings.styleSearch.styleSearchStrings.skip = "skip".asInstanceOf[typings.styleSearch.styleSearchStrings.skip]
  }
}
