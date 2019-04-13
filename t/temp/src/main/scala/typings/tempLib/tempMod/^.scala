package typings
package tempLib.tempMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var dir: java.lang.String = js.native
  def cleanup(): scala.Unit = js.native
  def cleanup(callback: js.Function1[/* result */ scala.Boolean | Stats, scala.Unit]): scala.Unit = js.native
  def cleanupSync(): scala.Boolean | Stats = js.native
  def createWriteStream(): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(affixes: java.lang.String): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(affixes: AffixOptions): nodeLib.fsMod.WriteStream = js.native
  def mkdir(): scala.Unit = js.native
  def mkdir(affixes: java.lang.String): scala.Unit = js.native
  def mkdir(
    affixes: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* dirPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(affixes: AffixOptions): scala.Unit = js.native
  def mkdir(
    affixes: AffixOptions,
    callback: js.Function2[/* err */ js.Any, /* dirPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirSync(): java.lang.String = js.native
  def mkdirSync(affixes: java.lang.String): java.lang.String = js.native
  def mkdirSync(affixes: AffixOptions): java.lang.String = js.native
  def open(): scala.Unit = js.native
  def open(affixes: java.lang.String): scala.Unit = js.native
  def open(
    affixes: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, scala.Unit]
  ): scala.Unit = js.native
  def open(affixes: AffixOptions): scala.Unit = js.native
  def open(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, scala.Unit]): scala.Unit = js.native
  def openSync(): OpenFile = js.native
  def openSync(affixes: java.lang.String): OpenFile = js.native
  def openSync(affixes: AffixOptions): OpenFile = js.native
  def path(): java.lang.String = js.native
  def path(affixes: java.lang.String): java.lang.String = js.native
  def path(affixes: java.lang.String, defaultPrefix: java.lang.String): java.lang.String = js.native
  def path(affixes: AffixOptions): java.lang.String = js.native
  def path(affixes: AffixOptions, defaultPrefix: java.lang.String): java.lang.String = js.native
  def track(): js.Any = js.native
  def track(value: scala.Boolean): js.Any = js.native
}

