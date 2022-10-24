package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonCircleSkeletonCircleMod {
  
  /** SkeletonCircle */
  @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", JSImport.Default)
  @js.native
  open class default protected () extends SkeletonCircle {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.diameter")
      @js.native
      val diameter: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.margin")
      @js.native
      val margin: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.marginBottom")
      @js.native
      val marginBottom: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.marginLeft")
      @js.native
      val marginLeft: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.marginRight")
      @js.native
      val marginRight: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonCircle/SkeletonCircle", "default.propTypes.marginTop")
      @js.native
      val marginTop: Requireable[String | Double] = js.native
    }
  }
  
  /** SkeletonCircle */
  @js.native
  trait SkeletonCircle extends PureComponent[Any, Any, Any]
}
