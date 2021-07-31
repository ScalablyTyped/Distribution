package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorMod {
  
  @JSImport("wix-style-react/dist/es/src/Selector", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SelectorProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/Selector", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/Selector", "default.ExtraText")
    @js.native
    def ExtraText: Instantiable0[SelectorExtraText] = js.native
    @scala.inline
    def ExtraText_=(x: Instantiable0[SelectorExtraText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtraText")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Selector", "default.ProgressBar")
    @js.native
    def ProgressBar: Instantiable0[SelectorProgressBar] = js.native
    @scala.inline
    def ProgressBar_=(x: Instantiable0[SelectorProgressBar]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressBar")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/es/src/Selector", "SelectorExtraText")
  @js.native
  class SelectorExtraText protected ()
    extends PureComponent[SelectorExtraTextProps, js.Object, js.Any] {
    def this(props: SelectorExtraTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectorExtraTextProps, context: js.Any) = this()
  }
  
  @JSImport("wix-style-react/dist/es/src/Selector", "SelectorProgressBar")
  @js.native
  class SelectorProgressBar protected ()
    extends PureComponent[SelectorProgressBarProps, js.Object, js.Any] {
    def this(props: SelectorProgressBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectorProgressBarProps, context: js.Any) = this()
  }
  
  type Selector = PureComponent[SelectorProps, js.Object, js.Any]
  
  trait SelectorExtraTextProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object SelectorExtraTextProps {
    
    @scala.inline
    def apply(text: String): SelectorExtraTextProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorExtraTextProps]
    }
    
    @scala.inline
    implicit class SelectorExtraTextPropsMutableBuilder[Self <: SelectorExtraTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.rectangular
    - typings.wixStyleReact.wixStyleReactStrings.circle
  */
  trait SelectorImageShape extends StObject
  object SelectorImageShape {
    
    @scala.inline
    def circle: typings.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.circle]
    
    @scala.inline
    def rectangular: typings.wixStyleReact.wixStyleReactStrings.rectangular = "rectangular".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.rectangular]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.portrait
    - typings.wixStyleReact.wixStyleReactStrings.large
    - typings.wixStyleReact.wixStyleReactStrings.cinema
  */
  trait SelectorImageSize extends StObject
  object SelectorImageSize {
    
    @scala.inline
    def cinema: typings.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.cinema]
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def portrait: typings.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.portrait]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    @scala.inline
    def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  trait SelectorProgressBarProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var progress: Double
  }
  object SelectorProgressBarProps {
    
    @scala.inline
    def apply(progress: Double): SelectorProgressBarProps = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorProgressBarProps]
    }
    
    @scala.inline
    implicit class SelectorProgressBarPropsMutableBuilder[Self <: SelectorProgressBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectorProps extends StObject {
    
    var belowNode: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var extraNode: js.UndefOr[ReactNode] = js.undefined
    
    var id: String | Double
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var imageShape: js.UndefOr[SelectorImageShape] = js.undefined
    
    var imageSize: js.UndefOr[SelectorImageSize] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* id */ String | Double, Unit]] = js.undefined
    
    var showBelowNodeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var subtitleNode: js.UndefOr[ReactNode] = js.undefined
    
    var title: String
    
    var toggleType: js.UndefOr[SelectorToggleType] = js.undefined
  }
  object SelectorProps {
    
    @scala.inline
    def apply(id: String | Double, title: String): SelectorProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorProps]
    }
    
    @scala.inline
    implicit class SelectorPropsMutableBuilder[Self <: SelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBelowNode(value: ReactNode): Self = StObject.set(x, "belowNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBelowNodeUndefined: Self = StObject.set(x, "belowNode", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setExtraNode(value: ReactNode): Self = StObject.set(x, "extraNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraNodeUndefined: Self = StObject.set(x, "extraNode", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageShape(value: SelectorImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      @scala.inline
      def setImageSize(value: SelectorImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* id */ String | Double => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setShowBelowNodeOnSelect(value: Boolean): Self = StObject.set(x, "showBelowNodeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBelowNodeOnSelectUndefined: Self = StObject.set(x, "showBelowNodeOnSelect", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleNode(value: ReactNode): Self = StObject.set(x, "subtitleNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleNodeUndefined: Self = StObject.set(x, "subtitleNode", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleType(value: SelectorToggleType): Self = StObject.set(x, "toggleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTypeUndefined: Self = StObject.set(x, "toggleType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.checkbox
    - typings.wixStyleReact.wixStyleReactStrings.radio
  */
  trait SelectorToggleType extends StObject
  object SelectorToggleType {
    
    @scala.inline
    def checkbox: typings.wixStyleReact.wixStyleReactStrings.checkbox = "checkbox".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.checkbox]
    
    @scala.inline
    def radio: typings.wixStyleReact.wixStyleReactStrings.radio = "radio".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.radio]
  }
}
