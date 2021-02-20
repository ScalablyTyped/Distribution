package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipNulls extends StObject {
  
  var skipNulls: js.UndefOr[Boolean] = js.native
}
object SkipNulls {
  
  @scala.inline
  def apply(): SkipNulls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipNulls]
  }
  
  @scala.inline
  implicit class SkipNullsMutableBuilder[Self <: SkipNulls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkipNulls(value: Boolean): Self = StObject.set(x, "skipNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipNullsUndefined: Self = StObject.set(x, "skipNulls", js.undefined)
  }
}
