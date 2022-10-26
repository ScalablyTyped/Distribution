package typings.wixStyleReact.mod

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialCustomModalLayoutP
import typings.wixStyleReact.anon.WeakValidationMapCustomMo
import typings.wixStyleReact.anon.`1`
import typings.wixStyleReact.distTypesCustomModalLayoutMod.CustomModalLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<wix-style-react.wix-style-react/dist/types/CustomModalLayout.CustomModalLayoutProps> & {  Title :react.react.FunctionComponent<{  children :react.react.ReactNode | undefined}>} */
object CustomModalLayout {
  
  inline def apply(props: CustomModalLayoutProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: CustomModalLayoutProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("wix-style-react", "CustomModalLayout")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "CustomModalLayout.Title")
  @js.native
  def Title: FunctionComponent[`1`] = js.native
  inline def Title_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialCustomModalLayoutP] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialCustomModalLayoutP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapCustomMo] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapCustomMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
