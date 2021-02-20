package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreRange extends StObject {
  
  var ignoreRange: js.UndefOr[Boolean] = js.native
}
object IgnoreRange {
  
  @scala.inline
  def apply(): IgnoreRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRange]
  }
  
  @scala.inline
  implicit class IgnoreRangeMutableBuilder[Self <: IgnoreRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
  }
}
