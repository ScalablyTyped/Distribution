package typings
package atWordpressRichDashTextLib.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/rich-text", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyFormat(value: Value, format: Format): Value = js.native
  def applyFormat(value: Value, format: Format, startIndex: scala.Double): Value = js.native
  def applyFormat(value: Value, format: Format, startIndex: scala.Double, endIndex: scala.Double): Value = js.native
  def concat(values: Value*): Value = js.native
  def create(): Value = js.native
  def create(args: atWordpressRichDashTextLib.Anon_A): Value = js.native
  def create(args: atWordpressRichDashTextLib.Anon_Html): Value = js.native
  def create(args: atWordpressRichDashTextLib.Anon_Text): Value = js.native
  def getActiveFormat(value: Value, formatType: java.lang.String): js.UndefOr[Format] = js.native
  def getActiveObject(value: Value): js.UndefOr[js.Object] = js.native
  def getTextContent(value: Value): java.lang.String = js.native
  def insert(value: Value, valueToInsert: Value): Value = js.native
  def insert(value: Value, valueToInsert: Value, startIndex: scala.Double): Value = js.native
  def insert(value: Value, valueToInsert: Value, startIndex: scala.Double, endIndex: scala.Double): Value = js.native
  def insertObject(value: Value, formatToInsert: Format): Value = js.native
  def isCollapsed(value: Value): js.UndefOr[scala.Boolean] = js.native
  def isEmpty(value: Value): scala.Boolean = js.native
  def join(values: js.Array[Value]): Value = js.native
  def join(values: js.Array[Value], separator: Value): Value = js.native
  def join(values: js.Array[Value], separator: java.lang.String): Value = js.native
  def registerFormatType(name: java.lang.String, config: FormatConfiguration): js.UndefOr[NamedFormatConfiguration] = js.native
  def remove(value: Value): Value = js.native
  def remove(value: Value, startIndex: scala.Double): Value = js.native
  def remove(value: Value, startIndex: scala.Double, endIndex: scala.Double): Value = js.native
  def removeFormat(value: Value, formatType: java.lang.String): Value = js.native
  def removeFormat(value: Value, formatType: java.lang.String, startIndex: scala.Double): Value = js.native
  def removeFormat(value: Value, formatType: java.lang.String, startIndex: scala.Double, endIndex: scala.Double): Value = js.native
  def replace(value: Value, pattern: java.lang.String, replacement: java.lang.String): Value = js.native
  def replace(
    value: Value,
    pattern: java.lang.String,
    replacement: js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): Value = js.native
  def replace(value: Value, pattern: stdLib.RegExp, replacement: java.lang.String): Value = js.native
  def replace(
    value: Value,
    pattern: stdLib.RegExp,
    replacement: js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): Value = js.native
  def slice(value: Value): Value = js.native
  def slice(value: Value, startIndex: scala.Double): Value = js.native
  def slice(value: Value, startIndex: scala.Double, endIndex: scala.Double): Value = js.native
  def split(value: Value): js.Array[Value] = js.native
  def split(value: Value, separator: java.lang.String): js.Array[Value] = js.native
  def split(value: Value, separator: java.lang.String, limit: scala.Double): js.Array[Value] = js.native
  def split(value: Value, separator: scala.Double): js.Array[Value] = js.native
  def split(value: Value, separator: scala.Double, limit: scala.Double): js.Array[Value] = js.native
  def toHTMLString(args: atWordpressRichDashTextLib.Anon_AAbbr): java.lang.String = js.native
  def toggleFormat(value: Value, format: Format): Value = js.native
  def unregisterFormatType(name: java.lang.String): js.UndefOr[NamedFormatConfiguration] = js.native
}

