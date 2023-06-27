package typings.unraw

import typings.std.IterableIterator
import typings.std.Map
import typings.unraw.distErrorsMod.ErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unraw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(raw: String, allowOctals: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(raw.asInstanceOf[js.Any], allowOctals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("unraw", "ErrorType")
  @js.native
  object ErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unraw.distErrorsMod.ErrorType & String] = js.native
    
    /* "CODE_POINT_LIMIT" */ val CodePointLimit: typings.unraw.distErrorsMod.ErrorType.CodePointLimit & String = js.native
    
    /* "END_OF_STRING" */ val EndOfString: typings.unraw.distErrorsMod.ErrorType.EndOfString & String = js.native
    
    /* "MALFORMED_HEXADECIMAL" */ val MalformedHexadecimal: typings.unraw.distErrorsMod.ErrorType.MalformedHexadecimal & String = js.native
    
    /* "MALFORMED_UNICODE" */ val MalformedUnicode: typings.unraw.distErrorsMod.ErrorType.MalformedUnicode & String = js.native
    
    /* "OCTAL_DEPRECATION" */ val OctalDeprecation: typings.unraw.distErrorsMod.ErrorType.OctalDeprecation & String = js.native
  }
  
  /* Inlined std.Readonly<std.Map<unraw.unraw/dist/errors.ErrorType, string>> */
  object errorMessages {
    
    @JSImport("unraw", "errorMessages")
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
    
    @JSImport("unraw", "errorMessages.size")
    @js.native
    val size: Double = js.native
    
    inline def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
  }
  
  inline def unraw(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unraw")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unraw(raw: String, allowOctals: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unraw")(raw.asInstanceOf[js.Any], allowOctals.asInstanceOf[js.Any])).asInstanceOf[String]
}
