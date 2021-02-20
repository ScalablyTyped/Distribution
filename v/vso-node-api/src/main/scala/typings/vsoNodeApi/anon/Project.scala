package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Project extends StObject {
  
  var project: scala.Double = js.native
  
  var projectCollection: scala.Double = js.native
}
object Project {
  
  @scala.inline
  def apply(project: scala.Double, projectCollection: scala.Double): Project = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectCollection = projectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: scala.Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectCollection(value: scala.Double): Self = StObject.set(x, "projectCollection", value.asInstanceOf[js.Any])
  }
}
