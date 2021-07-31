package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialCardProps
import typings.wixStyleReact.anon.WeakValidationMapCardProp
import typings.wixStyleReact.srcDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/es/src/Card.CardProps> & {  Content :new (): wix-style-react.wix-style-react/dist/es/src/Card/Content.default,   Header :new (): wix-style-react.wix-style-react/dist/es/src/Card/Header.default,   Divider :react.react.FunctionComponent<wix-style-react.wix-style-react/dist/es/src/Divider.DividerProps>,   Subheader :new (): wix-style-react.wix-style-react/dist/es/src/Card/Subheader.default} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[CardProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[CardProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("wix-style-react/dist/es/src/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-style-react/dist/es/src/Card", "default.Content")
    @js.native
    class Content ()
      extends typings.wixStyleReact.cardContentMod.default
    @JSImport("wix-style-react/dist/es/src/Card", "default.Content")
    @js.native
    def Content: Instantiable0[typings.wixStyleReact.cardContentMod.default] = js.native
    @scala.inline
    def Content_=(x: Instantiable0[typings.wixStyleReact.cardContentMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Card", "default.Divider")
    @js.native
    def Divider: FunctionComponent[DividerProps] = js.native
    @scala.inline
    def Divider_=(x: FunctionComponent[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-style-react/dist/es/src/Card", "default.Header")
    @js.native
    class Header ()
      extends typings.wixStyleReact.cardHeaderMod.default
    @JSImport("wix-style-react/dist/es/src/Card", "default.Header")
    @js.native
    def Header: Instantiable0[typings.wixStyleReact.cardHeaderMod.default] = js.native
    @scala.inline
    def Header_=(x: Instantiable0[typings.wixStyleReact.cardHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-style-react/dist/es/src/Card", "default.Subheader")
    @js.native
    class Subheader ()
      extends typings.wixStyleReact.subheaderMod.default
    @JSImport("wix-style-react/dist/es/src/Card", "default.Subheader")
    @js.native
    def Subheader: Instantiable0[typings.wixStyleReact.subheaderMod.default] = js.native
    @scala.inline
    def Subheader_=(x: Instantiable0[typings.wixStyleReact.subheaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subheader")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Card", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Card", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCardProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialCardProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Card", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Card", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCardProp] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapCardProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait CardProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideOverflow: js.UndefOr[Boolean] = js.undefined
    
    var showShadow: js.UndefOr[Boolean] = js.undefined
    
    var stretchVertically: js.UndefOr[Boolean] = js.undefined
  }
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    @scala.inline
    implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setControls(value: ReactNode): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHideOverflow(value: Boolean): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOverflowUndefined: Self = StObject.set(x, "hideOverflow", js.undefined)
      
      @scala.inline
      def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      @scala.inline
      def setStretchVertically(value: Boolean): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
    }
  }
}
