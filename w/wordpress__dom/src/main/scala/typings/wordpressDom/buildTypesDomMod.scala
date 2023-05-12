package typings.wordpressDom

import typings.std.DOMRect
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Range
import typings.std.Window
import typings.wordpressDom.buildTypesDomCleanNodeListMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomMod {
  
  @JSImport("@wordpress/dom/build-types/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCaretRect(win: Window): DOMRect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCaretRect")(win.asInstanceOf[js.Any]).asInstanceOf[DOMRect | Null]
  
  inline def documentHasSelection(doc: Document): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("documentHasSelection")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def documentHasTextSelection(doc: Document): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("documentHasTextSelection")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def documentHasUncollapsedSelection(doc: Document): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("documentHasUncollapsedSelection")(doc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getOffsetParent(node: Node): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(node.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def getRectangleFromRange(range: Range): DOMRect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRectangleFromRange")(range.asInstanceOf[js.Any]).asInstanceOf[DOMRect | Null]
  
  inline def getScrollContainer(): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollContainer")().asInstanceOf[js.UndefOr[Element]]
  inline def getScrollContainer(node: Null, direction: String): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollContainer")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
  inline def getScrollContainer(node: Element): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollContainer")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  inline def getScrollContainer(node: Element, direction: String): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollContainer")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
  
  inline def insertAfter(newNode: Node, referenceNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(newNode.asInstanceOf[js.Any], referenceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isEmpty(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEntirelySelected(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelySelected")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFormElement(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHorizontalEdge(container: Element, isReverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumberInput(node: Node): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberInput")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def isRTL(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTextField(node: Node): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextField")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def isVerticalEdge(container: Element, isReverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def placeCaretAtHorizontalEdge(container: HTMLElement, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtHorizontalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: DOMRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("placeCaretAtVerticalEdge")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeInvalidHTML(HTML: String, schema: Schema, `inline`: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeInvalidHTML")(HTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def replace(processedNode: Element, newNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(processedNode.asInstanceOf[js.Any], newNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceTag(node: Element, tagName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def safeHTML(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeHTML")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unstableStripHTML(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__unstableStripHTML")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unwrap(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wrap(newNode: Element, referenceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(newNode.asInstanceOf[js.Any], referenceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
