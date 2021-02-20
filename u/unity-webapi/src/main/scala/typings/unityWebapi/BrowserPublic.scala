package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserPublic extends StObject {
  
  def getUnityObject(version: Double): Unity = js.native
}
object BrowserPublic {
  
  @scala.inline
  def apply(getUnityObject: Double => Unity): BrowserPublic = {
    val __obj = js.Dynamic.literal(getUnityObject = js.Any.fromFunction1(getUnityObject))
    __obj.asInstanceOf[BrowserPublic]
  }
  
  @scala.inline
  implicit class BrowserPublicMutableBuilder[Self <: BrowserPublic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUnityObject(value: Double => Unity): Self = StObject.set(x, "getUnityObject", js.Any.fromFunction1(value))
  }
}
