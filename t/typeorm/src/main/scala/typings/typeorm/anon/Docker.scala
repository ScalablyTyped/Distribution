package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Docker extends StObject {
  
  var docker: Boolean
}
object Docker {
  
  @scala.inline
  def apply(docker: Boolean): Docker = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docker]
  }
  
  @scala.inline
  implicit class DockerMutableBuilder[Self <: Docker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
  }
}
