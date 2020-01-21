package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typings.tern.AnonNameString1072287092
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prim
  extends IType
     with Type {
  /** The name of the type, if any. */
  var name: string | bool | number
  /** The prototype of the object, or null. */
  var proto: Obj with AnonNameString1072287092
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal
}

@JSImport("tern/lib/infer", "Prim")
@js.native
object Prim extends TopLevel[PrimConstructor]

