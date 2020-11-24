package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedElement extends js.Object {
  
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
  implicit class PositionedElementOps[Self <: PositionedElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_element(value: js.Any): Self = this.set("_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fullStart(value: js.Any): Self = this.set("_fullStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parent(value: js.Any): Self = this.set("_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildAt(value: Double => PositionedElement): Self = this.set("childAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildCount(value: () => Double): Self = this.set("childCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildEnd(value: ISyntaxElement => Double): Self = this.set("childEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildEndAt(value: Double => Double): Self = this.set("childEndAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildIndex(value: ISyntaxElement => Double): Self = this.set("childIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildStart(value: ISyntaxElement => Double): Self = this.set("childStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildStartAt(value: Double => Double): Self = this.set("childStartAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainingNode(value: () => PositionedNode): Self = this.set("containingNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: () => ISyntaxElement): Self = this.set("element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullEnd(value: () => Double): Self = this.set("fullEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullStart(value: () => Double): Self = this.set("fullStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = this.set("fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPositionedChild(value: ISyntaxElement => PositionedElement): Self = this.set("getPositionedChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: () => PositionedElement): Self = this.set("parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParentElement(value: () => ISyntaxElement): Self = this.set("parentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: () => PositionedNode): Self = this.set("root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
