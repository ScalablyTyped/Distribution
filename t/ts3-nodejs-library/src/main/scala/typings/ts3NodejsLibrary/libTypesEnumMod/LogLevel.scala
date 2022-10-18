package typings.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  /** output that might help find a problem */
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevel
  /* 3 */ val DEBUG: typings.ts3NodejsLibrary.libTypesEnumMod.LogLevel.DEBUG & Double = js.native
  
  /** everything that is really bad */
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  /* 1 */ val ERROR: typings.ts3NodejsLibrary.libTypesEnumMod.LogLevel.ERROR & Double = js.native
  
  /** informational output */
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  /* 4 */ val INFO: typings.ts3NodejsLibrary.libTypesEnumMod.LogLevel.INFO & Double = js.native
  
  /** everything that might be bad */
  @js.native
  sealed trait WARNING
    extends StObject
       with LogLevel
  /* 2 */ val WARNING: typings.ts3NodejsLibrary.libTypesEnumMod.LogLevel.WARNING & Double = js.native
}
