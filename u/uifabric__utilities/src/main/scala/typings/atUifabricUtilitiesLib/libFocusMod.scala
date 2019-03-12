package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/focus", JSImport.Namespace)
@js.native
object libFocusMod extends js.Object {
  def doesElementContainFocus(element: stdLib.HTMLElement): scala.Boolean = js.native
  def focusAsync(): scala.Unit = js.native
  def focusAsync(element: atUifabricUtilitiesLib.Anon_Focus): scala.Unit = js.native
  def focusAsync(element: stdLib.HTMLElement): scala.Unit = js.native
  def focusFirstChild(rootElement: stdLib.HTMLElement): scala.Boolean = js.native
  def getElementIndexPath(fromElement: stdLib.HTMLElement, toElement: stdLib.HTMLElement): js.Array[scala.Double] = js.native
  def getFirstFocusable(rootElement: stdLib.HTMLElement, currentElement: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getFirstFocusable(
    rootElement: stdLib.HTMLElement,
    currentElement: stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): stdLib.HTMLElement | scala.Null = js.native
  def getFirstTabbable(rootElement: stdLib.HTMLElement, currentElement: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getFirstTabbable(
    rootElement: stdLib.HTMLElement,
    currentElement: stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): stdLib.HTMLElement | scala.Null = js.native
  def getFocusableByIndexPath(parent: stdLib.HTMLElement, path: js.Array[scala.Double]): js.UndefOr[stdLib.HTMLElement] = js.native
  def getLastFocusable(rootElement: stdLib.HTMLElement, currentElement: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getLastFocusable(
    rootElement: stdLib.HTMLElement,
    currentElement: stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): stdLib.HTMLElement | scala.Null = js.native
  def getLastTabbable(rootElement: stdLib.HTMLElement, currentElement: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getLastTabbable(
    rootElement: stdLib.HTMLElement,
    currentElement: stdLib.HTMLElement,
    includeElementsInFocusZones: scala.Boolean
  ): stdLib.HTMLElement | scala.Null = js.native
  def getNextElement(
    rootElement: stdLib.HTMLElement,
    currentElement: scala.Null,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    suppressChildTraversal: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): stdLib.HTMLElement | scala.Null = js.native
  def getNextElement(
    rootElement: stdLib.HTMLElement,
    currentElement: stdLib.HTMLElement,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    suppressChildTraversal: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): stdLib.HTMLElement | scala.Null = js.native
  def getPreviousElement(
    rootElement: stdLib.HTMLElement,
    currentElement: scala.Null,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    traverseChildren: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): stdLib.HTMLElement | scala.Null = js.native
  def getPreviousElement(
    rootElement: stdLib.HTMLElement,
    currentElement: stdLib.HTMLElement,
    checkNode: js.UndefOr[scala.Boolean],
    suppressParentTraversal: js.UndefOr[scala.Boolean],
    traverseChildren: js.UndefOr[scala.Boolean],
    includeElementsInFocusZones: js.UndefOr[scala.Boolean],
    allowFocusRoot: js.UndefOr[scala.Boolean],
    tabbable: js.UndefOr[scala.Boolean]
  ): stdLib.HTMLElement | scala.Null = js.native
  def isElementFocusSubZone(): scala.Boolean = js.native
  def isElementFocusSubZone(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isElementFocusZone(): scala.Boolean = js.native
  def isElementFocusZone(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isElementTabbable(element: stdLib.HTMLElement, checkTabIndex: scala.Boolean): scala.Boolean = js.native
  def isElementVisible(): scala.Boolean = js.native
  def isElementVisible(element: stdLib.HTMLElement): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-horizontal-wrap`(
    element: stdLib.HTMLElement,
    noWrapDataAttribute: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-no-horizontal-wrap`
  ): scala.Boolean = js.native
  @JSName("shouldWrapFocus")
  def `shouldWrapFocus_data-no-vertical-wrap`(
    element: stdLib.HTMLElement,
    noWrapDataAttribute: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-no-vertical-wrap`
  ): scala.Boolean = js.native
}

