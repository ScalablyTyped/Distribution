package typings.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.walkdir.AnonFalse
import typings.walkdir.AnonFalseSync
import typings.walkdir.AnonReturnobject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "find")
@js.native
object find extends js.Object {
  def apply(path: String): WalkEmitter = js.native
  def apply(path: String, options: AnonReturnobject with WalkOptions): StringDictionary[Stats] = js.native
  def apply(path: String, options: AnonFalseSync with WalkOptions): WalkEmitter = js.native
  def apply(path: String, options: AnonFalse with WalkOptions): js.Array[String] = js.native
  def apply(path: String, options: AnonFalseSync with WalkOptions, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: AnonReturnobject with WalkOptions, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
  def apply(path: String, options: AnonFalse with WalkOptions, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = js.native
}

