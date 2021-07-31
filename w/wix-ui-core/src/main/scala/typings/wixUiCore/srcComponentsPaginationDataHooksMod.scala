package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsPaginationDataHooksMod {
  
  @js.native
  sealed trait PaginationDataHooks extends StObject
  @JSImport("wix-ui-core/src/components/pagination/DataHooks", "PaginationDataHooks")
  @js.native
  object PaginationDataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PaginationDataHooks & String] = js.native
    
    @js.native
    sealed trait currentPage
      extends StObject
         with PaginationDataHooks
    /* "current-page" */ val currentPage: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.currentPage & String = js.native
    
    @js.native
    sealed trait first
      extends StObject
         with PaginationDataHooks
    /* "first" */ val first: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.first & String = js.native
    
    @js.native
    sealed trait last
      extends StObject
         with PaginationDataHooks
    /* "last" */ val last: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.last & String = js.native
    
    @js.native
    sealed trait next
      extends StObject
         with PaginationDataHooks
    /* "next" */ val next: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.next & String = js.native
    
    @js.native
    sealed trait page
      extends StObject
         with PaginationDataHooks
    /* "page" */ val page: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.page & String = js.native
    
    @js.native
    sealed trait pageCompact
      extends StObject
         with PaginationDataHooks
    /* "page-compact" */ val pageCompact: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.pageCompact & String = js.native
    
    @js.native
    sealed trait pageForm
      extends StObject
         with PaginationDataHooks
    /* "page-form" */ val pageForm: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.pageForm & String = js.native
    
    @js.native
    sealed trait pageInput
      extends StObject
         with PaginationDataHooks
    /* "page-input" */ val pageInput: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.pageInput & String = js.native
    
    @js.native
    sealed trait pageStrip
      extends StObject
         with PaginationDataHooks
    /* "page-strip" */ val pageStrip: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.pageStrip & String = js.native
    
    @js.native
    sealed trait previous
      extends StObject
         with PaginationDataHooks
    /* "previous" */ val previous: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.previous & String = js.native
    
    @js.native
    sealed trait slashLabel
      extends StObject
         with PaginationDataHooks
    /* "slash-label" */ val slashLabel: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.slashLabel & String = js.native
    
    @js.native
    sealed trait totalPages
      extends StObject
         with PaginationDataHooks
    /* "total-pages" */ val totalPages: typings.wixUiCore.srcComponentsPaginationDataHooksMod.PaginationDataHooks.totalPages & String = js.native
  }
}
