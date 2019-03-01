package typings
package webpackLib.webpackMod.webpackNs.DllReferencePluginNs

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
  var context: java.lang.String
  /**
    * An object containing `content` and `name`.
    */
  var manifest: webpackLib.Anon_Content | java.lang.String
  /**
    * The name where the DLL is exposed.
    *
    * Defaults to `manifest.name`.
    *
    * See also `externals`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The prefix which is used for accessing the content of the DLL.
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type how the DLL is exposed.
    *
    * Defaults to `"var"`.
    *
    * See also `externals`.
    */
  var sourceType: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    context: java.lang.String,
    manifest: webpackLib.Anon_Content | java.lang.String,
    content: js.Any = null,
    name: java.lang.String = null,
    scope: java.lang.String = null,
    sourceType: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[Options]
  }
}

