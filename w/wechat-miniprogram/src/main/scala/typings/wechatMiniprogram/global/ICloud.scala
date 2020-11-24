package typings.wechatMiniprogram.global

import typings.std.ArrayBuffer
import typings.wechatMiniprogram.ICloud.ICDNFilePathSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ICloud")
@js.native
object ICloud extends js.Object {
  
  // === end ===
  // === API: CDN ===
  @js.native
  abstract class CDN protected ()
    extends typings.wechatMiniprogram.ICloud.CDN {
    def this(target: String) = this()
    def this(target: ArrayBuffer) = this()
    def this(target: ICDNFilePathSpec) = this()
  }
  
  // === end ===
  // === API: CloudID ===
  @js.native
  abstract class CloudID protected ()
    extends typings.wechatMiniprogram.ICloud.CloudID {
    def this(cloudID: String) = this()
  }
}
