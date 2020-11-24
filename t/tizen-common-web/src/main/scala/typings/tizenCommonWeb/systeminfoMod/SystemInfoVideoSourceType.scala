package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoVideoSourceType extends js.Object
@JSImport("tizen-common-web/systeminfo", "SystemInfoVideoSourceType")
@js.native
object SystemInfoVideoSourceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoVideoSourceType with String] = js.native
  
  @js.native
  sealed trait AV extends SystemInfoVideoSourceType
  /* "AV" */ @js.native
  object AV extends TopLevel[AV with String]
  
  @js.native
  sealed trait COMP extends SystemInfoVideoSourceType
  /* "COMP" */ @js.native
  object COMP extends TopLevel[COMP with String]
  
  @js.native
  sealed trait DVI extends SystemInfoVideoSourceType
  /* "DVI" */ @js.native
  object DVI extends TopLevel[DVI with String]
  
  @js.native
  sealed trait HDMI extends SystemInfoVideoSourceType
  /* "HDMI" */ @js.native
  object HDMI extends TopLevel[HDMI with String]
  
  @js.native
  sealed trait MEDIA extends SystemInfoVideoSourceType
  /* "MEDIA" */ @js.native
  object MEDIA extends TopLevel[MEDIA with String]
  
  @js.native
  sealed trait PC extends SystemInfoVideoSourceType
  /* "PC" */ @js.native
  object PC extends TopLevel[PC with String]
  
  @js.native
  sealed trait SCART extends SystemInfoVideoSourceType
  /* "SCART" */ @js.native
  object SCART extends TopLevel[SCART with String]
  
  @js.native
  sealed trait SVIDEO extends SystemInfoVideoSourceType
  /* "SVIDEO" */ @js.native
  object SVIDEO extends TopLevel[SVIDEO with String]
  
  @js.native
  sealed trait TV extends SystemInfoVideoSourceType
  /* "TV" */ @js.native
  object TV extends TopLevel[TV with String]
}
