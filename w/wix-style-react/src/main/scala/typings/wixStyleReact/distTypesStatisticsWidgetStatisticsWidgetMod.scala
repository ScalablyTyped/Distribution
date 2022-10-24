package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.InvertedPercentage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatisticsWidgetStatisticsWidgetMod {
  
  @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", JSImport.Default)
  @js.native
  open class default protected () extends StatisticsWidget {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Alignment of inner items (default: center) */
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.propTypes.alignItems")
      @js.native
      def alignItems: Requireable[String] = js.native
      inline def alignItems_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used to create driver in testing */
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Show loader instead of values for all statistic items (default: undefined) */
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.propTypes.isLoading")
      @js.native
      def isLoading: Requireable[Boolean] = js.native
      inline def isLoading_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(x.asInstanceOf[js.Any])
      
      /**
        * Array of statistic items
        *  * `value` - Value of the statistic. Displayed as big text in the first row.
        *  * `valueInShort` - Short version of value. Will be applied when there is no space for long value. If not specified, part of the value will be hidden with ellipsis
        *  * `description` - Description of the statistic. Displayed in the second row.
        *  * `descriptionInfo` - More info about the description. Displayed as an info icon with this text inside a tooltip
        *  * `percentage` - Change in percents. Positive number - arrow up, negative - arrow down.
        *  * `invertedPercentage` - When set to true renders positive percentage in red and negative in green.
        *  * `onClick` - Callback to be executed on click (also on Enter/Space key press)
        *  * `isLoading` - Shows a loader instead of value.
        *  * `children` - Node to render on bottom of section.
        */
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.propTypes.items")
      @js.native
      def items: Requireable[js.Array[js.UndefOr[InferProps[InvertedPercentage] | Null]]] = js.native
      inline def items_=(x: Requireable[js.Array[js.UndefOr[InferProps[InvertedPercentage] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      /** Displayed value size (default: large) */
      @JSImport("wix-style-react/dist/types/StatisticsWidget/StatisticsWidget", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatisticsWidget extends PureComponent[Any, Any, Any] {
    
    def _renderStat(stat: Any, key: Any): Element = js.native
  }
}
