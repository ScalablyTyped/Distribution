package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryOptionsFactory extends js.Object {
  
  def createCommonFileQuery(query: CommonFileQuery, fileTypeFilter: IIterable[String]): QueryOptions = js.native
  
  def createCommonFolderQuery(query: CommonFolderQuery): QueryOptions = js.native
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
  
  @scala.inline
  implicit class IQueryOptionsFactoryOps[Self <: IQueryOptionsFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateCommonFileQuery(value: (CommonFileQuery, IIterable[String]) => QueryOptions): Self = this.set("createCommonFileQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCommonFolderQuery(value: CommonFolderQuery => QueryOptions): Self = this.set("createCommonFolderQuery", js.Any.fromFunction1(value))
  }
}
