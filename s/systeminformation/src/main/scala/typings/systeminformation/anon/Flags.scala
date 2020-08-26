package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags extends js.Object {
  var flags: Autokeep = js.native
  var id: Double = js.native
  var name: java.lang.String = js.native
  var raw: String = js.native
  var thresh: Double = js.native
  var value: Double = js.native
  var when_failed: java.lang.String = js.native
  var worst: Double = js.native
}

object Flags {
  @scala.inline
  def apply(
    flags: Autokeep,
    id: Double,
    name: java.lang.String,
    raw: String,
    thresh: Double,
    value: Double,
    when_failed: java.lang.String,
    worst: Double
  ): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], thresh = thresh.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], when_failed = when_failed.asInstanceOf[js.Any], worst = worst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlags(value: Autokeep): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setThresh(value: Double): Self = this.set("thresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhen_failed(value: java.lang.String): Self = this.set("when_failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorst(value: Double): Self = this.set("worst", value.asInstanceOf[js.Any])
  }
  
}

