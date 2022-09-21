package typings.webpack

import typings.std.Record
import typings.webpack.NodeJS.Module
import typings.webpack.anon.Eager
import typings.webpack.webpack.ExportsInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("__non_webpack_require__")
  @js.native
  def nonWebpackRequire: js.Function1[/* id */ Any, Any] = js.native
  
  inline def nonWebpackRequire_=(x: js.Function1[/* id */ Any, Any]): Unit = js.Dynamic.global.updateDynamic("__non_webpack_require__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__resourceQuery")
  @js.native
  val resourceQuery: String = js.native
  
  @JSGlobal("__system_context__")
  @js.native
  val systemContext: js.Object = js.native
  
  @JSGlobal("__webpack_base_uri__")
  @js.native
  def webpackBaseUri: String = js.native
  
  inline def webpackBaseUri_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_base_uri__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_chunk_load__")
  @js.native
  def webpackChunkLoad: js.Function1[/* chunkId */ String | Double, js.Promise[Unit]] = js.native
  
  inline def webpackChunkLoad_=(x: js.Function1[/* chunkId */ String | Double, js.Promise[Unit]]): Unit = js.Dynamic.global.updateDynamic("__webpack_chunk_load__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_chunkname__")
  @js.native
  val webpackChunkname: String = js.native
  
  @JSGlobal("__webpack_exports_info__")
  @js.native
  def webpackExportsInfo: ExportsInfo = js.native
  
  inline def webpackExportsInfo_=(x: ExportsInfo): Unit = js.Dynamic.global.updateDynamic("__webpack_exports_info__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_get_script_filename__")
  @js.native
  def webpackGetScriptFilename: js.Function1[/* chunkId */ String | Double, String] = js.native
  
  inline def webpackGetScriptFilename_=(x: js.Function1[/* chunkId */ String | Double, String]): Unit = js.Dynamic.global.updateDynamic("__webpack_get_script_filename__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_hash__")
  @js.native
  val webpackHash: String = js.native
  
  @JSGlobal("__webpack_init_sharing__")
  @js.native
  def webpackInitSharing: js.Function1[/* scope */ String, js.Promise[Unit]] = js.native
  
  inline def webpackInitSharing_=(x: js.Function1[/* scope */ String, js.Promise[Unit]]): Unit = js.Dynamic.global.updateDynamic("__webpack_init_sharing__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_is_included__")
  @js.native
  def webpackIsIncluded: js.Function1[/* request */ String, Boolean] = js.native
  
  inline def webpackIsIncluded_=(x: js.Function1[/* request */ String, Boolean]): Unit = js.Dynamic.global.updateDynamic("__webpack_is_included__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_modules__")
  @js.native
  val webpackModules: Record[String | Double, Module] = js.native
  
  @JSGlobal("__webpack_nonce__")
  @js.native
  def webpackNonce: String = js.native
  
  inline def webpackNonce_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_nonce__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_public_path__")
  @js.native
  def webpackPublicPath: String = js.native
  
  inline def webpackPublicPath_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_public_path__")(x.asInstanceOf[js.Any])
  
  inline def webpackRequire(id: String): Any = js.Dynamic.global.applyDynamic("__webpack_require__")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def webpackRequire(id: Double): Any = js.Dynamic.global.applyDynamic("__webpack_require__")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSGlobal("__webpack_runtime_id__")
  @js.native
  def webpackRuntimeId: String = js.native
  
  inline def webpackRuntimeId_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_runtime_id__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__webpack_share_scopes__")
  @js.native
  val webpackShareScopes: Record[String, Record[String, Eager]] = js.native
}
