package typings.walkdir.walkdirWalkdirMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.Anon_False
import typings.walkdir.Anon_FalseSync
import typings.walkdir.Anon_Returnobject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: Anon_FalseSync with WalkOptions): WalkEmitter = js.native
  def apply(path: String, options: Anon_Returnobject with WalkOptions): StringDictionary[Stats] = js.native
  def apply(path: String, options: Anon_False with WalkOptions): js.Array[String] = js.native
  def apply(path: String, options: Anon_False with WalkOptions, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: Anon_Returnobject with WalkOptions, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
  def apply(path: String, options: Anon_FalseSync with WalkOptions, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
}

