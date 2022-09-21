package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICDNConstructor
  extends StObject
     with Instantiable1[
      (/* options */ js.typedarray.ArrayBuffer) | (/* options */ ICDNFilePathSpec) | (/* options */ String), 
      CDN
    ] {
  
  def apply(options: String): CDN = js.native
  def apply(options: js.typedarray.ArrayBuffer): CDN = js.native
  def apply(options: ICDNFilePathSpec): CDN = js.native
}
