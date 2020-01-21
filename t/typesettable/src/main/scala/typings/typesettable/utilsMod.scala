package typings.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
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
  
  @js.native
  class Methods ()
    extends typings.typesettable.methodsMod.Methods
  
  @js.native
  class StringMethods ()
    extends typings.typesettable.stringMethodsMod.StringMethods
  
  @js.native
  class Tokenizer ()
    extends typings.typesettable.tokenizerMod.Tokenizer
  
  /* static members */
  @js.native
  object Methods extends js.Object {
    /**
      * Check if two arrays are equal by strict equality.
      */
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    /**
      * Shim for _.defaults
      */
    def defaults(target: js.Any, objects: js.Any*): js.Any = js.native
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    def objEq(a: js.Any, b: js.Any): Boolean = js.native
    def strictEq(a: js.Any, b: js.Any): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StringMethods extends js.Object {
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    def combineWhitespace(str: String): String = js.native
    def isNotEmptyString(str: String): Boolean = js.native
    def trimEnd(str: String): String = js.native
    def trimEnd(str: String, c: String): String = js.native
    def trimStart(str: String): String = js.native
    def trimStart(str: String, splitter: String): String = js.native
  }
  
}

