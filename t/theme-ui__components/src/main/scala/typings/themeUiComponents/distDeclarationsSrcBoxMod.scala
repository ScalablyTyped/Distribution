package typings.themeUiComponents

import typings.emotionSerialize.mod.Interpolation
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.std.Omit
import typings.std.Pick
import typings.themeUiComponents.distDeclarationsSrcTypesMod.Assign
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import typings.themeUiComponents.themeUiComponentsStrings.div
import typings.themeUiComponents.themeUiComponentsStrings.ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcBoxMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/components/dist/declarations/src/Box", "Box")
  @js.native
  val Box: ForwardRef[Any, BoxProps] = js.native
  
  inline def isBoxStyledSystemProp(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("__isBoxStyledSystemProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxSystemPropsKeys ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSProperties * / any[P]} */ trait BoxOwnProps extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var css: js.UndefOr[Interpolation[Any]] = js.undefined
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object BoxOwnProps {
    
    inline def apply(): BoxOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxOwnProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCss(value: Interpolation[Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type BoxProps = Omit[Assign[ComponentPropsWithRef[div], BoxOwnProps], ref]
  
  type BoxSystemProps = Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSProperties */ Any, 
    BoxSystemPropsKeys
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.themeUiComponents.themeUiComponentsStrings.margin
    - typings.themeUiComponents.themeUiComponentsStrings.marginTop
    - typings.themeUiComponents.themeUiComponentsStrings.marginRight
    - typings.themeUiComponents.themeUiComponentsStrings.marginBottom
    - typings.themeUiComponents.themeUiComponentsStrings.marginLeft
    - typings.themeUiComponents.themeUiComponentsStrings.marginX
    - typings.themeUiComponents.themeUiComponentsStrings.marginY
    - typings.themeUiComponents.themeUiComponentsStrings.m
    - typings.themeUiComponents.themeUiComponentsStrings.mt
    - typings.themeUiComponents.themeUiComponentsStrings.mr
    - typings.themeUiComponents.themeUiComponentsStrings.mb
    - typings.themeUiComponents.themeUiComponentsStrings.ml
    - typings.themeUiComponents.themeUiComponentsStrings.mx
    - typings.themeUiComponents.themeUiComponentsStrings.my
    - typings.themeUiComponents.themeUiComponentsStrings.padding
    - typings.themeUiComponents.themeUiComponentsStrings.paddingTop
    - typings.themeUiComponents.themeUiComponentsStrings.paddingRight
    - typings.themeUiComponents.themeUiComponentsStrings.paddingBottom
    - typings.themeUiComponents.themeUiComponentsStrings.paddingLeft
    - typings.themeUiComponents.themeUiComponentsStrings.paddingX
    - typings.themeUiComponents.themeUiComponentsStrings.paddingY
    - typings.themeUiComponents.themeUiComponentsStrings.p
    - typings.themeUiComponents.themeUiComponentsStrings.pt
    - typings.themeUiComponents.themeUiComponentsStrings.pr
    - typings.themeUiComponents.themeUiComponentsStrings.pb
    - typings.themeUiComponents.themeUiComponentsStrings.pl
    - typings.themeUiComponents.themeUiComponentsStrings.px
    - typings.themeUiComponents.themeUiComponentsStrings.py
    - typings.themeUiComponents.themeUiComponentsStrings.color
    - typings.themeUiComponents.themeUiComponentsStrings.backgroundColor
    - typings.themeUiComponents.themeUiComponentsStrings.bg
    - typings.themeUiComponents.themeUiComponentsStrings.opacity
  */
  trait BoxSystemPropsKeys extends StObject
}
