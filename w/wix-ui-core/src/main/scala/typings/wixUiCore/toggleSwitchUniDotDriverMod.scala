package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSwitchUniDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/toggle-switch/ToggleSwitch.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toggleSwitchUniDriverFactory(base: UniDriver[js.Any]): ToggleSwitchUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSwitchUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ToggleSwitchUniDriver]
  
  trait ToggleSwitchUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Returns the id of the input */
    def getId(): js.Promise[String]
    
    /** Returns the toggle icon inside the knob */
    def getKnobIcon(): js.Promise[js.Object]
    
    /** Returns the computed styles object of the knob icon */
    def getKnobIconStyles(): js.Promise[js.Object]
    
    /** Returns the computed styles object of the knob */
    def getKnobStyles(): js.Promise[js.Object]
    
    /** Returns the computed styles object of the root component */
    def getRootStyles(): js.Promise[js.Object]
    
    /** Returns the tab index */
    def getTabIndex(): js.Promise[Double]
    
    /** Returns the computed styles object of the track */
    def getTrackStyles(): js.Promise[js.Object]
    
    /** Returns whether the toggle has an icon */
    def hasKnobIcon(): js.Promise[Boolean]
    
    /** Returns a boolean indicating if the toggleSwitch is checked */
    def isChecked(): js.Promise[Boolean]
    
    /** Returns a boolean indicating if the toggleSwitch is disabled */
    def isDisabled(): js.Promise[Boolean]
  }
  object ToggleSwitchUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getId: () => js.Promise[String],
      getKnobIcon: () => js.Promise[js.Object],
      getKnobIconStyles: () => js.Promise[js.Object],
      getKnobStyles: () => js.Promise[js.Object],
      getRootStyles: () => js.Promise[js.Object],
      getTabIndex: () => js.Promise[Double],
      getTrackStyles: () => js.Promise[js.Object],
      hasKnobIcon: () => js.Promise[Boolean],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): ToggleSwitchUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getKnobIcon = js.Any.fromFunction0(getKnobIcon), getKnobIconStyles = js.Any.fromFunction0(getKnobIconStyles), getKnobStyles = js.Any.fromFunction0(getKnobStyles), getRootStyles = js.Any.fromFunction0(getRootStyles), getTabIndex = js.Any.fromFunction0(getTabIndex), getTrackStyles = js.Any.fromFunction0(getTrackStyles), hasKnobIcon = js.Any.fromFunction0(hasKnobIcon), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[ToggleSwitchUniDriver]
    }
    
    @scala.inline
    implicit class ToggleSwitchUniDriverMutableBuilder[Self <: ToggleSwitchUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => js.Promise[String]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetKnobIcon(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getKnobIcon", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetKnobIconStyles(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getKnobIconStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetKnobStyles(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getKnobStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootStyles(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getRootStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTabIndex(value: () => js.Promise[Double]): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTrackStyles(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getTrackStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasKnobIcon(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasKnobIcon", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
