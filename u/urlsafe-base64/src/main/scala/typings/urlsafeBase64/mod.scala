package typings.urlsafeBase64

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urlsafe-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(base64: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encode(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validate(base64: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(base64.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("urlsafe-base64", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
