package typings
package typedocLib.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Component(options: typedocLib.distLibUtilsComponentMod.ComponentOptions): stdLib.ClassDecorator = js.native
  def Option(options: typedocLib.distLibUtilsOptionsDeclarationMod.DeclarationOption): stdLib.PropertyDecorator = js.native
  def directoryExists(directoryPath: java.lang.String): scala.Boolean = js.native
  def ensureDirectoriesExist(directoryPath: java.lang.String): scala.Unit = js.native
  def normalizePath(path: java.lang.String): java.lang.String = js.native
  def writeFile(fileName: java.lang.String, data: java.lang.String, writeByteOrderMark: scala.Boolean): scala.Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    data: java.lang.String,
    writeByteOrderMark: scala.Boolean,
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

