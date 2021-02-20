package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignable extends StObject {
  
  var assignable: Double = js.native
  
  var identity: Double = js.native
  
  var strictSubtype: Double = js.native
  
  var subtype: Double = js.native
}
object Assignable {
  
  @scala.inline
  def apply(assignable: Double, identity: Double, strictSubtype: Double, subtype: Double): Assignable = {
    val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], strictSubtype = strictSubtype.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignable]
  }
  
  @scala.inline
  implicit class AssignableMutableBuilder[Self <: Assignable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignable(value: Double): Self = StObject.set(x, "assignable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictSubtype(value: Double): Self = StObject.set(x, "strictSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: Double): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
  }
}
