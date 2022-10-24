package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.HoveredStarIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStarsRatingBarStarsRatingBarMod {
  
  /** Star Rating Component  */
  @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", JSImport.Default)
  @js.native
  open class default protected () extends StarsRatingBar {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.defaultProps.readOnly_1")
      @js.native
      val readOnly1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.descriptionValues")
      @js.native
      val descriptionValues: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StarsRatingBar/StarsRatingBar", "default.propTypes.value")
      @js.native
      val value: Validator[Double] = js.native
    }
  }
  
  /** Star Rating Component  */
  @js.native
  trait StarsRatingBar extends PureComponent[Any, Any, Any] {
    
    def _getInteractiveModeStarsSize(): String = js.native
    
    def _getReadOnlyModeStarsSize(): Any = js.native
    
    def _getStarsRatingBarSize(): Any = js.native
    
    def _handleBlur(): Unit = js.native
    
    def _handleFocus(ratingValue: Any): Unit = js.native
    
    def _onMouseEnter(ratingValue: Any): Unit = js.native
    
    def _onMouseLeave(): Unit = js.native
    
    def _onStarIconClick(ratingValue: Any): Unit = js.native
    
    def _renderRateCaption(): Element = js.native
    
    def _renderReadOnlyModeStar(ratingValue: Any): Element = js.native
    
    def _renderStars(): js.Array[Element] = js.native
    
    def _shouldShowRateCaption(): Boolean = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MStarsRatingBar(prevProps: Any): Unit = js.native
    
    @JSName("state")
    var state_StarsRatingBar: HoveredStarIndex = js.native
  }
}
