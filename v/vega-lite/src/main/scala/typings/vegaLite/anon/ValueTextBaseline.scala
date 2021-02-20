package typings.vegaLite.anon

import typings.vegaTypings.encodeMod.TextBaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueTextBaseline extends StObject {
  
  var value: TextBaseline = js.native
}
object ValueTextBaseline {
  
  @scala.inline
  def apply(value: TextBaseline): ValueTextBaseline = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTextBaseline]
  }
  
  @scala.inline
  implicit class ValueTextBaselineMutableBuilder[Self <: ValueTextBaseline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: TextBaseline): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
