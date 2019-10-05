package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import typings.winjs.Anon_Entrance
import typings.winjs.WinJS.UI.Animation.IAnimationMethodResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the Windows animations. These functions provide developers with the ability to use animations in their custom controls that are consistent with animations used by Windows controls.
**/
@JSImport("winjs", "UI.Animation")
@js.native
object Animation extends js.Object {
  /**
    * Execute a continuum animation, scaling down the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled down that is the page root and contains the incoming item.
    * @param item Single element to be scaled, rotated, and translated into its final position on the page.
    * @returns A Promise that completes when the animation is finished.
    **/
  def continuumBackwardIn(page: js.Any, item: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a continuum animation, scaling down the outgoing page while.
    * @param page Single element to be scaled down that is the page root.
    * @returns A Promise that completes when the animation is finished.
    **/
  def continuumBackwardOut(page: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a continuum animation, scaling up the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled up that is the page root and does not contain the incoming item.
    * @param itemRoot Root of the item that will be translated as part of the continuum animation.
    * @param itemContent Content of the item that will be scaled and rotated as part of the continuum animation.
    * @returns A Promise that completes when the animation is finished.
    **/
  def continuumForwardIn(page: js.Any, itemRoot: js.Any, itemContent: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a continuum animation, scaling down the outgoing page while scaling, rotating, and translating the outgoing item.
    * @param page Single element to be scaled down that is the page root and contains the outgoing item.
    * @param item Single element to be scaled, rotated, and translated away from the outgoing page.
    * @returns A Promise that completes when the animation is finished.
    **/
  def continuumForwardOut(page: js.Any, item: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  //#region Functions
  /**
    * Creates an object that performs an animation that adds an item or items to a list.
    * @param added Element or elements to add to the list.
    * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createAddToListAnimation(added: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an object that performs an animation that adds an item or items to a list of search results.
    * @param added Element or elements to add to the list.
    * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createAddToSearchListAnimation(added: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an object that performs an animation that collapses a list.
    * @param hidden Element or elements hidden as a result of the collapse.
    * @param affected Element or elements affected by the hidden items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createCollapseAnimation(hidden: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an object that performs an animation that removes an item or items from a list.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createDeleteFromListAnimation(deleted: js.Any, remaining: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an object that performs an animation that removes an item or items from a list of search results.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createDeleteFromSearchListAnimation(deleted: js.Any, remaining: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an object that performs an animation that expands a list.
    * @param revealed Element or elements revealed by the expansion.
    * @param affected Element or elements affected by the newly revealed items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createExpandAnimation(revealed: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an exit and entrance animation to play for a page navigation given the current and incoming pages'
    * animation preferences and whether the pages are navigating forwards or backwards.
    * @param currentPreferredAnimation A value from WinJS.UI.PageNavigationAnimation describing the animation the current page prefers to use.
    * @param A value from nextPreferredAnimation WinJS.UI.PageNavigationAnimation describing the animation the incoming page prefers to use.
    * @param movingBackwards Boolean value for whether the navigation is moving backwards.
    * @returns an object containing the exit and entrance animations to play based on the parameters given.
    **/
  def createPageNavigationAnimations(currentPreferredAnimation: String, nextPreferredAnimation: String, movingBackwards: Boolean): Anon_Entrance = js.native
  /**
    * Creates an object that performs a peek animation.
    * @param element Element or elements involved in the peek.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def createPeekAnimation(element: js.Any): IAnimationMethodResponse = js.native
  /**
    * Creates an object that performs an animation that moves an item or items.
    * @param element Element or elements involved in the reposition.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise object that completes when the animation is finished.
    **/
  def createRepositionAnimation(element: js.Any): IAnimationMethodResponse = js.native
  /**
    * Performs an animation that fades an item or items in, fading out existing items that occupy the same space.
    * @param incoming Element or elements being faded in.
    * @param outgoing Element or elements being replaced.
    * @returns An object that completes when the animation has finished.
    **/
  def crossFade(incoming: js.Any, outgoing: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation when a dragged object is moved such that dropping it in that position would move other items. The potentially affected items are animated out of the way to show where the object would be dropped.
    * @param target Element or elements that the dragged object would cause to be moved if it were dropped.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def dragBetweenEnter(target: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def dragBetweenEnter(target: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation when a dragged object is moved away from items that it had previously involved in a dragBetweenEnter animation. The affected objects are animated back to their original positions.
    * @param target Element or elements that the dragged object would no longer cause to be displaced, due to its moving away. This should be the same element or element collection passed as the target parameter in the dragBetweenEnter animation.
    * @returns An object that completes when the animation is finished.
    **/
  def dragBetweenLeave(target: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation when the user finishes dragging an object.
    * @param dragSource Element or elements that were dragged.
    * @param offset Initial offset from the drop point. The dropped object begins at the offset and animates to its final position at the drop point. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param affected Element or elements whose position the dropped object affects. Typically, this is all other items in a reorderable list. This should be the same element or element collection passed as the affected parameter in the dragSourceStart animation.
    * @returns An object that completes when the animation is finished.
    **/
  def dragSourceEnd(dragSource: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def dragSourceEnd(dragSource: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def dragSourceEnd(dragSource: js.Any, offset: js.Any, affected: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation when the user begins to drag an object.
    * @param dragSource Element or elements being dragged.
    * @param affected Element or elements whose position is affected by the movement of the dragged object. Typically, this is all other items in a reorderable list.
    * @returns An object that completes when the animation is finished.
    **/
  def dragSourceStart(dragSource: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def dragSourceStart(dragSource: js.Any, affected: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute the incoming phase of the drill in animation, scaling up the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  def drillInIncoming(incomingPage: HTMLElement): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute the outgoing phase of the drill in animation, scaling up the outgoing page while fading it out.
    * @param incomingPage Element to be scaled up and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  def drillInOutgoing(outgoingPage: HTMLElement): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute the incoming phase of the drill out animation, scaling down the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  def drillOutIncoming(incomingPage: HTMLElement): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute the outgoing phase of the drill out animation, scaling down the outgoing page while fading it out.
    * @param outgoingPage Element to be scaled down and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  def drillOutOutgoing(outgoingPage: HTMLElement): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that displays one or more elements on a page.
    * @param incoming Element or elements that compose the incoming content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  def enterContent(incoming: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def enterContent(incoming: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def enterContent(incoming: js.Any, offset: js.Any, options: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that shows a new page of content, either when transitioning between pages in a running app or when displaying the first content in a newly launched app.
    * @param element Element or an array of elements that represent the content. If element refers to an array of elements, the elements enter in array order.
    * @param offset An initial offset where the element or elements begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def enterPage(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def enterPage(element: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that hides one or more elements on a page.
    * @param outgoing Element or elements that compose the outgoing content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def exitContent(outgoing: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def exitContent(outgoing: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that dismisses the current page when transitioning between pages in an app.
    * @param outgoing Element or elements that compose the outgoing page.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def exitPage(outgoing: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def exitPage(outgoing: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that fades an item or set of items into view.
    * @param shown Element or elements being faded in.
    * @returns An object that completes when the animation has finished. Use this object when subsequent actions need this animation to finish before they take place.
    **/
  def fadeIn(shown: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that fades an item or set of items out of view.
    * @param hidden Element or elements being faded out.
    * @returns An object that completes when the animation is finished.
    **/
  def fadeOut(hidden: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that hides edge-based user interface (UI).
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  def hideEdgeUI(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def hideEdgeUI(element: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def hideEdgeUI(element: js.Any, offset: js.Any, options: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that hides a panel.
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def hidePanel(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def hidePanel(element: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that removes pop-up user interface (UI).
    * @param element Element or elements that are being hidden.
    * @returns An object that completes when the animation is finished.
    **/
  def hidePopup(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation when a pointer is pressed on an object.
    * @param element Element or elements on which the pointer is pressed.
    * @returns An object that completes when the animation is finished.
    **/
  def pointerDown(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation when a pointer is released.
    * @param element Element or elements that the pointer was pressed on.
    * @returns An object that completes when the animation is finished.
    **/
  def pointerUp(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that slides a narrow, edge-based user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  def showEdgeUI(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def showEdgeUI(element: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def showEdgeUI(element: js.Any, offset: js.Any, options: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that slides a large panel user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def showPanel(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def showPanel(element: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that displays a pop-up user interface (UI).
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def showPopup(element: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def showPopup(element: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a slide down animation.
    * @param incoming Single element or collection of elements to animate sliding down.
    * @returns A Promise that completes when the animation is finished.
    **/
  def slideDown(incoming: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a slide in from right to left animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding in.
    * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  def slideLeftIn(page: js.Any, first: js.Any, second: js.Any, third: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a slide out from right to left animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  def slideLeftOut(page: js.Any, first: js.Any, second: js.Any, third: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a slide in from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding in.
    * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  def slideRightIn(page: js.Any, first: js.Any, second: js.Any, third: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a slide out from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  def slideRightOut(page: js.Any, first: js.Any, second: js.Any, third: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a slide up animation.
    * @param incoming Single element or collection of elements to animate sliding up.
    * @returns A Promise that completes when the animation is finished.
    **/
  def slideUp(incoming: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs a deselection animation in response to a swipe interaction.
    * @param deselected Element or elements that become unselected.
    * @param selection Element or elements that represent the selection, typically a check mark.
    * @returns An object that completes when the animation is finished.
    **/
  def swipeDeselect(deselected: js.Any, selection: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that reveals an item or items in response to a swipe interaction.
    * @param target Element or elements being revealed.
    * @param offset An initial offset where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def swipeReveal(target: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def swipeReveal(target: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs a selection animation in response to a swipe interaction.
    * @param selected Element or elements being selected.
    * @param selection Element or elements that show that something is selected, typically a check mark.
    * @returns An object that completes when the animation is finished.
    **/
  def swipeSelect(selected: js.Any, selection: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a turnstile backward in animation.
    * @param incoming Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  def turnstileBackwardIn(incoming: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a turnstile backward out animation.
    * @param outgoing Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  def turnstileBackwardOut(outgoing: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a turnstile forward in animation.
    * @param incoming Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  def turnstileForwardIn(incoming: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Execute a turnstile forward out animation.
    * @param outgoing Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  def turnstileForwardOut(outgoing: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  /**
    * Performs an animation that updates a badge.
    * @param incoming Element or elements that comprise the new badge.
    * @param offset Initial offsets where incoming animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def updateBadge(incoming: js.Any): typings.winjs.WinJS.Promise[_] = js.native
  def updateBadge(incoming: js.Any, offset: js.Any): typings.winjs.WinJS.Promise[_] = js.native
}

