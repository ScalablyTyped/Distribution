package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alpha extends StObject {
  
  var alpha: Double = js.native
}
object Alpha {
  
  @scala.inline
  def apply(alpha: Double): Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
  
  @scala.inline
  implicit class AlphaMutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
