package typings.webpackbar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Enable a simple log reporter (only start and end)
    * Defaults to 'true' when running in minimal environments
    * @default true
    */
  var basic: js.UndefOr[Boolean] = js.undefined
  /**
    * Color output of the progress bar
    * @default 'green'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Enable bars reporter
    * Defaults to 'true' when not in CI or testing mod
    * @default true
    */
  var fancy: js.UndefOr[Boolean] = js.undefined
  /**
    * Display name
    * @default 'webpack'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Enable profiler
    * @default false
    */
  var profile: js.UndefOr[Boolean] = js.undefined
  /**
    * Register a custom reporter
    * @default null
    */
  var reporter: js.UndefOr[Reporter | Null] = js.undefined
  /**
    * Register an Array of your custom reporters.
    * @default ['basic'] | ['fancy']
    */
  var reporters: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basic: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fancy: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    profile: js.UndefOr[Boolean] = js.undefined,
    reporter: Reporter = null,
    reporters: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fancy)) __obj.updateDynamic("fancy")(fancy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

