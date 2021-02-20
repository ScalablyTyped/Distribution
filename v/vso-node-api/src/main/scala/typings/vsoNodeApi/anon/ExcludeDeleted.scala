package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeDeleted extends StObject {
  
  var excludeDeleted: scala.Double = js.native
  
  var includeDeleted: scala.Double = js.native
  
  var onlyDeleted: scala.Double = js.native
}
object ExcludeDeleted {
  
  @scala.inline
  def apply(excludeDeleted: scala.Double, includeDeleted: scala.Double, onlyDeleted: scala.Double): ExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], onlyDeleted = onlyDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeDeleted]
  }
  
  @scala.inline
  implicit class ExcludeDeletedMutableBuilder[Self <: ExcludeDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeDeleted(value: scala.Double): Self = StObject.set(x, "excludeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeleted(value: scala.Double): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyDeleted(value: scala.Double): Self = StObject.set(x, "onlyDeleted", value.asInstanceOf[js.Any])
  }
}
