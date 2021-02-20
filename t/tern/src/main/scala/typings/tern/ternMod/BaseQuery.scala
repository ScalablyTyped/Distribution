package typings.tern.ternMod

import typings.tern.ternStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseQuery extends StObject {
  
  var docFormat: js.UndefOr[full] = js.native
  
  var lineCharPositions: js.UndefOr[Boolean] = js.native
  
  var `type`: String = js.native
}
object BaseQuery {
  
  @scala.inline
  def apply(`type`: String): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuery]
  }
  
  @scala.inline
  implicit class BaseQueryMutableBuilder[Self <: BaseQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocFormat(value: full): Self = StObject.set(x, "docFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocFormatUndefined: Self = StObject.set(x, "docFormat", js.undefined)
    
    @scala.inline
    def setLineCharPositions(value: Boolean): Self = StObject.set(x, "lineCharPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCharPositionsUndefined: Self = StObject.set(x, "lineCharPositions", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
