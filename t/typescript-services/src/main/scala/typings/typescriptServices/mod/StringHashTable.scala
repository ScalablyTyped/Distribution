package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "StringHashTable")
@js.native
class StringHashTable[T] ()
  extends typings.typescriptServices.TypeScript.StringHashTable[T] {
  /* CompleteClass */
  override var itemCount: js.Any = js.native
  /* CompleteClass */
  override var table: js.Any = js.native
  /* CompleteClass */
  override def add(key: String, data: T): Boolean = js.native
  /* CompleteClass */
  override def addOrUpdate(key: String, data: T): Boolean = js.native
  /* CompleteClass */
  override def count(): Double = js.native
  /* CompleteClass */
  override def every(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
  /* CompleteClass */
  override def getAllKeys(): js.Array[String] = js.native
  /* CompleteClass */
  override def lookup(key: String): T = js.native
  /* CompleteClass */
  override def map(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Unit = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  /* CompleteClass */
  override def some(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
}

