package typings.wxServerSdk.mod

import typings.wxServerSdk.wxServerSdkStrings.i
import typings.wxServerSdk.wxServerSdkStrings.m
import typings.wxServerSdk.wxServerSdkStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpOptions extends StObject {
  
  // 正则表达式，字符串形式
  var options: i | m | s
  
  var regexp: String
}
object RegExpOptions {
  
  @scala.inline
  def apply(options: i | m | s, regexp: String): RegExpOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpOptions]
  }
  
  @scala.inline
  implicit class RegExpOptionsMutableBuilder[Self <: RegExpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: i | m | s): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
