package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var fail: Any
}
object Fail {
  
  inline def apply(fail: Any): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  extension [Self <: Fail](x: Self) {
    
    inline def setFail(value: Any): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
  }
}
