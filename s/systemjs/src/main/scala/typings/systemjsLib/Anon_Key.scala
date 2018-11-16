package typings
package systemjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Key
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
               * A boolean flag which instructs the plugin to load configuration from "tsconfig.json".
               * To override the location of the file set this option to the path of the configuration file,
               * which will be resolved using normal SystemJS resolution.
               * Note: This setting is specific to plugin-typescript.
               */
  var tsconfig: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

