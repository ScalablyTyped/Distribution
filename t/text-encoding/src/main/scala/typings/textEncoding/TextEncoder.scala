package typings.textEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoder extends StObject {
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(input: String): js.typedarray.Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
  def encode(input: Unit, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
  
  val encoding: String = js.native
}
