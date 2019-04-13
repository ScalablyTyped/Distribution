package typings
package webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** https://github.com/webdeveric/webpack-assets-manifest#apply */
  @JSName("apply")
  var apply: js.UndefOr[(js.Function1[/* manifest */ WebpackAssetsManifest, scala.Unit]) | scala.Null] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#assets */
  var assets: js.UndefOr[js.Object] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#customize */
  var customize: js.UndefOr[
    (js.Function4[
      /* entry */ Entry, 
      /* original */ AnyObject, 
      /* manifest */ WebpackAssetsManifest, 
      /* asset */ AnyObject, 
      Entry | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false`
    ]) | scala.Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#done */
  var done: js.UndefOr[
    (js.Function2[/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject, scala.Unit]) | scala.Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypoints */
  var entrypoints: js.UndefOr[scala.Boolean] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypointskey */
  var entrypointsKey: js.UndefOr[
    java.lang.String | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false`
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#fileextregex */
  var fileExtRegex: js.UndefOr[
    stdLib.RegExp | scala.Null | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false`
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#integrity */
  var integrity: js.UndefOr[scala.Boolean] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#integrityhashes */
  var integrityHashes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#integritypropertyname */
  var integrityPropertyName: js.UndefOr[java.lang.String] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#merge */
  var merge: js.UndefOr[
    scala.Boolean | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibStrings.customize
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#output */
  var output: js.UndefOr[java.lang.String] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#publicpath */
  var publicPath: js.UndefOr[
    java.lang.String | scala.Boolean | scala.Null | (js.Function2[
      /* filename */ java.lang.String, 
      /* manifest */ WebpackAssetsManifest, 
      java.lang.String
    ])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#replacer */
  var replacer: js.UndefOr[
    scala.Null | js.Array[java.lang.String] | (js.Function2[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      js.UndefOr[scala.Double | java.lang.String | scala.Boolean | scala.Null | js.Object]
    ])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#sortmanifest */
  var sortManifest: js.UndefOr[
    scala.Boolean | (js.ThisFunction2[
      /* this */ WebpackAssetsManifest, 
      /* a */ java.lang.String, 
      /* b */ java.lang.String, 
      scala.Double
    ])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#space */
  var space: js.UndefOr[scala.Double] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#transform */
  var transform: js.UndefOr[
    (js.Function2[/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest, _]) | scala.Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
  var writeToDisk: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    apply: /* manifest */ WebpackAssetsManifest => scala.Unit = null,
    assets: js.Object = null,
    customize: (/* entry */ Entry, /* original */ AnyObject, /* manifest */ WebpackAssetsManifest, /* asset */ AnyObject) => Entry | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false` = null,
    done: (/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject) => scala.Unit = null,
    entrypoints: js.UndefOr[scala.Boolean] = js.undefined,
    entrypointsKey: java.lang.String | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false` = null,
    fileExtRegex: stdLib.RegExp | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false` = null,
    integrity: js.UndefOr[scala.Boolean] = js.undefined,
    integrityHashes: js.Array[java.lang.String] = null,
    integrityPropertyName: java.lang.String = null,
    merge: scala.Boolean | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibStrings.customize = null,
    output: java.lang.String = null,
    publicPath: java.lang.String | scala.Boolean | (js.Function2[
      /* filename */ java.lang.String, 
      /* manifest */ WebpackAssetsManifest, 
      java.lang.String
    ]) = null,
    replacer: js.Array[java.lang.String] | (js.Function2[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      js.UndefOr[scala.Double | java.lang.String | scala.Boolean | scala.Null | js.Object]
    ]) = null,
    sortManifest: scala.Boolean | (js.ThisFunction2[
      /* this */ WebpackAssetsManifest, 
      /* a */ java.lang.String, 
      /* b */ java.lang.String, 
      scala.Double
    ]) = null,
    space: scala.Int | scala.Double = null,
    transform: (/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest) => _ = null,
    writeToDisk: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction1(apply))
    if (assets != null) __obj.updateDynamic("assets")(assets)
    if (customize != null) __obj.updateDynamic("customize")(js.Any.fromFunction4(customize))
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    if (!js.isUndefined(entrypoints)) __obj.updateDynamic("entrypoints")(entrypoints)
    if (entrypointsKey != null) __obj.updateDynamic("entrypointsKey")(entrypointsKey.asInstanceOf[js.Any])
    if (fileExtRegex != null) __obj.updateDynamic("fileExtRegex")(fileExtRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(integrity)) __obj.updateDynamic("integrity")(integrity)
    if (integrityHashes != null) __obj.updateDynamic("integrityHashes")(integrityHashes)
    if (integrityPropertyName != null) __obj.updateDynamic("integrityPropertyName")(integrityPropertyName)
    if (merge != null) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (sortManifest != null) __obj.updateDynamic("sortManifest")(sortManifest.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (!js.isUndefined(writeToDisk)) __obj.updateDynamic("writeToDisk")(writeToDisk)
    __obj.asInstanceOf[Options]
  }
}

