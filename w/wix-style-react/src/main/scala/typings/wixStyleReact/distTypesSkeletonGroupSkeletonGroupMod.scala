package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonGroupSkeletonGroupMod {
  
  /** SkeletonGroup */
  @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", JSImport.Default)
  @js.native
  open class default protected () extends SkeletonGroup {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", "default.defaultProps.skin_1")
      @js.native
      val skin1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", "default.propTypes.backgroundColor")
      @js.native
      val backgroundColor: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SkeletonGroup/SkeletonGroup", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
    }
  }
  
  /** SkeletonGroup */
  @js.native
  trait SkeletonGroup extends PureComponent[Any, Any, Any]
}
