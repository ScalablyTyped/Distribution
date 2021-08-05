package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  var project: scala.Double
  
  var projectCollection: scala.Double
}
object Project {
  
  inline def apply(project: scala.Double, projectCollection: scala.Double): Project = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectCollection = projectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  extension [Self <: Project](x: Self) {
    
    inline def setProject(value: scala.Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectCollection(value: scala.Double): Self = StObject.set(x, "projectCollection", value.asInstanceOf[js.Any])
  }
}
