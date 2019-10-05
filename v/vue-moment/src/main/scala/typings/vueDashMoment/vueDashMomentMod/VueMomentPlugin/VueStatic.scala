package typings.vueDashMoment.vueDashMomentMod.VueMomentPlugin

import typings.moment.momentMod.Moment
import typings.moment.momentMod.MomentFormatSpecification
import typings.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueStatic extends Moment {
  def apply(): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  def apply(options: Options): Unit = js.native
}

