package typings
package tempLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Path extends js.Object {
  var dir: java.lang.String = js.native
  def cleanup(): scala.Unit = js.native
  def cleanup(callback: js.Function1[/* result */ scala.Boolean | tempLib.tempMod.tempNs.Stats, scala.Unit]): scala.Unit = js.native
  def cleanupSync(): scala.Boolean | tempLib.tempMod.tempNs.Stats = js.native
  def createWriteStream(): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(affixes: java.lang.String): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(affixes: tempLib.tempMod.tempNs.AffixOptions): nodeLib.fsMod.WriteStream = js.native
  def mkdir(): scala.Unit = js.native
  def mkdir(affixes: java.lang.String): scala.Unit = js.native
  def mkdir(
    affixes: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* dirPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(affixes: tempLib.tempMod.tempNs.AffixOptions): scala.Unit = js.native
  def mkdir(
    affixes: tempLib.tempMod.tempNs.AffixOptions,
    callback: js.Function2[/* err */ js.Any, /* dirPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirSync(): java.lang.String = js.native
  def mkdirSync(affixes: java.lang.String): java.lang.String = js.native
  def mkdirSync(affixes: tempLib.tempMod.tempNs.AffixOptions): java.lang.String = js.native
  def open(): scala.Unit = js.native
  def open(affixes: java.lang.String): scala.Unit = js.native
  def open(
    affixes: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* result */ tempLib.tempMod.tempNs.OpenFile, scala.Unit]
  ): scala.Unit = js.native
  def open(affixes: tempLib.tempMod.tempNs.AffixOptions): scala.Unit = js.native
  def open(
    affixes: tempLib.tempMod.tempNs.AffixOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ tempLib.tempMod.tempNs.OpenFile, scala.Unit]
  ): scala.Unit = js.native
  def openSync(): tempLib.tempMod.tempNs.OpenFile = js.native
  def openSync(affixes: java.lang.String): tempLib.tempMod.tempNs.OpenFile = js.native
  def openSync(affixes: tempLib.tempMod.tempNs.AffixOptions): tempLib.tempMod.tempNs.OpenFile = js.native
  def path(): java.lang.String = js.native
  def path(affixes: java.lang.String): java.lang.String = js.native
  def path(affixes: java.lang.String, defaultPrefix: java.lang.String): java.lang.String = js.native
  def path(affixes: tempLib.tempMod.tempNs.AffixOptions): java.lang.String = js.native
  def path(affixes: tempLib.tempMod.tempNs.AffixOptions, defaultPrefix: java.lang.String): java.lang.String = js.native
  def track(): /* import warning: Failed type conversion: TsTypeQuery(TsQIdent(List(TsIdentLibrarySimple(temp), TsIdentModule(None,List(temp)), TsIdentNamespace(temp)))) */js.Any = js.native
  def track(value: scala.Boolean): /* import warning: Failed type conversion: TsTypeQuery(TsQIdent(List(TsIdentLibrarySimple(temp), TsIdentModule(None,List(temp)), TsIdentNamespace(temp)))) */js.Any = js.native
}

