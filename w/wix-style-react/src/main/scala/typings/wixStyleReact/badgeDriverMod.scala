package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeDriverMod {
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getContent(): String
    
    def getSize(): Size
    
    def getSkin(): Skin
    
    def getType(): Type
    
    def hasClickCursor(): Boolean
    
    def isUppercase(): Boolean
    
    def text(): String
  }
  object BadgeDriver {
    
    @scala.inline
    def apply(
      click: () => Unit,
      exists: () => Boolean,
      getContent: () => String,
      getSize: () => Size,
      getSkin: () => Skin,
      getType: () => Type,
      hasClickCursor: () => Boolean,
      isUppercase: () => Boolean,
      text: () => String
    ): BadgeDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getType = js.Any.fromFunction0(getType), hasClickCursor = js.Any.fromFunction0(hasClickCursor), isUppercase = js.Any.fromFunction0(isUppercase), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeDriver]
    }
    
    @scala.inline
    implicit class BadgeDriverMutableBuilder[Self <: BadgeDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSkin(value: () => Skin): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => Type): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClickCursor(value: () => Boolean): Self = StObject.set(x, "hasClickCursor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUppercase(value: () => Boolean): Self = StObject.set(x, "isUppercase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait Size extends StObject
  object Size {
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.general
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.danger
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.neutral
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.urgent
    - typings.wixStyleReact.wixStyleReactStrings.neutralStandard
    - typings.wixStyleReact.wixStyleReactStrings.neutralSuccess
    - typings.wixStyleReact.wixStyleReactStrings.nutralDanger
    - typings.wixStyleReact.wixStyleReactStrings.premium
  */
  trait Skin extends StObject
  object Skin {
    
    @scala.inline
    def danger: typings.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.danger]
    
    @scala.inline
    def general: typings.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.general]
    
    @scala.inline
    def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
    
    @scala.inline
    def neutralStandard: typings.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    @scala.inline
    def neutralSuccess: typings.wixStyleReact.wixStyleReactStrings.neutralSuccess = "neutralSuccess".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralSuccess]
    
    @scala.inline
    def nutralDanger: typings.wixStyleReact.wixStyleReactStrings.nutralDanger = "nutralDanger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.nutralDanger]
    
    @scala.inline
    def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    @scala.inline
    def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    @scala.inline
    def urgent: typings.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.urgent]
    
    @scala.inline
    def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.solid
    - typings.wixStyleReact.wixStyleReactStrings.outlined
    - typings.wixStyleReact.wixStyleReactStrings.transparent
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def outlined: typings.wixStyleReact.wixStyleReactStrings.outlined = "outlined".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.outlined]
    
    @scala.inline
    def solid: typings.wixStyleReact.wixStyleReactStrings.solid = "solid".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.solid]
    
    @scala.inline
    def transparent: typings.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
