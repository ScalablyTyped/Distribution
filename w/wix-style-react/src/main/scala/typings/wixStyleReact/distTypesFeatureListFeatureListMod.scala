package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFeatureListFeatureListMod {
  
  /** FeatureList is a group of layouts that displays image, description and title. It's used in a footer of a marketing page to list product features. */
  @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", JSImport.Default)
  @js.native
  open class default protected () extends FeatureList {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.defaultProps.cols_1")
      @js.native
      val cols1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.defaultProps.features_1")
      @js.native
      val features1: js.Array[scala.Nothing] = js.native
    }
    
    @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.propTypes.cols")
      @js.native
      val cols: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FeatureList/FeatureList", "default.propTypes.features")
      @js.native
      val features: Requireable[js.Array[js.UndefOr[InferProps[Image] | Null]]] = js.native
    }
  }
  
  /** FeatureList is a group of layouts that displays image, description and title. It's used in a footer of a marketing page to list product features. */
  @js.native
  trait FeatureList extends Component[Any, Any, Any]
}
