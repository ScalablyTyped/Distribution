package typings.tokenTypes

import typings.node.Buffer
import typings.tokenizerToken.mod.IGetToken
import typings.tokenizerToken.mod.IToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("token-types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("Float16_BE")
  val Float16BE: IToken[Double] = js.native
  
  @JSName("Float16_LE")
  val Float16LE: IToken[Double] = js.native
  
  @JSName("Float32_BE")
  val Float32BE: IToken[Double] = js.native
  
  @JSName("Float32_LE")
  val Float32LE: IToken[Double] = js.native
  
  @JSName("Float64_BE")
  val Float64BE: IToken[Double] = js.native
  
  @JSName("Float64_LE")
  val Float64LE: IToken[Double] = js.native
  
  @JSName("Float80_BE")
  val Float80BE: IToken[Double] = js.native
  
  @JSName("Float80_LE")
  val Float80LE: IToken[Double] = js.native
  
  val INT16_BE: IToken[Double] = js.native
  
  val INT16_LE: IToken[Double] = js.native
  
  val INT24_BE: IToken[Double] = js.native
  
  val INT24_LE: IToken[Double] = js.native
  
  val INT32_BE: IToken[Double] = js.native
  
  val INT32_LE: IToken[Double] = js.native
  
  val INT64_BE: IToken[Double] = js.native
  
  val INT64_LE: IToken[Double] = js.native
  
  val INT8: IToken[Double] = js.native
  
  val UINT16_BE: IToken[Double] = js.native
  
  val UINT16_LE: IToken[Double] = js.native
  
  val UINT24_BE: IToken[Double] = js.native
  
  val UINT24_LE: IToken[Double] = js.native
  
  val UINT32_BE: IToken[Double] = js.native
  
  val UINT32_LE: IToken[Double] = js.native
  
  val UINT64_BE: IToken[Double] = js.native
  
  val UINT64_LE: IToken[Double] = js.native
  
  val UINT8: IToken[Double] = js.native
  
  def readIntBE(buf: Buffer, offset: Double, byteLength: Double): Double = js.native
  
  def readUIntBE(buf: Buffer, offset: Double, byteLength: Double): Double = js.native
  
  def writeIntBE(buf: Buffer, value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeIntLE(buf: Buffer, value: Double, offset: Double, byteLength: Double): Double = js.native
  
  def writeUIntBE(buf: Buffer, value: Double, offset: Double, byteLength: Double): Double = js.native
  
  @js.native
  class AnsiStringType protected () extends IGetToken[String] {
    def this(len: Double) = this()
    
    def get(buf: Buffer): String = js.native
  }
  /* static members */
  @js.native
  object AnsiStringType extends js.Object {
    
    var codePointToString: js.Any = js.native
    
    var decode: js.Any = js.native
    
    var inRange: js.Any = js.native
    
    var singleByteDecoder: js.Any = js.native
    
    var windows1252: js.Any = js.native
  }
  
  @js.native
  class BufferType protected () extends IGetToken[Buffer] {
    def this(len: Double) = this()
  }
  
  @js.native
  class IgnoreType protected () extends IGetToken[Unit] {
    /**
      * @param len number of bytes to ignore
      */
    def this(len: Double) = this()
  }
  
  @js.native
  class StringType protected () extends IGetToken[String] {
    def this(len: Double, encoding: String) = this()
    
    var encoding: String = js.native
  }
}
