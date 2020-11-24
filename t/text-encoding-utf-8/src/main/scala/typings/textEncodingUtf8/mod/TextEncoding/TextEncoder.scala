package typings.textEncodingUtf8.mod.TextEncoding

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoder extends js.Object {
  
  def encode(): Uint8Array = js.native
  def encode(input: js.UndefOr[scala.Nothing], options: TextEncodeOptions): Uint8Array = js.native
  def encode(input: String): Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): Uint8Array = js.native
  
  var encoding: String = js.native
}
