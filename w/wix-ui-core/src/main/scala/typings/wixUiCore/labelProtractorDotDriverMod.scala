package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/deprecated/label/Label.protractor.driver", "labelDriverFactory")
  @js.native
  val labelDriverFactory: DriverFactory[LabelDriver] = js.native
  
  trait LabelDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getLabelText(): js.Promise[String]
  }
  object LabelDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      getLabelText: () => js.Promise[String]
    ): LabelDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), getLabelText = js.Any.fromFunction0(getLabelText))
      __obj.asInstanceOf[LabelDriver]
    }
    
    @scala.inline
    implicit class LabelDriverMutableBuilder[Self <: LabelDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
    }
  }
}
