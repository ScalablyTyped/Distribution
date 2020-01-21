package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.AnonFalseReturnobject
import typings.walkdir.AnonReturnobjectBoolean
import typings.walkdir.AnonReturnobjectTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "async")
@js.native
object async extends js.Object {
  def apply(path: String): js.Promise[js.Array[String]] = js.native
  def apply(
    path: String,
    options: WalkOptions with AnonReturnobjectTrue with AnonFalseReturnobject with AnonReturnobjectBoolean
  ): js.Promise[StringDictionary[Stats]] = js.native
  def apply(
    path: String,
    options: WalkOptions with AnonReturnobjectTrue with AnonFalseReturnobject with AnonReturnobjectBoolean,
    eventListener: WalkEventListener
  ): js.Promise[StringDictionary[Stats]] = js.native
}

