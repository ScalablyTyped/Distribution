package typings.wixStyleReact

import typings.react.mod.ReactNode
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownBaseDropdownBaseDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase.uni.driver", "dropdownBaseDriverFactory")
  @js.native
  val dropdownBaseDriverFactory: UniDriverFactory[DropdownBaseUniDriver] = js.native
  
  @js.native
  trait DropdownBaseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOutside(): Boolean = js.native
    
    def clickTargetElement(dataHook: String): js.Promise[Unit] = js.native
    
    def getListType(dataHook: String): js.Promise[String] = js.native
    
    def getMarkedOption(): js.Promise[String | Null] = js.native
    
    def getSelectedOptionId(): js.Promise[String | Null] = js.native
    
    def hoverTargetElement(dataHook: String): js.Promise[Unit] = js.native
    
    def isDropdownShown(): js.Promise[Boolean] = js.native
    
    def mouseEnter(): js.Promise[Unit] = js.native
    
    def mouseLeave(): js.Promise[Unit] = js.native
    
    def optionContentAt(id: Double): js.Promise[ReactNode | String | Null] = js.native
    
    def optionsCount(): js.Promise[Double] = js.native
    
    def selectOption(index: String): js.Promise[Unit] = js.native
    def selectOption(index: Double): js.Promise[Unit] = js.native
    
    def selectOptionByDataHook(dataHook: String): js.Promise[Unit] = js.native
  }
}
