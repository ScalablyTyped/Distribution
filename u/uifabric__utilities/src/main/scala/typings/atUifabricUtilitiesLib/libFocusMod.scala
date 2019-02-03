package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/focus", JSImport.Namespace)
@js.native
object libFocusMod extends js.Object {
  def doesElementContainFocus(element: reactLib.HTMLElement): scala.Boolean = js.native
  def focusAsync(): scala.Unit = js.native
  def focusAsync(element: atUifabricUtilitiesLib.Anon_Focus): scala.Unit = js.native
  def focusAsync(element: reactLib.HTMLElement): scala.Unit = js.native
  def focusFirstChild(rootElement: reactLib.HTMLElement): scala.Boolean = js.native
  def getElementIndexPath(fromElement: reactLib.HTMLElement, toElement: reactLib.HTMLElement): js.Array[scala.Double] = js.native
  def getFirstFocusable(rootElement: reactLib.HTMLElement, currentElement: reactLib.HTMLElement): reactLib.HTMLElement | scala.Null = js.native
  def getFirstFocusable(
    rootElement: reactLib.HTMLElement,
    currentElement: reactLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): reactLib.HTMLElement | scala.Null = js.native
  def getFirstTabbable(rootElement: reactLib.HTMLElement, currentElement: reactLib.HTMLElement): reactLib.HTMLElement | scala.Null = js.native
  def getFirstTabbable(
    rootElement: reactLib.HTMLElement,
    currentElement: reactLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): reactLib.HTMLElement | scala.Null = js.native
  def getFocusableByIndexPath(parent: reactLib.HTMLElement, path: js.Array[scala.Double]): js.UndefOr[reactLib.HTMLElement] = js.native
  def getLastFocusable(rootElement: reactLib.HTMLElement, currentElement: reactLib.HTMLElement): reactLib.HTMLElement | scala.Null = js.native
  def getLastFocusable(
    rootElement: reactLib.HTMLElement,
    currentElement: reactLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): reactLib.HTMLElement | scala.Null = js.native
  def getLastTabbable(rootElement: reactLib.HTMLElement, currentElement: reactLib.HTMLElement): reactLib.HTMLElement | scala.Null = js.native
  def getLastTabbable(
    rootElement: reactLib.HTMLElement,
    currentElement: reactLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): reactLib.HTMLElement | scala.Null = js.native
  def getNextElement(
    rootElement: reactLib.HTMLElement,
    currentElement: reactLib.HTMLElement,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    suppressChildTraversal: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def getNextElement(
    rootElement: reactLib.HTMLElement,
    currentElement: scala.Null,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    suppressChildTraversal: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def getPreviousElement(
    rootElement: reactLib.HTMLElement,
    currentElement: reactLib.HTMLElement,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    traverseChildren: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def getPreviousElement(
    rootElement: reactLib.HTMLElement,
    currentElement: scala.Null,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    traverseChildren: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def isElementFocusSubZone(): scala.Boolean = js.native
  def isElementFocusSubZone(element: reactLib.HTMLElement): scala.Boolean = js.native
  def isElementFocusZone(): scala.Boolean = js.native
  def isElementFocusZone(element: reactLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: reactLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: reactLib.HTMLElement, checkTabIndex: scala.Boolean): scala.Boolean = js.native
  def isElementVisible(): scala.Boolean = js.native
  def isElementVisible(element: reactLib.HTMLElement): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-horizontal-wrap`(
    element: reactLib.HTMLElement,
    noWrapDataAttribute: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-no-horizontal-wrap`
  ): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-vertical-wrap`(
    element: reactLib.HTMLElement,
    noWrapDataAttribute: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-no-vertical-wrap`
  ): scala.Boolean = js.native
}

