package typings.tweetnacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hash extends js.Object {
  
  def apply(msg: Uint8Array): Uint8Array = js.native
  
  val hashLength: Double = js.native
}
