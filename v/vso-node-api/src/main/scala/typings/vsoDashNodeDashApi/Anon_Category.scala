package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: Double
  var contributionType: Double
  var displayName: Double
  var excludeWithFlags: Double
  var featured: Double
  var featuredInCategory: Double
  var id: Double
  var includeWithFlags: Double
  var installationTarget: Double
  var installationTargetVersion: Double
  var installationTargetVersionRange: Double
  var lcid: Double
  var name: Double
  var `private`: Double
  var searchText: Double
  var tag: Double
  var vsixMetadata: Double
}

object Anon_Category {
  @scala.inline
  def apply(
    category: Double,
    contributionType: Double,
    displayName: Double,
    excludeWithFlags: Double,
    featured: Double,
    featuredInCategory: Double,
    id: Double,
    includeWithFlags: Double,
    installationTarget: Double,
    installationTargetVersion: Double,
    installationTargetVersionRange: Double,
    lcid: Double,
    name: Double,
    `private`: Double,
    searchText: Double,
    tag: Double,
    vsixMetadata: Double
  ): Anon_Category = {
    val __obj = js.Dynamic.literal(category = category, contributionType = contributionType, displayName = displayName, excludeWithFlags = excludeWithFlags, featured = featured, featuredInCategory = featuredInCategory, id = id, includeWithFlags = includeWithFlags, installationTarget = installationTarget, installationTargetVersion = installationTargetVersion, installationTargetVersionRange = installationTargetVersionRange, lcid = lcid, name = name, searchText = searchText, tag = tag, vsixMetadata = vsixMetadata)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Anon_Category]
  }
}

