package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var dst: ^
}
object `5` {
  
  inline def apply(dst: ^): `5` = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setDst(value: ^): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
  }
}
