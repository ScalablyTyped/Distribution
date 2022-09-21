package typings.transitJs

import typings.std.ArrayLike
import typings.std.Record
import typings.transitJs.anon.Equals
import typings.transitJs.mod.Decoder_
import typings.transitJs.mod.Encodings
import typings.transitJs.mod.ReadCache_
import typings.transitJs.mod.ReaderOptions
import typings.transitJs.mod.TransitBuilder
import typings.transitJs.mod.TransitLink
import typings.transitJs.mod.TransitMap
import typings.transitJs.mod.TransitReader
import typings.transitJs.mod.TransitSet
import typings.transitJs.mod.TransitTaggedValue
import typings.transitJs.mod.TransitWriter
import typings.transitJs.mod.WriteCache_
import typings.transitJs.mod.WriteHandler
import typings.transitJs.mod.WriterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object transit {
    
    @JSGlobal("transit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def UUIDfromString(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("UUIDfromString")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def bigDec(s: String): TransitTaggedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("bigDec")(s.asInstanceOf[js.Any]).asInstanceOf[TransitTaggedValue]
    
    inline def bigInt(s: String): TransitTaggedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("bigInt")(s.asInstanceOf[js.Any]).asInstanceOf[TransitTaggedValue]
    
    inline def binary(s: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("binary")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def date(v: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(v.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def date(v: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(v.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def decoder(): Decoder_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decoder")().asInstanceOf[Decoder_]
    inline def decoder(options: Record[String, WriteHandler]): Decoder_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(options.asInstanceOf[js.Any]).asInstanceOf[Decoder_]
    
    inline def equals_(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def extendToEQ[T /* <: js.Object */](proto: T, params: Equals[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extendToEQ")(proto.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def hash(x: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def hashArrayLike(obj: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashArrayLike")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def hashMapLike(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMapLike")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def hashMapLike_Double(x: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMapLike")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def integer(s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def integer(s: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isBigDec(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigDec")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isBigInt(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigInt")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isBinary(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isInteger(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isKeyword(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyword")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isLink(x: Any): /* is transit-js.transit-js.TransitLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLink")(x.asInstanceOf[js.Any]).asInstanceOf[/* is transit-js.transit-js.TransitLink */ Boolean]
    
    inline def isList(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isMap(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isQuoted(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuoted")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSet(x: Any): /* is transit-js.transit-js.TransitSet<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(x.asInstanceOf[js.Any]).asInstanceOf[/* is transit-js.transit-js.TransitSet<any> */ Boolean]
    
    inline def isSymbol(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isTaggedValue(`val`: Any): /* is transit-js.transit-js.TransitTaggedValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is transit-js.transit-js.TransitTaggedValue */ Boolean]
    
    inline def isURI(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURI")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isUUID(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keyword(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def link(m: TransitMap[Any, Any]): TransitLink = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(m.asInstanceOf[js.Any]).asInstanceOf[TransitLink]
    
    inline def list(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[Boolean]
    inline def list(x: ArrayLike[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def makeBuilder(obj: TransitBuilder[Any]): TransitBuilder[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBuilder")(obj.asInstanceOf[js.Any]).asInstanceOf[TransitBuilder[Any]]
    
    inline def makeWriteHandler(obj: WriteHandler): WriteHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("makeWriteHandler")(obj.asInstanceOf[js.Any]).asInstanceOf[WriteHandler]
    
    inline def map(): TransitMap[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[TransitMap[Any, Any]]
    inline def map(arr: ArrayLike[Any]): TransitMap[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any]).asInstanceOf[TransitMap[Any, Any]]
    
    inline def mapToObject(m: TransitMap[Any, Any]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToObject")(m.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def objectToMap(obj: js.Object): TransitMap[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToMap")(obj.asInstanceOf[js.Any]).asInstanceOf[TransitMap[Any, Any]]
    
    inline def quoted(x: String): TransitTaggedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("quoted")(x.asInstanceOf[js.Any]).asInstanceOf[TransitTaggedValue]
    
    inline def randomUUID(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def readCache(): ReadCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("readCache")().asInstanceOf[ReadCache_]
    
    inline def reader(`type`: Encodings): TransitReader = ^.asInstanceOf[js.Dynamic].applyDynamic("reader")(`type`.asInstanceOf[js.Any]).asInstanceOf[TransitReader]
    inline def reader(`type`: Encodings, opts: ReaderOptions): TransitReader = (^.asInstanceOf[js.Dynamic].applyDynamic("reader")(`type`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TransitReader]
    
    inline def set(): TransitSet[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[TransitSet[Any]]
    inline def set(init: ArrayLike[Any]): TransitSet[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(init.asInstanceOf[js.Any]).asInstanceOf[TransitSet[Any]]
    
    inline def stringableKeys(em: Any, obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringableKeys")(em.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def symbol(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def tagged(tag: String, `val`: Any): TransitTaggedValue = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(tag.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[TransitTaggedValue]
    
    inline def uri(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uri")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def uuid(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def writeCache(): WriteCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCache")().asInstanceOf[WriteCache_]
    
    inline def writer(`type`: Encodings): TransitWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("writer")(`type`.asInstanceOf[js.Any]).asInstanceOf[TransitWriter]
    inline def writer(`type`: Encodings, opts: WriterOptions): TransitWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(`type`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TransitWriter]
  }
}
