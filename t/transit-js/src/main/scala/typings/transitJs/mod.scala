package typings.transitJs

import typings.std.ArrayLike
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.transitJs.anon.Equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("transit-js", JSImport.Namespace)
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
  
  trait ArrayBuilder[T] extends StObject {
    
    def add(accumulator: T, `val`: Any, hash: Any): T
    
    def finalize(`val`: T): T
    
    def fromArray(arr: js.Array[Any], hash: Any): T
    
    def init(hash: Any): T
  }
  object ArrayBuilder {
    
    inline def apply[T](add: (T, Any, Any) => T, finalize_ : T => T, fromArray: (js.Array[Any], Any) => T, init: Any => T): ArrayBuilder[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), fromArray = js.Any.fromFunction2(fromArray), init = js.Any.fromFunction1(init))
      __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
      __obj.asInstanceOf[ArrayBuilder[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrayBuilder[?], T] (val x: Self & ArrayBuilder[T]) extends AnyVal {
      
      inline def setAdd(value: (T, Any, Any) => T): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
      
      inline def setFinalize_(value: T => T): Self = StObject.set(x, "finalize", js.Any.fromFunction1(value))
      
      inline def setFromArray(value: (js.Array[Any], Any) => T): Self = StObject.set(x, "fromArray", js.Any.fromFunction2(value))
      
      inline def setInit(value: Any => T): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Decoder_ extends StObject {
    
    def decode(node: Any): Any = js.native
    def decode(node: Any, cache: ReadCache_): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.transitJs.transitJsStrings.json
    - typings.transitJs.transitJsStrings.`json-verbose`
  */
  trait Encodings extends StObject
  object Encodings {
    
    inline def json: typings.transitJs.transitJsStrings.json = "json".asInstanceOf[typings.transitJs.transitJsStrings.json]
    
    inline def `json-verbose`: typings.transitJs.transitJsStrings.`json-verbose` = "json-verbose".asInstanceOf[typings.transitJs.transitJsStrings.`json-verbose`]
  }
  
  trait MapBuilder[T] extends StObject {
    
    def add(accumulator: T, key: Any, `val`: Any, hash: Any): T
    
    def finalize(`val`: T, hash: Any): T
    
    def init(hash: Any): Any
  }
  object MapBuilder {
    
    inline def apply[T](add: (T, Any, Any, Any) => T, finalize_ : (T, Any) => T, init: Any => Any): MapBuilder[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add), init = js.Any.fromFunction1(init))
      __obj.updateDynamic("finalize")(js.Any.fromFunction2(finalize_))
      __obj.asInstanceOf[MapBuilder[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapBuilder[?], T] (val x: Self & MapBuilder[T]) extends AnyVal {
      
      inline def setAdd(value: (T, Any, Any, Any) => T): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
      
      inline def setFinalize_(value: (T, Any) => T): Self = StObject.set(x, "finalize", js.Any.fromFunction2(value))
      
      inline def setInit(value: Any => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReadCache_ extends StObject {
    
    def clear(): Unit = js.native
    
    def read(key: String): Any = js.native
    def read(key: String, asMapKey: Boolean): Any = js.native
    
    def write(obj: Any): Any = js.native
    def write(obj: Any, asMapKey: Any): Any = js.native
  }
  
  trait ReaderOptions extends StObject {
    
    var arrayBuilder: js.UndefOr[ArrayBuilder[Any]] = js.undefined
    
    var handlers: js.UndefOr[Record[String, js.Function1[/* val */ Any, Any]]] = js.undefined
    
    var mapBuilder: js.UndefOr[MapBuilder[Any]] = js.undefined
  }
  object ReaderOptions {
    
    inline def apply(): ReaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReaderOptions] (val x: Self) extends AnyVal {
      
      inline def setArrayBuilder(value: ArrayBuilder[Any]): Self = StObject.set(x, "arrayBuilder", value.asInstanceOf[js.Any])
      
      inline def setArrayBuilderUndefined: Self = StObject.set(x, "arrayBuilder", js.undefined)
      
      inline def setHandlers(value: Record[String, js.Function1[/* val */ Any, Any]]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setMapBuilder(value: MapBuilder[Any]): Self = StObject.set(x, "mapBuilder", value.asInstanceOf[js.Any])
      
      inline def setMapBuilderUndefined: Self = StObject.set(x, "mapBuilder", js.undefined)
    }
  }
  
  trait TransitBuilder[T] extends StObject {
    
    def add(args: Any*): T
    
    def finalize(`val`: T): T
    
    def init(): T
  }
  object TransitBuilder {
    
    inline def apply[T](add: /* repeated */ Any => T, finalize_ : T => T, init: () => T): TransitBuilder[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), init = js.Any.fromFunction0(init))
      __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
      __obj.asInstanceOf[TransitBuilder[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitBuilder[?], T] (val x: Self & TransitBuilder[T]) extends AnyVal {
      
      inline def setAdd(value: /* repeated */ Any => T): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setFinalize_(value: T => T): Self = StObject.set(x, "finalize", js.Any.fromFunction1(value))
      
      inline def setInit(value: () => T): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    }
  }
  
  type TransitLink = Any
  
  type TransitMap[K, V] = Map[K, V]
  
  trait TransitReader extends StObject {
    
    def read(payload: String): Any
  }
  object TransitReader {
    
    inline def apply(read: String => Any): TransitReader = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[TransitReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitReader] (val x: Self) extends AnyVal {
      
      inline def setRead(value: String => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
  
  type TransitSet[T] = Set[T]
  
  type TransitTaggedValue = Any
  
  trait TransitType extends StObject {
    
    def equiv(other: Any): Boolean
  }
  object TransitType {
    
    inline def apply(equiv: Any => Boolean): TransitType = {
      val __obj = js.Dynamic.literal(equiv = js.Any.fromFunction1(equiv))
      __obj.asInstanceOf[TransitType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitType] (val x: Self) extends AnyVal {
      
      inline def setEquiv(value: Any => Boolean): Self = StObject.set(x, "equiv", js.Any.fromFunction1(value))
    }
  }
  
  trait TransitWriter extends StObject {
    
    def write(payload: Any): String
  }
  object TransitWriter {
    
    inline def apply(write: Any => String): TransitWriter = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[TransitWriter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitWriter] (val x: Self) extends AnyVal {
      
      inline def setWrite(value: Any => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WriteCache_ extends StObject {
    
    def clear(): Any = js.native
    
    def write(str: String): Any = js.native
    def write(str: String, asMapKey: Boolean): Any = js.native
  }
  
  trait WriteHandler extends StObject {
    
    var getVerboseHandler: js.UndefOr[js.Function1[/* val */ Any, this.type]] = js.undefined
    
    def rep(`val`: Any): Any
    
    def stringRep(`val`: Any, h: WriteHandler): String | Null
    
    def tag(`val`: Any): String
  }
  object WriteHandler {
    
    inline def apply(rep: Any => Any, stringRep: (Any, WriteHandler) => String | Null, tag: Any => String): WriteHandler = {
      val __obj = js.Dynamic.literal(rep = js.Any.fromFunction1(rep), stringRep = js.Any.fromFunction2(stringRep), tag = js.Any.fromFunction1(tag))
      __obj.asInstanceOf[WriteHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteHandler] (val x: Self) extends AnyVal {
      
      inline def setGetVerboseHandler(value: /* val */ Any => WriteHandler): Self = StObject.set(x, "getVerboseHandler", js.Any.fromFunction1(value))
      
      inline def setGetVerboseHandlerUndefined: Self = StObject.set(x, "getVerboseHandler", js.undefined)
      
      inline def setRep(value: Any => Any): Self = StObject.set(x, "rep", js.Any.fromFunction1(value))
      
      inline def setStringRep(value: (Any, WriteHandler) => String | Null): Self = StObject.set(x, "stringRep", js.Any.fromFunction2(value))
      
      inline def setTag(value: Any => String): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    }
  }
  
  trait WriterOptions extends StObject {
    
    /**
      * Multiple JS context handler
      */
    var handlerForForeign: js.UndefOr[js.Function2[/* val */ Any, /* handlers */ TransitMap[Any, Any], WriteHandler]] = js.undefined
    
    var handlers: js.UndefOr[TransitMap[String, WriteHandler]] = js.undefined
  }
  object WriterOptions {
    
    inline def apply(): WriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriterOptions] (val x: Self) extends AnyVal {
      
      inline def setHandlerForForeign(value: (/* val */ Any, /* handlers */ TransitMap[Any, Any]) => WriteHandler): Self = StObject.set(x, "handlerForForeign", js.Any.fromFunction2(value))
      
      inline def setHandlerForForeignUndefined: Self = StObject.set(x, "handlerForForeign", js.undefined)
      
      inline def setHandlers(value: TransitMap[String, WriteHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    }
  }
}
