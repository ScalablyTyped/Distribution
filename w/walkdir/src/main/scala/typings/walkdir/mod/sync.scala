package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.AnonReturnobjectBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "sync")
@js.native
object sync extends js.Object {
  def apply(path: String): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: WalkOptions with AnonReturnobjectBoolean): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions with AnonReturnobjectBoolean, eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = js.native
}

