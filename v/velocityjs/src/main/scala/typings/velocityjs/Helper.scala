package typings.velocityjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Helper extends StObject {
  
  def getRefText(ast: VELOCITY_AST): String
}
object Helper {
  
  inline def apply(getRefText: VELOCITY_AST => String): Helper = {
    val __obj = js.Dynamic.literal(getRefText = js.Any.fromFunction1(getRefText))
    __obj.asInstanceOf[Helper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Helper] (val x: Self) extends AnyVal {
    
    inline def setGetRefText(value: VELOCITY_AST => String): Self = StObject.set(x, "getRefText", js.Any.fromFunction1(value))
  }
}
