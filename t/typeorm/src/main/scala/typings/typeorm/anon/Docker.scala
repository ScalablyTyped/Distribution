package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Docker extends js.Object {
  
  var docker: Boolean = js.native
}
object Docker {
  
  @scala.inline
  def apply(docker: Boolean): Docker = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docker]
  }
  
  @scala.inline
  implicit class DockerOps[Self <: Docker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocker(value: Boolean): Self = this.set("docker", value.asInstanceOf[js.Any])
  }
}
