package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xlsx", "CFB")
@js.native
object CFBNs extends js.Object {
  val utils: cfbLib.cfbMod.CFB$Utils = js.native
  val version: java.lang.String = js.native
  def find(cfb: cfbLib.cfbMod.CFB$Container, path: java.lang.String): cfbLib.cfbMod.CFB$Entry | scala.Null = js.native
  def parse(f: cfbLib.cfbMod.CFB$Blob): cfbLib.cfbMod.CFB$Container = js.native
  def parse(f: cfbLib.cfbMod.CFB$Blob, options: cfbLib.cfbMod.CFB$ParsingOptions): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: cfbLib.cfbMod.CFB$Blob): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: cfbLib.cfbMod.CFB$Blob, options: cfbLib.cfbMod.CFB$ParsingOptions): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: java.lang.String): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: java.lang.String, options: cfbLib.cfbMod.CFB$ParsingOptions): cfbLib.cfbMod.CFB$Container = js.native
  def write(cfb: cfbLib.cfbMod.CFB$Container): js.Any = js.native
  def write(cfb: cfbLib.cfbMod.CFB$Container, options: cfbLib.cfbMod.CFB$WritingOptions): js.Any = js.native
  def writeFile(cfb: cfbLib.cfbMod.CFB$Container, filename: java.lang.String): js.Any = js.native
  def writeFile(
    cfb: cfbLib.cfbMod.CFB$Container,
    filename: java.lang.String,
    options: cfbLib.cfbMod.CFB$WritingOptions
  ): js.Any = js.native
  @js.native
  object CFB$EntryType extends js.Object {
    /* 3 */ val lockbytes: cfbLib.cfbMod.CFB$EntryType.lockbytes with scala.Double = js.native
    /* 4 */ val property: cfbLib.cfbMod.CFB$EntryType.property with scala.Double = js.native
    /* 5 */ val root: cfbLib.cfbMod.CFB$EntryType.root with scala.Double = js.native
    /* 1 */ val storage: cfbLib.cfbMod.CFB$EntryType.storage with scala.Double = js.native
    /* 2 */ val stream: cfbLib.cfbMod.CFB$EntryType.stream with scala.Double = js.native
    /* 0 */ val unknown: cfbLib.cfbMod.CFB$EntryType.unknown with scala.Double = js.native
    @JSBracketAccess
    @JSName("CFB$EntryType")
    def apply(value: scala.Double): js.UndefOr[cfbLib.cfbMod.CFB$EntryType with scala.Double] = js.native
  }
  
  @js.native
  object CFB$StorageType extends js.Object {
    /* 0 */ val fat: cfbLib.cfbMod.CFB$StorageType.fat with scala.Double = js.native
    /* 1 */ val minifat: cfbLib.cfbMod.CFB$StorageType.minifat with scala.Double = js.native
    @JSBracketAccess
    @JSName("CFB$StorageType")
    def apply(value: scala.Double): js.UndefOr[cfbLib.cfbMod.CFB$StorageType with scala.Double] = js.native
  }
  
}

