package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 实例化参数类型 */
trait Options extends StObject {
  
  var SDKAppID: Double
}
object Options {
  
  inline def apply(SDKAppID: Double): Options = {
    val __obj = js.Dynamic.literal(SDKAppID = SDKAppID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setSDKAppID(value: Double): Self = StObject.set(x, "SDKAppID", value.asInstanceOf[js.Any])
  }
}
