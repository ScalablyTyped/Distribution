package typings.wixStyleReact

import typings.react.mod.ReactNode
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownBaseUniDriverMod {
  
  @js.native
  trait DropdownBaseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOutside(): Boolean = js.native
    
    def clickTargetElement(dataHook: String): js.Promise[Unit] = js.native
    
    def hoverTargetElement(dataHook: String): js.Promise[Unit] = js.native
    
    def isDropdownShown(): js.Promise[Boolean] = js.native
    
    def mouseEnter(): js.Promise[Unit] = js.native
    
    def mouseLeave(): js.Promise[Unit] = js.native
    
    def optionContentAt(id: Double): js.Promise[ReactNode | String | Null] = js.native
    
    def optionsCount(): js.Promise[Double] = js.native
    
    def selectOption(index: String): js.Promise[Unit] = js.native
    def selectOption(index: Double): js.Promise[Unit] = js.native
  }
}
