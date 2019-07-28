package typings.webpack.webpackMod.DllReferencePluginNs

import typings.webpack.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The mappings from the request to module ID.
    *
    * Defaults to `manifest.content`.
    */
  var content: js.UndefOr[js.Any] = js.undefined
  /**
    * The context of requests in the manifest (or content property).
    *
    * This is an <b>absolute path</b>.
    */
  var context: String
  /**
    * An object containing `content` and `name`.
    */
  var manifest: Anon_Content | String
  /**
    * The name where the DLL is exposed.
    *
    * Defaults to `manifest.name`.
    *
    * See also `externals`.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The prefix which is used for accessing the content of the DLL.
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * The type how the DLL is exposed.
    *
    * Defaults to `"var"`.
    *
    * See also `externals`.
    */
  var sourceType: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    context: String,
    manifest: Anon_Content | String,
    content: js.Any = null,
    name: String = null,
    scope: String = null,
    sourceType: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(context = context, manifest = manifest.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[Options]
  }
}

