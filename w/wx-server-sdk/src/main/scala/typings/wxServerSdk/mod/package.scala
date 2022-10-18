package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.wxServerSdk.anon.APPID
import typings.wxServerSdk.anon.CloudPath
import typings.wxServerSdk.anon.FileIDString
import typings.wxServerSdk.anon.FileList
import typings.wxServerSdk.anon.Name
import typings.wxServerSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// 云函数
inline def callFunction(options: Name): js.Promise[CallFunctionSuccess] = ^.asInstanceOf[js.Dynamic].applyDynamic("callFunction")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CallFunctionSuccess]]

// 数据库 API
inline def database(): Database_ = ^.asInstanceOf[js.Dynamic].applyDynamic("database")().asInstanceOf[Database_]
inline def database(options: DatabaseOptions): Database_ = ^.asInstanceOf[js.Dynamic].applyDynamic("database")(options.asInstanceOf[js.Any]).asInstanceOf[Database_]

inline def deleteFile(options: FileList): js.Promise[DeleteFileSuccess] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileSuccess]]

inline def downloadFile(options: FileIDString): js.Promise[DownloadFileSuccess] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DownloadFileSuccess]]

inline def getTempFileURL(options: FileList): js.Promise[TetTempFileURLSuccess] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTempFileURL")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TetTempFileURLSuccess]]

// 云函数
inline def getVoIPSign(options: GetVoIPSignOptions): js.Promise[GetVoIPSignSuccess] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVoIPSign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVoIPSignSuccess]]

inline def getWXContext(): APPID = ^.asInstanceOf[js.Dynamic].applyDynamic("getWXContext")().asInstanceOf[APPID]

inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def updateConfig(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

// 存储 API
inline def uploadFile(options: CloudPath): js.Promise[UploadFileSuccess] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UploadFileSuccess]]

type CrosFieldCommand = StringDictionary[Command | Boolean]

type DBRegExp = js.RegExp

type PointCoordinates = js.Tuple2[Double, Double]

type ServerDate = js.Date
