package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagDotUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makeTagUniDriver(base: UniDriver[js.Any]): TagUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagUniDriver")(base.asInstanceOf[js.Any]).asInstanceOf[TagUniDriver]
  
  trait TagUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getInput(): UniDriver[js.Any]
    
    def getText(): js.Promise[String]
    
    def getValue(): js.Promise[String]
    
    def isChecked(): js.Promise[Boolean]
    
    def simulateClick(): js.Promise[Unit]
  }
  object TagUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getInput: () => UniDriver[js.Any],
      getText: () => js.Promise[String],
      getValue: () => js.Promise[String],
      isChecked: () => js.Promise[Boolean],
      simulateClick: () => js.Promise[Unit]
    ): TagUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getInput = js.Any.fromFunction0(getInput), getText = js.Any.fromFunction0(getText), getValue = js.Any.fromFunction0(getValue), isChecked = js.Any.fromFunction0(isChecked), simulateClick = js.Any.fromFunction0(simulateClick))
      __obj.asInstanceOf[TagUniDriver]
    }
    
    @scala.inline
    implicit class TagUniDriverMutableBuilder[Self <: TagUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInput(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSimulateClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "simulateClick", js.Any.fromFunction0(value))
    }
  }
}
