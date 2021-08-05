package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.outerSectionMod.OuterSection
import typings.wordpressCustomizeBrowser.themesSectionMod.ThemesSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionConstructorMod {
  
  trait SectionConstructor extends StObject {
    
    var outer: OuterSection
    
    var themes: ThemesSection
  }
  object SectionConstructor {
    
    inline def apply(outer: OuterSection, themes: ThemesSection): SectionConstructor = {
      val __obj = js.Dynamic.literal(outer = outer.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionConstructor]
    }
    
    extension [Self <: SectionConstructor](x: Self) {
      
      inline def setOuter(value: OuterSection): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      inline def setThemes(value: ThemesSection): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    }
  }
}
