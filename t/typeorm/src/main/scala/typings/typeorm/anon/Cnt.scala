package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cnt extends StObject {
  
  var cnt: js.Any
  
  var parentId: js.Any
}
object Cnt {
  
  @scala.inline
  def apply(cnt: js.Any, parentId: js.Any): Cnt = {
    val __obj = js.Dynamic.literal(cnt = cnt.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cnt]
  }
  
  @scala.inline
  implicit class CntMutableBuilder[Self <: Cnt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCnt(value: js.Any): Self = StObject.set(x, "cnt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
