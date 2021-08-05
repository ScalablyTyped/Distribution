package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var shrink: js.UndefOr[Width] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setShrink(value: Width): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
