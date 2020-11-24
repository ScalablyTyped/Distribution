package typings.winston.mod.Logform

import typings.logform.mod.CliOptions
import typings.logform.mod.ColorizeOptions
import typings.logform.mod.FormatWrap
import typings.logform.mod.JsonOptions
import typings.logform.mod.LabelOptions
import typings.logform.mod.MetadataOptions
import typings.logform.mod.PadLevelsOptions
import typings.logform.mod.PrettyPrintOptions
import typings.logform.mod.TimestampOptions
import typings.logform.mod.TransformFunction
import typings.logform.mod.TransformableInfo
import typings.logform.mod.UncolorizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("winston", "Logform.format")
@js.native
object format extends js.Object {
  
  def apply(transform: TransformFunction): FormatWrap = js.native
  
  def align(): typings.logform.mod.Format_ = js.native
  
  def cli(): typings.logform.mod.Format_ = js.native
  def cli(opts: CliOptions): typings.logform.mod.Format_ = js.native
  
  def colorize(): typings.logform.mod.Colorizer = js.native
  def colorize(opts: ColorizeOptions): typings.logform.mod.Colorizer = js.native
  
  def combine(formats: typings.logform.mod.Format_ *): typings.logform.mod.Format_ = js.native
  
  def errors(): typings.logform.mod.Format_ = js.native
  def errors(opts: js.Object): typings.logform.mod.Format_ = js.native
  
  def json(): typings.logform.mod.Format_ = js.native
  def json(opts: JsonOptions): typings.logform.mod.Format_ = js.native
  
  def label(): typings.logform.mod.Format_ = js.native
  def label(opts: LabelOptions): typings.logform.mod.Format_ = js.native
  
  def logstash(): typings.logform.mod.Format_ = js.native
  
  def metadata(): typings.logform.mod.Format_ = js.native
  def metadata(opts: MetadataOptions): typings.logform.mod.Format_ = js.native
  
  def ms(): typings.logform.mod.Format_ = js.native
  
  def padLevels(): typings.logform.mod.Format_ = js.native
  def padLevels(opts: PadLevelsOptions): typings.logform.mod.Format_ = js.native
  
  def prettyPrint(): typings.logform.mod.Format_ = js.native
  def prettyPrint(opts: PrettyPrintOptions): typings.logform.mod.Format_ = js.native
  
  def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): typings.logform.mod.Format_ = js.native
  
  def simple(): typings.logform.mod.Format_ = js.native
  
  def splat(): typings.logform.mod.Format_ = js.native
  
  def timestamp(): typings.logform.mod.Format_ = js.native
  def timestamp(opts: TimestampOptions): typings.logform.mod.Format_ = js.native
  
  def uncolorize(): typings.logform.mod.Format_ = js.native
  def uncolorize(opts: UncolorizeOptions): typings.logform.mod.Format_ = js.native
}
