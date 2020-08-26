package typings.webpackbar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Enable a simple log reporter (only start and end)
    * Defaults to 'true' when running in minimal environments
    * @default true
    */
  var basic: js.UndefOr[Boolean] = js.native
  /**
    * Color output of the progress bar
    * @default 'green'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Enable bars reporter
    * Defaults to 'true' when not in CI or testing mod
    * @default true
    */
  var fancy: js.UndefOr[Boolean] = js.native
  /**
    * Display name
    * @default 'webpack'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Enable profiler
    * @default false
    */
  var profile: js.UndefOr[Boolean] = js.native
  /**
    * Register a custom reporter
    * @default null
    */
  var reporter: js.UndefOr[Reporter | Null] = js.native
  /**
    * Register an Array of your custom reporters.
    * @default ['basic'] | ['fancy']
    */
  var reporters: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFancy(value: Boolean): Self = this.set("fancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFancy: Self = this.set("fancy", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setReporter(value: Reporter): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setReporterNull: Self = this.set("reporter", null)
    @scala.inline
    def setReportersVarargs(value: String*): Self = this.set("reporters", js.Array(value :_*))
    @scala.inline
    def setReporters(value: js.Array[String]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
  }
  
}

