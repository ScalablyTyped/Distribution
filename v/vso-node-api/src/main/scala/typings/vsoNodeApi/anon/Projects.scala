package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projects extends StObject {
  
  var none: scala.Double = js.native
  
  var projects: scala.Double = js.native
}
object Projects {
  
  @scala.inline
  def apply(none: scala.Double, projects: scala.Double): Projects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projects]
  }
  
  @scala.inline
  implicit class ProjectsMutableBuilder[Self <: Projects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjects(value: scala.Double): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}
