package typings.uifabricFoundation.libIcomponentMod

import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentOptions[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  /**
    * Display name to identify component in React hierarchy. This parameter is required for targeted component styling via theming.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Default prop for which to map primitive values.
    */
  var factoryOptions: js.UndefOr[IFactoryOptions[TComponentProps]] = js.undefined
  /**
    * List of fields which can be customized.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional state component that processes TComponentProps into TViewProps.
    */
  var state: js.UndefOr[IStateComponentType[TComponentProps, TViewProps]] = js.undefined
  /**
    * Optional static object to assign to constructed component.
    */
  var statics: js.UndefOr[TStatics] = js.undefined
  /**
    * Styles prop to pass into component.
    */
  var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.undefined
  /**
    * Tokens prop to pass into component.
    */
  var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.undefined
}

object IComponentOptions {
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](
    displayName: String = null,
    factoryOptions: IFactoryOptions[TComponentProps] = null,
    fields: js.Array[String] = null,
    state: TComponentProps => TViewProps = null,
    statics: TStatics = null,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = null,
    tokens: ITokenFunctionOrObject[TViewProps, TTokens] = null
  ): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (factoryOptions != null) __obj.updateDynamic("factoryOptions")(factoryOptions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(js.Any.fromFunction1(state))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
  }
}

