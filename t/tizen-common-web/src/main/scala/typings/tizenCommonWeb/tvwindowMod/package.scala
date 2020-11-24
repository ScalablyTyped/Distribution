package typings.tizenCommonWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tvwindowMod {
  
  type AvailableWindowListCallback = js.Function1[/* type */ js.Array[typings.tizenCommonWeb.tvwindowMod.WindowType], scala.Unit]
  
  type SourceChangedSuccessCallback = js.Function2[
    /* source */ typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceInfo, 
    /* type */ typings.tizenCommonWeb.tvwindowMod.WindowType, 
    scala.Unit
  ]
  
  type VideoResolutionChangeCallback = js.Function2[
    /* resolution */ typings.tizenCommonWeb.tvwindowMod.VideoResolution, 
    /* type */ typings.tizenCommonWeb.tvwindowMod.WindowType, 
    scala.Unit
  ]
  
  type WindowRectangleSuccessCallback = js.Function2[
    /* windowRect */ js.Array[java.lang.String], 
    /* type */ typings.tizenCommonWeb.tvwindowMod.WindowType, 
    scala.Unit
  ]
}
