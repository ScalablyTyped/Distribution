package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import typings.winjs.WinJS.UI.Animation.IAnimationMethodResponse
import typings.winjs.anon.Entrance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the Windows animations. These functions provide developers with the ability to use animations in their custom controls that are consistent with animations used by Windows controls.
**/
object Animation {
  
  /**
    * Execute a continuum animation, scaling down the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled down that is the page root and contains the incoming item.
    * @param item Single element to be scaled, rotated, and translated into its final position on the page.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.continuumBackwardIn")
  @js.native
  def continuumBackwardIn(page: js.Any, item: js.Any): Promise[_] = js.native
  
  /**
    * Execute a continuum animation, scaling down the outgoing page while.
    * @param page Single element to be scaled down that is the page root.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.continuumBackwardOut")
  @js.native
  def continuumBackwardOut(page: js.Any): Promise[_] = js.native
  
  /**
    * Execute a continuum animation, scaling up the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled up that is the page root and does not contain the incoming item.
    * @param itemRoot Root of the item that will be translated as part of the continuum animation.
    * @param itemContent Content of the item that will be scaled and rotated as part of the continuum animation.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.continuumForwardIn")
  @js.native
  def continuumForwardIn(page: js.Any, itemRoot: js.Any, itemContent: js.Any): Promise[_] = js.native
  
  /**
    * Execute a continuum animation, scaling down the outgoing page while scaling, rotating, and translating the outgoing item.
    * @param page Single element to be scaled down that is the page root and contains the outgoing item.
    * @param item Single element to be scaled, rotated, and translated away from the outgoing page.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.continuumForwardOut")
  @js.native
  def continuumForwardOut(page: js.Any, item: js.Any): Promise[_] = js.native
  
  //#region Functions
  /**
    * Creates an object that performs an animation that adds an item or items to a list.
    * @param added Element or elements to add to the list.
    * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createAddToListAnimation")
  @js.native
  def createAddToListAnimation(added: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an object that performs an animation that adds an item or items to a list of search results.
    * @param added Element or elements to add to the list.
    * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createAddToSearchListAnimation")
  @js.native
  def createAddToSearchListAnimation(added: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an object that performs an animation that collapses a list.
    * @param hidden Element or elements hidden as a result of the collapse.
    * @param affected Element or elements affected by the hidden items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createCollapseAnimation")
  @js.native
  def createCollapseAnimation(hidden: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an object that performs an animation that removes an item or items from a list.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createDeleteFromListAnimation")
  @js.native
  def createDeleteFromListAnimation(deleted: js.Any, remaining: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an object that performs an animation that removes an item or items from a list of search results.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createDeleteFromSearchListAnimation")
  @js.native
  def createDeleteFromSearchListAnimation(deleted: js.Any, remaining: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an object that performs an animation that expands a list.
    * @param revealed Element or elements revealed by the expansion.
    * @param affected Element or elements affected by the newly revealed items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createExpandAnimation")
  @js.native
  def createExpandAnimation(revealed: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an exit and entrance animation to play for a page navigation given the current and incoming pages'
    * animation preferences and whether the pages are navigating forwards or backwards.
    * @param currentPreferredAnimation A value from WinJS.UI.PageNavigationAnimation describing the animation the current page prefers to use.
    * @param A value from nextPreferredAnimation WinJS.UI.PageNavigationAnimation describing the animation the incoming page prefers to use.
    * @param movingBackwards Boolean value for whether the navigation is moving backwards.
    * @returns an object containing the exit and entrance animations to play based on the parameters given.
    **/
  @JSGlobal("WinJS.UI.Animation.createPageNavigationAnimations")
  @js.native
  def createPageNavigationAnimations(currentPreferredAnimation: String, nextPreferredAnimation: String, movingBackwards: Boolean): Entrance = js.native
  
