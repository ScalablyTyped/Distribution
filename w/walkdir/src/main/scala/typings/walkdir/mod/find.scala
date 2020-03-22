package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.syncfalseWalkOptions
import typings.walkdir.synctruereturnobjectfalse
import typings.walkdir.synctruereturnobjecttrueW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "find")
@js.native
object find extends js.Object {
  def apply(path: String): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: syncfalseWalkOptions): WalkEmitter = js.native
  def apply(path: String, options: syncfalseWalkOptions, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: synctruereturnobjectfalse): js.Array[String] = js.native
  def apply(path: String, options: synctruereturnobjectfalse, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: synctruereturnobjecttrueW): StringDictionary[Stats] = js.native
  def apply(path: String, options: synctruereturnobjecttrueW, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
}

