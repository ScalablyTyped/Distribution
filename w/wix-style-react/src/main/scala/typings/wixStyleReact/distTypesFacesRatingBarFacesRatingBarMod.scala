package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.FaceHoveredIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFacesRatingBarFacesRatingBarMod {
  
  /** A rating component that will enable the user to rate on a 1-5 scale. */
  @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", JSImport.Default)
  @js.native
  open class default protected () extends FacesRatingBar {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.defaultProps.maxValue_1")
      @js.native
      val maxValue1: Double = js.native
      
      inline def onChange1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.defaultProps.readOnly_1")
      @js.native
      val readOnly1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.descriptionValues")
      @js.native
      val descriptionValues: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.maxValue")
      @js.native
      val maxValue: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FacesRatingBar/FacesRatingBar", "default.propTypes.value")
      @js.native
      val value: Validator[Double] = js.native
    }
  }
  
  /** A rating component that will enable the user to rate on a 1-5 scale. */
  @js.native
  trait FacesRatingBar extends PureComponent[Any, Any, Any] {
    
    def _onFaceBlur(focusableProps: Any): Unit = js.native
    
    def _onFaceClick(index: Any): Unit = js.native
    
    def _onFaceFocus(faceIndex: Any, focusableProps: Any): Unit = js.native
    
    def _onFaceMouseEnter(index: Any): Unit = js.native
    
    def _onFaceMouseLeave(): Unit = js.native
    
    def _shouldShowDescriptionValues(): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFacesRatingBar(): Unit = js.native
    
    @JSName("state")
    var state_FacesRatingBar: FaceHoveredIndex = js.native
  }
}
