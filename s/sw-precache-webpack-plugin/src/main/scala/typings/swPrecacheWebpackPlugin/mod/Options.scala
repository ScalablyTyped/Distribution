package typings.swPrecacheWebpackPlugin.mod

import typings.std.RegExp
import typings.swPrecacheWebpackPlugin.anon.ChunkName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends _Options {
  var filename: js.UndefOr[String] = js.native
  var filepath: js.UndefOr[String] = js.native
  // override sw-precache options
  @JSName("importScripts")
  var importScripts_Options: js.UndefOr[js.Array[String | ChunkName]] = js.native
  var mergeStaticsConfig: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var staticFileGlobsIgnorePatterns: js.UndefOr[js.Array[RegExp]] = js.native
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilepath: Self = this.set("filepath", js.undefined)
    @scala.inline
    def setImportScriptsVarargs(value: (String | ChunkName)*): Self = this.set("importScripts", js.Array(value :_*))
    @scala.inline
    def setImportScripts(value: js.Array[String | ChunkName]): Self = this.set("importScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportScripts: Self = this.set("importScripts", js.undefined)
    @scala.inline
    def setMergeStaticsConfig(value: Boolean): Self = this.set("mergeStaticsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeStaticsConfig: Self = this.set("mergeStaticsConfig", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setStaticFileGlobsIgnorePatternsVarargs(value: RegExp*): Self = this.set("staticFileGlobsIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setStaticFileGlobsIgnorePatterns(value: js.Array[RegExp]): Self = this.set("staticFileGlobsIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticFileGlobsIgnorePatterns: Self = this.set("staticFileGlobsIgnorePatterns", js.undefined)
  }
  
}

