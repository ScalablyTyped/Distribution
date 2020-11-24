package typings.webPush

import typings.webPush.mod.ContentEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webPushStrings {
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def aes128gcm: aes128gcm = "aes128gcm".asInstanceOf[aes128gcm]
  
  @scala.inline
  def aesgcm: aesgcm = "aesgcm".asInstanceOf[aesgcm]
  
  @scala.inline
  def aws128gcm: aws128gcm = "aws128gcm".asInstanceOf[aws128gcm]
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait aes128gcm extends ContentEncoding
  
  @js.native
  sealed trait aesgcm extends ContentEncoding
  
  @js.native
  sealed trait aws128gcm extends js.Object
}