  /**
    * Creates an object that performs a peek animation.
    * @param element Element or elements involved in the peek.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createPeekAnimation")
  @js.native
  def createPeekAnimation(element: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Creates an object that performs an animation that moves an item or items.
    * @param element Element or elements involved in the reposition.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.createRepositionAnimation")
  @js.native
  def createRepositionAnimation(element: js.Any): IAnimationMethodResponse = js.native
  
  /**
    * Performs an animation that fades an item or items in, fading out existing items that occupy the same space.
    * @param incoming Element or elements being faded in.
    * @param outgoing Element or elements being replaced.
    * @returns An object that completes when the animation has finished.
    **/
  @JSGlobal("WinJS.UI.Animation.crossFade")
  @js.native
  def crossFade(incoming: js.Any, outgoing: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation when a dragged object is moved such that dropping it in that position would move other items. The potentially affected items are animated out of the way to show where the object would be dropped.
    * @param target Element or elements that the dragged object would cause to be moved if it were dropped.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.dragBetweenEnter")
  @js.native
  def dragBetweenEnter(target: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.dragBetweenEnter")
  @js.native
  def dragBetweenEnter(target: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation when a dragged object is moved away from items that it had previously involved in a dragBetweenEnter animation. The affected objects are animated back to their original positions.
    * @param target Element or elements that the dragged object would no longer cause to be displaced, due to its moving away. This should be the same element or element collection passed as the target parameter in the dragBetweenEnter animation.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.dragBetweenLeave")
  @js.native
  def dragBetweenLeave(target: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation when the user finishes dragging an object.
    * @param dragSource Element or elements that were dragged.
    * @param offset Initial offset from the drop point. The dropped object begins at the offset and animates to its final position at the drop point. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param affected Element or elements whose position the dropped object affects. Typically, this is all other items in a reorderable list. This should be the same element or element collection passed as the affected parameter in the dragSourceStart animation.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.dragSourceEnd")
  @js.native
  def dragSourceEnd(dragSource: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.dragSourceEnd")
  @js.native
  def dragSourceEnd(dragSource: js.Any, offset: js.UndefOr[scala.Nothing], affected: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.dragSourceEnd")
  @js.native
  def dragSourceEnd(dragSource: js.Any, offset: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.dragSourceEnd")
  @js.native
  def dragSourceEnd(dragSource: js.Any, offset: js.Any, affected: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation when the user begins to drag an object.
    * @param dragSource Element or elements being dragged.
    * @param affected Element or elements whose position is affected by the movement of the dragged object. Typically, this is all other items in a reorderable list.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.dragSourceStart")
  @js.native
  def dragSourceStart(dragSource: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.dragSourceStart")
  @js.native
  def dragSourceStart(dragSource: js.Any, affected: js.Any): Promise[_] = js.native
  
  /**
    * Execute the incoming phase of the drill in animation, scaling up the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  @JSGlobal("WinJS.UI.Animation.drillInIncoming")
  @js.native
  def drillInIncoming(incomingPage: HTMLElement): Promise[_] = js.native
  
  /**
    * Execute the outgoing phase of the drill in animation, scaling up the outgoing page while fading it out.
    * @param incomingPage Element to be scaled up and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  @JSGlobal("WinJS.UI.Animation.drillInOutgoing")
  @js.native
  def drillInOutgoing(outgoingPage: HTMLElement): Promise[_] = js.native
  
  /**
    * Execute the incoming phase of the drill out animation, scaling down the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  @JSGlobal("WinJS.UI.Animation.drillOutIncoming")
  @js.native
  def drillOutIncoming(incomingPage: HTMLElement): Promise[_] = js.native
  
  /**
    * Execute the outgoing phase of the drill out animation, scaling down the outgoing page while fading it out.
    * @param outgoingPage Element to be scaled down and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  @JSGlobal("WinJS.UI.Animation.drillOutOutgoing")
  @js.native
  def drillOutOutgoing(outgoingPage: HTMLElement): Promise[_] = js.native
  
  /**
    * Performs an animation that displays one or more elements on a page.
    * @param incoming Element or elements that compose the incoming content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.enterContent")
  @js.native
  def enterContent(incoming: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.enterContent")
  @js.native
  def enterContent(incoming: js.Any, offset: js.UndefOr[scala.Nothing], options: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.enterContent")
  @js.native
  def enterContent(incoming: js.Any, offset: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.enterContent")
  @js.native
  def enterContent(incoming: js.Any, offset: js.Any, options: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that shows a new page of content, either when transitioning between pages in a running app or when displaying the first content in a newly launched app.
    * @param element Element or an array of elements that represent the content. If element refers to an array of elements, the elements enter in array order.
    * @param offset An initial offset where the element or elements begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.enterPage")
  @js.native
  def enterPage(element: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.enterPage")
  @js.native
  def enterPage(element: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that hides one or more elements on a page.
    * @param outgoing Element or elements that compose the outgoing content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.exitContent")
  @js.native
  def exitContent(outgoing: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.exitContent")
  @js.native
  def exitContent(outgoing: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that dismisses the current page when transitioning between pages in an app.
    * @param outgoing Element or elements that compose the outgoing page.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.exitPage")
  @js.native
  def exitPage(outgoing: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.exitPage")
  @js.native
  def exitPage(outgoing: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that fades an item or set of items into view.
    * @param shown Element or elements being faded in.
    * @returns An object that completes when the animation has finished. Use this object when subsequent actions need this animation to finish before they take place.
    **/
  @JSGlobal("WinJS.UI.Animation.fadeIn")
  @js.native
  def fadeIn(shown: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that fades an item or set of items out of view.
    * @param hidden Element or elements being faded out.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.fadeOut")
  @js.native
  def fadeOut(hidden: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that hides edge-based user interface (UI).
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.hideEdgeUI")
  @js.native
  def hideEdgeUI(element: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.hideEdgeUI")
  @js.native
  def hideEdgeUI(element: js.Any, offset: js.UndefOr[scala.Nothing], options: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.hideEdgeUI")
  @js.native
  def hideEdgeUI(element: js.Any, offset: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.hideEdgeUI")
  @js.native
  def hideEdgeUI(element: js.Any, offset: js.Any, options: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that hides a panel.
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.hidePanel")
  @js.native
  def hidePanel(element: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.hidePanel")
  @js.native
  def hidePanel(element: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that removes pop-up user interface (UI).
    * @param element Element or elements that are being hidden.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.hidePopup")
  @js.native
  def hidePopup(element: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation when a pointer is pressed on an object.
    * @param element Element or elements on which the pointer is pressed.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.pointerDown")
  @js.native
  def pointerDown(element: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation when a pointer is released.
    * @param element Element or elements that the pointer was pressed on.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.pointerUp")
  @js.native
  def pointerUp(element: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that slides a narrow, edge-based user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.showEdgeUI")
  @js.native
  def showEdgeUI(element: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.showEdgeUI")
  @js.native
  def showEdgeUI(element: js.Any, offset: js.UndefOr[scala.Nothing], options: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.showEdgeUI")
  @js.native
  def showEdgeUI(element: js.Any, offset: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.showEdgeUI")
  @js.native
  def showEdgeUI(element: js.Any, offset: js.Any, options: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that slides a large panel user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.showPanel")
  @js.native
  def showPanel(element: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.showPanel")
  @js.native
  def showPanel(element: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that displays a pop-up user interface (UI).
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.showPopup")
  @js.native
  def showPopup(element: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.showPopup")
  @js.native
  def showPopup(element: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Execute a slide down animation.
    * @param incoming Single element or collection of elements to animate sliding down.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.slideDown")
  @js.native
  def slideDown(incoming: js.Any): Promise[_] = js.native
  
  /**
    * Execute a slide in from right to left animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding in.
    * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.slideLeftIn")
  @js.native
  def slideLeftIn(page: js.Any, first: js.Any, second: js.Any, third: js.Any): Promise[_] = js.native
  
  /**
    * Execute a slide out from right to left animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.slideLeftOut")
  @js.native
  def slideLeftOut(page: js.Any, first: js.Any, second: js.Any, third: js.Any): Promise[_] = js.native
  
  /**
    * Execute a slide in from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding in.
    * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.slideRightIn")
  @js.native
  def slideRightIn(page: js.Any, first: js.Any, second: js.Any, third: js.Any): Promise[_] = js.native
  
  /**
    * Execute a slide out from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.slideRightOut")
  @js.native
  def slideRightOut(page: js.Any, first: js.Any, second: js.Any, third: js.Any): Promise[_] = js.native
  
  /**
    * Execute a slide up animation.
    * @param incoming Single element or collection of elements to animate sliding up.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.slideUp")
  @js.native
  def slideUp(incoming: js.Any): Promise[_] = js.native
  
  /**
    * Performs a deselection animation in response to a swipe interaction.
    * @param deselected Element or elements that become unselected.
    * @param selection Element or elements that represent the selection, typically a check mark.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.swipeDeselect")
  @js.native
  def swipeDeselect(deselected: js.Any, selection: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that reveals an item or items in response to a swipe interaction.
    * @param target Element or elements being revealed.
    * @param offset An initial offset where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.swipeReveal")
  @js.native
  def swipeReveal(target: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.swipeReveal")
  @js.native
  def swipeReveal(target: js.Any, offset: js.Any): Promise[_] = js.native
  
  /**
    * Performs a selection animation in response to a swipe interaction.
    * @param selected Element or elements being selected.
    * @param selection Element or elements that show that something is selected, typically a check mark.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.swipeSelect")
  @js.native
  def swipeSelect(selected: js.Any, selection: js.Any): Promise[_] = js.native
  
  /**
    * Execute a turnstile backward in animation.
    * @param incoming Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.turnstileBackwardIn")
  @js.native
  def turnstileBackwardIn(incoming: js.Any): Promise[_] = js.native
  
  /**
    * Execute a turnstile backward out animation.
    * @param outgoing Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.turnstileBackwardOut")
  @js.native
  def turnstileBackwardOut(outgoing: js.Any): Promise[_] = js.native
  
  /**
    * Execute a turnstile forward in animation.
    * @param incoming Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.turnstileForwardIn")
  @js.native
  def turnstileForwardIn(incoming: js.Any): Promise[_] = js.native
  
  /**
    * Execute a turnstile forward out animation.
    * @param outgoing Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.turnstileForwardOut")
  @js.native
  def turnstileForwardOut(outgoing: js.Any): Promise[_] = js.native
  
  /**
    * Performs an animation that updates a badge.
    * @param incoming Element or elements that comprise the new badge.
    * @param offset Initial offsets where incoming animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  @JSGlobal("WinJS.UI.Animation.updateBadge")
  @js.native
  def updateBadge(incoming: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Animation.updateBadge")
  @js.native
  def updateBadge(incoming: js.Any, offset: js.Any): Promise[_] = js.native
}
