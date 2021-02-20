package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedElement extends StObject {
  
  var _element: js.Any = js.native
  
  var _fullStart: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  def childAt(index: Double): PositionedElement = js.native
  
  def childCount(): Double = js.native
  
  def childEnd(child: ISyntaxElement): Double = js.native
  
  def childEndAt(index: Double): Double = js.native
  
  def childIndex(child: ISyntaxElement): Double = js.native
  
  def childStart(child: ISyntaxElement): Double = js.native
  
  def childStartAt(index: Double): Double = js.native
  
  def containingNode(): PositionedNode = js.native
  
  def element(): ISyntaxElement = js.native
  
  def end(): Double = js.native
  
  def fullEnd(): Double = js.native
  
  def fullStart(): Double = js.native
  
  def fullWidth(): Double = js.native
  
  def getPositionedChild(child: ISyntaxElement): PositionedElement = js.native
  
  def kind(): SyntaxKind = js.native
  
  def parent(): PositionedElement = js.native
  
  def parentElement(): ISyntaxElement = js.native
  
  def root(): PositionedNode = js.native
  
  def start(): Double = js.native
}
object PositionedElement {
  
  @scala.inline
  def apply(
    _element: js.Any,
    _fullStart: js.Any,
    _parent: js.Any,
    childAt: Double => PositionedElement,
    childCount: () => Double,
    childEnd: ISyntaxElement => Double,
    childEndAt: Double => Double,
    childIndex: ISyntaxElement => Double,
    childStart: ISyntaxElement => Double,
    childStartAt: Double => Double,
    containingNode: () => PositionedNode,
    element: () => ISyntaxElement,
    end: () => Double,
    fullEnd: () => Double,
    fullStart: () => Double,
    fullWidth: () => Double,
    getPositionedChild: ISyntaxElement => PositionedElement,
    kind: () => SyntaxKind,
    parent: () => PositionedElement,
    parentElement: () => ISyntaxElement,
    root: () => PositionedNode,
    start: () => Double
  ): PositionedElement = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), childEnd = js.Any.fromFunction1(childEnd), childEndAt = js.Any.fromFunction1(childEndAt), childIndex = js.Any.fromFunction1(childIndex), childStart = js.Any.fromFunction1(childStart), childStartAt = js.Any.fromFunction1(childStartAt), containingNode = js.Any.fromFunction0(containingNode), element = js.Any.fromFunction0(element), end = js.Any.fromFunction0(end), fullEnd = js.Any.fromFunction0(fullEnd), fullStart = js.Any.fromFunction0(fullStart), fullWidth = js.Any.fromFunction0(fullWidth), getPositionedChild = js.Any.fromFunction1(getPositionedChild), kind = js.Any.fromFunction0(kind), parent = js.Any.fromFunction0(parent), parentElement = js.Any.fromFunction0(parentElement), root = js.Any.fromFunction0(root), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[PositionedElement]
  }
  
  @scala.inline
  implicit class PositionedElementMutableBuilder[Self <: PositionedElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildAt(value: Double => PositionedElement): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildCount(value: () => Double): Self = StObject.set(x, "childCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildEnd(value: ISyntaxElement => Double): Self = StObject.set(x, "childEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildEndAt(value: Double => Double): Self = StObject.set(x, "childEndAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildIndex(value: ISyntaxElement => Double): Self = StObject.set(x, "childIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildStart(value: ISyntaxElement => Double): Self = StObject.set(x, "childStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildStartAt(value: Double => Double): Self = StObject.set(x, "childStartAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainingNode(value: () => PositionedNode): Self = StObject.set(x, "containingNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: () => ISyntaxElement): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullEnd(value: () => Double): Self = StObject.set(x, "fullEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullStart(value: () => Double): Self = StObject.set(x, "fullStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPositionedChild(value: ISyntaxElement => PositionedElement): Self = StObject.set(x, "getPositionedChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: () => PositionedElement): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParentElement(value: () => ISyntaxElement): Self = StObject.set(x, "parentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: () => PositionedNode): Self = StObject.set(x, "root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_element(value: js.Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fullStart(value: js.Any): Self = StObject.set(x, "_fullStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parent(value: js.Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
  }
}
