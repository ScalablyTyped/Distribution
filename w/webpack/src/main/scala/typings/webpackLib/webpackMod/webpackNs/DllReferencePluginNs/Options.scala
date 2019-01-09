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

