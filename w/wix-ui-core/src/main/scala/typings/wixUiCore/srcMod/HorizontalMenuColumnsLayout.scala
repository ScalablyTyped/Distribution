package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.ColumnsNumber
import typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "HorizontalMenuColumnsLayout")
@js.native
class HorizontalMenuColumnsLayout protected ()
  extends typings.wixUiCore.horizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayout {
  def this(props: HorizontalMenuColumnsLayoutProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: HorizontalMenuColumnsLayoutProps, context: js.Any) = this()
}
/* static members */
object HorizontalMenuColumnsLayout {
  
  @JSImport("wix-ui-core/dist/src", "HorizontalMenuColumnsLayout")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "HorizontalMenuColumnsLayout.defaultProps")
  @js.native
  def defaultProps: ColumnsNumber = js.native
  @scala.inline
  def defaultProps_=(x: ColumnsNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "HorizontalMenuColumnsLayout.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
