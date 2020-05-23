package typings.webpackAssetsManifest.mod

import typings.std.RegExp
import typings.webpackAssetsManifest.webpackAssetsManifestBooleans.`false`
import typings.webpackAssetsManifest.webpackAssetsManifestStrings.customize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** https://github.com/webdeveric/webpack-assets-manifest#apply */
  @JSName("apply")
  var apply: js.UndefOr[(js.Function1[/* manifest */ WebpackAssetsManifest, Unit]) | Null] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#assets */
  var assets: js.UndefOr[js.Object] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#customize */
  var customize: js.UndefOr[
    (js.Function4[
      /* entry */ Entry, 
      /* original */ AnyObject, 
      /* manifest */ WebpackAssetsManifest, 
      /* asset */ AnyObject, 
      Entry | `false`
    ]) | Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#done */
  var done: js.UndefOr[
    (js.Function2[/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject, Unit]) | Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypoints */
  var entrypoints: js.UndefOr[Boolean] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypointskey */
  var entrypointsKey: js.UndefOr[String | `false`] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#fileextregex */
  var fileExtRegex: js.UndefOr[RegExp | Null | `false`] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#integrity */
  var integrity: js.UndefOr[Boolean] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#integrityhashes */
  var integrityHashes: js.UndefOr[js.Array[String]] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#integritypropertyname */
  var integrityPropertyName: js.UndefOr[String] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#merge */
  var merge: js.UndefOr[Boolean | customize] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#output */
  var output: js.UndefOr[String] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#publicpath */
  var publicPath: js.UndefOr[
    String | Boolean | Null | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#replacer */
  var replacer: js.UndefOr[
    Null | js.Array[String] | (js.Function2[
      /* key */ String, 
      /* value */ String, 
      js.UndefOr[Double | String | Boolean | Null | js.Object]
    ])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#sortmanifest */
  var sortManifest: js.UndefOr[
    Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#space */
  var space: js.UndefOr[Double] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#transform */
  var transform: js.UndefOr[
    (js.Function2[/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest, _]) | Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
  var writeToDisk: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    apply: js.UndefOr[Null | (/* manifest */ WebpackAssetsManifest => Unit)] = js.undefined,
    assets: js.Object = null,
    customize: js.UndefOr[
      Null | ((/* entry */ Entry, /* original */ AnyObject, /* manifest */ WebpackAssetsManifest, /* asset */ AnyObject) => Entry | `false`)
    ] = js.undefined,
    done: js.UndefOr[Null | ((/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject) => Unit)] = js.undefined,
    entrypoints: js.UndefOr[Boolean] = js.undefined,
    entrypointsKey: String | `false` = null,
    fileExtRegex: js.UndefOr[Null | RegExp | `false`] = js.undefined,
    integrity: js.UndefOr[Boolean] = js.undefined,
    integrityHashes: js.Array[String] = null,
    integrityPropertyName: String = null,
    merge: Boolean | customize = null,
    output: String = null,
    publicPath: js.UndefOr[
      Null | String | Boolean | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
    ] = js.undefined,
    replacer: js.UndefOr[
      Null | js.Array[String] | (js.Function2[
        /* key */ String, 
        /* value */ String, 
        js.UndefOr[Double | String | Boolean | Null | js.Object]
      ])
    ] = js.undefined,
    sortManifest: Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double]) = null,
    space: js.UndefOr[Double] = js.undefined,
    transform: js.UndefOr[Null | ((/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest) => _)] = js.undefined,
    writeToDisk: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(if (apply != null) js.Any.fromFunction1(apply.asInstanceOf[/* manifest */ WebpackAssetsManifest => Unit]) else null)
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (!js.isUndefined(customize)) __obj.updateDynamic("customize")(if (customize != null) js.Any.fromFunction4(customize.asInstanceOf[(/* entry */ Entry, /* original */ AnyObject, /* manifest */ WebpackAssetsManifest, /* asset */ AnyObject) => Entry | `false`]) else null)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(if (done != null) js.Any.fromFunction2(done.asInstanceOf[(/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject) => Unit]) else null)
    if (!js.isUndefined(entrypoints)) __obj.updateDynamic("entrypoints")(entrypoints.get.asInstanceOf[js.Any])
    if (entrypointsKey != null) __obj.updateDynamic("entrypointsKey")(entrypointsKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fileExtRegex)) __obj.updateDynamic("fileExtRegex")(fileExtRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(integrity)) __obj.updateDynamic("integrity")(integrity.get.asInstanceOf[js.Any])
    if (integrityHashes != null) __obj.updateDynamic("integrityHashes")(integrityHashes.asInstanceOf[js.Any])
    if (integrityPropertyName != null) __obj.updateDynamic("integrityPropertyName")(integrityPropertyName.asInstanceOf[js.Any])
    if (merge != null) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(publicPath)) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(replacer)) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (sortManifest != null) __obj.updateDynamic("sortManifest")(sortManifest.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(if (transform != null) js.Any.fromFunction2(transform.asInstanceOf[(/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest) => _]) else null)
    if (!js.isUndefined(writeToDisk)) __obj.updateDynamic("writeToDisk")(writeToDisk.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

