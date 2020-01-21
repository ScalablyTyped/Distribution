package typings.twix.mod.momentAugmentingMod

import typings.moment.mod.MomentInput
import typings.std.Date
import typings.twix.mod.Twix
import typings.twix.mod.TwixParseAndFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def twix(date: String): Twix = js.native
  def twix(date: String, allDay: Boolean): Twix = js.native
  def twix(date: String, format: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: js.Array[Double]): Twix = js.native
  def twix(date: js.Array[Double], allDay: Boolean): Twix = js.native
  def twix(date: js.Array[Double], format: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: js.Array[Double], options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: Double): Twix = js.native
  def twix(date: Double, allDay: Boolean): Twix = js.native
  def twix(date: Double, format: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: Double, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: MomentInput): Twix = js.native
  def twix(date: MomentInput, allDay: Boolean): Twix = js.native
  def twix(date: MomentInput, format: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: MomentInput, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: Date): Twix = js.native
  def twix(date: Date, allDay: Boolean): Twix = js.native
  def twix(date: Date, format: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: Date, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: Moment): Twix = js.native
  def twix(date: Moment, allDay: Boolean): Twix = js.native
  def twix(date: Moment, format: String, options: TwixParseAndFormatOptions): Twix = js.native
  def twix(date: Moment, options: TwixParseAndFormatOptions): Twix = js.native
}

