package typings.walkdir.walkdirWalkdirMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.Anon_False
import typings.walkdir.Anon_FalseReturnobject
import typings.walkdir.Anon_FalseSync
import typings.walkdir.Anon_Returnobject
import typings.walkdir.Anon_ReturnobjectBoolean
import typings.walkdir.Anon_ReturnobjectTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: Anon_False with WalkOptions): js.Array[String] = js.native
  def apply(path: String, options: Anon_Returnobject with WalkOptions): StringDictionary[Stats] = js.native
  def apply(path: String, options: Anon_False with WalkOptions, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: Anon_Returnobject with WalkOptions, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions | WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions | WalkEventListener, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def async(path: String): js.Promise[js.Array[String]] = js.native
  def async(
    path: String,
    options: WalkOptions with (Anon_FalseReturnobject | Anon_ReturnobjectBoolean | Anon_ReturnobjectTrue)
  ): js.Promise[StringDictionary[Stats]] = js.native
  def async(
    path: String,
    options: WalkOptions with (Anon_FalseReturnobject | Anon_ReturnobjectBoolean | Anon_ReturnobjectTrue),
    eventListener: WalkEventListener
  ): js.Promise[StringDictionary[Stats]] = js.native
  def find(path: String): WalkEmitter = js.native
  def find(path: String, options: Anon_False with WalkOptions): js.Array[String] = js.native
  def find(path: String, options: Anon_FalseSync with WalkOptions): WalkEmitter = js.native
  def find(path: String, options: Anon_Returnobject with WalkOptions): StringDictionary[Stats] = js.native
  def find(path: String, options: Anon_FalseSync with WalkOptions, eventListener: WalkEventListener): WalkEmitter = js.native
  def find(path: String, options: Anon_Returnobject with WalkOptions, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
  def find(path: String, options: Anon_False with WalkOptions, eventListener: WalkEventListener): js.Array[String] = js.native
  def find(path: String, options: WalkEventListener): WalkEmitter = js.native
  def find(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = js.native
  def sync(path: String): js.Array[String] = js.native
  def sync(path: String, options: WalkOptions with Anon_FalseReturnobject): js.Array[String] = js.native
  def sync(path: String, options: WalkOptions with Anon_FalseReturnobject, eventListener: WalkEventListener): js.Array[String] = js.native
  @JSName("sync")
  def sync_StringDictionary(path: String, options: WalkOptions with Anon_ReturnobjectTrue): StringDictionary[Stats] = js.native
  @JSName("sync")
  def sync_StringDictionary(path: String, options: WalkOptions with Anon_ReturnobjectTrue, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
  @JSName("sync")
  def sync_Union(path: String): js.Array[String] | StringDictionary[Stats] = js.native
  @JSName("sync")
  def sync_Union(path: String, options: WalkOptions with Anon_ReturnobjectBoolean): js.Array[String] | StringDictionary[Stats] = js.native
  @JSName("sync")
  def sync_Union(path: String, options: WalkOptions with Anon_ReturnobjectBoolean, eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = js.native
}

