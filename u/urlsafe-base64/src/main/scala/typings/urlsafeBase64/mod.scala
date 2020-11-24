package typings.urlsafeBase64

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urlsafe-base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(base64: String): Buffer = js.native
  
  def encode(buffer: Buffer): String = js.native
  
  def validate(base64: String): Boolean = js.native
  
  var version: String = js.native
}
