package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.radioButtonUniDriverMod.RadioButtonUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupUniDriverMod {
  
  @JSImport("wix-style-react/dist/es/src/RadioGroup/RadioGroup.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRadioButtonsGetter(base: BaseUniDriver, body: HTMLElement): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createRadioButtonsGetter")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @js.native
  trait RadioGroupUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getClassOfLabelAt(index: Double): js.Promise[String] = js.native
    
    def getNumberOfRadios(): js.Promise[Double] = js.native
    
    def getRadioAtIndex(index: Double): js.Promise[HTMLElement & RadioButtonUniDriver] = js.native
    
    def getRadioValueAt(index: Double): js.Promise[String | Double] = js.native
    
    def getSelectedValue(): js.Promise[String | Double | Null] = js.native
    
    def isButtonType(): js.Promise[Boolean] = js.native
    
    def isHorizontalDisplay(): js.Promise[Boolean] = js.native
    
    def isRadioDisabled(index: Double): js.Promise[Boolean] = js.native
    
    def isVerticalDisplay(): js.Promise[Boolean] = js.native
    
    def lineHeight(): js.Promise[String] = js.native
    
    def selectByIndex(index: Double): js.Promise[Unit] = js.native
    
    def selectByValue(value: String): js.Promise[Unit] = js.native
    def selectByValue(value: Double): js.Promise[Unit] = js.native
    
    def spacing(): js.Promise[String] = js.native
  }
}
