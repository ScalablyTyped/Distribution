package typings.styletronReact

import typings.react.mod.ReactNode
import typings.styletronReact.mod.DebugEngine
import typings.styletronReact.mod.StackInfo
import typings.styletronStandard.mod.StandardEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): ReactNode
  }
  object Children {
    
    inline def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactNode): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: (StandardEngine, DebugEngine, Boolean) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
  }
  object ClassName {
    
    inline def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hydrating extends StObject {
    
    var hydrating: Boolean
  }
  object Hydrating {
    
    inline def apply(hydrating: Boolean): Hydrating = {
      val __obj = js.Dynamic.literal(hydrating = hydrating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hydrating]
    }
    
    extension [Self <: Hydrating](x: Self) {
      
      inline def setHydrating(value: Boolean): Self = StObject.set(x, "hydrating", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackIndex extends StObject {
    
    var stackIndex: typings.styletronReact.mod.StackIndex
    
    var stackInfo: StackInfo
  }
  object StackIndex {
    
    inline def apply(stackIndex: typings.styletronReact.mod.StackIndex, stackInfo: StackInfo): StackIndex = {
      val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackIndex]
    }
    
    extension [Self <: StackIndex](x: Self) {
      
      inline def setStackIndex(value: typings.styletronReact.mod.StackIndex): Self = StObject.set(x, "stackIndex", value.asInstanceOf[js.Any])
      
      inline def setStackInfo(value: StackInfo): Self = StObject.set(x, "stackInfo", value.asInstanceOf[js.Any])
    }
  }
}
