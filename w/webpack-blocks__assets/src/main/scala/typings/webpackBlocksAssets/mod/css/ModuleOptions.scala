package typings.webpackBlocksAssets.mod.css

import typings.std.RegExp
import typings.webpackBlocksAssets.webpackBlocksAssetsNumbers.`0`
import typings.webpackBlocksAssets.webpackBlocksAssetsNumbers.`1`
import typings.webpackBlocksAssets.webpackBlocksAssetsNumbers.`2`
import typings.webpackBlocksAssets.webpackBlocksAssetsStrings.asIs
import typings.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCase
import typings.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCaseOnly
import typings.webpackBlocksAssets.webpackBlocksAssetsStrings.dashes
import typings.webpackBlocksAssets.webpackBlocksAssetsStrings.dashesOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions extends js.Object {
  var context: js.UndefOr[String] = js.native
  var getLocalIdent: js.UndefOr[GetLocalIdent] = js.native
  var hashPrefix: js.UndefOr[String] = js.native
  /**
    * 0 => no loaders (default);
    * 1 => postcss-loader;
    * 2 => postcss-loader, sass-loader
    */
  var importLoaders: js.UndefOr[`0` | `1` | `2`] = js.native
  var localIdentName: js.UndefOr[String] = js.native
  var localIdentRegExp: js.UndefOr[String | RegExp] = js.native
  var localsConvention: js.UndefOr[asIs | camelCase | camelCaseOnly | dashes | dashesOnly] = js.native
  var mode: js.UndefOr[String] = js.native
  var onlyLocals: js.UndefOr[Boolean] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setGetLocalIdent(
      value: (/* context */ js.Any, /* localIdentName */ js.Any, /* localName */ js.Any, /* options */ js.Any) => String
    ): Self = this.set("getLocalIdent", js.Any.fromFunction4(value))
    @scala.inline
    def deleteGetLocalIdent: Self = this.set("getLocalIdent", js.undefined)
    @scala.inline
    def setHashPrefix(value: String): Self = this.set("hashPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashPrefix: Self = this.set("hashPrefix", js.undefined)
    @scala.inline
    def setImportLoaders(value: `0` | `1` | `2`): Self = this.set("importLoaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportLoaders: Self = this.set("importLoaders", js.undefined)
    @scala.inline
    def setLocalIdentName(value: String): Self = this.set("localIdentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalIdentName: Self = this.set("localIdentName", js.undefined)
    @scala.inline
    def setLocalIdentRegExp(value: String | RegExp): Self = this.set("localIdentRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalIdentRegExp: Self = this.set("localIdentRegExp", js.undefined)
    @scala.inline
    def setLocalsConvention(value: asIs | camelCase | camelCaseOnly | dashes | dashesOnly): Self = this.set("localsConvention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalsConvention: Self = this.set("localsConvention", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnlyLocals(value: Boolean): Self = this.set("onlyLocals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyLocals: Self = this.set("onlyLocals", js.undefined)
  }
  
}

