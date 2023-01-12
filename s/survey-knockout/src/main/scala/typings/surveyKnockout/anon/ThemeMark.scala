package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeMark extends StObject {
  
  var themeMark: String
}
object ThemeMark {
  
  inline def apply(themeMark: String): ThemeMark = {
    val __obj = js.Dynamic.literal(themeMark = themeMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeMark] (val x: Self) extends AnyVal {
    
    inline def setThemeMark(value: String): Self = StObject.set(x, "themeMark", value.asInstanceOf[js.Any])
  }
}
