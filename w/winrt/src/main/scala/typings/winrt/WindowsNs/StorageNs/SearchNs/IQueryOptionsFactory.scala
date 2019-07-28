package typings.winrt.WindowsNs.StorageNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryOptionsFactory extends js.Object {
  def createCommonFileQuery(query: CommonFileQuery, fileTypeFilter: IIterable[String]): QueryOptions
  def createCommonFolderQuery(query: CommonFolderQuery): QueryOptions
}

object IQueryOptionsFactory {
  @scala.inline
  def apply(
    createCommonFileQuery: (CommonFileQuery, IIterable[String]) => QueryOptions,
    createCommonFolderQuery: CommonFolderQuery => QueryOptions
  ): IQueryOptionsFactory = {
    val __obj = js.Dynamic.literal(createCommonFileQuery = js.Any.fromFunction2(createCommonFileQuery), createCommonFolderQuery = js.Any.fromFunction1(createCommonFolderQuery))
  
    __obj.asInstanceOf[IQueryOptionsFactory]
  }
}

