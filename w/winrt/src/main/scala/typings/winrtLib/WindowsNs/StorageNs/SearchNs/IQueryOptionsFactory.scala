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

object IQueryOptionsFactory {
  @scala.inline
  def apply(
    createCommonFileQuery: (CommonFileQuery, winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) => QueryOptions,
    createCommonFolderQuery: CommonFolderQuery => QueryOptions
  ): IQueryOptionsFactory = {
    val __obj = js.Dynamic.literal(createCommonFileQuery = js.Any.fromFunction2(createCommonFileQuery), createCommonFolderQuery = js.Any.fromFunction1(createCommonFolderQuery))
  
    __obj.asInstanceOf[IQueryOptionsFactory]
  }
}

