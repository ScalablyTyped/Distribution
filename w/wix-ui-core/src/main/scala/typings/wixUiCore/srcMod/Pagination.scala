package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.PartialPaginationProps
import typings.wixUiCore.paginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "Pagination")
@js.native
class Pagination protected ()
  extends typings.wixUiCore.paginationMod.Pagination {
  def this(props: PaginationProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PaginationProps, context: js.Any) = this()
}
/* static members */
object Pagination {
  
  @JSImport("wix-ui-core/dist/src", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "Pagination.defaultProps")
  @js.native
  def defaultProps: PartialPaginationProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialPaginationProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "Pagination.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
