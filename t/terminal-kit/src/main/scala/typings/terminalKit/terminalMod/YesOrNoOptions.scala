package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YesOrNoOptions extends StObject {
  
  var echoNo: js.UndefOr[String] = js.undefined
  
  var echoYes: js.UndefOr[String] = js.undefined
  
  var no: String | js.Array[String]
  
  var yes: String | js.Array[String]
}
object YesOrNoOptions {
  
  @scala.inline
  def apply(no: String | js.Array[String], yes: String | js.Array[String]): YesOrNoOptions = {
    val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], yes = yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[YesOrNoOptions]
  }
  
  @scala.inline
  implicit class YesOrNoOptionsMutableBuilder[Self <: YesOrNoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEchoNo(value: String): Self = StObject.set(x, "echoNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoNoUndefined: Self = StObject.set(x, "echoNo", js.undefined)
    
    @scala.inline
    def setEchoYes(value: String): Self = StObject.set(x, "echoYes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoYesUndefined: Self = StObject.set(x, "echoYes", js.undefined)
    
    @scala.inline
    def setNo(value: String | js.Array[String]): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoVarargs(value: String*): Self = StObject.set(x, "no", js.Array(value :_*))
    
    @scala.inline
    def setYes(value: String | js.Array[String]): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYesVarargs(value: String*): Self = StObject.set(x, "yes", js.Array(value :_*))
  }
}
