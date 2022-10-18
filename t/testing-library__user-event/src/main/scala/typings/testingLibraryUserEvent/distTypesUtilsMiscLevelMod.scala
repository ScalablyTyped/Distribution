package typings.testingLibraryUserEvent

import typings.std.Record
import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMiscLevelMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/level", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ApiLevel extends StObject
  @JSImport("@testing-library/user-event/dist/types/utils/misc/level", "ApiLevel")
  @js.native
  object ApiLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApiLevel & Double] = js.native
    
    @js.native
    sealed trait Call
      extends StObject
         with ApiLevel
    /* 1 */ val Call: typings.testingLibraryUserEvent.distTypesUtilsMiscLevelMod.ApiLevel.Call & Double = js.native
    
    @js.native
    sealed trait Trigger
      extends StObject
         with ApiLevel
    /* 2 */ val Trigger: typings.testingLibraryUserEvent.distTypesUtilsMiscLevelMod.ApiLevel.Trigger & Double = js.native
  }
  
  inline def getLevelRef(instance: Instance, level: ApiLevel): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLevelRef")(instance.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def setLevelRef(instance: Instance, level: ApiLevel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLevelRef")(instance.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type LevelRefs = Record[ApiLevel, js.UndefOr[js.Object]]
}
