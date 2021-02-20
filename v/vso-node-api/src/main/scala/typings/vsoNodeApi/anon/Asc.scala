package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asc extends StObject {
  
  var asc: scala.Double = js.native
  
  var desc: scala.Double = js.native
}
object Asc {
  
  @scala.inline
  def apply(asc: scala.Double, desc: scala.Double): Asc = {
    val __obj = js.Dynamic.literal(asc = asc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asc]
  }
  
  @scala.inline
  implicit class AscMutableBuilder[Self <: Asc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsc(value: scala.Double): Self = StObject.set(x, "asc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: scala.Double): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
