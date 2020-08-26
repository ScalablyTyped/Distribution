package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoVideoSourceType extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoVideoSourceType")
@js.native
object SystemInfoVideoSourceType extends js.Object {
  @js.native
  sealed trait AV extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait COMP extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait DVI extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait HDMI extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait MEDIA extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait PC extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait SCART extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait SVIDEO extends SystemInfoVideoSourceType
  
  @js.native
  sealed trait TV extends SystemInfoVideoSourceType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoVideoSourceType with String] = js.native
  /* "AV" */ @js.native
  object AV extends TopLevel[AV with String]
  
  /* "COMP" */ @js.native
  object COMP extends TopLevel[COMP with String]
  
  /* "DVI" */ @js.native
  object DVI extends TopLevel[DVI with String]
  
  /* "HDMI" */ @js.native
  object HDMI extends TopLevel[HDMI with String]
  
  /* "MEDIA" */ @js.native
  object MEDIA extends TopLevel[MEDIA with String]
  
  /* "PC" */ @js.native
  object PC extends TopLevel[PC with String]
  
  /* "SCART" */ @js.native
  object SCART extends TopLevel[SCART with String]
  
  /* "SVIDEO" */ @js.native
  object SVIDEO extends TopLevel[SVIDEO with String]
  
  /* "TV" */ @js.native
  object TV extends TopLevel[TV with String]
  
}

