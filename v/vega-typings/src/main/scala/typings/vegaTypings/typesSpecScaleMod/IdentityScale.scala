package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityScale
  extends StObject
     with BaseScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  @JSName("type")
  var type_IdentityScale: identity
}
object IdentityScale {
  
  inline def apply(name: String): IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[IdentityScale]
  }
  
  extension [Self <: IdentityScale](x: Self) {
    
    inline def setNice(value: Boolean | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setType(value: identity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
