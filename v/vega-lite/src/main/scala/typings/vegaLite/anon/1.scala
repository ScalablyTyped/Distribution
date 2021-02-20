package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.center
import typings.vegaLite.vegaLiteStrings.left
import typings.vegaLite.vegaLiteStrings.right
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var align: left | right | center | SignalRef = js.native
}
object `1` {
  
  @scala.inline
  def apply(align: left | right | center | SignalRef): `1` = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right | center | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
  }
}
