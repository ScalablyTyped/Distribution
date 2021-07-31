package typings.uifabricUtilities

import typings.std.HTMLElement
import typings.uifabricUtilities.anon.Focus
import typings.uifabricUtilities.uifabricUtilitiesStrings.`data-no-horizontal-wrap`
import typings.uifabricUtilities.uifabricUtilitiesStrings.`data-no-vertical-wrap`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusMod {
  
  @JSImport("@uifabric/utilities/lib/focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def doesElementContainFocus(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doesElementContainFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def focusAsync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusAsync")().asInstanceOf[Unit]
  @scala.inline
  def focusAsync(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusAsync")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def focusAsync(element: Focus): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusAsync")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def focusFirstChild(rootElement: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusFirstChild")(rootElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getElementIndexPath(fromElement: HTMLElement, toElement: HTMLElement): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndexPath")(fromElement.asInstanceOf[js.Any], toElement.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Unit,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def getFocusableByIndexPath(parent: HTMLElement, path: js.Array[Double]): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableByIndexPath")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  
  @scala.inline
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Unit,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def getNextElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextElement")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any], suppressParentTraversal.asInstanceOf[js.Any], suppressChildTraversal.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], allowFocusRoot.asInstanceOf[js.Any], tabbable.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousElement")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any], suppressParentTraversal.asInstanceOf[js.Any], traverseChildren.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], allowFocusRoot.asInstanceOf[js.Any], tabbable.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def isElementFocusSubZone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusSubZone")().asInstanceOf[Boolean]
  @scala.inline
  def isElementFocusSubZone(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusSubZone")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isElementFocusZone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusZone")().asInstanceOf[Boolean]
  @scala.inline
  def isElementFocusZone(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusZone")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isElementTabbable(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementTabbable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isElementTabbable(element: HTMLElement, checkTabIndex: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementTabbable")(element.asInstanceOf[js.Any], checkTabIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isElementVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisible")().asInstanceOf[Boolean]
  @scala.inline
  def isElementVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldWrapFocus_datanohorizontalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-horizontal-wrap`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldWrapFocus")(element.asInstanceOf[js.Any], noWrapDataAttribute.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldWrapFocus_datanoverticalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-vertical-wrap`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldWrapFocus")(element.asInstanceOf[js.Any], noWrapDataAttribute.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
