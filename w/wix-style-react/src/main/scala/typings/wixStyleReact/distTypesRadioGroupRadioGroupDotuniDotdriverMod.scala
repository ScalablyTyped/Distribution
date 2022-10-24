package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesRadioRadioDotuniDotdriverMod.RadioUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioGroupRadioGroupDotuniDotdriverMod {
  
  @js.native
  trait RadioGroupUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getClassOfLabelAt(index: Double): js.Promise[String] = js.native
    
    def getNumberOfRadios(): js.Promise[Double] = js.native
    
    def getRadioAtIndex(index: Double): js.Promise[HTMLElement & RadioUniDriver] = js.native
    
    def getRadioIdAt(index: Double): js.Promise[String] = js.native
    
    def getRadioName(): js.Promise[String] = js.native
    
    def getRadioValueAt(index: Double): js.Promise[String | Double] = js.native
    
    def getSelectedValue(): js.Promise[String | Double | Null] = js.native
    
    def isButtonType(): js.Promise[Boolean] = js.native
    
    def isHorizontalDisplay(): js.Promise[Boolean] = js.native
    
    def isRadioDisabled(index: Double): js.Promise[Boolean] = js.native
    
    def isVerticalDisplay(): js.Promise[Boolean] = js.native
    
    def selectByIndex(index: Double): js.Promise[Unit] = js.native
    
    def selectByValue(value: String): js.Promise[Unit] = js.native
    def selectByValue(value: Double): js.Promise[Unit] = js.native
    
    def spacing(): js.Promise[String] = js.native
  }
}
