package typings.swiftclick

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwiftClickStatic extends StObject {
  
  def attach(contextEl: Element): SwiftClickObject
}
object SwiftClickStatic {
  
  inline def apply(attach: Element => SwiftClickObject): SwiftClickStatic = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
    __obj.asInstanceOf[SwiftClickStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwiftClickStatic] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: Element => SwiftClickObject): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
  }
}
