package typings
package typescriptDashServicesLib.TypeScriptNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Collections.StringTable")
@js.native
class StringTable protected () extends js.Object {
  def this(capacity: scala.Double) = this()
  var count: js.Any = js.native
  var entries: js.Any = js.native
  def addCharArray(key: js.Array[scala.Double], start: scala.Double, len: scala.Double): java.lang.String = js.native
  /* private */ def addEntry(text: js.Any, hashCode: js.Any): js.Any = js.native
  /* private */ def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any = js.native
  /* private */ def grow(): js.Any = js.native
}

@JSGlobal("TypeScript.Collections.StringTable")
@js.native
object StringTable extends js.Object {
  /* private */ def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
}

