package typings.walkdir.walkdirWalkdirMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.Anon_ReturnobjectBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "sync")
@js.native
object sync extends js.Object {
  def apply(path: String): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: WalkOptions with Anon_ReturnobjectBoolean): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions with Anon_ReturnobjectBoolean, eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = js.native
}

