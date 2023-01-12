package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAlign extends StObject {
  
  var value: typings.vegaTypings.typesSpecEncodeMod.Align
}
object ValueAlign {
  
  inline def apply(value: typings.vegaTypings.typesSpecEncodeMod.Align): ValueAlign = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueAlign] (val x: Self) extends AnyVal {
    
    inline def setValue(value: typings.vegaTypings.typesSpecEncodeMod.Align): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
