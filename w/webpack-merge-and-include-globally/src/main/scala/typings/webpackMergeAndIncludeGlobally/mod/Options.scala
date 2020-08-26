package typings.webpackMergeAndIncludeGlobally.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackMergeAndIncludeGlobally.anon.Dest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * array of entry points (strings) for which this plugin should run only
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
    */
  var chunks: js.UndefOr[js.Array[String]] = js.native
  /**
    * encoding of node.js reading
    * @default 'utf-8'
    */
  var encoding: js.UndefOr[String] = js.native
  var files: js.UndefOr[FilesMap | SourceDestinationMaps] = js.native
  /**
    * set true to append version hash before file extension.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
    * @default false
    */
  var hash: js.UndefOr[Boolean] = js.native
  /**
    * Object that maps resulting file names to transform methods that will be applied on merged content before saving. Use to minify / uglify the result.
    * {@linkhttps://github.com/markshapiro/webpack-merge-and-include-globally#transform}
    */
  var transform: js.UndefOr[StringDictionary[js.Function1[/* code */ String, String]]] = js.native
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
    def setChunksVarargs(value: String*): Self = this.set("chunks", js.Array(value :_*))
    @scala.inline
    def setChunks(value: js.Array[String]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunks: Self = this.set("chunks", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFilesVarargs(value: Dest*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: FilesMap | SourceDestinationMaps): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setTransform(value: StringDictionary[js.Function1[/* code */ String, String]]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

