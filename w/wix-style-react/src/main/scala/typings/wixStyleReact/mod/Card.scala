package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialCardProps
import typings.wixStyleReact.anon.WeakValidationMapCardProp
import typings.wixStyleReact.distTypesCardMod.CardProps
import typings.wixStyleReact.distTypesDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/Card.CardProps> & {  Content :new (): wix-style-react.wix-style-react/dist/types/Card/Content.default,   Header :new (): wix-style-react.wix-style-react/dist/types/Card/Header.default,   Divider :react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/Divider.DividerProps>,   Subheader :new (): wix-style-react.wix-style-react/dist/types/Card/Subheader.default} */
object Card {
  
  inline def apply(props: CardProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: CardProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("wix-style-react", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "Card.Content")
  @js.native
  open class Content ()
    extends typings.wixStyleReact.distTypesCardContentMod.default
  @JSImport("wix-style-react", "Card.Content")
  @js.native
  def Content: Instantiable0[typings.wixStyleReact.distTypesCardContentMod.default] = js.native
  inline def Content_=(x: Instantiable0[typings.wixStyleReact.distTypesCardContentMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.Divider")
  @js.native
  def Divider: FunctionComponent[DividerProps] = js.native
  inline def Divider_=(x: FunctionComponent[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "Card.Header")
  @js.native
  open class Header ()
    extends typings.wixStyleReact.distTypesCardHeaderMod.default
  @JSImport("wix-style-react", "Card.Header")
  @js.native
  def Header: Instantiable0[typings.wixStyleReact.distTypesCardHeaderMod.default] = js.native
  inline def Header_=(x: Instantiable0[typings.wixStyleReact.distTypesCardHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "Card.Subheader")
  @js.native
  open class Subheader ()
    extends typings.wixStyleReact.distTypesCardSubheaderMod.default
  @JSImport("wix-style-react", "Card.Subheader")
  @js.native
  def Subheader: Instantiable0[typings.wixStyleReact.distTypesCardSubheaderMod.default] = js.native
  inline def Subheader_=(x: Instantiable0[typings.wixStyleReact.distTypesCardSubheaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subheader")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialCardProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialCardProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Card.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapCardProp] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapCardProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
