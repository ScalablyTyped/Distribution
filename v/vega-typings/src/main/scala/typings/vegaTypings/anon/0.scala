package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod.LinearGradient
import typings.vegaTypings.typesSpecEncodeMod.RadialGradient
import typings.vegaTypings.typesSpecEncodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with _ColorValueRef {
  
  var value: LinearGradient | RadialGradient
}
object `0` {
  
  inline def apply(value: LinearGradient | RadialGradient): `0` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setValue(value: LinearGradient | RadialGradient): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
