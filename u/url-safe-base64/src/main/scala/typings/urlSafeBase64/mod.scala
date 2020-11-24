package typings.urlSafeBase64

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("url-safe-base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(safe: String): String = js.native
  
  def encode(base64: String): String = js.native
  
  def isBase64(string: String): String = js.native
  
  def isUrlSafeBase64(string: String): String = js.native
  
  def trim(string: String): String = js.native
}
