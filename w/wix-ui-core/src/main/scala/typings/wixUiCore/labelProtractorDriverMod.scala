package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/deprecated/label/Label.protractor.driver", "labelDriverFactory")
  @js.native
  val labelDriverFactory: DriverFactory[LabelDriver] = js.native
  
  trait LabelDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getLabelText(): js.Promise[String]
  }
  object LabelDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      getLabelText: () => js.Promise[String]
    ): LabelDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), getLabelText = js.Any.fromFunction0(getLabelText))
      __obj.asInstanceOf[LabelDriver]
    }
    
    extension [Self <: LabelDriver](x: Self) {
      
      inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
    }
  }
}
