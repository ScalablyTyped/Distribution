package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Docker extends StObject {
  
  var docker: Boolean
}
object Docker {
  
  inline def apply(docker: Boolean): Docker = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docker]
  }
  
  extension [Self <: Docker](x: Self) {
    
    inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
  }
}
