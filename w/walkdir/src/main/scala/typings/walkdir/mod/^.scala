package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.anon.syncfalseundefinedWalkOpt
import typings.walkdir.anon.synctruereturnobjectfalse
import typings.walkdir.anon.synctruereturnobjecttrueW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): WalkEmitter = js.native
  def apply(path: String, options: js.UndefOr[scala.Nothing], eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: syncfalseundefinedWalkOpt): WalkEmitter = js.native
  def apply(path: String, options: syncfalseundefinedWalkOpt, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: synctruereturnobjectfalse): js.Array[String] = js.native
  def apply(path: String, options: synctruereturnobjectfalse, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: synctruereturnobjecttrueW): StringDictionary[Stats] = js.native
  def apply(path: String, options: synctruereturnobjecttrueW, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkOptions): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
}

