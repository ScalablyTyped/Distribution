package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoVideoSourceType extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoVideoSourceType")
@js.native
object SystemInfoVideoSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoVideoSourceType with String] = js.native
  
  @js.native
  sealed trait AV extends SystemInfoVideoSourceType
  /* "AV" */ val AV: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.AV with String = js.native
  
  @js.native
  sealed trait COMP extends SystemInfoVideoSourceType
  /* "COMP" */ val COMP: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.COMP with String = js.native
  
  @js.native
  sealed trait DVI extends SystemInfoVideoSourceType
  /* "DVI" */ val DVI: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.DVI with String = js.native
  
  @js.native
  sealed trait HDMI extends SystemInfoVideoSourceType
  /* "HDMI" */ val HDMI: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.HDMI with String = js.native
  
  @js.native
  sealed trait MEDIA extends SystemInfoVideoSourceType
  /* "MEDIA" */ val MEDIA: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.MEDIA with String = js.native
  
  @js.native
  sealed trait PC extends SystemInfoVideoSourceType
  /* "PC" */ val PC: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.PC with String = js.native
  
  @js.native
  sealed trait SCART extends SystemInfoVideoSourceType
  /* "SCART" */ val SCART: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.SCART with String = js.native
  
  @js.native
  sealed trait SVIDEO extends SystemInfoVideoSourceType
  /* "SVIDEO" */ val SVIDEO: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.SVIDEO with String = js.native
  
  @js.native
  sealed trait TV extends SystemInfoVideoSourceType
  /* "TV" */ val TV: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.TV with String = js.native
}
