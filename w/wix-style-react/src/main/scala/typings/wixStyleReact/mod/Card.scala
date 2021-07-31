package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialCardProps
import typings.wixStyleReact.anon.WeakValidationMapCardProp
import typings.wixStyleReact.cardContentMod.default
import typings.wixStyleReact.cardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/es/src/Card.CardProps> & {  Content :new (): wix-style-react.wix-style-react/dist/es/src/Card/Content.default,   Header :new (): wix-style-react.wix-style-react/dist/es/src/Card/Header.default,   Divider :react.react.FunctionComponent<wix-style-react.wix-style-react/dist/es/src/Divider.DividerProps>,   Subheader :new (): wix-style-react.wix-style-react/dist/es/src/Card/Subheader.default} */
object Card {
  
  @scala.inline
  def apply(props: PropsWithChildren[CardProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  @scala.inline
  def apply(props: PropsWithChildren[CardProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("wix-style-react", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "Card.Content")
  @js.native
  class Content () extends default
  @JSImport("wix-style-react", "Card.Content")
  @js.native
  def Content: Instantiable0[default] = js.native
  @scala.inline
  def Content_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.Divider")
  @js.native
  def Divider: FunctionComponent[typings.wixStyleReact.srcDividerMod.DividerProps] = js.native
  @scala.inline
  def Divider_=(x: FunctionComponent[typings.wixStyleReact.srcDividerMod.DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "Card.Header")
  @js.native
  class Header ()
    extends typings.wixStyleReact.cardHeaderMod.default
  @JSImport("wix-style-react", "Card.Header")
  @js.native
  def Header: Instantiable0[typings.wixStyleReact.cardHeaderMod.default] = js.native
  @scala.inline
  def Header_=(x: Instantiable0[typings.wixStyleReact.cardHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "Card.Subheader")
  @js.native
  class Subheader ()
    extends typings.wixStyleReact.subheaderMod.default
  @JSImport("wix-style-react", "Card.Subheader")
  @js.native
  def Subheader: Instantiable0[typings.wixStyleReact.subheaderMod.default] = js.native
  @scala.inline
  def Subheader_=(x: Instantiable0[typings.wixStyleReact.subheaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subheader")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialCardProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialCardProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapCardProp] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapCardProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
