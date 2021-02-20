package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionStorageMod {
  
  @JSImport("@uifabric/utilities/lib/sessionStorage", "getItem")
  @js.native
  def getItem(key: String): String | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/sessionStorage", "setItem")
  @js.native
  def setItem(key: String, data: String): Unit = js.native
}
