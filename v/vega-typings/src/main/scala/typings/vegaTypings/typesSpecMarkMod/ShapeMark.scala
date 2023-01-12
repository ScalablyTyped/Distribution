package typings.vegaTypings.typesSpecMarkMod

import typings.vegaTypings.typesSpecEncodeMod.Encodable
import typings.vegaTypings.typesSpecEncodeMod.ShapeEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeMark
  extends StObject
     with BaseMark
     with Encodable[ShapeEncodeEntry]
     with Mark {
  
  var `type`: shape
}
object ShapeMark {
  
  inline def apply(): ShapeMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shape")
    __obj.asInstanceOf[ShapeMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeMark] (val x: Self) extends AnyVal {
    
    inline def setType(value: shape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
