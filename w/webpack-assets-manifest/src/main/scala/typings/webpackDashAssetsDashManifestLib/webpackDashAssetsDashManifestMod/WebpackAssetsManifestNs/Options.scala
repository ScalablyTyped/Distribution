package typings
package webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** https://github.com/webdeveric/webpack-assets-manifest#apply */
  @JSName("apply")
  var apply: js.UndefOr[
    (js.Function1[
      /* manifest */ webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#assets */
  var assets: js.UndefOr[js.Object] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#customize */
  var customize: js.UndefOr[
    (js.Function4[
      /* entry */ Entry, 
      /* original */ AnyObject, 
      /* manifest */ webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
      /* asset */ AnyObject, 
      Entry | webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestLibNumbers.`false`
    ]) | scala.Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#done */
  var done: js.UndefOr[
    (js.Function2[
      /* manifest */ webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
      /* stats */ AnyObject, 
      scala.Unit
    ]) | scala.Null
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
      /* manifest */ webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
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
      /* this */ webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
      /* a */ java.lang.String, 
      /* b */ java.lang.String, 
      scala.Double
    ])
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#space */
  var space: js.UndefOr[scala.Double] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#transform */
  var transform: js.UndefOr[
    (js.Function2[
      /* assets */ AnyObject, 
      /* manifest */ webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
      _
    ]) | scala.Null
  ] = js.undefined
  /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
  var writeToDisk: js.UndefOr[scala.Boolean] = js.undefined
}

