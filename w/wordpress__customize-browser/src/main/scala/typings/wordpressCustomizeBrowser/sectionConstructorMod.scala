package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.outerSectionMod.OuterSection
import typings.wordpressCustomizeBrowser.themesSectionMod.ThemesSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionConstructorMod {
  
  @js.native
  trait SectionConstructor extends StObject {
    
    var outer: OuterSection = js.native
    
    var themes: ThemesSection = js.native
  }
  object SectionConstructor {
    
    @scala.inline
    def apply(outer: OuterSection, themes: ThemesSection): SectionConstructor = {
      val __obj = js.Dynamic.literal(outer = outer.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionConstructor]
    }
    
    @scala.inline
    implicit class SectionConstructorMutableBuilder[Self <: SectionConstructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOuter(value: OuterSection): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemes(value: ThemesSection): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    }
  }
}
