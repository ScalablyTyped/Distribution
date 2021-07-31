package typings.victory.anon

import typings.victory.mod.DomainTuple
import typings.victory.mod._DomainPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X
  extends StObject
     with _DomainPropType {
  
  var x: js.UndefOr[DomainTuple] = js.undefined
  
  var y: DomainTuple
}
object X {
  
  @scala.inline
  def apply(y: DomainTuple): X = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: DomainTuple): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: DomainTuple): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
