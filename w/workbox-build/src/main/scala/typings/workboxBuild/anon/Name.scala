package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**
    * The `name` property to use when creating the
    * [`BackgroundSyncPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-background-sync.BackgroundSyncPlugin).
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The `options` property to use when creating the
    * [`BackgroundSyncPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-background-sync.BackgroundSyncPlugin).
    */
  var options: js.UndefOr[js.Object] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, options: js.Object = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

