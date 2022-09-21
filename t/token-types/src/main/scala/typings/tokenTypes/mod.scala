package typings.tokenTypes

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.tokenizerToken.mod.IGetToken
import typings.tokenizerToken.mod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("token-types", "AnsiStringType")
  @js.native
  open class AnsiStringType protected ()
    extends StObject
       with IGetToken[String, js.typedarray.Uint8Array] {
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param array - Uint8Array to read the decoded value from
      * @param offset - Decode offset
      * @return decoded value
      */
    /* CompleteClass */
    override def get(array: js.typedarray.Uint8Array, offset: Double): String = js.native
    def get(buffer: Buffer): String = js.native
    def get(buffer: Buffer, offset: Double): String = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  /* static members */
  object AnsiStringType {
    
    @JSImport("token-types", "AnsiStringType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("token-types", "AnsiStringType.codePointToString")
    @js.native
    def codePointToString: Any = js.native
    inline def codePointToString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codePointToString")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.decode")
    @js.native
    def decode: Any = js.native
    inline def decode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.inRange")
    @js.native
    def inRange: Any = js.native
    inline def inRange_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inRange")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.singleByteDecoder")
    @js.native
    def singleByteDecoder: Any = js.native
    inline def singleByteDecoder_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singleByteDecoder")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.windows1252")
    @js.native
    def windows1252: Any = js.native
    inline def windows1252_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows1252")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("token-types", "BufferType")
  @js.native
  open class BufferType protected ()
    extends StObject
       with IGetToken[js.typedarray.Uint8Array, Buffer] {
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param array - Uint8Array to read the decoded value from
      * @param offset - Decode offset
      * @return decoded value
      */
    /* CompleteClass */
    override def get(array: Buffer, offset: Double): js.typedarray.Uint8Array = js.native
    def get(uint8Array: js.typedarray.Uint8Array, off: Double): Buffer = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  
  @JSImport("token-types", "Float16_BE")
  @js.native
  val Float16BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float16_LE")
  @js.native
  val Float16LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float32_BE")
  @js.native
  val Float32BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float32_LE")
  @js.native
  val Float32LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float64_BE")
  @js.native
  val Float64BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float64_LE")
  @js.native
  val Float64LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float80_BE")
  @js.native
  val Float80BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Float80_LE")
  @js.native
  val Float80LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT16_BE")
  @js.native
  val INT16_BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT16_LE")
  @js.native
  val INT16_LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT24_BE")
  @js.native
  val INT24_BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT24_LE")
  @js.native
  val INT24_LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT32_BE")
  @js.native
  val INT32_BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT32_LE")
  @js.native
  val INT32_LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT64_BE")
  @js.native
  val INT64_BE: IToken[js.BigInt, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT64_LE")
  @js.native
  val INT64_LE: IToken[js.BigInt, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "INT8")
  @js.native
  val INT8: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "IgnoreType")
  @js.native
  open class IgnoreType protected ()
    extends StObject
       with IGetToken[Unit, js.typedarray.Uint8Array] {
    /**
      * @param len number of bytes to ignore
      */
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param array - Uint8Array to read the decoded value from
      * @param offset - Decode offset
      * @return decoded value
      */
    /* CompleteClass */
    override def get(array: js.typedarray.Uint8Array, offset: Double): Unit = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  
  @JSImport("token-types", "StringType")
  @js.native
  open class StringType protected ()
    extends StObject
       with IGetToken[String, Buffer] {
    def this(len: Double, encoding: BufferEncoding) = this()
    
    var encoding: BufferEncoding = js.native
    
    /**
      * Decode value from buffer at offset
      * @param array - Uint8Array to read the decoded value from
      * @param offset - Decode offset
      * @return decoded value
      */
    /* CompleteClass */
    override def get(array: Buffer, offset: Double): String = js.native
    def get(uint8Array: js.typedarray.Uint8Array, offset: Double): String = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  
  @JSImport("token-types", "UINT16_BE")
  @js.native
  val UINT16_BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT16_LE")
  @js.native
  val UINT16_LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT24_BE")
  @js.native
  val UINT24_BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT24_LE")
  @js.native
  val UINT24_LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT32_BE")
  @js.native
  val UINT32_BE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT32_LE")
  @js.native
  val UINT32_LE: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT64_BE")
  @js.native
  val UINT64_BE: IToken[js.BigInt, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT64_LE")
  @js.native
  val UINT64_LE: IToken[js.BigInt, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "UINT8")
  @js.native
  val UINT8: IToken[Double, js.typedarray.Uint8Array] = js.native
  
  @JSImport("token-types", "Uint8ArrayType")
  @js.native
  open class Uint8ArrayType protected ()
    extends StObject
       with IGetToken[js.typedarray.Uint8Array, js.typedarray.Uint8Array] {
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param array - Uint8Array to read the decoded value from
      * @param offset - Decode offset
      * @return decoded value
      */
    /* CompleteClass */
    override def get(array: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
}
