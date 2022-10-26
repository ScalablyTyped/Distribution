package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.IconLabel
import typings.wixStyleReact.anon.LabelEllipsis
import typings.wixStyleReact.anon.Line
import typings.wixStyleReact.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHorizontalTimelineHorizontalTimelineMod {
  
  @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", JSImport.Default)
  @js.native
  open class default protected () extends HorizontalTimeline {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.ActiveIcon")
    @js.native
    def ActiveIcon: js.Function1[/* param0 */ `9`, Element] = js.native
    inline def ActiveIcon_=(x: js.Function1[/* param0 */ `9`, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActiveIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.BoundaryIcon")
    @js.native
    def BoundaryIcon: js.Function1[/* param0 */ `9`, Element] = js.native
    inline def BoundaryIcon_=(x: js.Function1[/* param0 */ `9`, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoundaryIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.CompleteIcon")
    @js.native
    def CompleteIcon: js.Function1[/* param0 */ `9`, Element] = js.native
    inline def CompleteIcon_=(x: js.Function1[/* param0 */ `9`, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompleteIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.DefaultIcon")
    @js.native
    def DefaultIcon: js.Function1[/* param0 */ `9`, Element] = js.native
    inline def DefaultIcon_=(x: js.Function1[/* param0 */ `9`, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.DestructiveIcon")
    @js.native
    def DestructiveIcon: js.Function0[Element] = js.native
    inline def DestructiveIcon_=(x: js.Function0[Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DestructiveIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.defaultProps.alignLabel")
      @js.native
      def alignLabel: String = js.native
      inline def alignLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.defaultProps.items")
      @js.native
      def items: js.Array[scala.Nothing] = js.native
      inline def items_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.propTypes.alignLabel")
      @js.native
      val alignLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.propTypes.items")
      @js.native
      val items: Requireable[js.Array[js.UndefOr[InferProps[IconLabel] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/HorizontalTimeline/HorizontalTimeline", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait HorizontalTimeline extends PureComponent[Any, Any, Any] {
    
    def _renderLabel(param0: LabelEllipsis): Element = js.native
    
    def _renderLine(param0: Line): Element = js.native
  }
}
