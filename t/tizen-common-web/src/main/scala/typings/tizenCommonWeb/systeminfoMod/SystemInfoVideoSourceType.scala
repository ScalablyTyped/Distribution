package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoVideoSourceType extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoVideoSourceType")
@js.native
object SystemInfoVideoSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoVideoSourceType & String] = js.native
  
  @js.native
  sealed trait AV
    extends StObject
       with SystemInfoVideoSourceType
  /* "AV" */ val AV: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.AV & String = js.native
  
  @js.native
  sealed trait COMP
    extends StObject
       with SystemInfoVideoSourceType
  /* "COMP" */ val COMP: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.COMP & String = js.native
  
  @js.native
  sealed trait DVI
    extends StObject
       with SystemInfoVideoSourceType
  /* "DVI" */ val DVI: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.DVI & String = js.native
  
  @js.native
  sealed trait HDMI
    extends StObject
       with SystemInfoVideoSourceType
  /* "HDMI" */ val HDMI: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.HDMI & String = js.native
  
  @js.native
  sealed trait MEDIA
    extends StObject
       with SystemInfoVideoSourceType
  /* "MEDIA" */ val MEDIA: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.MEDIA & String = js.native
  
  @js.native
  sealed trait PC
    extends StObject
       with SystemInfoVideoSourceType
  /* "PC" */ val PC: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.PC & String = js.native
  
  @js.native
  sealed trait SCART
    extends StObject
       with SystemInfoVideoSourceType
  /* "SCART" */ val SCART: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.SCART & String = js.native
  
  @js.native
  sealed trait SVIDEO
    extends StObject
       with SystemInfoVideoSourceType
  /* "SVIDEO" */ val SVIDEO: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.SVIDEO & String = js.native
  
  @js.native
  sealed trait TV
    extends StObject
       with SystemInfoVideoSourceType
  /* "TV" */ val TV: typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceType.TV & String = js.native
}
