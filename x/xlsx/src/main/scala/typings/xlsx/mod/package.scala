package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def read(data: js.Any): typings.xlsx.mod.WorkBook = typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[typings.xlsx.mod.WorkBook]
@scala.inline
def read(data: js.Any, opts: typings.xlsx.mod.ParsingOptions): typings.xlsx.mod.WorkBook = (typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.xlsx.mod.WorkBook]

@scala.inline
def readFile(filename: java.lang.String): typings.xlsx.mod.WorkBook = typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.xlsx.mod.WorkBook]
@scala.inline
def readFile(filename: java.lang.String, opts: typings.xlsx.mod.ParsingOptions): typings.xlsx.mod.WorkBook = (typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.xlsx.mod.WorkBook]

@scala.inline
def stream: typings.xlsx.mod.StreamUtils = typings.xlsx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stream").asInstanceOf[typings.xlsx.mod.StreamUtils]

@scala.inline
def utils: typings.xlsx.mod.XLSXUtils = typings.xlsx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[typings.xlsx.mod.XLSXUtils]

@scala.inline
def version: java.lang.String = typings.xlsx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

@scala.inline
def write(data: typings.xlsx.mod.WorkBook): js.Any = typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def write(data: typings.xlsx.mod.WorkBook, opts: typings.xlsx.mod.WritingOptions): js.Any = (typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def writeFile(data: typings.xlsx.mod.WorkBook, filename: java.lang.String): js.Any = (typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
@scala.inline
def writeFile(data: typings.xlsx.mod.WorkBook, filename: java.lang.String, opts: typings.xlsx.mod.WritingOptions): js.Any = (typings.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]

type NumberFormat = java.lang.String | scala.Double

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.xlsx.mod.Range
  - typings.xlsx.mod.CellAddress
*/
type RangeSpec = typings.xlsx.mod._RangeSpec | java.lang.String

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.xlsx.mod.MarginInfo
  - typings.xlsx.mod.SheetType
*/
type SheetKeys = typings.xlsx.mod._SheetKeys | java.lang.String

type StrictWS = org.scalablytyped.runtime.StringDictionary[typings.xlsx.mod.CellObject]

/* Rewritten from type alias, can be one of: 
  - typings.xlsx.mod.SheetKeys
  - js.Array[typings.xlsx.mod.ColInfo | typings.xlsx.mod.Range | typings.xlsx.mod.RowInfo]
  - typings.xlsx.mod.ProtectInfo
  - typings.xlsx.mod.AutoFilterInfo
*/
type WSKeys = typings.xlsx.mod._WSKeys | (js.Array[typings.xlsx.mod.ColInfo | typings.xlsx.mod.Range | typings.xlsx.mod.RowInfo]) | java.lang.String

type WSSpec = java.lang.String | scala.Double | typings.xlsx.mod.WorkSheet
