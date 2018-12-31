package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Obj extends Type {
  /** An object mapping the object’s known properties to AVals. Don’t manipulate this directly (ever), only use it if you have to iterate over the properties. */
  var props: stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[AVal]] = js.native
  /** The prototype of the object, or null. */
  var proto: js.Any = js.native
  /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
  def defProp(prop: java.lang.String): AVal = js.native
  def defProp(prop: java.lang.String, originNode: estreeLib.estreeMod.Node): AVal = js.native
  /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
  def hasProp(prop: java.lang.String): AVal | scala.Null = js.native
}

