package typings.wixUiCore

import typings.wixUiCore.anon.PartialPaginationPropsClassName
import typings.wixUiCore.componentsPaginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPaginationMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/pagination", "Pagination")
  @js.native
  class Pagination protected ()
    extends typings.wixUiCore.componentsPaginationPaginationMod.Pagination {
    def this(props: PaginationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginationProps, context: js.Any) = this()
  }
  /* static members */
  object Pagination {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/pagination", "Pagination")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/pagination", "Pagination.defaultProps")
    @js.native
    def defaultProps: PartialPaginationPropsClassName = js.native
    inline def defaultProps_=(x: PartialPaginationPropsClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/pagination", "Pagination.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
