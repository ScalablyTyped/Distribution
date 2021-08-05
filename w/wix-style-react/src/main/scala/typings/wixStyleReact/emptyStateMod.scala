package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ImageContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyStateMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/EmptyState", JSImport.Default)
  @js.native
  val default: SFC[EmptyStateProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/EmptyState", "EmptyState")
  @js.native
  val EmptyState: SFC[EmptyStateProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.end
  */
  trait EmptyStateAlign extends StObject
  object EmptyStateAlign {
    
    inline def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    inline def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait EmptyStateProps extends StObject {
    
    var align: js.UndefOr[EmptyStateAlign] = js.undefined
    
    var classNames: js.UndefOr[ImageContainer] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String | Element] = js.undefined
    
    var subtitle: js.UndefOr[String | ReactNode] = js.undefined
    
    var theme: js.UndefOr[EmptyStateTheme] = js.undefined
    
    var title: js.UndefOr[String | ReactNode] = js.undefined
  }
  object EmptyStateProps {
    
    inline def apply(): EmptyStateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyStateProps]
    }
    
    extension [Self <: EmptyStateProps](x: Self) {
      
      inline def setAlign(value: EmptyStateAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setClassNames(value: ImageContainer): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setImage(value: String | Element): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setSubtitle(value: String | ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTheme(value: EmptyStateTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.page
    - typings.wixStyleReact.wixStyleReactStrings.`page-no-border`
    - typings.wixStyleReact.wixStyleReactStrings.section
  */
  trait EmptyStateTheme extends StObject
  object EmptyStateTheme {
    
    inline def page: typings.wixStyleReact.wixStyleReactStrings.page = "page".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.page]
    
    inline def `page-no-border`: typings.wixStyleReact.wixStyleReactStrings.`page-no-border` = "page-no-border".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`page-no-border`]
    
    inline def section: typings.wixStyleReact.wixStyleReactStrings.section = "section".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.section]
  }
  
  type _To = SFC[EmptyStateProps]
  
  /* This means you don't have to write `default`, but can instead just say `emptyStateMod.foo` */
  override def _to: SFC[EmptyStateProps] = default
}
