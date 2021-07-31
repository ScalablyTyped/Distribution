package typings.tokenTypes

import typings.node.Buffer
import typings.tokenizerToken.mod.IGetToken
import typings.tokenizerToken.mod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("token-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("token-types", "AnsiStringType")
  @js.native
  class AnsiStringType protected ()
    extends StObject
       with IGetToken[String] {
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param buffer - Buffer to read the decoded value from
      * @param offset - Decode offset
      * @return Decoded value
      */
    /* CompleteClass */
    override def get(buffer: Buffer, offset: Double): String = js.native
    def get(buf: Buffer): String = js.native
    
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
    def codePointToString: js.Any = js.native
    @scala.inline
    def codePointToString_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codePointToString")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.decode")
    @js.native
    def decode: js.Any = js.native
    @scala.inline
    def decode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.inRange")
    @js.native
    def inRange: js.Any = js.native
    @scala.inline
    def inRange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inRange")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.singleByteDecoder")
    @js.native
    def singleByteDecoder: js.Any = js.native
    @scala.inline
    def singleByteDecoder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singleByteDecoder")(x.asInstanceOf[js.Any])
    
    @JSImport("token-types", "AnsiStringType.windows1252")
    @js.native
    def windows1252: js.Any = js.native
    @scala.inline
    def windows1252_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows1252")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("token-types", "BufferType")
  @js.native
  class BufferType protected ()
    extends StObject
       with IGetToken[Buffer] {
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param buffer - Buffer to read the decoded value from
      * @param offset - Decode offset
      * @return Decoded value
      */
    /* CompleteClass */
    override def get(buffer: Buffer, offset: Double): Buffer = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  
  @JSImport("token-types", "Float16_BE")
  @js.native
  val Float16BE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float16_LE")
  @js.native
  val Float16LE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float32_BE")
  @js.native
  val Float32BE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float32_LE")
  @js.native
  val Float32LE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float64_BE")
  @js.native
  val Float64BE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float64_LE")
  @js.native
  val Float64LE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float80_BE")
  @js.native
  val Float80BE: IToken[Double] = js.native
  
  @JSImport("token-types", "Float80_LE")
  @js.native
  val Float80LE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT16_BE")
  @js.native
  val INT16_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT16_LE")
  @js.native
  val INT16_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT24_BE")
  @js.native
  val INT24_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT24_LE")
  @js.native
  val INT24_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT32_BE")
  @js.native
  val INT32_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT32_LE")
  @js.native
  val INT32_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT64_BE")
  @js.native
  val INT64_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT64_LE")
  @js.native
  val INT64_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "INT8")
  @js.native
  val INT8: IToken[Double] = js.native
  
  @JSImport("token-types", "IgnoreType")
  @js.native
  class IgnoreType protected ()
    extends StObject
       with IGetToken[Unit] {
    /**
      * @param len number of bytes to ignore
      */
    def this(len: Double) = this()
    
    /**
      * Decode value from buffer at offset
      * @param buffer - Buffer to read the decoded value from
      * @param offset - Decode offset
      * @return Decoded value
      */
    /* CompleteClass */
    override def get(buffer: Buffer, offset: Double): Unit = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  
  @JSImport("token-types", "StringType")
  @js.native
  class StringType protected ()
    extends StObject
       with IGetToken[String] {
    def this(len: Double, encoding: String) = this()
    
    var encoding: String = js.native
    
    /**
      * Decode value from buffer at offset
      * @param buffer - Buffer to read the decoded value from
      * @param offset - Decode offset
      * @return Decoded value
      */
    /* CompleteClass */
    override def get(buffer: Buffer, offset: Double): String = js.native
    
    /**
      * Length of encoded token in bytes
      */
    /* CompleteClass */
    var len: Double = js.native
  }
  
  @JSImport("token-types", "UINT16_BE")
  @js.native
  val UINT16_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT16_LE")
  @js.native
  val UINT16_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT24_BE")
  @js.native
  val UINT24_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT24_LE")
  @js.native
  val UINT24_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT32_BE")
  @js.native
  val UINT32_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT32_LE")
  @js.native
  val UINT32_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT64_BE")
  @js.native
  val UINT64_BE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT64_LE")
  @js.native
  val UINT64_LE: IToken[Double] = js.native
  
  @JSImport("token-types", "UINT8")
  @js.native
  val UINT8: IToken[Double] = js.native
  
  @scala.inline
  def readIntBE(buf: Buffer, offset: Double, byteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readIntBE")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readUIntBE(buf: Buffer, offset: Double, byteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUIntBE")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def writeIntBE(buf: Buffer, value: Double, offset: Double, byteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeIntBE")(buf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def writeIntLE(buf: Buffer, value: Double, offset: Double, byteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeIntLE")(buf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def writeUIntBE(buf: Buffer, value: Double, offset: Double, byteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUIntBE")(buf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
}
