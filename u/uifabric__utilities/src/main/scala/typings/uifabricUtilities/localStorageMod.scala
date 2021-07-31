package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localStorageMod {
  
  @JSImport("@uifabric/utilities/lib/localStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getItem(key: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def setItem(key: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
