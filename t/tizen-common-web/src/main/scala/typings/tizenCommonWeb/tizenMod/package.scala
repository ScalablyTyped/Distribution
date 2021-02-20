package typings.tizenCommonWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tizenMod {
  
  type BundleItemCallback = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* type */ typings.tizenCommonWeb.tizenMod.BundleValueType, 
    scala.Unit
  ]
  
  type ByteStream = js.Array[typings.std.Uint8Array]
  
  type ErrorCallback = js.Function1[/* error */ typings.tizenCommonWeb.tizenMod.WebAPIError, scala.Unit]
  
  type SuccessCallback = js.Function0[scala.Unit]
}
