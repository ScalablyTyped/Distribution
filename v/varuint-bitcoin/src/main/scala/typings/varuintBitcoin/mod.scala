package typings.varuintBitcoin

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("varuint-bitcoin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val decode: Decode_ = js.native
  
  val encode: Encode_ = js.native
  
  def encodingLength(num: Double): Double = js.native
  
  @js.native
  trait Decode_ extends js.Object {
    
    def apply(buffer: Buffer): Double = js.native
    def apply(buffer: Buffer, offset: Double): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait Encode_ extends js.Object {
    
    def apply(num: Double): Buffer = js.native
    def apply(num: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
    def apply(num: Double, buffer: Buffer): Buffer = js.native
    def apply(num: Double, buffer: Buffer, offset: Double): Buffer = js.native
    
    var bytes: Double = js.native
  }
}
