package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends js.Object {
  
  var category: scala.Double = js.native
  
  var contributionType: scala.Double = js.native
  
  var displayName: scala.Double = js.native
  
  var excludeWithFlags: scala.Double = js.native
  
  var featured: scala.Double = js.native
  
  var featuredInCategory: scala.Double = js.native
  
  var id: scala.Double = js.native
  
  var includeWithFlags: scala.Double = js.native
  
  var installationTarget: scala.Double = js.native
  
  var installationTargetVersion: scala.Double = js.native
  
  var installationTargetVersionRange: scala.Double = js.native
  
  var lcid: scala.Double = js.native
  
  var name: scala.Double = js.native
  
  var `private`: scala.Double = js.native
  
  var searchText: scala.Double = js.native
  
  var tag: scala.Double = js.native
  
  var vsixMetadata: scala.Double = js.native
}
object Category {
  
  @scala.inline
  def apply(
    category: scala.Double,
    contributionType: scala.Double,
    displayName: scala.Double,
    excludeWithFlags: scala.Double,
    featured: scala.Double,
    featuredInCategory: scala.Double,
    id: scala.Double,
    includeWithFlags: scala.Double,
    installationTarget: scala.Double,
    installationTargetVersion: scala.Double,
    installationTargetVersionRange: scala.Double,
    lcid: scala.Double,
    name: scala.Double,
    `private`: scala.Double,
    searchText: scala.Double,
    tag: scala.Double,
    vsixMetadata: scala.Double
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], contributionType = contributionType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], excludeWithFlags = excludeWithFlags.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], featuredInCategory = featuredInCategory.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includeWithFlags = includeWithFlags.asInstanceOf[js.Any], installationTarget = installationTarget.asInstanceOf[js.Any], installationTargetVersion = installationTargetVersion.asInstanceOf[js.Any], installationTargetVersionRange = installationTargetVersionRange.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vsixMetadata = vsixMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: scala.Double): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributionType(value: scala.Double): Self = this.set("contributionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: scala.Double): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeWithFlags(value: scala.Double): Self = this.set("excludeWithFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured(value: scala.Double): Self = this.set("featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedInCategory(value: scala.Double): Self = this.set("featuredInCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: scala.Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeWithFlags(value: scala.Double): Self = this.set("includeWithFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTarget(value: scala.Double): Self = this.set("installationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargetVersion(value: scala.Double): Self = this.set("installationTargetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargetVersionRange(value: scala.Double): Self = this.set("installationTargetVersionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: scala.Double): Self = this.set("lcid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: scala.Double): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: scala.Double): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchText(value: scala.Double): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: scala.Double): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsixMetadata(value: scala.Double): Self = this.set("vsixMetadata", value.asInstanceOf[js.Any])
  }
}
