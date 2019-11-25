package typings.webpack

import typings.tapable.tapableMod.SyncWaterfallHook
import typings.webpack.webpackMod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonpScript extends js.Object {
  var jsonpScript: js.UndefOr[SyncWaterfallHook[String, Chunk, String]] = js.undefined
  var requireExtensions: SyncWaterfallHook[String, Chunk, String]
}

object Anon_JsonpScript {
  @scala.inline
  def apply(
    requireExtensions: SyncWaterfallHook[String, Chunk, String],
    jsonpScript: SyncWaterfallHook[String, Chunk, String] = null
  ): Anon_JsonpScript = {
    val __obj = js.Dynamic.literal(requireExtensions = requireExtensions.asInstanceOf[js.Any])
    if (jsonpScript != null) __obj.updateDynamic("jsonpScript")(jsonpScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JsonpScript]
  }
}

