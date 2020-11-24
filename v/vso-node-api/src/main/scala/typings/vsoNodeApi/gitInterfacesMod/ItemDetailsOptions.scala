package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemDetailsOptions extends js.Object {
  
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean = js.native
  
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full) or None for folder items
    */
  var recursionLevel: VersionControlRecursionType = js.native
}
object ItemDetailsOptions {
  
  @scala.inline
  def apply(includeContentMetadata: Boolean, recursionLevel: VersionControlRecursionType): ItemDetailsOptions = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDetailsOptions]
  }
  
  @scala.inline
  implicit class ItemDetailsOptionsOps[Self <: ItemDetailsOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeContentMetadata(value: Boolean): Self = this.set("includeContentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursionLevel(value: VersionControlRecursionType): Self = this.set("recursionLevel", value.asInstanceOf[js.Any])
  }
}
