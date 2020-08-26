package typings.tiffToPng.mod

import typings.tiffToPng.tiffToPngNumbers.`1`
import typings.tiffToPng.tiffToPngNumbers.`2`
import typings.tiffToPng.tiffToPngStrings.A3
import typings.tiffToPng.tiffToPngStrings.A4
import typings.tiffToPng.tiffToPngStrings.jpg
import typings.tiffToPng.tiffToPngStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Automatically removes all files from tmpPath prefixed with magick-*, this happens on process completion
    * @default false
    */
  var autoRemoveTmp: js.UndefOr[Boolean] = js.native
  /**
    * Allows the specification of the command path for use with binaries or aliased convert commands
    * @default null
    */
  var commandPath: js.UndefOr[String] = js.native
  /**
    * The level of the logs required. 0: Errors only, 1: Information
    * @default 0
    */
  var logLevel: js.UndefOr[Double] = js.native
  var page: js.UndefOr[A4 | A3] = js.native
  /**
    * The string that will be prepended to the file names of the pages converted. E.g. 'page': `page1.png`
    * @default 'page'
    */
  var prefix: js.UndefOr[String] = js.native
  var saveFolder: js.UndefOr[String] = js.native
  /**
    * The image scene number
    * @default null
    */
  var scene: js.UndefOr[`1` | `2`] = js.native
  /**
    * The string that will be appended onto the end of the file names of the page converted. E.g. '_invoices': page1_invoices.png
    * @default ''
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Overwrites the Imagemagick default tmp directory path
    * @default null
    */
  var tmpPath: js.UndefOr[String] = js.native
  /**
    * The file type of the converted files
    * @default 'png'
    */
  var `type`: js.UndefOr[png | jpg] = js.native
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
    def setAutoRemoveTmp(value: Boolean): Self = this.set("autoRemoveTmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRemoveTmp: Self = this.set("autoRemoveTmp", js.undefined)
    @scala.inline
    def setCommandPath(value: String): Self = this.set("commandPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandPath: Self = this.set("commandPath", js.undefined)
    @scala.inline
    def setLogLevel(value: Double): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setPage(value: A4 | A3): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSaveFolder(value: String): Self = this.set("saveFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveFolder: Self = this.set("saveFolder", js.undefined)
    @scala.inline
    def setScene(value: `1` | `2`): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setTmpPath(value: String): Self = this.set("tmpPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmpPath: Self = this.set("tmpPath", js.undefined)
    @scala.inline
    def setType(value: png | jpg): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

