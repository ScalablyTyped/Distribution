package typings.vegaTypings.typesSpecMarkMod

import typings.vegaTypings.typesSpecEncodeMod.AreaEncodeEntry
import typings.vegaTypings.typesSpecEncodeMod.Encodable
import typings.vegaTypings.vegaTypingsStrings.area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMark
  extends StObject
     with BaseMark
     with Encodable[AreaEncodeEntry]
     with Mark {
  
  var `type`: area
}
object AreaMark {
  
  inline def apply(): AreaMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("area")
    __obj.asInstanceOf[AreaMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaMark] (val x: Self) extends AnyVal {
    
    inline def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
