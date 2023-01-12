package typings.vegaLite.anon

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var align: SignalRef | typings.vegaTypings.typesSpecEncodeMod.Align
}
object `1` {
  
  inline def apply(align: SignalRef | typings.vegaTypings.typesSpecEncodeMod.Align): `1` = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: SignalRef | typings.vegaTypings.typesSpecEncodeMod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
  }
}
