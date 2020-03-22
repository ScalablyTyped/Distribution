package typings.xo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xo.xo.Pick<eslint.eslint.Linter.Config, 'extends' | 'settings'> */
trait ESLintConfig extends js.Object {
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ESLintConfig {
  @scala.inline
  def apply(`extends`: String | js.Array[String] = null, settings: StringDictionary[js.Any] = null): ESLintConfig = {
    val __obj = js.Dynamic.literal()
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESLintConfig]
  }
}

