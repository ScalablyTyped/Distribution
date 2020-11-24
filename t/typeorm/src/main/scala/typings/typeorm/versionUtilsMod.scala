package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/util/VersionUtils", JSImport.Namespace)
@js.native
object versionUtilsMod extends js.Object {
  
  @js.native
  class VersionUtils () extends js.Object
  /* static members */
  @js.native
  object VersionUtils extends js.Object {
    
    def isGreaterOrEqual(version: String, targetVersion: String): Boolean = js.native
  }
  
  type Version = js.Tuple3[Double, Double, Double]
}
