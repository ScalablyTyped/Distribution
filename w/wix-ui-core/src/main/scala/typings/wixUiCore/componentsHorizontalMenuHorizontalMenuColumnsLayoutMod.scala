package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiCore.anon.ColumnsNumber
import typings.wixUiCore.anon.PickPickHorizontalMenuColColumnGap
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHorizontalMenuHorizontalMenuColumnsLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-columns-layout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuColColumnGap] = js.native
  
  @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout")
  @js.native
  class HorizontalMenuColumnsLayout protected ()
    extends typings.wixUiCore.componentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayout {
    def this(props: HorizontalMenuColumnsLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuColumnsLayoutProps, context: js.Any) = this()
  }
  /* static members */
  object HorizontalMenuColumnsLayout {
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout.defaultProps")
    @js.native
    def defaultProps: ColumnsNumber = js.native
    @scala.inline
    def defaultProps_=(x: ColumnsNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type _To = FC[PickPickHorizontalMenuColColumnGap]
  
  /* This means you don't have to write `default`, but can instead just say `componentsHorizontalMenuHorizontalMenuColumnsLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuColColumnGap] = default
}
