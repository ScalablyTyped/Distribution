package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactMetadata extends js.Object {
  
  /**
    * Sets alias of artifact.
    */
  var alias: String = js.native
  
  /**
    * Sets instance reference of artifact. e.g. for build artifact it is build number.
    */
  var instanceReference: BuildVersion = js.native
}
object ArtifactMetadata {
  
  @scala.inline
  def apply(alias: String, instanceReference: BuildVersion): ArtifactMetadata = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], instanceReference = instanceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactMetadata]
  }
  
  @scala.inline
  implicit class ArtifactMetadataOps[Self <: ArtifactMetadata] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceReference(value: BuildVersion): Self = this.set("instanceReference", value.asInstanceOf[js.Any])
  }
}
