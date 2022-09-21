package typings.tablestore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.tablestore.anon.ColumnName
import typings.tablestore.anon.Dictname
import typings.tablestore.anon.Name
import typings.tablestore.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def INF_MAX: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("INF_MAX").asInstanceOf[js.Symbol]

inline def INF_MIN: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("INF_MIN").asInstanceOf[js.Symbol]

inline def PK_AUTO_INCR: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("PK_AUTO_INCR").asInstanceOf[js.Symbol]

inline def events: SequentialExecutor = ^.asInstanceOf[js.Dynamic].selectDynamic("events").asInstanceOf[SequentialExecutor]

type AbortLocalTransactionParams = CommitLocalTransactionParams

type AttributesInput = js.Array[Dictname]

type AttributesOutput = js.Array[ColumnName]

type CellValue = String | Buffer | int64 | Boolean | Double | Null

type DeleteSearchIndexParams = DescribeSearchIndexParams

type DeleteTableParams = JustTableName

type DescribeTableParams = JustTableName

// helper
type EnumValues[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any

type EnumValuesOrKeys[T] = (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | (/* keyof T */ String)

type ListSearchIndexParams = JustTableName

type PrimaryKeyInput = js.Array[StringDictionary[CellValue | VirtualData]]

type PrimaryKeyOutput = js.Array[Name]

type VirtualData = js.Symbol
