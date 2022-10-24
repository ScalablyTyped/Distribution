package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesRadioRadioDotdriverMod.RadioDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioGroupRadioGroupDotdriverMod {
  
  @js.native
  trait RadioGroupDriver
    extends StObject
       with BaseDriver {
    
    def getClassOfLabelAt(index: Double): String = js.native
    
    def getNumberOfRadios(): Double = js.native
    
    def getRadioAtIndex(index: Double): HTMLElement & RadioDriver = js.native
    
    def getRadioIdAt(index: Double): String = js.native
    
    def getRadioName(): String = js.native
    
    def getRadioValueAt(index: Double): String | Double = js.native
    
    def getSelectedValue(): String | Double | Null = js.native
    
    def isButtonType(): Boolean = js.native
    
    def isHorizontalDisplay(): Boolean = js.native
    
    def isRadioDisabled(index: Double): Boolean = js.native
    
    def isVerticalDisplay(): Boolean = js.native
    
    def selectByIndex(index: Double): Unit = js.native
    
    def selectByValue(value: String): Unit = js.native
    def selectByValue(value: Double): Unit = js.native
    
    def spacing(): String = js.native
  }
}
