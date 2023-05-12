package typings.twitterCldr.anon

import typings.twitterCldr.twitterCldrStrings.LTR
import typings.twitterCldr.twitterCldrStrings.RTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var direction: LTR | RTL
}
object `4` {
  
  inline def apply(direction: LTR | RTL): `4` = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: LTR | RTL): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
