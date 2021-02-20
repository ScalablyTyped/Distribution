package typings.swiftclick

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwiftClickStatic extends StObject {
  
  def attach(contextEl: Element): SwiftClickObject = js.native
}
object SwiftClickStatic {
  
  @scala.inline
  def apply(attach: Element => SwiftClickObject): SwiftClickStatic = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
    __obj.asInstanceOf[SwiftClickStatic]
  }
  
  @scala.inline
  implicit class SwiftClickStaticMutableBuilder[Self <: SwiftClickStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: Element => SwiftClickObject): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
  }
}
