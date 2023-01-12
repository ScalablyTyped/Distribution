package typings.toRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a regular expression from the given `patterns` string.
    */
  inline def apply(patterns: String): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def apply(patterns: String, options: Options): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def apply(patterns: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def apply(patterns: js.Array[String], options: Options): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def apply(patterns: js.RegExp): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def apply(patterns: js.RegExp, options: Options): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  @JSImport("to-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a regular expression from the given `pattern` string.
    */
  inline def makeRe(pattern: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def makeRe(pattern: String, options: Options): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def makeRe(pattern: js.RegExp): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def makeRe(pattern: js.RegExp, options: Options): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  trait Options extends StObject {
    
    /**
      * Generated regex is cached based on the provided string and options.
      * As a result, runtime compilation only happens once per pattern (as
      * long as options are also the same), which can result in dramatic
      * speed improvements.
      *
      * This also helps with debugging, since adding options and pattern
      * are added to the generated regex.
      * @default true
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate a regex that will match any string that contains the given
      * pattern. By default, regex is strict will only return true for
      * exact matches.
      */
    var contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the flags you want to use on the generated regex.
      */
    var flags: js.UndefOr[String] = js.undefined
    
    /**
      * Create a regex that will match everything except the given pattern.
      */
    var negate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds the i flag, to enable case-insensitive matching.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Check the generated regular expression with safe-regex and throw an
      * error if the regex is potentially unsafe.
      */
    var safe: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
      
      inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
    }
  }
}
