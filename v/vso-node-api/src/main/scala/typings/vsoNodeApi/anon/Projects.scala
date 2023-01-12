package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projects extends StObject {
  
  var none: scala.Double
  
  var projects: scala.Double
}
object Projects {
  
  inline def apply(none: scala.Double, projects: scala.Double): Projects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projects] (val x: Self) extends AnyVal {
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setProjects(value: scala.Double): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}
