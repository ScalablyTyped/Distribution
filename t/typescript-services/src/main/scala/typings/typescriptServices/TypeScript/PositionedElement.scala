package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedElement extends StObject {
  
  /* private */ var _element: Any
  
  /* private */ var _fullStart: Any
  
  /* private */ var _parent: Any
  
  def childAt(index: Double): PositionedElement
  
  def childCount(): Double
  
  def childEnd(child: ISyntaxElement): Double
  
  def childEndAt(index: Double): Double
  
  def childIndex(child: ISyntaxElement): Double
  
  def childStart(child: ISyntaxElement): Double
  
  def childStartAt(index: Double): Double
  
  def containingNode(): PositionedNode
  
  def element(): ISyntaxElement
  
  def end(): Double
  
  def fullEnd(): Double
  
  def fullStart(): Double
  
  def fullWidth(): Double
  
  def getPositionedChild(child: ISyntaxElement): PositionedElement
  
  def kind(): SyntaxKind
  
  def parent(): PositionedElement
  
  def parentElement(): ISyntaxElement
  
  def root(): PositionedNode
  
  def start(): Double
}
object PositionedElement {
  
  inline def apply(
    _element: Any,
    _fullStart: Any,
    _parent: Any,
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
  implicit open class MutableBuilder[Self <: PositionedElement] (val x: Self) extends AnyVal {
    
    inline def setChildAt(value: Double => PositionedElement): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    inline def setChildCount(value: () => Double): Self = StObject.set(x, "childCount", js.Any.fromFunction0(value))
    
    inline def setChildEnd(value: ISyntaxElement => Double): Self = StObject.set(x, "childEnd", js.Any.fromFunction1(value))
    
    inline def setChildEndAt(value: Double => Double): Self = StObject.set(x, "childEndAt", js.Any.fromFunction1(value))
    
    inline def setChildIndex(value: ISyntaxElement => Double): Self = StObject.set(x, "childIndex", js.Any.fromFunction1(value))
    
    inline def setChildStart(value: ISyntaxElement => Double): Self = StObject.set(x, "childStart", js.Any.fromFunction1(value))
    
    inline def setChildStartAt(value: Double => Double): Self = StObject.set(x, "childStartAt", js.Any.fromFunction1(value))
    
    inline def setContainingNode(value: () => PositionedNode): Self = StObject.set(x, "containingNode", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => ISyntaxElement): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setFullEnd(value: () => Double): Self = StObject.set(x, "fullEnd", js.Any.fromFunction0(value))
    
    inline def setFullStart(value: () => Double): Self = StObject.set(x, "fullStart", js.Any.fromFunction0(value))
    
    inline def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    inline def setGetPositionedChild(value: ISyntaxElement => PositionedElement): Self = StObject.set(x, "getPositionedChild", js.Any.fromFunction1(value))
    
    inline def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setParent(value: () => PositionedElement): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    inline def setParentElement(value: () => ISyntaxElement): Self = StObject.set(x, "parentElement", js.Any.fromFunction0(value))
    
    inline def setRoot(value: () => PositionedNode): Self = StObject.set(x, "root", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_fullStart(value: Any): Self = StObject.set(x, "_fullStart", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
  }
}
