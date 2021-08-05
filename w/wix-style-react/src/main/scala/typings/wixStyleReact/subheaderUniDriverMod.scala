package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subheaderUniDriverMod {
  
  trait CardSubheaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def suffixNode(): UniDriver[js.Any]
    
    def title(): js.Promise[String]
    
    def titleNode(): UniDriver[js.Any]
  }
  object CardSubheaderUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      suffixNode: () => UniDriver[js.Any],
      title: () => js.Promise[String],
      titleNode: () => UniDriver[js.Any]
    ): CardSubheaderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), suffixNode = js.Any.fromFunction0(suffixNode), title = js.Any.fromFunction0(title), titleNode = js.Any.fromFunction0(titleNode))
      __obj.asInstanceOf[CardSubheaderUniDriver]
    }
    
    extension [Self <: CardSubheaderUniDriver](x: Self) {
      
      inline def setSuffixNode(value: () => UniDriver[js.Any]): Self = StObject.set(x, "suffixNode", js.Any.fromFunction0(value))
      
      inline def setTitle(value: () => js.Promise[String]): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleNode(value: () => UniDriver[js.Any]): Self = StObject.set(x, "titleNode", js.Any.fromFunction0(value))
    }
  }
}
