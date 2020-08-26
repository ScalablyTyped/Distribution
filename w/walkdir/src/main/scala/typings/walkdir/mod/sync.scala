package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.anon.WalkOptionsreturnobjectbo
import typings.walkdir.anon.WalkOptionsreturnobjectfa
import typings.walkdir.anon.WalkOptionsreturnobjecttr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "sync")
@js.native
object sync extends js.Object {
  def apply(path: String): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: js.UndefOr[scala.Nothing], eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectbo): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectbo, eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectfa): js.Array[String] = js.native
  def apply(path: String, options: WalkOptionsreturnobjectfa, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: WalkOptionsreturnobjecttr): StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptionsreturnobjecttr, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
}

