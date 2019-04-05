package typings
package webdriverDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/utils", JSImport.Namespace)
@js.native
object builtLibUtilsMod extends js.Object {
  var spawn: js.Function4[
    /* cmd */ java.lang.String, 
    /* args */ js.Array[java.lang.String], 
    /* stdio */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[nodeLib.childUnderscoreProcessMod.SpawnOptions], 
    nodeLib.childUnderscoreProcessMod.ChildProcess
  ] = js.native
  var spawnSync: js.Function4[
    /* cmd */ java.lang.String, 
    /* args */ js.Array[java.lang.String], 
    /* stdio */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[nodeLib.childUnderscoreProcessMod.SpawnSyncOptions], 
    nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[js.Any]
  ] = js.native
  def adb(sdkPath: java.lang.String, port: scala.Double, command: java.lang.String, timeout: scala.Double): js.Promise[java.lang.String] = js.native
  def adb(
    sdkPath: java.lang.String,
    port: scala.Double,
    command: java.lang.String,
    timeout: scala.Double,
    args: js.Array[java.lang.String]
  ): js.Promise[java.lang.String] = js.native
  def request(method: java.lang.String, port: java.lang.String, path: java.lang.String): js.Promise[java.lang.String] = js.native
  def request(method: java.lang.String, port: java.lang.String, path: java.lang.String, timeout: scala.Double): js.Promise[java.lang.String] = js.native
  def request(
    method: java.lang.String,
    port: java.lang.String,
    path: java.lang.String,
    timeout: scala.Double,
    data: js.Any
  ): js.Promise[java.lang.String] = js.native
}

