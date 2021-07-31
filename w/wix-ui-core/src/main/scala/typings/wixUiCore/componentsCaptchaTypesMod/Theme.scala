package typings.wixUiCore.componentsCaptchaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Theme extends StObject
@JSImport("wix-ui-core/dist/standalone/src/components/captcha/types", "Theme")
@js.native
object Theme extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Theme & String] = js.native
  
  @js.native
  sealed trait dark
    extends StObject
       with Theme
  /* "dark" */ val dark: typings.wixUiCore.componentsCaptchaTypesMod.Theme.dark & String = js.native
  
  @js.native
  sealed trait light
    extends StObject
       with Theme
  /* "light" */ val light: typings.wixUiCore.componentsCaptchaTypesMod.Theme.light & String = js.native
}
