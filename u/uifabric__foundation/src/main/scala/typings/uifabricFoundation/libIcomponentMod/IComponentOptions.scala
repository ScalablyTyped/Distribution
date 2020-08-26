package typings.uifabricFoundation.libIcomponentMod

import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponentOptions[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  /**
    * Display name to identify component in React hierarchy. This parameter is required for targeted component styling
    * via theming.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Default prop for which to map primitive values.
    */
  var factoryOptions: js.UndefOr[IFactoryOptions[TComponentProps]] = js.native
  /**
    * List of fields which can be customized.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional state component that processes TComponentProps into TViewProps.
    */
  var state: js.UndefOr[IStateComponentType[TComponentProps, TViewProps]] = js.native
  /**
    * Optional static object to assign to constructed component.
    */
  var statics: js.UndefOr[TStatics] = js.native
  /**
    * Styles prop to pass into component.
    */
  var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
  /**
    * Tokens prop to pass into component.
    */
  var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
}

object IComponentOptions {
  @scala.inline
  def apply[TComponentProps, TTokens, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet, TViewProps, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
  }
  @scala.inline
  implicit class IComponentOptionsOps[Self <: IComponentOptions[_, _, _, _, _], TComponentProps, TTokens, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet, TViewProps, TStatics] (val x: Self with (IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = this.set("factoryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactoryOptions: Self = this.set("factoryOptions", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setState(value: TComponentProps => TViewProps): Self = this.set("state", js.Any.fromFunction1(value))
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatics(value: TStatics): Self = this.set("statics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatics: Self = this.set("statics", js.undefined)
    @scala.inline
    def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = this.set("styles", js.Any.fromFunction3(value))
    @scala.inline
    def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
  
}

