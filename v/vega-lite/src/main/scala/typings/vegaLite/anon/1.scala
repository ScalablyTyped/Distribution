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
  
  extension [Self <: `1`](x: Self) {
    
    inline def setAlign(value: SignalRef | typings.vegaTypings.typesSpecEncodeMod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
  }
}
