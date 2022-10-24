package typings.wixStyleReact

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.Left
import typings.wixStyleReact.anon.LeftTop
import typings.wixStyleReact.anon.Timeout
import typings.wixStyleReact.anon.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverCoreUtilsUtilsMod {
  
  @JSImport("wix-style-react/dist/types/Popover/PopoverCore/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachClasses(node: Null, classnames: String): Unit | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("attachClasses")(node.asInstanceOf[js.Any], classnames.asInstanceOf[js.Any])).asInstanceOf[Unit | Null]
  inline def attachClasses(node: HTMLElement, classnames: String): Unit | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("attachClasses")(node.asInstanceOf[js.Any], classnames.asInstanceOf[js.Any])).asInstanceOf[Unit | Null]
  
  inline def buildChildrenObject[T](children: ReactNode, childrenObject: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildrenObject")(children.asInstanceOf[js.Any], childrenObject.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createComponentThatRendersItsChildren(displayName: String): FunctionComponent[ElementProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponentThatRendersItsChildren")(displayName.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[ElementProps]]
  
  inline def detachClasses(node: Null, classnames: String): Unit | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detachClasses")(node.asInstanceOf[js.Any], classnames.asInstanceOf[js.Any])).asInstanceOf[Unit | Null]
  inline def detachClasses(node: HTMLElement, classnames: String): Unit | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detachClasses")(node.asInstanceOf[js.Any], classnames.asInstanceOf[js.Any])).asInstanceOf[Unit | Null]
  
  inline def getArrowShift(shift: Double, direction: String): Left | Top | LeftTop = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowShift")(shift.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Left | Top | LeftTop]
  inline def getArrowShift(shift: Unit, direction: String): Left | Top | LeftTop = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowShift")(shift.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Left | Top | LeftTop]
  
  inline def getParentNode(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentNode")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getScrollParent(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollParent")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isReactElement[T](child: Any, Element: ComponentType[T]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactElement")(child.asInstanceOf[js.Any], Element.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def isStatelessComponent(Component: FC[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatelessComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Null]
  
  inline def shouldAnimatePopover(param0: Timeout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldAnimatePopover")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ElementProps extends StObject {
    
    var children: Any
  }
  object ElementProps {
    
    inline def apply(children: Any): ElementProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementProps]
    }
    
    extension [Self <: ElementProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
