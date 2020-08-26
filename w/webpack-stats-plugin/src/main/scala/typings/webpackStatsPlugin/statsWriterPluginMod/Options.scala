package typings.webpackStatsPlugin.statsWriterPluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * fields of stats obj to keep
    * @default ['assetsByChunkName']
    */
  var fields: js.UndefOr[Null | js.Array[String]] = js.native
  /**
    * output file name
    * @default 'stats.json'
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * stats config object or string preset
    * @default {}
    */
  var stats: js.UndefOr[StringDictionary[js.Any] | String] = js.native
  /**
    * transform stats obj
    * @default JSON.stringify()
    */
  var transform: js.UndefOr[TransformFunc] = js.native
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setStats(value: StringDictionary[js.Any] | String): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setTransform(
      value: (/* data */ StringDictionary[js.Any], /* options */ js.UndefOr[TransformOptions]) => String | js.Promise[String]
    ): Self = this.set("transform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

