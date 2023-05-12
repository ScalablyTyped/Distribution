package typings.themeUiGlobal

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@theme-ui/global/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: GlobalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait GlobalProps extends StObject {
    
    var styles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
  }
  object GlobalProps {
    
    inline def apply(
      styles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
    ): GlobalProps = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalProps] (val x: Self) extends AnyVal {
      
      inline def setStyles(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
