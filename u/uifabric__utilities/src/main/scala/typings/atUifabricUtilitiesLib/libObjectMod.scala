package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/object", JSImport.Namespace)
@js.native
object libObjectMod extends js.Object {
  def assign(target: js.Any, args: js.Any*): js.Any = js.native
  def filteredAssign(
    isAllowed: js.Function1[/* propName */ java.lang.String, scala.Boolean],
    target: js.Any,
    args: js.Any*
  ): js.Any = js.native
  def getId(): java.lang.String = js.native
  def getId(prefix: java.lang.String): java.lang.String = js.native
  def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String | scala.Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = js.native
  def resetIds(): scala.Unit = js.native
  def resetIds(counter: scala.Double): scala.Unit = js.native
  def shallowCompare[TA, TB](a: TA, b: TB): scala.Boolean = js.native
  def values[T](obj: js.Any): js.Array[T] = js.native
}

