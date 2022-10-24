package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.dark
import typings.wixStyleReact.wixStyleReactStrings.light
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarItemNextSidebarItemNextDotuniDotdriverMod {
  
  trait SidebarItemNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[dark | light]
    
    def getText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
    
    def suffixExists(): js.Promise[Boolean]
  }
  object SidebarItemNextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[dark | light],
      getText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isSelected: () => js.Promise[Boolean],
      suffixExists: () => js.Promise[Boolean]
    ): SidebarItemNextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), getText = js.Any.fromFunction0(getText), isDisabled = js.Any.fromFunction0(isDisabled), isSelected = js.Any.fromFunction0(isSelected), suffixExists = js.Any.fromFunction0(suffixExists))
      __obj.asInstanceOf[SidebarItemNextUniDriver]
    }
    
    extension [Self <: SidebarItemNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: () => js.Promise[dark | light]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
      
      inline def setSuffixExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "suffixExists", js.Any.fromFunction0(value))
    }
  }
}
