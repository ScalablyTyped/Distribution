package typings.textEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoder extends StObject {
  
  def decode(): String = js.native
  def decode(input: js.typedarray.Uint8Array): String = js.native
  def decode(input: js.typedarray.Uint8Array, options: TextDecoderOptions): String = js.native
  def decode(input: Unit, options: TextDecoderOptions): String = js.native
  
  val encoding: String = js.native
}
