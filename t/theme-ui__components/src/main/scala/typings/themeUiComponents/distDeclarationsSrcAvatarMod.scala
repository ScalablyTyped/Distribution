package typings.themeUiComponents

import typings.std.HTMLImageElement
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAvatarMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Avatar", "Avatar")
  @js.native
  val Avatar: ForwardRef[HTMLImageElement, AvatarProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentPropsWithRef<'img'> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof react.react.ComponentPropsWithRef<'img'>? react.react.ComponentPropsWithRef<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait AvatarProps extends StObject {
    
    var size: js.UndefOr[Double | String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
