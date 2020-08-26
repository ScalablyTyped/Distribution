package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locked extends js.Object {
  var builtIn: scala.Double = js.native
  var disabled: scala.Double = js.native
  var locked: scala.Double = js.native
  var multiVersion: scala.Double = js.native
  var none: scala.Double = js.native
  var paid: scala.Double = js.native
  var preview: scala.Double = js.native
  var public: scala.Double = js.native
  var system: scala.Double = js.native
  var trial: scala.Double = js.native
  var trusted: scala.Double = js.native
  var unpublished: scala.Double = js.native
  var validated: scala.Double = js.native
}

object Locked {
  @scala.inline
  def apply(
    builtIn: scala.Double,
    disabled: scala.Double,
    locked: scala.Double,
    multiVersion: scala.Double,
    none: scala.Double,
    paid: scala.Double,
    preview: scala.Double,
    public: scala.Double,
    system: scala.Double,
    trial: scala.Double,
    trusted: scala.Double,
    unpublished: scala.Double,
    validated: scala.Double
  ): Locked = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], trial = trial.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
  @scala.inline
  implicit class LockedOps[Self <: Locked] (val x: Self) extends AnyVal {
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
    def setBuiltIn(value: scala.Double): Self = this.set("builtIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: scala.Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: scala.Double): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiVersion(value: scala.Double): Self = this.set("multiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaid(value: scala.Double): Self = this.set("paid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreview(value: scala.Double): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: scala.Double): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: scala.Double): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrial(value: scala.Double): Self = this.set("trial", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrusted(value: scala.Double): Self = this.set("trusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnpublished(value: scala.Double): Self = this.set("unpublished", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidated(value: scala.Double): Self = this.set("validated", value.asInstanceOf[js.Any])
  }
  
}

