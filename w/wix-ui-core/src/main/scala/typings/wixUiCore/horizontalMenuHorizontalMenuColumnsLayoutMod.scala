package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiCore.anon.ColumnsNumber
import typings.wixUiCore.anon.PickPickHorizontalMenuColClassName
import typings.wixUiCore.horizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuHorizontalMenuColumnsLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-columns-layout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuColClassName] = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout")
  @js.native
  class HorizontalMenuColumnsLayout protected ()
    extends typings.wixUiCore.horizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayout {
    def this(props: HorizontalMenuColumnsLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuColumnsLayoutProps, context: js.Any) = this()
  }
  /* static members */
  object HorizontalMenuColumnsLayout {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout.defaultProps")
    @js.native
    def defaultProps: ColumnsNumber = js.native
    inline def defaultProps_=(x: ColumnsNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-columns-layout", "HorizontalMenuColumnsLayout.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type _To = FC[PickPickHorizontalMenuColClassName]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalMenuHorizontalMenuColumnsLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuColClassName] = default
}
