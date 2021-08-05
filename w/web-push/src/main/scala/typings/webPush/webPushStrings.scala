package typings.webPush

import typings.webPush.mod.ContentEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webPushStrings {
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait aes128gcm
    extends StObject
       with ContentEncoding
  inline def aes128gcm: aes128gcm = "aes128gcm".asInstanceOf[aes128gcm]
  
  @js.native
  sealed trait aesgcm
    extends StObject
       with ContentEncoding
  inline def aesgcm: aesgcm = "aesgcm".asInstanceOf[aesgcm]
  
  @js.native
  sealed trait aws128gcm extends StObject
  inline def aws128gcm: aws128gcm = "aws128gcm".asInstanceOf[aws128gcm]
}
