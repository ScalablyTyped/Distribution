package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelDotUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/deprecated/label/Label.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def labelUniDriverFactory(base: UniDriver[js.Any]): LabelDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("labelUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[LabelDriver]
  
  trait LabelDriver
    extends StObject
       with BaseUniDriver {
    
    /** get the "for" attribute of the component */
    def getForAttribute(): js.Promise[String]
    
    /** get the id of the component */
    def getId(): js.Promise[String]
    
    /** get the label's text */
    def getLabelText(): js.Promise[String]
    
    /** returns true if the label is in ellipsis state */
    def hasEllipsis(): js.Promise[Boolean]
    
    /** true if disabled */
    def isDisabled(): js.Promise[Boolean]
    
    /** send key down on the label */
    def keyDown(key: js.Any): js.Promise[Unit]
  }
  object LabelDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getForAttribute: () => js.Promise[String],
      getId: () => js.Promise[String],
      getLabelText: () => js.Promise[String],
      hasEllipsis: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      keyDown: js.Any => js.Promise[Unit]
    ): LabelDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getForAttribute = js.Any.fromFunction0(getForAttribute), getId = js.Any.fromFunction0(getId), getLabelText = js.Any.fromFunction0(getLabelText), hasEllipsis = js.Any.fromFunction0(hasEllipsis), isDisabled = js.Any.fromFunction0(isDisabled), keyDown = js.Any.fromFunction1(keyDown))
      __obj.asInstanceOf[LabelDriver]
    }
    
    @scala.inline
    implicit class LabelDriverMutableBuilder[Self <: LabelDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetForAttribute(value: () => js.Promise[String]): Self = StObject.set(x, "getForAttribute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetId(value: () => js.Promise[String]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasEllipsis(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasEllipsis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeyDown(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    }
  }
}
