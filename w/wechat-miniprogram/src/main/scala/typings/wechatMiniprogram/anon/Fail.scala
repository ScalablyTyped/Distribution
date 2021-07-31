package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var fail: js.Any
}
object Fail {
  
  @scala.inline
  def apply(fail: js.Any): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  @scala.inline
  implicit class FailMutableBuilder[Self <: Fail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFail(value: js.Any): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
  }
}
