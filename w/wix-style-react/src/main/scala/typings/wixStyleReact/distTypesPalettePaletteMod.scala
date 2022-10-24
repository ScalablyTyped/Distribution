package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPalettePaletteMod {
  
  /** A component to show a palette of colors */
  @JSImport("wix-style-react/dist/types/Palette/Palette", JSImport.Default)
  @js.native
  open class default protected () extends Palette {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Palette/Palette", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Palette/Palette", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Palette/Palette", "default.defaultProps.fill")
      @js.native
      def fill: js.Array[scala.Nothing] = js.native
      inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Palette/Palette", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Palette/Palette", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applies a data-hook HTML attribute that can be used in the tests. */
      @JSImport("wix-style-react/dist/types/Palette/Palette", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Defines an array of fill items for the palette. Accepts solid colors, gradients or images. */
      @JSImport("wix-style-react/dist/types/Palette/Palette", "default.propTypes.fill")
      @js.native
      def fill: Requireable[js.Array[Any]] = js.native
      inline def fill_=(x: Requireable[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    }
  }
  
  /** A component to show a palette of colors */
  @js.native
  trait Palette extends PureComponent[Any, Any, Any]
}
