package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  var section: SectionTitle
  
  var showSectionTitles: js.UndefOr[Boolean] = js.undefined
}
object Section {
  
  inline def apply(section: SectionTitle): Section = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setSection(value: SectionTitle): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setShowSectionTitles(value: Boolean): Self = StObject.set(x, "showSectionTitles", value.asInstanceOf[js.Any])
    
    inline def setShowSectionTitlesUndefined: Self = StObject.set(x, "showSectionTitles", js.undefined)
  }
}
