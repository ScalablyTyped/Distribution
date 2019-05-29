package typings
package walkdirLib.walkdirWalkdirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: java.lang.String): WalkEmitter | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def apply(path: java.lang.String, options: walkdirLib.Anon_False with WalkOptions): js.Array[java.lang.String] = js.native
  def apply(path: java.lang.String, options: walkdirLib.Anon_Returnobject with WalkOptions): org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def apply(
    path: java.lang.String,
    options: walkdirLib.Anon_False with WalkOptions,
    eventListener: WalkEventListener
  ): js.Array[java.lang.String] = js.native
  def apply(
    path: java.lang.String,
    options: walkdirLib.Anon_Returnobject with WalkOptions,
    eventListener: WalkEventListener
  ): org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def apply(path: java.lang.String, options: WalkOptions | WalkEventListener): WalkEmitter | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def apply(path: java.lang.String, options: WalkOptions | WalkEventListener, eventListener: WalkEventListener): WalkEmitter | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def async(path: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def async(
    path: java.lang.String,
    options: WalkOptions with (walkdirLib.Anon_FalseReturnobject | walkdirLib.Anon_ReturnobjectBoolean | walkdirLib.Anon_ReturnobjectTrue)
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats]] = js.native
  def async(
    path: java.lang.String,
    options: WalkOptions with (walkdirLib.Anon_FalseReturnobject | walkdirLib.Anon_ReturnobjectBoolean | walkdirLib.Anon_ReturnobjectTrue),
    eventListener: WalkEventListener
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats]] = js.native
  def find(path: java.lang.String): WalkEmitter = js.native
  def find(path: java.lang.String, options: walkdirLib.Anon_FalseSync with WalkOptions): WalkEmitter = js.native
  def find(path: java.lang.String, options: walkdirLib.Anon_Returnobject with WalkOptions): org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def find(path: java.lang.String, options: walkdirLib.Anon_False with WalkOptions): js.Array[java.lang.String] = js.native
  def find(
    path: java.lang.String,
    options: walkdirLib.Anon_FalseSync with WalkOptions,
    eventListener: WalkEventListener
  ): WalkEmitter = js.native
  def find(
    path: java.lang.String,
    options: walkdirLib.Anon_Returnobject with WalkOptions,
    eventListener: WalkEventListener
  ): org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  def find(
    path: java.lang.String,
    options: walkdirLib.Anon_False with WalkOptions,
    eventListener: WalkEventListener
  ): js.Array[java.lang.String] = js.native
  def find(path: java.lang.String, options: WalkEventListener): WalkEmitter = js.native
  def find(path: java.lang.String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = js.native
  def sync(path: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(path: java.lang.String, options: WalkOptions with walkdirLib.Anon_FalseReturnobject): js.Array[java.lang.String] = js.native
  def sync(
    path: java.lang.String,
    options: WalkOptions with walkdirLib.Anon_FalseReturnobject,
    eventListener: WalkEventListener
  ): js.Array[java.lang.String] = js.native
  @JSName("sync")
  def `sync_<union>`(path: java.lang.String): js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  @JSName("sync")
  def `sync_<union>`(path: java.lang.String, options: WalkOptions with walkdirLib.Anon_ReturnobjectBoolean): js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  @JSName("sync")
  def `sync_<union>`(
    path: java.lang.String,
    options: WalkOptions with walkdirLib.Anon_ReturnobjectBoolean,
    eventListener: WalkEventListener
  ): js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  @JSName("sync")
  def sync_StringDictionary(path: java.lang.String, options: WalkOptions with walkdirLib.Anon_ReturnobjectTrue): org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  @JSName("sync")
  def sync_StringDictionary(
    path: java.lang.String,
    options: WalkOptions with walkdirLib.Anon_ReturnobjectTrue,
    eventListener: WalkEventListener
  ): org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
}

