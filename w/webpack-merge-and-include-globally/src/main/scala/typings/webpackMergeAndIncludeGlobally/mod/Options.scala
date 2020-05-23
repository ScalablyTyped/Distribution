package typings.webpackMergeAndIncludeGlobally.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * array of entry points (strings) for which this plugin should run only
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
    */
  var chunks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * encoding of node.js reading
    * @default 'utf-8'
    */
  var encoding: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[FilesMap | SourceDestinationMaps] = js.undefined
  /**
    * set true to append version hash before file extension.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
    * @default false
    */
  var hash: js.UndefOr[Boolean] = js.undefined
  /**
    * Object that maps resulting file names to transform methods that will be applied on merged content before saving. Use to minify / uglify the result.
    * {@linkhttps://github.com/markshapiro/webpack-merge-and-include-globally#transform}
    */
  var transform: js.UndefOr[StringDictionary[js.Function1[/* code */ String, String]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chunks: js.Array[String] = null,
    encoding: String = null,
    files: FilesMap | SourceDestinationMaps = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    transform: StringDictionary[js.Function1[/* code */ String, String]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

