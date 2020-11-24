package typings.textEncoding

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoder extends js.Object {
  
  def decode(): String = js.native
  def decode(input: js.UndefOr[scala.Nothing], options: TextDecoderOptions): String = js.native
  def decode(input: Uint8Array): String = js.native
  def decode(input: Uint8Array, options: TextDecoderOptions): String = js.native
  
  val encoding: String = js.native
}
