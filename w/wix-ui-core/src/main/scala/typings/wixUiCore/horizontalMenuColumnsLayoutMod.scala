package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiCore.anon.ColumnsNumber
import typings.wixUiCore.anon.PickPickHorizontalMenuCol
import typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuColumnsLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuCol] = js.native
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout")
  @js.native
  class HorizontalMenuColumnsLayout protected ()
    extends typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayout {
    def this(props: HorizontalMenuColumnsLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuColumnsLayoutProps, context: js.Any) = this()
  }
  /* static members */
  object HorizontalMenuColumnsLayout {
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout.defaultProps")
    @js.native
    def defaultProps: ColumnsNumber = js.native
    inline def defaultProps_=(x: ColumnsNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type _To = FC[PickPickHorizontalMenuCol]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalMenuColumnsLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuCol] = default
}
