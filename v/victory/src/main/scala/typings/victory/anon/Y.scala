package typings.victory.anon

import typings.victory.mod.DomainTuple
import typings.victory.mod._DomainPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y
  extends StObject
     with _DomainPropType {
  
  var x: DomainTuple
  
  var y: js.UndefOr[DomainTuple] = js.undefined
}
object Y {
  
  @scala.inline
  def apply(x: DomainTuple): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: DomainTuple): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: DomainTuple): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
