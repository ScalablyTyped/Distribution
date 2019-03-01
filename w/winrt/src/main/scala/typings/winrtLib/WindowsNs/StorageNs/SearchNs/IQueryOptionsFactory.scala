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
    createCommonFileQuery: js.Function2[
      CommonFileQuery, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      QueryOptions
    ],
    createCommonFolderQuery: js.Function1[CommonFolderQuery, QueryOptions]
  ): IQueryOptionsFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCommonFileQuery")(createCommonFileQuery)
    __obj.updateDynamic("createCommonFolderQuery")(createCommonFolderQuery)
    __obj.asInstanceOf[IQueryOptionsFactory]
  }
}

