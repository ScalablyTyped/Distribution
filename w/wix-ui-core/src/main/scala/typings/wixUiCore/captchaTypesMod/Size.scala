package typings.wixUiCore.captchaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Size extends StObject
@JSImport("wix-ui-core/dist/src/components/captcha/types", "Size")
@js.native
object Size extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Size & String] = js.native
  
  @js.native
  sealed trait compact
    extends StObject
       with Size
  /* "compact" */ val compact: typings.wixUiCore.captchaTypesMod.Size.compact & String = js.native
  
  @js.native
  sealed trait normal
    extends StObject
       with Size
  /* "normal" */ val normal: typings.wixUiCore.captchaTypesMod.Size.normal & String = js.native
}
