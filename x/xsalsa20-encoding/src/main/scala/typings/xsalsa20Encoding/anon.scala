package typings.xsalsa20Encoding

import typings.node.bufferMod.global.Buffer
import typings.xsalsa20Encoding.mod.BufferWithNonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bytes[TDec] extends StObject {
    
    def apply(buffer: BufferWithNonce): TDec = js.native
    def apply(buffer: BufferWithNonce, start: Double): TDec = js.native
    def apply(buffer: BufferWithNonce, start: Double, end: Double): TDec = js.native
    def apply(buffer: BufferWithNonce, start: Unit, end: Double): TDec = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait Call[TEnc] extends StObject {
    
    def apply(value: TEnc): Buffer = js.native
    def apply(value: TEnc, buffer: Unit, offset: Double): Buffer = js.native
    def apply(value: TEnc, buffer: Buffer): Buffer = js.native
    def apply(value: TEnc, buffer: Buffer, offset: Double): Buffer = js.native
    
    var bytes: Double = js.native
  }
}
