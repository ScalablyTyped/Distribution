package typings.videoJs.mod.default

import typings.videoJs.anon.BeforeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Vhs {
  
  @JSImport("video.js", "default.Vhs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("video.js", "default.Vhs.xhr")
  @js.native
  def xhr: BeforeRequest = js.native
  inline def xhr_=(x: BeforeRequest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xhr")(x.asInstanceOf[js.Any])
}
