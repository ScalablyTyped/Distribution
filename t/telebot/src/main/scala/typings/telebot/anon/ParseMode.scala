package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseMode extends StObject {
  
  var parseMode: js.UndefOr[String] = js.undefined
}
object ParseMode {
  
  inline def apply(): ParseMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseMode] (val x: Self) extends AnyVal {
    
    inline def setParseMode(value: String): Self = StObject.set(x, "parseMode", value.asInstanceOf[js.Any])
    
    inline def setParseModeUndefined: Self = StObject.set(x, "parseMode", js.undefined)
  }
}
