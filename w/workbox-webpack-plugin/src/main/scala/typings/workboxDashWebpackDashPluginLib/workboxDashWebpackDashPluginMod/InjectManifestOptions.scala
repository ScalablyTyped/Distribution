package typings
package workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod

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
  var swSrc: java.lang.String
}

object InjectManifestOptions {
  @scala.inline
  def apply(
    swSrc: java.lang.String,
    chunks: js.Array[java.lang.String] = null,
    dontCacheBustUrlsMatching: stdLib.RegExp = null,
    exclude: js.Array[java.lang.String | stdLib.RegExp] = null,
    excludeChunks: js.Array[java.lang.String] = null,
    globDirectory: java.lang.String = null,
    globFollow: js.UndefOr[scala.Boolean] = js.undefined,
    globIgnores: js.Array[java.lang.String] = null,
    globPatterns: js.Array[java.lang.String] = null,
    globStrict: js.UndefOr[scala.Boolean] = js.undefined,
    importWorkboxFrom: workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginLibStrings.cdn | workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginLibStrings.local | workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginLibStrings.disabled = null,
    importsDirectory: java.lang.String = null,
    include: js.Array[java.lang.String | stdLib.RegExp] = null,
    manifestTransforms: js.Array[
      js.Function1[
        /* originalManifest */ js.Array[ManifestEntry], 
        workboxDashWebpackDashPluginLib.Anon_Manifest
      ]
    ] = null,
    maximumFileSizeToCacheInBytes: scala.Int | scala.Double = null,
    modifyUrlPrefix: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    precacheManifestFilename: java.lang.String = null,
    swDest: java.lang.String = null,
    templatedUrls: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    test: js.Array[java.lang.String | stdLib.RegExp] = null
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

