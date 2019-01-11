package typings
package tableLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createStream(userConfig: tableLib.tableMod.TableUserConfig): tableLib.Anon_Write = js.native
  def getBorderCharacters(templateName: tableLib.tableMod.BorderType): tableLib.tableMod.JoinStruct = js.native
  def table(data: js.Array[_]): java.lang.String = js.native
  def table(data: js.Array[_], userConfig: tableLib.tableMod.TableUserConfig): java.lang.String = js.native
}

