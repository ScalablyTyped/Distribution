package typings.webpackStatsPlugin.statsWriterPluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * fields of stats obj to keep
    * @default ['assetsByChunkName']
    */
  var fields: js.UndefOr[Null | js.Array[String]] = js.undefined
  /**
    * output file name
    * @default 'stats.json'
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * stats config object or string preset
    * @default {}
    */
  var stats: js.UndefOr[StringDictionary[js.Any] | String] = js.undefined
  /**
    * transform stats obj
    * @default JSON.stringify()
    */
  var transform: js.UndefOr[TransformFunc] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fields: js.UndefOr[Null | js.Array[String]] = js.undefined,
    filename: String = null,
    stats: StringDictionary[js.Any] | String = null,
    transform: (/* data */ StringDictionary[js.Any], /* options */ js.UndefOr[TransformOptions]) => String | js.Promise[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[Options]
  }
}

