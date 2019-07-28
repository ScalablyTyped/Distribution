package typings.winston.winstonMod

import typings.logform.logformMod.Colorizer
import typings.logform.logformMod.Format
import typings.logform.logformMod.TransformableInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston", "format")
@js.native
object formatNs extends js.Object {
  def align(): Format = js.native
  def align(opts: js.Object): Format = js.native
  def cli(): Format = js.native
  def cli(opts: js.Object): Format = js.native
  def colorize(): Colorizer = js.native
  def colorize(opts: js.Object): Colorizer = js.native
  def combine(formats: Format*): Format = js.native
  def json(): Format = js.native
  def json(opts: js.Object): Format = js.native
  def label(): Format = js.native
  def label(opts: js.Object): Format = js.native
  def logstash(): Format = js.native
  def logstash(opts: js.Object): Format = js.native
  def padLevels(): Format = js.native
  def padLevels(opts: js.Object): Format = js.native
  def prettyPrint(): Format = js.native
  def prettyPrint(opts: js.Object): Format = js.native
  def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format = js.native
  def simple(): Format = js.native
  def simple(opts: js.Object): Format = js.native
  def splat(): Format = js.native
  def splat(opts: js.Object): Format = js.native
  def timestamp(): Format = js.native
  def timestamp(opts: js.Object): Format = js.native
  def uncolorize(): Format = js.native
  def uncolorize(opts: js.Object): Format = js.native
}

