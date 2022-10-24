package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonFluidColumnsFluidColumnsMod {
  
  /** A fluid columns component*/
  @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", JSImport.Default)
  @js.native
  open class default protected () extends FluidColumns {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", "default.defaultProps.cols_1")
      @js.native
      val cols1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", "default.propTypes.children")
      @js.native
      val children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", "default.propTypes.cols")
      @js.native
      val cols: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/common/FluidColumns/FluidColumns", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
    }
  }
  
  /** A fluid columns component*/
  @js.native
  trait FluidColumns extends PureComponent[Any, Any, Any]
}
