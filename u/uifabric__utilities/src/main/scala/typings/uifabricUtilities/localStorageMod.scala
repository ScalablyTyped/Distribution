package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/localStorage", JSImport.Namespace)
@js.native
object localStorageMod extends js.Object {
  
  def getItem(key: String): String | Null = js.native
  
  def setItem(key: String, data: String): Unit = js.native
}
