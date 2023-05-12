package typings.undici

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.TypedArray
import typings.std.ArrayBufferLike
import typings.std.Record
import typings.std.ReturnType
import typings.undici.anon.AllowShared
import typings.undici.anon.AllowSharedBoolean
import typings.undici.anon.AllowedValues
import typings.undici.anon.Argument
import typings.undici.anon.Header
import typings.undici.anon.LegacyNullToEmptyString
import typings.undici.anon.Length
import typings.undici.anon.Message
import typings.undici.anon.Prefix
import typings.undici.anon.Strict
import typings.undici.anon.StrictBoolean
import typings.undici.undiciStrings.BigInt
import typings.undici.undiciStrings.Number
import typings.undici.undiciStrings.Object
import typings.undici.undiciStrings.Symbol
import typings.undici.undiciStrings.Undefined
import typings.undici.undiciStrings.signed
import typings.undici.undiciStrings.unsigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWebidlMod {
  
  trait ConvertToIntOpts extends StObject {
    
    var clamp: js.UndefOr[Boolean] = js.undefined
    
    var enforceRange: js.UndefOr[Boolean] = js.undefined
  }
  object ConvertToIntOpts {
    
    inline def apply(): ConvertToIntOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertToIntOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertToIntOpts] (val x: Self) extends AnyVal {
      
      inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setEnforceRange(value: Boolean): Self = StObject.set(x, "enforceRange", value.asInstanceOf[js.Any])
      
      inline def setEnforceRangeUndefined: Self = StObject.set(x, "enforceRange", js.undefined)
    }
  }
  
  type Converter[T] = js.Function1[/* object */ Any, T]
  
  type RecordConverter[K /* <: String */, V] = js.Function1[/* object */ Any, Record[K, V]]
  
  type SequenceConverter[T] = js.Function1[/* object */ Any, js.Array[T]]
  
  @js.native
  trait Webidl extends StObject {
    
    def argumentLengthCheck(args: Length, min: Double, context: Header): Unit = js.native
    
    /**
      * @description Performs a brand-check on {@param V} to ensure it is a
      * {@param cls} object.
      */
    def brandCheck[Interface](V: Any, cls: Interface): /* asserts V is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Interface))),IArray())*/ Boolean = js.native
    def brandCheck[Interface](V: Any, cls: Interface, opts: Strict): /* asserts V is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Interface))),IArray())*/ Boolean = js.native
    
    var converters: WebidlConverters = js.native
    
    // TODO(@KhafraDev): a type could likely be implemented that can infer the return type
    // from the converters given?
    /**
      * Converts a value, V, to a WebIDL dictionary types. Allows limiting which keys are
      * allowed, values allowed, optional and required keys. Auto converts the value to
      * a type given a converter.
      */
    def dictionaryConverter(converters: js.Array[AllowedValues]): js.Function1[/* V */ Any, Record[String, Any]] = js.native
    
    var errors: WebidlErrors = js.native
    
    /**
      * Similar to {@link Webidl.brandCheck} but allows skipping the check if third party
      * interfaces are allowed.
      */
    def interfaceConverter[Interface](cls: Interface): js.Function2[
        /* V */ Any, 
        /* opts */ js.UndefOr[StrictBoolean], 
        /* asserts V is TsTypeRef(Comments(1),TsQIdent(IArray(TsIdentSimple(any))),IArray())*/ Boolean
      ] = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#idl-nullable-type
      * @description allows a type, V, to be null
      */
    def nullableConverter[T](converter: Converter[T]): js.Function1[
        /* V */ Any, 
        (ReturnType[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof converter */ Any
        ]) | Null
      ] = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-to-record
      * @description Convert a value, V, to a WebIDL record type.
      */
    def recordConverter[K /* <: String */, V](keyConverter: Converter[K], valueConverter: Converter[V]): RecordConverter[K, V] = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-sequence
      * @description Convert a value, V, to a WebIDL sequence type.
      */
    def sequenceConverter[Type](C: Converter[Type]): SequenceConverter[Type] = js.native
    
    var util: WebidlUtil = js.native
  }
  
  @js.native
  trait WebidlConverters
    extends StObject
       with /* Key */ StringDictionary[js.Function1[/* repeated */ Any, Any]] {
    
    /**
      * @see https://webidl.spec.whatwg.org/#idl-ArrayBuffer
      */
    def ArrayBuffer(V: Any): ArrayBufferLike = js.native
    def ArrayBuffer(V: Any, opts: AllowShared): js.typedarray.ArrayBuffer = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#BufferSource
      */
    def BufferSource(V: Any): TypedArray | ArrayBufferLike | js.typedarray.DataView = js.native
    def BufferSource(V: Any, opts: AllowSharedBoolean): TypedArray | ArrayBufferLike | js.typedarray.DataView = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-ByteString
      */
    def ByteString(V: Any): String = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-DOMString
      */
    def DOMString(V: Any): String = js.native
    def DOMString(V: Any, opts: LegacyNullToEmptyString): String = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-buffer-source-types
      */
    def DataView(V: Any): js.typedarray.DataView = js.native
    def DataView(V: Any, opts: AllowSharedBoolean): js.typedarray.DataView = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-buffer-source-types
      */
    def TypedArray(V: Any, TypedArray: ArrayBufferLike | typings.node.NodeJS.TypedArray): typings.node.NodeJS.TypedArray | ArrayBufferLike = js.native
    def TypedArray(V: Any, TypedArray: ArrayBufferLike | typings.node.NodeJS.TypedArray, opts: AllowShared): typings.node.NodeJS.TypedArray | js.typedarray.ArrayBuffer = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-USVString
      */
    def USVString(V: Any): String = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-any
      */
    def any[Value](V: Value): Value = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-boolean
      */
    def boolean(V: Any): Boolean = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-long-long
      */
    def `long long`(V: Any): Double = js.native
    
    @JSName("record<ByteString, ByteString>")
    def `recordLessthansignByteStringComma ByteStringGreaterthansign`(`object`: Any): Record[String, String] = js.native
    @JSName("record<ByteString, ByteString>")
    var `recordLessthansignByteStringComma ByteStringGreaterthansign_Original`: RecordConverter[String, String] = js.native
    
    @JSName("sequence<ByteString>")
    def sequenceLessthansignByteStringGreaterthansign(`object`: Any): js.Array[String] = js.native
    @JSName("sequence<ByteString>")
    var sequenceLessthansignByteStringGreaterthansign_Original: SequenceConverter[String] = js.native
    
    @JSName("sequence<sequence<ByteString>>")
    def sequenceLessthansignsequenceLessthansignByteStringGreaterthansignGreaterthansign(`object`: Any): js.Array[js.Array[String]] = js.native
    @JSName("sequence<sequence<ByteString>>")
    var sequenceLessthansignsequenceLessthansignByteStringGreaterthansignGreaterthansign_Original: SequenceConverter[js.Array[String]] = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-unsigned-long
      */
    def `unsigned long`(V: Any): Double = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-unsigned-long-long
      */
    def `unsigned long long`(V: Any): Double = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#es-unsigned-short
      */
    def `unsigned short`(V: Any): Double = js.native
    def `unsigned short`(V: Any, opts: ConvertToIntOpts): Double = js.native
  }
  
  trait WebidlErrors extends StObject {
    
    /**
      * @description Throw an error when conversion from one type to another has failed
      */
    def conversionFailed(opts: Argument): js.TypeError
    
    def exception(opts: Message): js.TypeError
    
    /**
      * @description Throw an error when an invalid argument is provided
      */
    def invalidArgument(opts: Prefix): js.TypeError
  }
  object WebidlErrors {
    
    inline def apply(
      conversionFailed: Argument => js.TypeError,
      exception: Message => js.TypeError,
      invalidArgument: Prefix => js.TypeError
    ): WebidlErrors = {
      val __obj = js.Dynamic.literal(conversionFailed = js.Any.fromFunction1(conversionFailed), exception = js.Any.fromFunction1(exception), invalidArgument = js.Any.fromFunction1(invalidArgument))
      __obj.asInstanceOf[WebidlErrors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebidlErrors] (val x: Self) extends AnyVal {
      
      inline def setConversionFailed(value: Argument => js.TypeError): Self = StObject.set(x, "conversionFailed", js.Any.fromFunction1(value))
      
      inline def setException(value: Message => js.TypeError): Self = StObject.set(x, "exception", js.Any.fromFunction1(value))
      
      inline def setInvalidArgument(value: Prefix => js.TypeError): Self = StObject.set(x, "invalidArgument", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WebidlUtil extends StObject {
    
    /**
      * @see https://webidl.spec.whatwg.org/#abstract-opdef-converttoint
      */
    def ConvertToInt(V: Any, bitLength: Double, signedness: signed | unsigned): Double = js.native
    def ConvertToInt(V: Any, bitLength: Double, signedness: signed | unsigned, opts: ConvertToIntOpts): Double = js.native
    
    /**
      * @see https://webidl.spec.whatwg.org/#abstract-opdef-converttoint
      */
    def IntegerPart(N: Double): Double = js.native
    
    /**
      * @see https://tc39.es/ecma262/#sec-ecmascript-data-types-and-values
      */
    def Type(`object`: Any): Undefined | typings.undici.undiciStrings.Boolean | typings.undici.undiciStrings.String | Symbol | Number | BigInt | typings.undici.undiciStrings.Null | Object = js.native
  }
}
