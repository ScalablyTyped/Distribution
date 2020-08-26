package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JenkinsArtifactDownloadInput extends ArtifactDownloadInputBase {
  var artifactItems: js.Array[String] = js.native
}

object JenkinsArtifactDownloadInput {
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactItems: js.Array[String], artifactType: String): JenkinsArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactItems = artifactItems.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsArtifactDownloadInput]
  }
  @scala.inline
  implicit class JenkinsArtifactDownloadInputOps[Self <: JenkinsArtifactDownloadInput] (val x: Self) extends AnyVal {
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
    def setArtifactItemsVarargs(value: String*): Self = this.set("artifactItems", js.Array(value :_*))
    @scala.inline
    def setArtifactItems(value: js.Array[String]): Self = this.set("artifactItems", value.asInstanceOf[js.Any])
  }
  
}

