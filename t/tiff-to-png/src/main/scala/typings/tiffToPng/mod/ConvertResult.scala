package typings.tiffToPng.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertResult extends js.Object {
  val converted: js.Array[Converted] = js.native
  val errors: js.Array[TiffConverterError] = js.native
  val total: Double = js.native
}

object ConvertResult {
  @scala.inline
  def apply(converted: js.Array[Converted], errors: js.Array[TiffConverterError], total: Double): ConvertResult = {
    val __obj = js.Dynamic.literal(converted = converted.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertResult]
  }
  @scala.inline
  implicit class ConvertResultOps[Self <: ConvertResult] (val x: Self) extends AnyVal {
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
    def setConvertedVarargs(value: Converted*): Self = this.set("converted", js.Array(value :_*))
    @scala.inline
    def setConverted(value: js.Array[Converted]): Self = this.set("converted", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: TiffConverterError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[TiffConverterError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

