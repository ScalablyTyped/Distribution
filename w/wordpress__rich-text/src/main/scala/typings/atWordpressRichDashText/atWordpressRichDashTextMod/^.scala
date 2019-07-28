package typings.atWordpressRichDashText.atWordpressRichDashTextMod

import typings.atWordpressRichDashText.Anon_A
import typings.atWordpressRichDashText.Anon_AAbbr
import typings.atWordpressRichDashText.Anon_Html
import typings.atWordpressRichDashText.Anon_Text
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/rich-text", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyFormat(value: Value, format: Format): Value = js.native
  def applyFormat(value: Value, format: Format, startIndex: Double): Value = js.native
  def applyFormat(value: Value, format: Format, startIndex: Double, endIndex: Double): Value = js.native
  def concat(values: Value*): Value = js.native
  def create(): Value = js.native
  def create(args: Anon_A): Value = js.native
  def create(args: Anon_Html): Value = js.native
  def create(args: Anon_Text): Value = js.native
  def getActiveFormat(value: Value, formatType: String): js.UndefOr[Format] = js.native
  def getActiveObject(value: Value): js.UndefOr[js.Object] = js.native
  def getTextContent(value: Value): String = js.native
  def insert(value: Value, valueToInsert: Value): Value = js.native
  def insert(value: Value, valueToInsert: Value, startIndex: Double): Value = js.native
  def insert(value: Value, valueToInsert: Value, startIndex: Double, endIndex: Double): Value = js.native
  def insertObject(value: Value, formatToInsert: Format): Value = js.native
  def isCollapsed(value: Value): js.UndefOr[Boolean] = js.native
  def isEmpty(value: Value): Boolean = js.native
  def join(values: js.Array[Value]): Value = js.native
  def join(values: js.Array[Value], separator: String): Value = js.native
  def join(values: js.Array[Value], separator: Value): Value = js.native
  def registerFormatType(name: String, config: FormatConfiguration): js.UndefOr[NamedFormatConfiguration] = js.native
  def remove(value: Value): Value = js.native
  def remove(value: Value, startIndex: Double): Value = js.native
  def remove(value: Value, startIndex: Double, endIndex: Double): Value = js.native
  def removeFormat(value: Value, formatType: String): Value = js.native
  def removeFormat(value: Value, formatType: String, startIndex: Double): Value = js.native
  def removeFormat(value: Value, formatType: String, startIndex: Double, endIndex: Double): Value = js.native
  def replace(value: Value, pattern: String, replacement: String): Value = js.native
  def replace(
    value: Value,
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]
  ): Value = js.native
  def replace(value: Value, pattern: RegExp, replacement: String): Value = js.native
  def replace(
    value: Value,
    pattern: RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]
  ): Value = js.native
  def slice(value: Value): Value = js.native
  def slice(value: Value, startIndex: Double): Value = js.native
  def slice(value: Value, startIndex: Double, endIndex: Double): Value = js.native
  def split(value: Value): js.Array[Value] = js.native
  def split(value: Value, separator: String): js.Array[Value] = js.native
  def split(value: Value, separator: String, limit: Double): js.Array[Value] = js.native
  def split(value: Value, separator: Double): js.Array[Value] = js.native
  def split(value: Value, separator: Double, limit: Double): js.Array[Value] = js.native
  def toHTMLString(args: Anon_AAbbr): String = js.native
  def toggleFormat(value: Value, format: Format): Value = js.native
  def unregisterFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
}

