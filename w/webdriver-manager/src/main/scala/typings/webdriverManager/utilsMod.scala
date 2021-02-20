package typings.webdriverManager

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.childProcessMod.SpawnSyncReturns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("webdriver-manager/built/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver-manager/built/lib/utils", "adb")
  @js.native
  def adb(sdkPath: String, port: Double, command: String, timeout: Double): js.Promise[String] = js.native
  @JSImport("webdriver-manager/built/lib/utils", "adb")
  @js.native
  def adb(sdkPath: String, port: Double, command: String, timeout: Double, args: js.Array[String]): js.Promise[String] = js.native
  
  @JSImport("webdriver-manager/built/lib/utils", "request")
  @js.native
  def request(method: String, port: String, path: String): js.Promise[String] = js.native
  @JSImport("webdriver-manager/built/lib/utils", "request")
  @js.native
  def request(method: String, port: String, path: String, timeout: js.UndefOr[scala.Nothing], data: js.Any): js.Promise[String] = js.native
  @JSImport("webdriver-manager/built/lib/utils", "request")
  @js.native
  def request(method: String, port: String, path: String, timeout: Double): js.Promise[String] = js.native
  @JSImport("webdriver-manager/built/lib/utils", "request")
  @js.native
  def request(method: String, port: String, path: String, timeout: Double, data: js.Any): js.Promise[String] = js.native
  
  @JSImport("webdriver-manager/built/lib/utils", "spawn")
  @js.native
  def spawn: js.Function4[
    /* cmd */ String, 
    /* args */ js.Array[String], 
    /* stdio */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[SpawnOptions], 
    ChildProcess
  ] = js.native
  
  @JSImport("webdriver-manager/built/lib/utils", "spawnSync")
  @js.native
  def spawnSync: js.Function4[
    /* cmd */ String, 
    /* args */ js.Array[String], 
    /* stdio */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[SpawnSyncOptions], 
    SpawnSyncReturns[js.Any]
  ] = js.native
  @scala.inline
  def spawnSync_=(
    x: js.Function4[
      /* cmd */ String, 
      /* args */ js.Array[String], 
      /* stdio */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[SpawnSyncOptions], 
      SpawnSyncReturns[js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spawnSync")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def spawn_=(
    x: js.Function4[
      /* cmd */ String, 
      /* args */ js.Array[String], 
      /* stdio */ js.UndefOr[js.Any], 
      /* opts */ js.UndefOr[SpawnOptions], 
      ChildProcess
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spawn")(x.asInstanceOf[js.Any])
}
