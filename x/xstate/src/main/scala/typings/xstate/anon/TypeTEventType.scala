package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeTEventType[TEventType /* <: String */] extends StObject {
  
  var `type`: TEventType = js.native
}
object TypeTEventType {
  
  @scala.inline
  def apply[TEventType /* <: String */](`type`: TEventType): TypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeTEventType[TEventType]]
  }
  
  @scala.inline
  implicit class TypeTEventTypeMutableBuilder[Self <: TypeTEventType[_], TEventType /* <: String */] (val x: Self with TypeTEventType[TEventType]) extends AnyVal {
    
    @scala.inline
    def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
