package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.anon.WalkOptionsreturnobjectbo
import typings.walkdir.anon.WalkOptionsreturnobjectfa
import typings.walkdir.anon.WalkOptionsreturnobjecttr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "async")
@js.native
object async extends js.Object {
  def apply(path: String): js.Promise[js.Array[String]] = js.native
  def apply(path: String, options: js.UndefOr[scala.Nothing], eventListener: WalkEventListener): js.Promise[js.Array[String]] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectbo): js.Promise[js.Array[String] | StringDictionary[Stats]] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectbo, eventListener: WalkEventListener): js.Promise[js.Array[String] | StringDictionary[Stats]] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectfa): js.Promise[js.Array[String]] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectfa, eventListener: WalkEventListener): js.Promise[js.Array[String]] = js.native
  def apply(path: String, options: WalkOptionsreturnobjecttr): js.Promise[StringDictionary[Stats]] = js.native
  def apply(path: String, options: WalkOptionsreturnobjecttr, eventListener: WalkEventListener): js.Promise[StringDictionary[Stats]] = js.native
}

