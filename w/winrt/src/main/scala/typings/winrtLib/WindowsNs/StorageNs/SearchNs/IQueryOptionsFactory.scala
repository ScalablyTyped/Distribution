package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryOptionsFactory extends js.Object {
  def createCommonFileQuery(
    query: CommonFileQuery,
    fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): QueryOptions
  def createCommonFolderQuery(query: CommonFolderQuery): QueryOptions
}

