package typings.uirouterCore.anon

import typings.uirouterCore.stateInterfaceMod.StateOrName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relative extends StObject {
  
  var relative: js.UndefOr[StateOrName] = js.undefined
}
object Relative {
  
  inline def apply(): Relative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relative]
  }
  
  extension [Self <: Relative](x: Self) {
    
    inline def setRelative(value: StateOrName): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
  }
}
