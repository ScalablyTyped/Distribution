package typings.webpackAssetsManifest.mod

import typings.std.RegExp
import typings.webpackAssetsManifest.webpackAssetsManifestBooleans.`false`
import typings.webpackAssetsManifest.webpackAssetsManifestStrings.customize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** https://github.com/webdeveric/webpack-assets-manifest#apply */
  @JSName("apply")
  var apply: js.UndefOr[(js.Function1[/* manifest */ WebpackAssetsManifest, Unit]) | Null] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#assets */
  var assets: js.UndefOr[js.Object] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#customize */
  var customize: js.UndefOr[
    (js.Function4[
      /* entry */ Entry, 
      /* original */ AnyObject, 
      /* manifest */ WebpackAssetsManifest, 
      /* asset */ AnyObject, 
      Entry | `false`
    ]) | Null
  ] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#done */
  var done: js.UndefOr[
    (js.Function2[/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject, Unit]) | Null
  ] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypoints */
  var entrypoints: js.UndefOr[Boolean] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypointskey */
  var entrypointsKey: js.UndefOr[String | `false`] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#fileextregex */
  var fileExtRegex: js.UndefOr[RegExp | Null | `false`] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#integrity */
  var integrity: js.UndefOr[Boolean] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#integrityhashes */
  var integrityHashes: js.UndefOr[js.Array[String]] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#integritypropertyname */
  var integrityPropertyName: js.UndefOr[String] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#merge */
  var merge: js.UndefOr[Boolean | customize] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#output */
  var output: js.UndefOr[String] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#publicpath */
  var publicPath: js.UndefOr[
    String | Boolean | Null | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
  ] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#replacer */
  var replacer: js.UndefOr[
    Null | js.Array[String] | (js.Function2[
      /* key */ String, 
      /* value */ String, 
      js.UndefOr[Double | String | Boolean | Null | js.Object]
    ])
  ] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#sortmanifest */
  var sortManifest: js.UndefOr[
    Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
  ] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#space */
  var space: js.UndefOr[Double] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#transform */
  var transform: js.UndefOr[
    (js.Function2[/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest, _]) | Null
  ] = js.native
  
  /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
  var writeToDisk: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setApply(value: /* manifest */ WebpackAssetsManifest => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    
    @scala.inline
    def setApplyNull: Self = this.set("apply", null)
    
    @scala.inline
    def setAssets(value: js.Object): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
    
    @scala.inline
    def setCustomize(
      value: (/* entry */ Entry, /* original */ AnyObject, /* manifest */ WebpackAssetsManifest, /* asset */ AnyObject) => Entry | `false`
    ): Self = this.set("customize", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteCustomize: Self = this.set("customize", js.undefined)
    
    @scala.inline
    def setCustomizeNull: Self = this.set("customize", null)
    
    @scala.inline
    def setDone(value: (/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject) => Unit): Self = this.set("done", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setDoneNull: Self = this.set("done", null)
    
    @scala.inline
    def setEntrypoints(value: Boolean): Self = this.set("entrypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrypoints: Self = this.set("entrypoints", js.undefined)
    
    @scala.inline
    def setEntrypointsKey(value: String | `false`): Self = this.set("entrypointsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrypointsKey: Self = this.set("entrypointsKey", js.undefined)
    
    @scala.inline
    def setFileExtRegex(value: RegExp | `false`): Self = this.set("fileExtRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtRegex: Self = this.set("fileExtRegex", js.undefined)
    
    @scala.inline
    def setFileExtRegexNull: Self = this.set("fileExtRegex", null)
    
    @scala.inline
    def setIntegrity(value: Boolean): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    
    @scala.inline
    def setIntegrityHashesVarargs(value: String*): Self = this.set("integrityHashes", js.Array(value :_*))
    
    @scala.inline
    def setIntegrityHashes(value: js.Array[String]): Self = this.set("integrityHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrityHashes: Self = this.set("integrityHashes", js.undefined)
    
    @scala.inline
    def setIntegrityPropertyName(value: String): Self = this.set("integrityPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrityPropertyName: Self = this.set("integrityPropertyName", js.undefined)
    
    @scala.inline
    def setMerge(value: Boolean | customize): Self = this.set("merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPublicPathFunction2(value: (/* filename */ String, /* manifest */ WebpackAssetsManifest) => String): Self = this.set("publicPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPublicPath(
      value: String | Boolean | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
    ): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setPublicPathNull: Self = this.set("publicPath", null)
    
    @scala.inline
    def setReplacerFunction2(
      value: (/* key */ String, /* value */ String) => js.UndefOr[Double | String | Boolean | Null | js.Object]
    ): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacerVarargs(value: String*): Self = this.set("replacer", js.Array(value :_*))
    
    @scala.inline
    def setReplacer(
      value: js.Array[String] | (js.Function2[
          /* key */ String, 
          /* value */ String, 
          js.UndefOr[Double | String | Boolean | Null | js.Object]
        ])
    ): Self = this.set("replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setReplacerNull: Self = this.set("replacer", null)
    
    @scala.inline
    def setSortManifest(
      value: Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
    ): Self = this.set("sortManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortManifest: Self = this.set("sortManifest", js.undefined)
    
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest) => _): Self = this.set("transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformNull: Self = this.set("transform", null)
    
    @scala.inline
    def setWriteToDisk(value: Boolean): Self = this.set("writeToDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToDisk: Self = this.set("writeToDisk", js.undefined)
  }
}
