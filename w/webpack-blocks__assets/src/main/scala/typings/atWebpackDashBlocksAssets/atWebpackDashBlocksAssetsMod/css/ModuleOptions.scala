package typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsMod.css

import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsNumbers.`0`
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsNumbers.`1`
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsNumbers.`2`
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsStrings.asIs
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsStrings.camelCase
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsStrings.camelCaseOnly
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsStrings.dashes
import typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsStrings.dashesOnly
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var getLocalIdent: js.UndefOr[GetLocalIdent] = js.undefined
  var hashPrefix: js.UndefOr[String] = js.undefined
  /**
    * 0 => no loaders (default);
    * 1 => postcss-loader;
    * 2 => postcss-loader, sass-loader
    */
  var importLoaders: js.UndefOr[`0` | `1` | `2`] = js.undefined
  var localIdentName: js.UndefOr[String] = js.undefined
  var localIdentRegExp: js.UndefOr[String | RegExp] = js.undefined
  var localsConvention: js.UndefOr[asIs | camelCase | camelCaseOnly | dashes | dashesOnly] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var onlyLocals: js.UndefOr[Boolean] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply(
    context: String = null,
    getLocalIdent: (/* context */ js.Any, /* localIdentName */ js.Any, /* localName */ js.Any, /* options */ js.Any) => String = null,
    hashPrefix: String = null,
    importLoaders: `0` | `1` | `2` = null,
    localIdentName: String = null,
    localIdentRegExp: String | RegExp = null,
    localsConvention: asIs | camelCase | camelCaseOnly | dashes | dashesOnly = null,
    mode: String = null,
    onlyLocals: js.UndefOr[Boolean] = js.undefined
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (getLocalIdent != null) __obj.updateDynamic("getLocalIdent")(js.Any.fromFunction4(getLocalIdent))
    if (hashPrefix != null) __obj.updateDynamic("hashPrefix")(hashPrefix)
    if (importLoaders != null) __obj.updateDynamic("importLoaders")(importLoaders.asInstanceOf[js.Any])
    if (localIdentName != null) __obj.updateDynamic("localIdentName")(localIdentName)
    if (localIdentRegExp != null) __obj.updateDynamic("localIdentRegExp")(localIdentRegExp.asInstanceOf[js.Any])
    if (localsConvention != null) __obj.updateDynamic("localsConvention")(localsConvention.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(onlyLocals)) __obj.updateDynamic("onlyLocals")(onlyLocals)
    __obj.asInstanceOf[ModuleOptions]
  }
}

