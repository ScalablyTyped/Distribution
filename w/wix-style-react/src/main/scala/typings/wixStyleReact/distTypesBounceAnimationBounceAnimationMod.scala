package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.AnimationSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBounceAnimationBounceAnimationMod {
  
  /** Bounce Animation*/
  @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", JSImport.Default)
  @js.native
  open class default protected () extends BounceAnimation {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.active")
      @js.native
      val active: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.children")
      @js.native
      val children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.delay")
      @js.native
      val delay: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.loop")
      @js.native
      val loop: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.onEnd")
      @js.native
      val onEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/BounceAnimation/BounceAnimation", "default.propTypes.onStart")
      @js.native
      val onStart: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
  
  /** Bounce Animation*/
  @js.native
  trait BounceAnimation extends PureComponent[Any, Any, Any] {
    
    def _getAnimationSize(): String = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBounceAnimation(): Unit = js.native
    
    var rootRef: RefObject[Any] = js.native
    
    @JSName("state")
    var state_BounceAnimation: AnimationSize = js.native
  }
}
