package typings.workboxDashWebpackDashPlugin.workboxDashWebpackDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxDashWebpackDashPlugin.Anon_Manifest
import typings.workboxDashWebpackDashPlugin.workboxDashWebpackDashPluginStrings.cdn
import typings.workboxDashWebpackDashPlugin.workboxDashWebpackDashPluginStrings.disabled
import typings.workboxDashWebpackDashPlugin.workboxDashWebpackDashPluginStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectManifestOptions extends CommonOptions {
  /**
  	 * The path to the source service worker file that can contain your own customized code, in addition to containing a match for `injectionPointRegexp`.
  	 *
  	 * Your service worker file should reference the `self.__precacheManifest` variable to obtain a list of
  	 * [`ManifestEntrys`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-build#.ManifestEntry) obtained as part of the compilation:
  	 * `workbox.precaching.precacheAndRoute(self.__precacheManifest)`.
  	 *
  	 * @example swSrc: path.join('src', 'sw.js')
  	 */
  var swSrc: String
}

object InjectManifestOptions {
  @scala.inline
  def apply(
    swSrc: String,
    chunks: js.Array[String] = null,
    dontCacheBustUrlsMatching: RegExp = null,
    exclude: js.Array[String | RegExp] = null,
    excludeChunks: js.Array[String] = null,
    globDirectory: String = null,
    globFollow: js.UndefOr[Boolean] = js.undefined,
    globIgnores: js.Array[String] = null,
    globPatterns: js.Array[String] = null,
    globStrict: js.UndefOr[Boolean] = js.undefined,
    importWorkboxFrom: cdn | local | disabled = null,
    importsDirectory: String = null,
    include: js.Array[String | RegExp] = null,
    manifestTransforms: js.Array[js.Function1[/* originalManifest */ js.Array[ManifestEntry], Anon_Manifest]] = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    modifyUrlPrefix: StringDictionary[String] = null,
    precacheManifestFilename: String = null,
    swDest: String = null,
    templatedUrls: StringDictionary[String | js.Array[String]] = null,
    test: js.Array[String | RegExp] = null
  ): InjectManifestOptions = {
    val __obj = js.Dynamic.literal(swSrc = swSrc)
    if (chunks != null) __obj.updateDynamic("chunks")(chunks)
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks)
    if (globDirectory != null) __obj.updateDynamic("globDirectory")(globDirectory)
    if (!js.isUndefined(globFollow)) __obj.updateDynamic("globFollow")(globFollow)
    if (globIgnores != null) __obj.updateDynamic("globIgnores")(globIgnores)
    if (globPatterns != null) __obj.updateDynamic("globPatterns")(globPatterns)
    if (!js.isUndefined(globStrict)) __obj.updateDynamic("globStrict")(globStrict)
    if (importWorkboxFrom != null) __obj.updateDynamic("importWorkboxFrom")(importWorkboxFrom.asInstanceOf[js.Any])
    if (importsDirectory != null) __obj.updateDynamic("importsDirectory")(importsDirectory)
    if (include != null) __obj.updateDynamic("include")(include)
    if (manifestTransforms != null) __obj.updateDynamic("manifestTransforms")(manifestTransforms)
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (modifyUrlPrefix != null) __obj.updateDynamic("modifyUrlPrefix")(modifyUrlPrefix)
    if (precacheManifestFilename != null) __obj.updateDynamic("precacheManifestFilename")(precacheManifestFilename)
    if (swDest != null) __obj.updateDynamic("swDest")(swDest)
    if (templatedUrls != null) __obj.updateDynamic("templatedUrls")(templatedUrls)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[InjectManifestOptions]
  }
}

