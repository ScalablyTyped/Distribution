package typings.wordpressRichText

import typings.wordpressRichText.anon.MultilineTag
import typings.wordpressRichText.createMod.Format
import typings.wordpressRichText.createMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def applyFormat(value: Value, format: Format): Value = (js.Dynamic.global.applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyFormat(value: Value, format: Format, startIndex: Double): Value = (js.Dynamic.global.applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyFormat(value: Value, format: Format, startIndex: Double, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyFormat(value: Value, format: Format, startIndex: Unit, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def concat(values: Value*): Value = js.Dynamic.global.applyDynamic("concat")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Value]
  
  inline def getActiveFormat(value: Value, formatType: String): js.UndefOr[Format] = (js.Dynamic.global.applyDynamic("getActiveFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Format]]
  
  inline def getActiveFormats(value: Value): js.Array[Format] = js.Dynamic.global.applyDynamic("getActiveFormats")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Format]]
  inline def getActiveFormats(value: Value, EMPTY_ACTIVE_FORMATS: js.Array[Format]): js.Array[Format] = (js.Dynamic.global.applyDynamic("getActiveFormats")(value.asInstanceOf[js.Any], EMPTY_ACTIVE_FORMATS.asInstanceOf[js.Any])).asInstanceOf[js.Array[Format]]
  
  inline def getActiveObject(value: Value): js.UndefOr[js.Object] = js.Dynamic.global.applyDynamic("getActiveObject")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def getTextContent(value: Value): String = js.Dynamic.global.applyDynamic("getTextContent")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def insert(value: Value, valueToInsert: Value): Value = (js.Dynamic.global.applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def insert(value: Value, valueToInsert: Value, startIndex: Double): Value = (js.Dynamic.global.applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def insert(value: Value, valueToInsert: Value, startIndex: Double, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def insert(value: Value, valueToInsert: Value, startIndex: Unit, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def insertObject(value: Value, formatToInsert: Format): Value = (js.Dynamic.global.applyDynamic("insertObject")(value.asInstanceOf[js.Any], formatToInsert.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def isCollapsed(value: Value): js.UndefOr[Boolean] = js.Dynamic.global.applyDynamic("isCollapsed")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def isEmpty(value: Value): Boolean = js.Dynamic.global.applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(values: js.Array[Value]): Value = js.Dynamic.global.applyDynamic("join")(values.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def join(values: js.Array[Value], separator: String): Value = (js.Dynamic.global.applyDynamic("join")(values.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def join(values: js.Array[Value], separator: Value): Value = (js.Dynamic.global.applyDynamic("join")(values.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def registerFormatType(name: String, config: FormatConfiguration): js.UndefOr[NamedFormatConfiguration] = (js.Dynamic.global.applyDynamic("registerFormatType")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
  
  inline def remove(value: Value): Value = js.Dynamic.global.applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def remove(value: Value, startIndex: Double): Value = (js.Dynamic.global.applyDynamic("remove")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def remove(value: Value, startIndex: Double, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("remove")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def remove(value: Value, startIndex: Unit, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("remove")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def removeFormat(value: Value, formatType: String): Value = (js.Dynamic.global.applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def removeFormat(value: Value, formatType: String, startIndex: Double): Value = (js.Dynamic.global.applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def removeFormat(value: Value, formatType: String, startIndex: Double, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def removeFormat(value: Value, formatType: String, startIndex: Unit, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def replace(value: Value, pattern: String, replacement: String): Value = (js.Dynamic.global.applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def replace(
    value: Value,
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ Any, String]
  ): Value = (js.Dynamic.global.applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def replace(value: Value, pattern: js.RegExp, replacement: String): Value = (js.Dynamic.global.applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def replace(
    value: Value,
    pattern: js.RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ Any, String]
  ): Value = (js.Dynamic.global.applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def slice(value: Value): Value = js.Dynamic.global.applyDynamic("slice")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def slice(value: Value, startIndex: Double): Value = (js.Dynamic.global.applyDynamic("slice")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def slice(value: Value, startIndex: Double, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("slice")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def slice(value: Value, startIndex: Unit, endIndex: Double): Value = (js.Dynamic.global.applyDynamic("slice")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def split(value: Value): js.Array[Value] = js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: String): js.Array[Value] = (js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: String, limit: Double): js.Array[Value] = (js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: Double): js.Array[Value] = (js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: Double, limit: Double): js.Array[Value] = (js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: Unit, limit: Double): js.Array[Value] = (js.Dynamic.global.applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  
  inline def toHTMLString(args: MultilineTag): String = js.Dynamic.global.applyDynamic("toHTMLString")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toggleFormat(value: Value, format: Format): Value = (js.Dynamic.global.applyDynamic("toggleFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def unregisterFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.Dynamic.global.applyDynamic("unregisterFormatType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
}
