package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // to use with adapter.js, see: https://github.com/webrtc/adapter
  @JSGlobal("getUserMedia")
  @js.native
  def getUserMedia: NavigatorGetUserMedia = js.native
  @scala.inline
  def getUserMedia_=(x: NavigatorGetUserMedia): Unit = js.Dynamic.global.updateDynamic("getUserMedia")(x.asInstanceOf[js.Any])
}
