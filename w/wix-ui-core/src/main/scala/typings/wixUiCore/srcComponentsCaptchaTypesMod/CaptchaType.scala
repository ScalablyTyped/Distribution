package typings.wixUiCore.srcComponentsCaptchaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptchaType extends StObject
@JSImport("wix-ui-core/src/components/captcha/types", "CaptchaType")
@js.native
object CaptchaType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptchaType & String] = js.native
  
  @js.native
  sealed trait audio
    extends StObject
       with CaptchaType
  /* "audio" */ val audio: typings.wixUiCore.srcComponentsCaptchaTypesMod.CaptchaType.audio & String = js.native
  
  @js.native
  sealed trait image
    extends StObject
       with CaptchaType
  /* "image" */ val image: typings.wixUiCore.srcComponentsCaptchaTypesMod.CaptchaType.image & String = js.native
}
