package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.StringHashTable")
@js.native
class StringHashTable[T] () extends IHashTable[T] {
  var itemCount: js.Any = js.native
  var table: js.Any = js.native
  /* CompleteClass */
  override def add(key: java.lang.String, data: T): scala.Boolean = js.native
  /* CompleteClass */
  override def addOrUpdate(key: java.lang.String, data: T): scala.Boolean = js.native
  /* CompleteClass */
  override def count(): scala.Double = js.native
  /* CompleteClass */
  override def every(fn: js.Function3[/* k */ java.lang.String, T, /* context */ js.Any, scala.Unit], context: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def getAllKeys(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def lookup(key: java.lang.String): T = js.native
  /* CompleteClass */
  override def map(fn: js.Function3[/* k */ java.lang.String, T, /* context */ js.Any, scala.Unit], context: js.Any): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def some(fn: js.Function3[/* k */ java.lang.String, T, /* context */ js.Any, scala.Unit], context: js.Any): scala.Boolean = js.native
}

