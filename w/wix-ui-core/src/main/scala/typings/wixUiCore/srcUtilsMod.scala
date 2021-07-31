package typings.wixUiCore

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("wix-ui-core/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildChildrenObject[T](children: ReactNode, childrenObject: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildrenObject")(children.asInstanceOf[js.Any], childrenObject.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def createComponentThatRendersItsChildren(displayName: String): FunctionComponent[ElementProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponentThatRendersItsChildren")(displayName.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[ElementProps]]
  
  @scala.inline
  def isReactElement[T](child: js.Any, Element: ComponentType[T]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactElement")(child.asInstanceOf[js.Any], Element.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def isStatelessComponent(Component: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatelessComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def noop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Any]
  
  trait ElementProps extends StObject {
    
    var children: js.Any
  }
  object ElementProps {
    
    @scala.inline
    def apply(children: js.Any): ElementProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementProps]
    }
    
    @scala.inline
    implicit class ElementPropsMutableBuilder[Self <: ElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
