package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArtifact extends js.Object {
  /**
    * The artifact ID.
    */
  var id: Double = js.native
  /**
    * The name of the artifact.
    */
  var name: String = js.native
  /**
    * The actual resource.
    */
  var resource: ArtifactResource = js.native
}

object BuildArtifact {
  @scala.inline
  def apply(id: Double, name: String, resource: ArtifactResource): BuildArtifact = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifact]
  }
  @scala.inline
  implicit class BuildArtifactOps[Self <: BuildArtifact] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: ArtifactResource): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
  
}

