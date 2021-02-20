package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeMark extends StObject {
  
  var compositeMark: js.UndefOr[Boolean] = js.native
}
object CompositeMark {
  
  @scala.inline
  def apply(): CompositeMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeMark]
  }
  
  @scala.inline
  implicit class CompositeMarkMutableBuilder[Self <: CompositeMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeMark(value: Boolean): Self = StObject.set(x, "compositeMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeMarkUndefined: Self = StObject.set(x, "compositeMark", js.undefined)
  }
}
