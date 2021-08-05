package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportMode extends StObject {
  
  var supportMode: js.Array[String]
}
object SupportMode {
  
  inline def apply(supportMode: js.Array[String]): SupportMode = {
    val __obj = js.Dynamic.literal(supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
  
  extension [Self <: SupportMode](x: Self) {
    
    inline def setSupportMode(value: js.Array[String]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
    
    inline def setSupportModeVarargs(value: String*): Self = StObject.set(x, "supportMode", js.Array(value :_*))
  }
}
