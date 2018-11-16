package typings
package tableLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table", JSImport.Namespace)
@js.native
object tableModMembers extends js.Object {
  def createStream(userConfig: TableUserConfig): tableLib.Anon_Write = js.native
  def getBorderCharacters(templateName: BorderType): JoinStruct = js.native
  def table(data: js.Array[_]): java.lang.String = js.native
  def table(data: js.Array[_], userConfig: TableUserConfig): java.lang.String = js.native
}

