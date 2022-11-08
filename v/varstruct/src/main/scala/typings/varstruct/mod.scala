package typings.varstruct

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.varstruct.anon.Bytes
import typings.varstruct.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a codec with a fixed number of fields. If any subcodec has a variable
    * length, then the new codec will as well.
    *
    * @example
    * import vstruct = require('varstruct')
    *
    * //create a vector codec.
    * let Vector = vstruct<{ x: number; y: number; z: number }>([
    *   { name: 'x', type: vstruct.DoubleBE },
    *   { name: 'y', type: vstruct.DoubleBE },
    *   { name: 'z', type: vstruct.DoubleBE }
    * ])
    *
    * // or short form
    * Vector = vstruct([
    *   ['x', vstruct.DoubleBE],
    *   ['y', vstruct.DoubleBE],
    *   ['z', vstruct.DoubleBE]
    * ])
    *
    * //encode a object to get a buffer
    * const dump = Vector.encode({ x: 93.1, y: 87.3, z: 10.39 })
    * // <Buffer 40 57 46 66 66 66 66 66 40 55 d3 33 33 33 33 33 40 24 c7 ae 14 7a e1 48>
    *
    * const xyz = Vector.decode(dump)
    * // => { x: 93.1, y: 87.3, z: 10.39 }
    *
    * @example
    * import vstruct = require('varstruct')
    * import * as VarIntProtobuf from 'varint'
    *
    * // codec for a sha256 hash
    * const SHA256 = vstruct.Buffer(32)
    *
    * interface Message {
    *     previous: Buffer;
    *     author: Buffer;
    *     message: Buffer;
    *     attachments: Buffer[];
    * }
    *
    * const Message = vstruct<Message>([
    *   // the hash of the previous message
    *   { name: 'previous', type: SHA256 },
    *
    *   // the hash of the author's public key
    *   { name: 'author', type: SHA256 },
    *
    *   // an arbitary length buffer
    *   { name: 'message', type: vstruct.VarBuffer(VarIntProtobuf) },
    *
    *   // hashes of related documents.
    *   { name: 'attachments', type: vstruct.VarArray(vstruct.Byte, SHA256) }
    * ])
    */
  inline def apply[TObj](definition: ObjectDescriptor[TObj]): Codec[TObj] = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Codec[TObj]]
  
  @JSImport("varstruct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates codec that encodes an array with *fixed* length.
    */
  inline def Array[T](length: Double, itemCodec: Codec[T]): Codec[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Array")(length.asInstanceOf[js.Any], itemCodec.asInstanceOf[js.Any])).asInstanceOf[Codec[js.Array[T]]]
  
  /**
    * Creates a codec that will call `checkValueCallback` before encode and after decode.
    *
    * @param valueCodec The codec for the value.
    * @param checkValueCallback Should throw error if the given `value` is wrong.
    */
  inline def Bound[T](
    valueCodec: Codec[T],
    checkValueCallback: js.Function1[
      /* value */ T, 
      /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean
    ]
  ): Codec[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Bound")(valueCodec.asInstanceOf[js.Any], checkValueCallback.asInstanceOf[js.Any])).asInstanceOf[Codec[T]]
  
  /**
    * Creates a *fixed* length buffer codec.
    */
  inline def Buffer(length: Double): Codec[typings.node.bufferMod.global.Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("Buffer")(length.asInstanceOf[js.Any]).asInstanceOf[Codec[typings.node.bufferMod.global.Buffer]]
  
  /**
    * Codec for unsigned byte (8-bit) integer numbers.
    */
  @JSImport("varstruct", "Byte")
  @js.native
  val Byte: Codec[Double] = js.native
  
  /**
    * Codec for 64-bit floating point numbers encoded as Big Endian (BE).
    */
  @JSImport("varstruct", "DoubleBE")
  @js.native
  val DoubleBE: Codec[Double] = js.native
  
  /**
    * Codec for 64-bit floating point numbers encoded as Little Endian (LE).
    */
  @JSImport("varstruct", "DoubleLE")
  @js.native
  val DoubleLE: Codec[Double] = js.native
  
  /**
    * Codec for 32-bit floating point numbers encoded as Big Endian (BE).
    */
  @JSImport("varstruct", "FloatBE")
  @js.native
  val FloatBE: Codec[Double] = js.native
  
  /**
    * Codec for 32-bit floating point numbers encoded as Little Endian (LE).
    */
  @JSImport("varstruct", "FloatLE")
  @js.native
  val FloatLE: Codec[Double] = js.native
  
  /**
    * Codec for signed 16-bit integer numbers encoded as Big Endian (BE).
    */
  @JSImport("varstruct", "Int16BE")
  @js.native
  val Int16BE: Codec[Double] = js.native
  
  /**
    * Codec for signed 16-bit integer numbers encoded as Little Endian (LE).
    */
  @JSImport("varstruct", "Int16LE")
  @js.native
  val Int16LE: Codec[Double] = js.native
  
  /**
    * Codec for signed 32-bit integer numbers encoded as Big Endian (BE).
    */
  @JSImport("varstruct", "Int32BE")
  @js.native
  val Int32BE: Codec[Double] = js.native
  
  /**
    * Codec for signed 32-bit integer numbers encoded as Little Endian (LE).
    */
  @JSImport("varstruct", "Int32LE")
  @js.native
  val Int32LE: Codec[Double] = js.native
  
  /**
    * Codec for signed 64-bit integer numbers encoded as Big Endian (BE).
    *
    * 64 bit ints are actually only 53 bit ints, but they will still be
    * written to 8 bytes. (based on [int53](https://github.com/dannycoates/int53))
    */
  @JSImport("varstruct", "Int64BE")
  @js.native
  val Int64BE: Codec[Double] = js.native
  
  /**
    * Codec for signed 64-bit integer numbers encoded as Little Endian (LE).
    *
    * 64 bit ints are actually only 53 bit ints, but they will still be
    * written to 8 bytes. (based on [int53](https://github.com/dannycoates/int53))
    */
  @JSImport("varstruct", "Int64LE")
  @js.native
  val Int64LE: Codec[Double] = js.native
  
  /**
    * Codec for signed 8-bit integer numbers.
    */
  @JSImport("varstruct", "Int8")
  @js.native
  val Int8: Codec[Double] = js.native
  
  /**
    * Creates codec that encodes an array with *fixed* length and *various* types.
    */
  inline def Sequence[TCodecs /* <: Array[Codec[Any]] */](itemCodecs: TCodecs): Codec[CodecTypes[TCodecs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Sequence")(itemCodecs.asInstanceOf[js.Any]).asInstanceOf[Codec[CodecTypes[TCodecs]]]
  
  /**
    * Creates a *fixed* length (in bytes) string codec.
    *
    * @param length The length of the string.
    * @param [encoding='utf-8'] The encoding of the string.
    */
  inline def String(length: Double): Codec[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("String")(length.asInstanceOf[js.Any]).asInstanceOf[Codec[java.lang.String]]
  inline def String(length: Double, encoding: java.lang.String): Codec[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("String")(length.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Codec[java.lang.String]]
  
  /**
    * Codec for unsigned 16-bit integer numbers encoded as Big Endian (BE).
    */
  @JSImport("varstruct", "UInt16BE")
  @js.native
  val UInt16BE: Codec[Double] = js.native
  
  /**
    * Codec for unsigned 16-bit integer numbers encoded as Little Endian (LE).
    */
  @JSImport("varstruct", "UInt16LE")
  @js.native
  val UInt16LE: Codec[Double] = js.native
  
  /**
    * Codec for unsigned 32-bit integer numbers encoded as Big Endian (BE).
    */
  @JSImport("varstruct", "UInt32BE")
  @js.native
  val UInt32BE: Codec[Double] = js.native
  
  /**
    * Codec for unsigned 32-bit integer numbers encoded as Little Endian (LE).
    */
  @JSImport("varstruct", "UInt32LE")
  @js.native
  val UInt32LE: Codec[Double] = js.native
  
  /**
    * Codec for unsigned 64-bit integer numbers encoded as Big Endian (BE).
    *
    * 64 bit ints are actually only 53 bit ints, but they will still be
    * written to 8 bytes. (based on [int53](https://github.com/dannycoates/int53))
    */
  @JSImport("varstruct", "UInt64BE")
  @js.native
  val UInt64BE: Codec[Double] = js.native
  
  /**
    * Codec for unsigned 64-bit integer numbers encoded as Little Endian (LE).
    *
    * 64 bit ints are actually only 53 bit ints, but they will still be
    * written to 8 bytes. (based on [int53](https://github.com/dannycoates/int53))
    */
  @JSImport("varstruct", "UInt64LE")
  @js.native
  val UInt64LE: Codec[Double] = js.native
  
  /**
    * Codec for unsigned byte (8-bit) integer numbers.
    */
  @JSImport("varstruct", "UInt8")
  @js.native
  val UInt8: Codec[Double] = js.native
  
  /**
    * Creates a codec that will encode `constantValue` every time (and will throw
    * if given any value other than `constantValue`), and will decode `constantValue`
    * if it exists (throwing otherwise).
    */
  inline def Value[T](valueCodec: Codec[T], constantValue: T): Codec[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Value")(valueCodec.asInstanceOf[js.Any], constantValue.asInstanceOf[js.Any])).asInstanceOf[Codec[js.UndefOr[T]]]
  
  /**
    * Creates a variable length codec that encodes an array of items.
    *
    * @param lengthCodec Must encode an integer.
    * @param itemCodec May be any varstruct compatible codec, including a `VarArray`.
    * As long as it can encode every element in the array.
    */
  inline def VarArray[T](lengthCodec: Codec[Double], itemCodec: Codec[T]): Codec[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("VarArray")(lengthCodec.asInstanceOf[js.Any], itemCodec.asInstanceOf[js.Any])).asInstanceOf[Codec[js.Array[T]]]
  
  /**
    * Creates a variable length buffer codec. This will first write out the length of the
    * value buffer and then the value buffer itself.
    *
    * @param lengthCodec May be variable length itself, but must encode an integer.
    */
  inline def VarBuffer(lengthCodec: Codec[Double]): Codec[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("VarBuffer")(lengthCodec.asInstanceOf[js.Any]).asInstanceOf[Codec[Buffer]]
  
  /**
    * Create a variable length object codec. This will first write out the number of
    * entries in the object and then write each entry as a key-value pair.
    *
    * @param lengthCodec May be variable length itself, but must encode an integer.
    * @param keyCodec Must accept string keys.
    * @param valueCodec The codec for each value of the map.
    */
  inline def VarMap[TKey /* <: String */, TValue](lengthCodec: Codec[Double], keyCodec: Codec[TKey], valueCodec: Codec[TValue]): Codec[Record[TKey, TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("VarMap")(lengthCodec.asInstanceOf[js.Any], keyCodec.asInstanceOf[js.Any], valueCodec.asInstanceOf[js.Any])).asInstanceOf[Codec[Record[TKey, TValue]]]
  
  /**
    * Create a variable length string codec. This codec uses `VarBuffer`
    * (buffer will be created from string with given `encoding`).
    *
    * @param lengthCodec May be variable length itself, but must encode an integer.
    * @param [encoding='utf-8'] The encoding of the string.
    */
  inline def VarString(lengthCodec: Codec[Double]): Codec[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("VarString")(lengthCodec.asInstanceOf[js.Any]).asInstanceOf[Codec[String]]
  inline def VarString(lengthCodec: Codec[Double], encoding: String): Codec[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("VarString")(lengthCodec.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Codec[String]]
  
  trait Codec[T] extends StObject {
    
    def decode(buffer: Buffer): T
    def decode(buffer: Buffer, start: Double): T
    def decode(buffer: Buffer, start: Double, end: Double): T
    def decode(buffer: Buffer, start: Unit, end: Double): T
    @JSName("decode")
    var decode_Original: Bytes[T]
    
    def encode(value: T): Buffer
    def encode(value: T, buffer: Unit, offset: Double): Buffer
    def encode(value: T, buffer: Buffer): Buffer
    def encode(value: T, buffer: Buffer, offset: Double): Buffer
    @JSName("encode")
    var encode_Original: Call[T]
    
    def encodingLength(value: T): Double
  }
  object Codec {
    
    inline def apply[T](decode: Bytes[T], encode: Call[T], encodingLength: T => Double): Codec[T] = {
      val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], encodingLength = js.Any.fromFunction1(encodingLength))
      __obj.asInstanceOf[Codec[T]]
    }
    
    extension [Self <: Codec[?], T](x: Self & Codec[T]) {
      
      inline def setDecode(value: Bytes[T]): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: Call[T]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodingLength(value: T => Double): Self = StObject.set(x, "encodingLength", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends varstruct.varstruct.Codec<infer TCodec> ? TCodec : never
    }}}
    */
  @js.native
  trait CodecType[T] extends StObject
  
  @js.native
  trait CodecTypes[Tuple /* <: Array[Any] */] extends StObject {
    
    var length: /* import warning: importer.ImportType#apply Failed type conversion: Tuple['length'] */ js.Any = js.native
  }
  
  type ObjectDescriptor[TObj] = js.Array[
    (ObjectDescriptorTuple[TObj, /* keyof TObj */ String]) | (ObjectDescriptorMap[TObj, /* keyof TObj */ String])
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TKey extends keyof TObj ? { readonly name :TKey,  readonly type :varstruct.varstruct.Codec<TObj[TKey]>} : never
    }}}
    */
  @js.native
  trait ObjectDescriptorMap[TObj, TKey] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TKey extends keyof TObj ? [name: keyof TObj, type: varstruct.varstruct.Codec<TObj[keyof TObj]>] : never
    }}}
    */
  @js.native
  trait ObjectDescriptorTuple[TObj, TKey] extends StObject
}
