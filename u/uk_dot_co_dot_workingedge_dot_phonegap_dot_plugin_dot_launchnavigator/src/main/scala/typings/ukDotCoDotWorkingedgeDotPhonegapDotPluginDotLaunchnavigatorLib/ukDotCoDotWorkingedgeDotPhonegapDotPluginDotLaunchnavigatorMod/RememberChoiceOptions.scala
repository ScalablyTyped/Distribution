package typings
package ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorLib.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RememberChoiceOptions extends js.Object {
  /**
    * whether to remember user choice of app for next time, instead of asking again for user choice.
    * `"prompt"` - Prompt user to decide whether to remember choice.
    *  - Default value if unspecified.
    *  - If `promptFn` is defined, this will be used for user confirmation.
    *  - Otherwise (by default), a native dialog will be displayed to ask user.
    * `false` - Do not remember user choice.
    * `true` - Remember user choice.
    */
  var enabled: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * options related to the default dialog prompt used to ask the user whether to remember their choice of app.
    */
  var prompt: js.UndefOr[PromptsOptions] = js.undefined
  /**
    * a function which asks the user whether to remember their choice of app.
    * If this is defined, then the default dialog prompt will not be shown, allowing for a custom UI for asking the user.
    * This will be passed a callback function which should be invoked with a single boolean argument which indicates the user's decision to remember their choice.
    * @param callback
    */
  var promptFn: js.UndefOr[
    js.Function1[
      /* callback */ js.Function1[/* rememberChoice */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

