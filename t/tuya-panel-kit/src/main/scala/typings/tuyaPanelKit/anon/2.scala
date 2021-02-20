package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[Data] extends StObject {
  
  val data: js.UndefOr[Data] = js.native
}
object `2` {
  
  @scala.inline
  def apply[Data](): `2`[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[Data]]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`[_], Data] (val x: Self with `2`[Data]) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
