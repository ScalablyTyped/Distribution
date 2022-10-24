package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.compact
import typings.wixStyleReact.wixStyleReactStrings.input
import typings.wixStyleReact.wixStyleReactStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationPaginationCoreConstantsMod {
  
  @js.native
  sealed trait DataHooks extends StObject
  @JSImport("wix-style-react/dist/types/Pagination/PaginationCore/constants", "DataHooks")
  @js.native
  object DataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHooks & String] = js.native
    
    @js.native
    sealed trait currentPage
      extends StObject
         with DataHooks
    /* "current-page" */ val currentPage: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.currentPage & String = js.native
    
    @js.native
    sealed trait first
      extends StObject
         with DataHooks
    /* "first" */ val first: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.first & String = js.native
    
    @js.native
    sealed trait last
      extends StObject
         with DataHooks
    /* "last" */ val last: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.last & String = js.native
    
    @js.native
    sealed trait next
      extends StObject
         with DataHooks
    /* "next" */ val next: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.next & String = js.native
    
    @js.native
    sealed trait page
      extends StObject
         with DataHooks
    /* "page" */ val page: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.page & String = js.native
    
    @js.native
    sealed trait pageCompact
      extends StObject
         with DataHooks
    /* "page-compact" */ val pageCompact: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.pageCompact & String = js.native
    
    @js.native
    sealed trait pageForm
      extends StObject
         with DataHooks
    /* "page-form" */ val pageForm: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.pageForm & String = js.native
    
    @js.native
    sealed trait pageInput
      extends StObject
         with DataHooks
    /* "page-input" */ val pageInput: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.pageInput & String = js.native
    
    @js.native
    sealed trait pageStrip
      extends StObject
         with DataHooks
    /* "page-strip" */ val pageStrip: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.pageStrip & String = js.native
    
    @js.native
    sealed trait previous
      extends StObject
         with DataHooks
    /* "previous" */ val previous: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.previous & String = js.native
    
    @js.native
    sealed trait slashLabel
      extends StObject
         with DataHooks
    /* "slash-label" */ val slashLabel: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.slashLabel & String = js.native
    
    @js.native
    sealed trait totalPages
      extends StObject
         with DataHooks
    /* "total-pages" */ val totalPages: typings.wixStyleReact.distTypesPaginationPaginationCoreConstantsMod.DataHooks.totalPages & String = js.native
  }
  
  type PageStripLayout = js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.pages
    - typings.wixStyleReact.wixStyleReactStrings.compact
    - typings.wixStyleReact.wixStyleReactStrings.input
  */
  trait PaginationCoreMode extends StObject
  object PaginationCoreMode {
    
    inline def Compact: compact = "compact".asInstanceOf[compact]
    
    inline def Input: input = "input".asInstanceOf[input]
    
    inline def Pages: pages = "pages".asInstanceOf[pages]
  }
}
