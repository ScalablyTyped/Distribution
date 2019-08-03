package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.Anon_APPID
import typings.wxDashServerDashSdk.Anon_CloudPath
import typings.wxDashServerDashSdk.Anon_Data
import typings.wxDashServerDashSdk.Anon_FileID
import typings.wxDashServerDashSdk.Anon_FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wx-server-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // 云函数
  def callFunction(options: Anon_Data): js.Promise[CallFunctionSuccess] = js.native
  // 数据库 API
  def database(): Database = js.native
  def database(options: DatabaseOptions): Database = js.native
  def deleteFile(options: Anon_FileList): js.Promise[DeleteFileSuccess] = js.native
  def downloadFile(options: Anon_FileID): js.Promise[DownloadFileSuccess] = js.native
  def getTempFileURL(options: Anon_FileList): js.Promise[TetTempFileURLSuccess] = js.native
  // 云函数
  def getVoIPSign(options: GetVoIPSignOptions): js.Promise[GetVoIPSignSuccess] = js.native
  def getWXContext(): Anon_APPID = js.native
  def init(): Unit = js.native
  def init(options: InitOptions): Unit = js.native
  def updateConfig(options: InitOptions): Unit = js.native
  // 存储 API
  def uploadFile(options: Anon_CloudPath): js.Promise[UploadFileSuccess] = js.native
}

