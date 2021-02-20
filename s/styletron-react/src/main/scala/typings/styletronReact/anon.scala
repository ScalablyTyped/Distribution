package typings.styletronReact

import typings.react.mod.ReactNode
import typings.styletronReact.mod.DebugEngine
import typings.styletronReact.mod.StackInfo
import typings.styletronStandard.mod.StandardEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): ReactNode = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactNode): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (StandardEngine, DebugEngine, Boolean) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ClassName extends StObject {
    
    var className: String = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hydrating extends StObject {
    
    var hydrating: Boolean = js.native
  }
  object Hydrating {
    
    @scala.inline
    def apply(hydrating: Boolean): Hydrating = {
      val __obj = js.Dynamic.literal(hydrating = hydrating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hydrating]
    }
    
    @scala.inline
    implicit class HydratingMutableBuilder[Self <: Hydrating] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHydrating(value: Boolean): Self = StObject.set(x, "hydrating", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackIndex extends StObject {
    
    var stackIndex: typings.styletronReact.mod.StackIndex = js.native
    
    var stackInfo: StackInfo = js.native
  }
  object StackIndex {
    
    @scala.inline
    def apply(stackIndex: typings.styletronReact.mod.StackIndex, stackInfo: StackInfo): StackIndex = {
      val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackIndex]
    }
    
    @scala.inline
    implicit class StackIndexMutableBuilder[Self <: StackIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStackIndex(value: typings.styletronReact.mod.StackIndex): Self = StObject.set(x, "stackIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackInfo(value: StackInfo): Self = StObject.set(x, "stackInfo", value.asInstanceOf[js.Any])
    }
  }
}
