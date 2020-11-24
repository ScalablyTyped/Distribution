package typings.typeorm.anon

import typings.typeorm.metadataArgsEntityListenerMetadataArgsMod.EntityListenerMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedMetadataEntityMetadata extends js.Object {
  
  var args: EntityListenerMetadataArgs = js.native
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object EmbeddedMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: EntityListenerMetadataArgs,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): EmbeddedMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class EmbeddedMetadataEntityMetadataOps[Self <: EmbeddedMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: EntityListenerMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = this.set("embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedMetadata: Self = this.set("embeddedMetadata", js.undefined)
  }
}
