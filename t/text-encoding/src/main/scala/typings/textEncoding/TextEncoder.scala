package typings.textEncoding

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoder extends StObject {
  
  def encode(): Uint8Array = js.native
  def encode(input: String): Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): Uint8Array = js.native
  def encode(input: Unit, options: TextEncodeOptions): Uint8Array = js.native
  
  val encoding: String = js.native
}
