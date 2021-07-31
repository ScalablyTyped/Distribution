package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationDataHooksMod {
  
  @js.native
  sealed trait PaginationDataHooks extends StObject
  @JSImport("wix-ui-core/dist/src/components/pagination/DataHooks", "PaginationDataHooks")
  @js.native
  object PaginationDataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PaginationDataHooks & String] = js.native
    
    @js.native
    sealed trait currentPage
      extends StObject
         with PaginationDataHooks
    /* "current-page" */ val currentPage: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.currentPage & String = js.native
    
    @js.native
    sealed trait first
      extends StObject
         with PaginationDataHooks
    /* "first" */ val first: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.first & String = js.native
    
    @js.native
    sealed trait last
      extends StObject
         with PaginationDataHooks
    /* "last" */ val last: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.last & String = js.native
    
    @js.native
    sealed trait next
      extends StObject
         with PaginationDataHooks
    /* "next" */ val next: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.next & String = js.native
    
    @js.native
    sealed trait page
      extends StObject
         with PaginationDataHooks
    /* "page" */ val page: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.page & String = js.native
    
    @js.native
    sealed trait pageCompact
      extends StObject
         with PaginationDataHooks
    /* "page-compact" */ val pageCompact: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.pageCompact & String = js.native
    
    @js.native
    sealed trait pageForm
      extends StObject
         with PaginationDataHooks
    /* "page-form" */ val pageForm: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.pageForm & String = js.native
    
    @js.native
    sealed trait pageInput
      extends StObject
         with PaginationDataHooks
    /* "page-input" */ val pageInput: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.pageInput & String = js.native
    
    @js.native
    sealed trait pageStrip
      extends StObject
         with PaginationDataHooks
    /* "page-strip" */ val pageStrip: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.pageStrip & String = js.native
    
    @js.native
    sealed trait previous
      extends StObject
         with PaginationDataHooks
    /* "previous" */ val previous: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.previous & String = js.native
    
    @js.native
    sealed trait slashLabel
      extends StObject
         with PaginationDataHooks
    /* "slash-label" */ val slashLabel: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.slashLabel & String = js.native
    
    @js.native
    sealed trait totalPages
      extends StObject
         with PaginationDataHooks
    /* "total-pages" */ val totalPages: typings.wixUiCore.paginationDataHooksMod.PaginationDataHooks.totalPages & String = js.native
  }
}
