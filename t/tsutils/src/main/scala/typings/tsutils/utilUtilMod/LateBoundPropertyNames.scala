package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LateBoundPropertyNames extends StObject {
  
  var known: Boolean = js.native
  
  var names: js.Array[PropertyName] = js.native
}
object LateBoundPropertyNames {
  
  @scala.inline
  def apply(known: Boolean, names: js.Array[PropertyName]): LateBoundPropertyNames = {
    val __obj = js.Dynamic.literal(known = known.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[LateBoundPropertyNames]
  }
  
  @scala.inline
  implicit class LateBoundPropertyNamesMutableBuilder[Self <: LateBoundPropertyNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnown(value: Boolean): Self = StObject.set(x, "known", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: js.Array[PropertyName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: PropertyName*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
