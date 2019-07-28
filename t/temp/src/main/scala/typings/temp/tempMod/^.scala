package typings.temp.tempMod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var dir: String = js.native
  def cleanup(): Unit = js.native
  def cleanup(callback: js.Function2[/* err */ js.Any, /* result */ Stats, Unit]): Unit = js.native
  def cleanupSync(): Boolean | Stats = js.native
  def createWriteStream(): WriteStream = js.native
  def createWriteStream(affixes: String): WriteStream = js.native
  def createWriteStream(affixes: AffixOptions): WriteStream = js.native
  def mkdir(): Unit = js.native
  def mkdir(affixes: String): Unit = js.native
  def mkdir(affixes: String, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = js.native
  def mkdir(affixes: AffixOptions): Unit = js.native
  def mkdir(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = js.native
  def mkdirSync(): String = js.native
  def mkdirSync(affixes: String): String = js.native
  def mkdirSync(affixes: AffixOptions): String = js.native
  def open(): Unit = js.native
  def open(affixes: String): Unit = js.native
  def open(affixes: String, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = js.native
  def open(affixes: AffixOptions): Unit = js.native
  def open(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = js.native
  def openSync(): OpenFile = js.native
  def openSync(affixes: String): OpenFile = js.native
  def openSync(affixes: AffixOptions): OpenFile = js.native
  def path(): String = js.native
  def path(affixes: String): String = js.native
  def path(affixes: String, defaultPrefix: String): String = js.native
  def path(affixes: AffixOptions): String = js.native
  def path(affixes: AffixOptions, defaultPrefix: String): String = js.native
  def track(): js.Any = js.native
  def track(value: Boolean): js.Any = js.native
}

