package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.wixStyleReactStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("wix-style-react/dist/es/src/Skeleton", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SkeletonProps, js.Object, js.Any]
  
  type Skeleton = PureComponent[SkeletonProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.middle
  */
  trait SkeletonAlignment extends StObject
  object SkeletonAlignment {
    
    inline def middle: typings.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.middle]
    
    inline def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait SkeletonContent extends StObject {
    
    var size: SkeletonContentSize
    
    var `type`: SkeletonContentType
  }
  object SkeletonContent {
    
    inline def apply(size: SkeletonContentSize, `type`: SkeletonContentType): SkeletonContent = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonContent]
    }
    
    extension [Self <: SkeletonContent](x: Self) {
      
      inline def setSize(value: SkeletonContentSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: SkeletonContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
    - typings.wixStyleReact.wixStyleReactStrings.full
  */
  trait SkeletonContentSize extends StObject
  object SkeletonContentSize {
    
    inline def full: typings.wixStyleReact.wixStyleReactStrings.full = "full".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.full]
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  type SkeletonContentType = line
  
  trait SkeletonProps extends StObject {
    
    var alignment: js.UndefOr[SkeletonAlignment] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.Array[SkeletonContent]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var spacing: js.UndefOr[SkeletonSpacing] = js.undefined
  }
  object SkeletonProps {
    
    inline def apply(content: js.Array[SkeletonContent]): SkeletonProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonProps]
    }
    
    extension [Self <: SkeletonProps](x: Self) {
      
      inline def setAlignment(value: SkeletonAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: js.Array[SkeletonContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: SkeletonContent*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSpacing(value: SkeletonSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait SkeletonSpacing extends StObject
  object SkeletonSpacing {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
