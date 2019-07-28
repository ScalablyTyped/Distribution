package typings.table.tableMod

import typings.table.Anon_Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createStream(userConfig: TableUserConfig): Anon_Write = js.native
  def getBorderCharacters(templateName: BorderType): JoinStruct = js.native
  def table(data: js.Array[_]): String = js.native
  def table(data: js.Array[_], userConfig: TableUserConfig): String = js.native
}

