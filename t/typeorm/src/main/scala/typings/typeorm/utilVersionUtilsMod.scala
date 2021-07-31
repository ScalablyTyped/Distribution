package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilVersionUtilsMod {
  
  @JSImport("typeorm/util/VersionUtils", "VersionUtils")
  @js.native
  class VersionUtils () extends StObject
  /* static members */
  object VersionUtils {
    
    @JSImport("typeorm/util/VersionUtils", "VersionUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isGreaterOrEqual(version: String, targetVersion: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGreaterOrEqual")(version.asInstanceOf[js.Any], targetVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  type Version = js.Tuple3[Double, Double, Double]
}
