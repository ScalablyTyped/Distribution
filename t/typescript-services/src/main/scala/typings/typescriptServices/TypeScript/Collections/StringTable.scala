package typings.typescriptServices.TypeScript.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringTable extends js.Object {
  var count: js.Any
  var entries: js.Any
  def addCharArray(key: js.Array[Double], start: Double, len: Double): String
  /* private */ def addEntry(text: js.Any, hashCode: js.Any): js.Any
  /* private */ def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any
  /* private */ def grow(): js.Any
}

object StringTable {
  @scala.inline
  def apply(
    addCharArray: (js.Array[Double], Double, Double) => String,
    addEntry: (js.Any, js.Any) => js.Any,
    count: js.Any,
    entries: js.Any,
    findCharArrayEntry: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    grow: () => js.Any
  ): StringTable = {
    val __obj = js.Dynamic.literal(addCharArray = js.Any.fromFunction3(addCharArray), addEntry = js.Any.fromFunction2(addEntry), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findCharArrayEntry = js.Any.fromFunction4(findCharArrayEntry), grow = js.Any.fromFunction0(grow))
    __obj.asInstanceOf[StringTable]
  }
}

