package typings.tizenCommonWeb.tvwindowMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AspectRatio extends js.Object
@JSImport("tizen-common-web/tvwindow", "AspectRatio")
@js.native
object AspectRatio extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AspectRatio with String] = js.native
  
  @js.native
  sealed trait ASPECT_RATIO_16x9 extends AspectRatio
  /* "ASPECT_RATIO_16x9" */ @js.native
  object ASPECT_RATIO_16x9 extends TopLevel[ASPECT_RATIO_16x9 with String]
  
  @js.native
  sealed trait ASPECT_RATIO_1x1 extends AspectRatio
  /* "ASPECT_RATIO_1x1" */ @js.native
  object ASPECT_RATIO_1x1 extends TopLevel[ASPECT_RATIO_1x1 with String]
  
  @js.native
  sealed trait ASPECT_RATIO_221x100 extends AspectRatio
  /* "ASPECT_RATIO_221x100" */ @js.native
  object ASPECT_RATIO_221x100 extends TopLevel[ASPECT_RATIO_221x100 with String]
  
  @js.native
  sealed trait ASPECT_RATIO_4x3 extends AspectRatio
  /* "ASPECT_RATIO_4x3" */ @js.native
  object ASPECT_RATIO_4x3 extends TopLevel[ASPECT_RATIO_4x3 with String]
  
  @js.native
  sealed trait ASPECT_RATIO_UNKNOWN extends AspectRatio
  /* "ASPECT_RATIO_UNKNOWN" */ @js.native
  object ASPECT_RATIO_UNKNOWN extends TopLevel[ASPECT_RATIO_UNKNOWN with String]
}
