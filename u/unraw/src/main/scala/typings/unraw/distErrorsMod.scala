package typings.unraw

import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @js.native
  sealed trait ErrorType extends StObject
  @JSImport("unraw/dist/errors", "ErrorType")
  @js.native
  object ErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorType & String] = js.native
    
    /**
      * Thrown when a Unicode code point escape sequence has too high of a code
      * point. The maximum code point allowed is `\\u{10FFFF}`, so `\\u{110000}` and
      * higher will throw this error.
      */
    @js.native
    sealed trait CodePointLimit
      extends StObject
         with ErrorType
    /* "CODE_POINT_LIMIT" */ val CodePointLimit: typings.unraw.distErrorsMod.ErrorType.CodePointLimit & String = js.native
    
    /**
      * Thrown only when a single backslash is found at the end of a string. For
      * example, `"\\"` or `"test\\x24\\"`.
      */
    @js.native
    sealed trait EndOfString
      extends StObject
         with ErrorType
    /* "END_OF_STRING" */ val EndOfString: typings.unraw.distErrorsMod.ErrorType.EndOfString & String = js.native
    
    /**
      * Thrown when a badly formed hexadecimal escape sequence is found. Possible
      * reasons include the code being too short (`"\x2"`) or having invalid
      * characters (`"\x2$"`).
      */
    @js.native
    sealed trait MalformedHexadecimal
      extends StObject
         with ErrorType
    /* "MALFORMED_HEXADECIMAL" */ val MalformedHexadecimal: typings.unraw.distErrorsMod.ErrorType.MalformedHexadecimal & String = js.native
    
    /**
      * Thrown when a badly formed Unicode escape sequence is found. Possible
      * reasons include the code being too short (`"\\u25"`) or having invalid
      * characters (`"\\u2$A5"`).
      */
    @js.native
    sealed trait MalformedUnicode
      extends StObject
         with ErrorType
    /* "MALFORMED_UNICODE" */ val MalformedUnicode: typings.unraw.distErrorsMod.ErrorType.MalformedUnicode & String = js.native
    
    /**
      * Thrown when an octal escape sequences is encountered and `allowOctals` is
      * `false`. For example, `unraw("\234", false)`.
      */
    @js.native
    sealed trait OctalDeprecation
      extends StObject
         with ErrorType
    /* "OCTAL_DEPRECATION" */ val OctalDeprecation: typings.unraw.distErrorsMod.ErrorType.OctalDeprecation & String = js.native
  }
  
  /* Inlined std.Readonly<std.Map<unraw.unraw/dist/errors.ErrorType, string>> */
  object errorMessages {
    
    @JSImport("unraw/dist/errors", "errorMessages")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def delete(key: ErrorType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def entries(): IterableIterator[js.Tuple2[ErrorType, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[ErrorType, String]]]
    
    inline def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ ErrorType, /* map */ Map[ErrorType, String], Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def get(key: ErrorType): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def has(key: ErrorType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keys(): IterableIterator[ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[ErrorType]]
    
    inline def set(key: ErrorType, value: String): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    @JSImport("unraw/dist/errors", "errorMessages.size")
    @js.native
    val size: Double = js.native
    
    inline def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
  }
}
