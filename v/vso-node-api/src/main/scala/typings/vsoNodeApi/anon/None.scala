package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait None extends StObject {
  
  var none: scala.Double
}
object None {
  
  @scala.inline
  def apply(none: scala.Double): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  
  @scala.inline
  implicit class NoneMutableBuilder[Self <: None] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
