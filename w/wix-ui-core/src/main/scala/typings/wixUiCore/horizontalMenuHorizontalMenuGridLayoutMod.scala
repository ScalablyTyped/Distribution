package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiCore.anon.PickPickHorizontalMenuGri
import typings.wixUiCore.horizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod.HorizontalMenuGridLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuHorizontalMenuGridLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-grid-layout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuGri] = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-grid-layout", "HorizontalMenuGridLayout")
  @js.native
  class HorizontalMenuGridLayout protected ()
    extends typings.wixUiCore.horizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod.HorizontalMenuGridLayout {
    def this(props: HorizontalMenuGridLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuGridLayoutProps, context: js.Any) = this()
  }
  /* static members */
  object HorizontalMenuGridLayout {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-grid-layout", "HorizontalMenuGridLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/horizontal-menu/horizontal-menu-grid-layout", "HorizontalMenuGridLayout.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type _To = FC[PickPickHorizontalMenuGri]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalMenuHorizontalMenuGridLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuGri] = default
}
