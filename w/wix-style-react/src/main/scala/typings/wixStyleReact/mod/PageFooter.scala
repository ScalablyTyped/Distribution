package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialPageFooterProps
import typings.wixStyleReact.anon.WeakValidationMapPageFoot
import typings.wixStyleReact.distTypesPageFooterMod.PageFooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/PageFooter.PageFooterProps> & {  Start :new (): wix-style-react.wix-style-react/dist/types/PageFooter/Start.default,   Center :new (): wix-style-react.wix-style-react/dist/types/PageFooter/Center.default,   End :new (): wix-style-react.wix-style-react/dist/types/PageFooter/End.default} */
object PageFooter {
  
  inline def apply(props: PageFooterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: PageFooterProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("wix-style-react", "PageFooter")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "PageFooter.Center")
  @js.native
  open class Center ()
    extends typings.wixStyleReact.distTypesPageFooterCenterMod.default
  @JSImport("wix-style-react", "PageFooter.Center")
  @js.native
  def Center: Instantiable0[typings.wixStyleReact.distTypesPageFooterCenterMod.default] = js.native
  inline def Center_=(x: Instantiable0[typings.wixStyleReact.distTypesPageFooterCenterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Center")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "PageFooter.End")
  @js.native
  open class End ()
    extends typings.wixStyleReact.distTypesPageFooterEndMod.default
  @JSImport("wix-style-react", "PageFooter.End")
  @js.native
  def End: Instantiable0[typings.wixStyleReact.distTypesPageFooterEndMod.default] = js.native
  inline def End_=(x: Instantiable0[typings.wixStyleReact.distTypesPageFooterEndMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("End")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react", "PageFooter.Start")
  @js.native
  open class Start ()
    extends typings.wixStyleReact.distTypesPageFooterStartMod.default
  @JSImport("wix-style-react", "PageFooter.Start")
  @js.native
  def Start: Instantiable0[typings.wixStyleReact.distTypesPageFooterStartMod.default] = js.native
  inline def Start_=(x: Instantiable0[typings.wixStyleReact.distTypesPageFooterStartMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Start")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "PageFooter.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "PageFooter.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialPageFooterProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialPageFooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "PageFooter.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "PageFooter.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapPageFoot] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapPageFoot]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
