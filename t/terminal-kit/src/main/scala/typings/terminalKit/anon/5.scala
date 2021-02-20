package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var dst: ^ = js.native
}
object `5` {
  
  @scala.inline
  def apply(dst: ^): `5` = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDst(value: ^): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
  }
}
