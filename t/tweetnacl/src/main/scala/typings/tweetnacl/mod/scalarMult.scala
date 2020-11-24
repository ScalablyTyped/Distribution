package typings.tweetnacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait scalarMult extends js.Object {
  
  def apply(n: Uint8Array, p: Uint8Array): Uint8Array = js.native
  
  def base(n: Uint8Array): Uint8Array = js.native
  
  val groupElementLength: Double = js.native
  
  val scalarLength: Double = js.native
}
