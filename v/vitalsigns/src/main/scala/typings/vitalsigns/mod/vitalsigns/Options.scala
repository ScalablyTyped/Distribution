package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Number of milliseconds to wait between automatic health checks.
    * @type {number|boolean}
    */
  var autoCheck: js.UndefOr[Double | Boolean] = js.native
  /**
    * HTTP response code to send back in the VitalSigns.
    * @type {number}
    */
  var httpHealthy: js.UndefOr[Double] = js.native
  /**
    * HTTP response code to send back in the VitalSigns.
    * @type {number}
    */
  var httpUnhealthy: js.UndefOr[Double] = js.native
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
    def setAutoCheck(value: Double | Boolean): Self = this.set("autoCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCheck: Self = this.set("autoCheck", js.undefined)
    @scala.inline
    def setHttpHealthy(value: Double): Self = this.set("httpHealthy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpHealthy: Self = this.set("httpHealthy", js.undefined)
    @scala.inline
    def setHttpUnhealthy(value: Double): Self = this.set("httpUnhealthy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpUnhealthy: Self = this.set("httpUnhealthy", js.undefined)
  }
  
}

