package typings.typedoc.distLibUtilsMod

import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import typings.typedoc.distLibUtilsComponentMod.ComponentOptions
import typings.typedoc.distLibUtilsOptionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Component(options: ComponentOptions): ClassDecorator = js.native
  def Option(options: DeclarationOption): PropertyDecorator = js.native
  def directoryExists(directoryPath: String): Boolean = js.native
  def ensureDirectoriesExist(directoryPath: String): Unit = js.native
  def normalizePath(path: String): String = js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
}

