package typings.tuyaPanelKit.stackTypesMod

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.tuyaPanelKit.anon.Left
import typings.tuyaPanelKit.anon.Progress
import typings.tuyaPanelKit.anon.Screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackCardInterpolationProps extends StObject {
  
  /**
    * Animated node representing whether the card is closing (1 - closing, 0 - not closing).
    */
  var closing: AnimatedInterpolation
  
  /**
    * Values for the current screen.
    */
  var current: Progress
  
  /**
    * The index of the card in the stack.
    */
  var index: Double
  
  /**
    * Safe area insets
    */
  var insets: Left
  
  /**
    * Animated node representing multiplier when direction is inverted (-1 - inverted, 1 - normal).
    */
  var inverted: AnimatedInterpolation
  
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: Screen
  
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[Progress] = js.undefined
  
  /**
    * Animated node representing whether the card is being swiped (1 - swiping, 0 - not swiping).
    */
  var swiping: AnimatedInterpolation
}
object StackCardInterpolationProps {
  
  @scala.inline
  def apply(
    closing: AnimatedInterpolation,
    current: Progress,
    index: Double,
    insets: Left,
    inverted: AnimatedInterpolation,
    layouts: Screen,
    swiping: AnimatedInterpolation
  ): StackCardInterpolationProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCardInterpolationProps]
  }
  
  @scala.inline
  implicit class StackCardInterpolationPropsMutableBuilder[Self <: StackCardInterpolationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosing(value: AnimatedInterpolation): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: Progress): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsets(value: Left): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverted(value: AnimatedInterpolation): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayouts(value: Screen): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Progress): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setSwiping(value: AnimatedInterpolation): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
  }
}
