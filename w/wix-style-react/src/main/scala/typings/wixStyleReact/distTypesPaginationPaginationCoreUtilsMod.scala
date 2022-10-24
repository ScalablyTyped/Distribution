package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.anon.Container
import typings.wixStyleReact.anon.CurrentPage
import typings.wixStyleReact.anon.MaxPagesToShow
import typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.PageStripLayout
import typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.PaginationCoreMode
import typings.wixStyleReact.wixStyleReactStrings.compact
import typings.wixStyleReact.wixStyleReactStrings.input
import typings.wixStyleReact.wixStyleReactStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationPaginationCoreUtilsMod {
  
  @JSImport("wix-style-react/dist/types/Pagination/PaginationCore/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateWidth(totalPages: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateWidth")(totalPages.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createResponsiveLayout(param0: Container): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponsiveLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  inline def createResponsiveLayoutTemplate(param0: CurrentPage): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponsiveLayoutTemplate")(param0.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  inline def createStaticLayout(param0: MaxPagesToShow): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  inline def getId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
  inline def getId(idPrefix: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(idPrefix.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getId(idPrefix: String, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getId")(idPrefix.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getId(idPrefix: Unit, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getId")(idPrefix.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def measureAndSetRootMinWidth(compNode: HTMLElement, paginationMode: PaginationCoreMode | compact | input | pages): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measureAndSetRootMinWidth")(compNode.asInstanceOf[js.Any], paginationMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def measureAndSetRootMinWidth(
    compNode: HTMLElement,
    paginationMode: PaginationCoreMode | compact | input | pages,
    idPrefix: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measureAndSetRootMinWidth")(compNode.asInstanceOf[js.Any], paginationMode.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
