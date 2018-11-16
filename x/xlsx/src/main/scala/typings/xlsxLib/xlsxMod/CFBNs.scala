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
    val lockbytes: cfbLib.cfbMod.CFB$EntryType.lockbytes with java.lang.String = js.native
    val property: cfbLib.cfbMod.CFB$EntryType.property with java.lang.String = js.native
    val root: cfbLib.cfbMod.CFB$EntryType.root with java.lang.String = js.native
    val storage: cfbLib.cfbMod.CFB$EntryType.storage with java.lang.String = js.native
    val stream: cfbLib.cfbMod.CFB$EntryType.stream with java.lang.String = js.native
    val unknown: cfbLib.cfbMod.CFB$EntryType.unknown with java.lang.String = js.native
    @JSBracketAccess
    @JSName("CFB$EntryType")
    def apply(value: java.lang.String): js.UndefOr[cfbLib.cfbMod.CFB$EntryType with java.lang.String] = js.native
  }
  
  @js.native
  object CFB$StorageType extends js.Object {
    val fat: cfbLib.cfbMod.CFB$StorageType.fat with java.lang.String = js.native
    val minifat: cfbLib.cfbMod.CFB$StorageType.minifat with java.lang.String = js.native
    @JSBracketAccess
    @JSName("CFB$StorageType")
    def apply(value: java.lang.String): js.UndefOr[cfbLib.cfbMod.CFB$StorageType with java.lang.String] = js.native
  }
  
  type CFB$EntryType = cfbLib.cfbMod.CFB$EntryType
  type CFB$StorageType = cfbLib.cfbMod.CFB$StorageType
}

