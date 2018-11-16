package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHashTable[T] extends js.Object {
  def add(key: java.lang.String, data: T): scala.Boolean
  def addOrUpdate(key: java.lang.String, data: T): scala.Boolean
  def count(): scala.Double
  def every(
    fn: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit],
    context: js.Any
  ): scala.Boolean
  def getAllKeys(): js.Array[java.lang.String]
  def lookup(key: java.lang.String): T
  def map(
    fn: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit],
    context: js.Any
  ): scala.Unit
  def some(
    fn: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit],
    context: js.Any
  ): scala.Boolean
}

