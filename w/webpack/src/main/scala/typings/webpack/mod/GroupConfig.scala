package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfig extends StObject {
  
  def createGroup(arg0: String, arg1: js.Array[Any], arg2: js.Array[Any]): js.Object = js.native
  
  def getKeys(): js.Array[String] = js.native
  def getKeys(arg0: Any): js.Array[String] = js.native
  
  var getOptions: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ js.Array[Any], GroupOptions]] = js.native
}
