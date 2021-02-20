package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.ShapeEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeMark
  extends BaseMark
     with Encodable[ShapeEncodeEntry]
     with Mark {
  
  var `type`: shape = js.native
}
object ShapeMark {
  
  @scala.inline
  def apply(`type`: shape): ShapeMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeMark]
  }
  
  @scala.inline
  implicit class ShapeMarkMutableBuilder[Self <: ShapeMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: shape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
