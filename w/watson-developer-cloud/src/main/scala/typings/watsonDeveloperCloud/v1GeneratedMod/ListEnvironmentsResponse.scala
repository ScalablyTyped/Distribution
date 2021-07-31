package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ListEnvironmentsResponse. */
trait ListEnvironmentsResponse extends StObject {
  
  /** An array of [environments] that are available for the service instance. */
  var environments: js.UndefOr[js.Array[Environment]] = js.undefined
}
object ListEnvironmentsResponse {
  
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class ListEnvironmentsResponseMutableBuilder[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: js.Array[Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    @scala.inline
    def setEnvironmentsVarargs(value: Environment*): Self = StObject.set(x, "environments", js.Array(value :_*))
  }
}
