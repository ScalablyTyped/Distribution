package typings.urlsafeBase64

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urlsafe-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("urlsafe-base64", "decode")
  @js.native
  def decode(base64: String): Buffer = js.native
  
  @JSImport("urlsafe-base64", "encode")
  @js.native
  def encode(buffer: Buffer): String = js.native
  
  @JSImport("urlsafe-base64", "validate")
  @js.native
  def validate(base64: String): Boolean = js.native
  
  @JSImport("urlsafe-base64", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
