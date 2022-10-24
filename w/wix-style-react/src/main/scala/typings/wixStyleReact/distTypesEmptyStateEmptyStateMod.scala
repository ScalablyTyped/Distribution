package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ClassNames
import typings.wixStyleReact.anon.ImageContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEmptyStateEmptyStateMod {
  
  object default {
    
    /**
      * Representing a state of an empty page, section, table, etc.
      */
    inline def apply(param0: ClassNames): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.defaultProps.align_1")
      @js.native
      val align1: String = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.defaultProps.children_1")
      @js.native
      val children1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.defaultProps.image_1")
      @js.native
      val image1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.defaultProps.theme_1")
      @js.native
      val theme1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.align")
      @js.native
      val align: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.classNames")
      @js.native
      val classNames: Requireable[InferProps[ImageContainer]] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.image")
      @js.native
      val image: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.theme")
      @js.native
      val theme: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/EmptyState/EmptyState", "default.propTypes.title")
      @js.native
      val title: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
    }
  }
}
