package typings.webdriverManager

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.childProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def adb(sdkPath: String, port: Double, command: String, timeout: Double): js.Promise[String] = js.native
  def adb(sdkPath: String, port: Double, command: String, timeout: Double, args: js.Array[String]): js.Promise[String] = js.native
  
  def request(method: String, port: String, path: String): js.Promise[String] = js.native
  def request(method: String, port: String, path: String, timeout: js.UndefOr[scala.Nothing], data: js.Any): js.Promise[String] = js.native
  def request(method: String, port: String, path: String, timeout: Double): js.Promise[String] = js.native
  def request(method: String, port: String, path: String, timeout: Double, data: js.Any): js.Promise[String] = js.native
  
  var spawn: js.Function4[
    /* cmd */ String, 
    /* args */ js.Array[String], 
    /* stdio */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[SpawnOptions], 
    ChildProcess
  ] = js.native
  
  var spawnSync: js.Function4[
    /* cmd */ String, 
    /* args */ js.Array[String], 
    /* stdio */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[SpawnSyncOptions], 
    SpawnSyncReturns[js.Any]
  ] = js.native
}
