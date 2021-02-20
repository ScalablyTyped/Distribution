package typings.uifabricUtilities

import typings.std.HTMLElement
import typings.uifabricUtilities.anon.Focus
import typings.uifabricUtilities.uifabricUtilitiesStrings.`data-no-horizontal-wrap`
import typings.uifabricUtilities.uifabricUtilitiesStrings.`data-no-vertical-wrap`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusMod {
  
  @JSImport("@uifabric/utilities/lib/focus", "doesElementContainFocus")
  @js.native
  def doesElementContainFocus(element: HTMLElement): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "focusAsync")
  @js.native
  def focusAsync(): Unit = js.native
  @JSImport("@uifabric/utilities/lib/focus", "focusAsync")
  @js.native
  def focusAsync(element: HTMLElement): Unit = js.native
  @JSImport("@uifabric/utilities/lib/focus", "focusAsync")
  @js.native
  def focusAsync(element: Focus): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "focusFirstChild")
  @js.native
  def focusFirstChild(rootElement: HTMLElement): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getElementIndexPath")
  @js.native
  def getElementIndexPath(fromElement: HTMLElement, toElement: HTMLElement): js.Array[Double] = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getFirstFocusable")
  @js.native
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getFirstFocusable")
  @js.native
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getFirstTabbable")
  @js.native
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getFirstTabbable")
  @js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getFirstTabbable")
  @js.native
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getFirstTabbable")
  @js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getFocusableByIndexPath")
  @js.native
  def getFocusableByIndexPath(parent: HTMLElement, path: js.Array[Double]): js.UndefOr[HTMLElement] = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getLastFocusable")
  @js.native
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getLastFocusable")
  @js.native
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getLastTabbable")
  @js.native
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getLastTabbable")
  @js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getLastTabbable")
  @js.native
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/focus", "getLastTabbable")
  @js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getNextElement")
  @js.native
  def getNextElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "getPreviousElement")
  @js.native
  def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "isElementFocusSubZone")
  @js.native
  def isElementFocusSubZone(): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/focus", "isElementFocusSubZone")
  @js.native
  def isElementFocusSubZone(element: HTMLElement): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "isElementFocusZone")
  @js.native
  def isElementFocusZone(): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/focus", "isElementFocusZone")
  @js.native
  def isElementFocusZone(element: HTMLElement): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "isElementTabbable")
  @js.native
  def isElementTabbable(element: HTMLElement): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/focus", "isElementTabbable")
  @js.native
  def isElementTabbable(element: HTMLElement, checkTabIndex: Boolean): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "isElementVisible")
  @js.native
  def isElementVisible(): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/focus", "isElementVisible")
  @js.native
  def isElementVisible(element: HTMLElement): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/focus", "shouldWrapFocus")
  @js.native
  def shouldWrapFocus_datanohorizontalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-horizontal-wrap`): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/focus", "shouldWrapFocus")
  @js.native
  def shouldWrapFocus_datanoverticalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-vertical-wrap`): Boolean = js.native
}
