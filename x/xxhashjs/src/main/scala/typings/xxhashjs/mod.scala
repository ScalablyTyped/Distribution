package typings.xxhashjs

import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xxhashjs", "h32")
  @js.native
  val h32: HashInterface = js.native
  
  @JSImport("xxhashjs", "h64")
  @js.native
  val h64: HashInterface = js.native
  
  @js.native
  trait HashInterface extends StObject {
    
    def apply(): HashObject = js.native
    def apply(data: String, seed: Double): UINT = js.native
    def apply(data: Buffer, seed: Double): UINT = js.native
    def apply(data: ArrayBuffer, seed: Double): UINT = js.native
    def apply(seed: Double): HashObject = js.native
  }
  
  @js.native
  trait HashObject extends StObject {
    
    def digest(): UINT = js.native
    
    def init(seed: Double): this.type = js.native
    
    def update(data: String): this.type = js.native
    def update(data: Buffer): this.type = js.native
    def update(data: ArrayBuffer): this.type = js.native
  }
  
  @js.native
  trait UINT extends StObject {
    
    def toNumber(): Double = js.native
    
    def toString(radix: Double): String = js.native
  }
}
