package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var category: scala.Double
  var contributionType: scala.Double
  var displayName: scala.Double
  var excludeWithFlags: scala.Double
  var featured: scala.Double
  var featuredInCategory: scala.Double
  var id: scala.Double
  var includeWithFlags: scala.Double
  var installationTarget: scala.Double
  var installationTargetVersion: scala.Double
  var installationTargetVersionRange: scala.Double
  var lcid: scala.Double
  var name: scala.Double
  var `private`: scala.Double
  var searchText: scala.Double
  var tag: scala.Double
  var vsixMetadata: scala.Double
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
}

