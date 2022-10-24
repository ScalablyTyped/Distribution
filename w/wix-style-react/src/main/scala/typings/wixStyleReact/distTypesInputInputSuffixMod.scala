package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ClearButtonSize
import typings.wixStyleReact.anon.IsVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputInputSuffixMod {
  
  @JSImport("wix-style-react/dist/types/Input/InputSuffix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(param0: ClearButtonSize): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Input/InputSuffix", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.clearButtonSize")
      @js.native
      val clearButtonSize: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.isClearButtonVisible")
      @js.native
      val isClearButtonVisible: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.menuArrow")
      @js.native
      val menuArrow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.onClear")
      @js.native
      val onClear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.onIconClicked")
      @js.native
      val onIconClicked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.suffix")
      @js.native
      val suffix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.suffixes")
      @js.native
      val suffixes: Requireable[js.Array[js.UndefOr[InferProps[IsVisible] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/InputSuffix", "default.propTypes.tooltipPlacement")
      @js.native
      val tooltipPlacement: Requireable[String] = js.native
    }
  }
  
  inline def getVisibleSuffixCount(args: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleSuffixCount")(args.asInstanceOf[js.Any]).asInstanceOf[Double]
}
