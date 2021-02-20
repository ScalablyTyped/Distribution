package typings.wxServerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CrosFieldCommand = org.scalablytyped.runtime.StringDictionary[typings.wxServerSdk.mod.Command | scala.Boolean]
  
  type DBRegExp = typings.std.RegExp
  
  type PointCoordinates = js.Tuple2[scala.Double, scala.Double]
  
  type ServerDate = typings.std.Date
  
  // 云函数
  @scala.inline
  def callFunction(options: typings.wxServerSdk.anon.Data): js.Promise[typings.wxServerSdk.mod.CallFunctionSuccess] = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("callFunction")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wxServerSdk.mod.CallFunctionSuccess]]
  
  // 数据库 API
  @scala.inline
  def database(): typings.wxServerSdk.mod.Database_ = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("database")().asInstanceOf[typings.wxServerSdk.mod.Database_]
  @scala.inline
  def database(options: typings.wxServerSdk.mod.DatabaseOptions): typings.wxServerSdk.mod.Database_ = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("database")(options.asInstanceOf[js.Any]).asInstanceOf[typings.wxServerSdk.mod.Database_]
  
  @scala.inline
  def deleteFile(options: typings.wxServerSdk.anon.FileList): js.Promise[typings.wxServerSdk.mod.DeleteFileSuccess] = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wxServerSdk.mod.DeleteFileSuccess]]
  
  @scala.inline
  def downloadFile(options: typings.wxServerSdk.anon.FileID): js.Promise[typings.wxServerSdk.mod.DownloadFileSuccess] = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wxServerSdk.mod.DownloadFileSuccess]]
  
  @scala.inline
  def getTempFileURL(options: typings.wxServerSdk.anon.FileList): js.Promise[typings.wxServerSdk.mod.TetTempFileURLSuccess] = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTempFileURL")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wxServerSdk.mod.TetTempFileURLSuccess]]
  
  // 云函数
  @scala.inline
  def getVoIPSign(options: typings.wxServerSdk.mod.GetVoIPSignOptions): js.Promise[typings.wxServerSdk.mod.GetVoIPSignSuccess] = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVoIPSign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wxServerSdk.mod.GetVoIPSignSuccess]]
  
  @scala.inline
  def getWXContext(): typings.wxServerSdk.anon.APPID = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getWXContext")().asInstanceOf[typings.wxServerSdk.anon.APPID]
  
  @scala.inline
  def init(): scala.Unit = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[scala.Unit]
  @scala.inline
  def init(options: typings.wxServerSdk.mod.InitOptions): scala.Unit = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def updateConfig(options: typings.wxServerSdk.mod.InitOptions): scala.Unit = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateConfig")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  // 存储 API
  @scala.inline
  def uploadFile(options: typings.wxServerSdk.anon.CloudPath): js.Promise[typings.wxServerSdk.mod.UploadFileSuccess] = typings.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wxServerSdk.mod.UploadFileSuccess]]
}
