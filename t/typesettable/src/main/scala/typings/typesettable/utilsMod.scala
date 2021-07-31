package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("typesettable/build/src/utils", "Methods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    @scala.inline
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Shim for _.defaults
      */
    @scala.inline
    def defaults(target: js.Any, objects: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(target.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    @scala.inline
    def objEq(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def strictEq(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("typesettable/build/src/utils", "StringMethods")
  @js.native
  class StringMethods ()
    extends typings.typesettable.stringMethodsMod.StringMethods
  /* static members */
  object StringMethods {
    
    @JSImport("typesettable/build/src/utils", "StringMethods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    @scala.inline
    def combineWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def isNotEmptyString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def trimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def trimEnd(str: String, c: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def trimStart(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def trimStart(str: String, splitter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any], splitter.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("typesettable/build/src/utils", "Tokenizer")
  @js.native
  class Tokenizer ()
    extends typings.typesettable.tokenizerMod.Tokenizer
}
