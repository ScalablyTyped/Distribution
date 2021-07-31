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
    
    @scala.inline
    def middle: typings.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.middle]
    
    @scala.inline
    def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait SkeletonContent extends StObject {
    
    var size: SkeletonContentSize
    
    var `type`: SkeletonContentType
  }
  object SkeletonContent {
    
    @scala.inline
    def apply(size: SkeletonContentSize, `type`: SkeletonContentType): SkeletonContent = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonContent]
    }
    
    @scala.inline
    implicit class SkeletonContentMutableBuilder[Self <: SkeletonContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: SkeletonContentSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SkeletonContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def full: typings.wixStyleReact.wixStyleReactStrings.full = "full".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.full]
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
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
    
    @scala.inline
    def apply(content: js.Array[SkeletonContent]): SkeletonProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonProps]
    }
    
    @scala.inline
    implicit class SkeletonPropsMutableBuilder[Self <: SkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: SkeletonAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: js.Array[SkeletonContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: SkeletonContent*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setSpacing(value: SkeletonSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait SkeletonSpacing extends StObject
  object SkeletonSpacing {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
