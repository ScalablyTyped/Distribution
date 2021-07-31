package typings.wixUiCore

import typings.wixUiCore.anon.CurrentPage
import typings.wixUiCore.anon.MaxPagesToShow
import typings.wixUiCore.anon.ShowFirstPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPageStripLayoutMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/pagination/page-strip-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createResponsiveLayout(hasContainerTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage: ShowFirstPage): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponsiveLayout")(hasContainerTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  @scala.inline
  def createResponsiveLayoutTemplate(hasTotalPagesCurrentPageMaxPagesToShow: MaxPagesToShow): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponsiveLayoutTemplate")(hasTotalPagesCurrentPageMaxPagesToShow.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  @scala.inline
  def createStaticLayout(hasTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage: CurrentPage): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticLayout")(hasTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  type PageStripLayout = js.Array[Double]
}
