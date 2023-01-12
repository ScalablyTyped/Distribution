package typings.vegaLite.anon

import typings.vegaTypings.typesSpecEncodeMod.TextBaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTextBaseline extends StObject {
  
  var value: TextBaseline
}
object ValueTextBaseline {
  
  inline def apply(value: TextBaseline): ValueTextBaseline = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTextBaseline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueTextBaseline] (val x: Self) extends AnyVal {
    
    inline def setValue(value: TextBaseline): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
