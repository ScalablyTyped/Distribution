package typings.urlSafeBase64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-safe-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(safe: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(safe.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encode(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isBase64(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isUrlSafeBase64(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlSafeBase64")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def trim(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
