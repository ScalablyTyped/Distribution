package typings
package systemjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * A boolean flag which instructs the plugin to load configuration from "tsconfig.json".
    * To override the location of the file set this option to the path of the configuration file,
    * which will be resolved using normal SystemJS resolution.
    * Note: This setting is specific to plugin-typescript.
    */
  var tsconfig: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tsconfig: scala.Boolean | java.lang.String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

