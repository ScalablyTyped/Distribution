package typings.viewerjs

import typings.std.Element
import typings.viewerjs.Viewer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Viewer protected ()
    extends typings.viewerjs.Viewer {
    def this(element: Element) = this()
    def this(element: Element, options: Options) = this()
  }
  
  /* static members */
  @js.native
  object Viewer extends js.Object {
    def noConflict(): typings.viewerjs.Viewer = js.native
    def setDefaults(options: Options): Unit = js.native
    @js.native
    object ToolbarButtonSize extends js.Object {
      /* "large" */ val Large: typings.viewerjs.Viewer.ToolbarButtonSize.Large with String = js.native
      /* "medium" */ val Medium: typings.viewerjs.Viewer.ToolbarButtonSize.Medium with String = js.native
      /* "small" */ val Small: typings.viewerjs.Viewer.ToolbarButtonSize.Small with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.viewerjs.Viewer.ToolbarButtonSize with String] = js.native
    }
    
    @js.native
    object Visibility extends js.Object {
      /* 0 */ val Hidden: typings.viewerjs.Viewer.Visibility.Hidden with Double = js.native
      /* 1 */ val Visible: typings.viewerjs.Viewer.Visibility.Visible with Double = js.native
      /* 4 */ val VisibleOnExtraLargeOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnExtraLargeOrWiderScreen with Double = js.native
      /* 3 */ val VisibleOnLargeOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnLargeOrWiderScreen with Double = js.native
      /* 2 */ val VisibleOnMediumOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnMediumOrWiderScreen with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.viewerjs.Viewer.Visibility with Double] = js.native
    }
    
  }
  
}

