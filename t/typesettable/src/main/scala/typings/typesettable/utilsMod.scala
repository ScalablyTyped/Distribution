package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("typesettable/build/src/utils", "Cache")
  @js.native
  class Cache[T] protected ()
    extends typings.typesettable.cacheMod.Cache[T] {
    /**
      * @constructor
      *
      * @param {string} compute The function whose results will be cached.
      */
    def this(compute: js.Function1[/* k */ String, T]) = this()
  }
  
  @JSImport("typesettable/build/src/utils", "Methods")
  @js.native
  class Methods ()
    extends typings.typesettable.methodsMod.Methods
  /* static members */
  object Methods {
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    @JSImport("typesettable/build/src/utils", "Methods.arrayEq")
    @js.native
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    
    /**
      * Shim for _.defaults
      */
    @JSImport("typesettable/build/src/utils", "Methods.defaults")
    @js.native
    def defaults(target: js.Any, objects: js.Any*): js.Any = js.native
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    @JSImport("typesettable/build/src/utils", "Methods.objEq")
    @js.native
    def objEq(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSImport("typesettable/build/src/utils", "Methods.strictEq")
    @js.native
    def strictEq(a: js.Any, b: js.Any): Boolean = js.native
  }
  
  @JSImport("typesettable/build/src/utils", "StringMethods")
  @js.native
  class StringMethods ()
    extends typings.typesettable.stringMethodsMod.StringMethods
  /* static members */
  object StringMethods {
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    @JSImport("typesettable/build/src/utils", "StringMethods.combineWhitespace")
    @js.native
    def combineWhitespace(str: String): String = js.native
    
    @JSImport("typesettable/build/src/utils", "StringMethods.isNotEmptyString")
    @js.native
    def isNotEmptyString(str: String): Boolean = js.native
    
    @JSImport("typesettable/build/src/utils", "StringMethods.trimEnd")
    @js.native
    def trimEnd(str: String): String = js.native
    @JSImport("typesettable/build/src/utils", "StringMethods.trimEnd")
    @js.native
    def trimEnd(str: String, c: String): String = js.native
    
    @JSImport("typesettable/build/src/utils", "StringMethods.trimStart")
    @js.native
    def trimStart(str: String): String = js.native
    @JSImport("typesettable/build/src/utils", "StringMethods.trimStart")
    @js.native
    def trimStart(str: String, splitter: String): String = js.native
  }
  
  @JSImport("typesettable/build/src/utils", "Tokenizer")
  @js.native
  class Tokenizer ()
    extends typings.typesettable.tokenizerMod.Tokenizer
}
