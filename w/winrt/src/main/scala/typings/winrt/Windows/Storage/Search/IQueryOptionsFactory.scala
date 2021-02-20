package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryOptionsFactory extends StObject {
  
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
  implicit class IQueryOptionsFactoryMutableBuilder[Self <: IQueryOptionsFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateCommonFileQuery(value: (CommonFileQuery, IIterable[String]) => QueryOptions): Self = StObject.set(x, "createCommonFileQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCommonFolderQuery(value: CommonFolderQuery => QueryOptions): Self = StObject.set(x, "createCommonFolderQuery", js.Any.fromFunction1(value))
  }
}
