package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typings.estree.mod.Node
import typings.tern.ObjnamestringDefProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Obj
  extends IType
     with Type {
  /** The name of the type, if any. */
  var name: js.UndefOr[String] = js.native
  /** The prototype of the object, or null. */
  var proto: ObjnamestringDefProp | Null = js.native
  /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
  def defProp(prop: String): AVal = js.native
  def defProp(prop: String, originNode: Node): AVal = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(f: js.Function3[/* prop */ String, /* val */ AVal, /* local */ Boolean, Unit]): Unit = js.native
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
  def hasProp(prop: String): AVal | Null = js.native
}

@JSImport("tern/lib/infer", "Obj")
@js.native
object Obj extends TopLevel[ObjConstructor]

