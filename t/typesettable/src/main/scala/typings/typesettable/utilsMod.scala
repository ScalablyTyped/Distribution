package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("typesettable/build/src/utils", "Cache")
  @js.native
  open class Cache[T] protected ()
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
  open class Methods ()
    extends typings.typesettable.methodsMod.Methods
  /* static members */
  object Methods {
    
    @JSImport("typesettable/build/src/utils", "Methods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    inline def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Shim for _.defaults
      */
    inline def defaults(target: Any, objects: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(target.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    inline def objEq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def strictEq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("typesettable/build/src/utils", "StringMethods")
  @js.native
  open class StringMethods ()
    extends typings.typesettable.stringMethodsMod.StringMethods
  /* static members */
  object StringMethods {
    
    @JSImport("typesettable/build/src/utils", "StringMethods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    inline def combineWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isNotEmptyString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def trimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimEnd(str: String, c: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def trimStart(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimStart(str: String, splitter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any], splitter.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("typesettable/build/src/utils", "Tokenizer")
  @js.native
  open class Tokenizer ()
    extends typings.typesettable.tokenizerMod.Tokenizer
}
