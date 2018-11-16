package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Providers extends js.Object {
  var HttpProvider: ScalablyTyped.runtime.Instantiable2[
    /* host */ java.lang.String, 
    /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
    HttpProvider
  ]
  var IpcProvider: ScalablyTyped.runtime.Instantiable2[/* path */ java.lang.String, /* net */ js.Any, IpcProvider]
  var WebsocketProvider: ScalablyTyped.runtime.Instantiable2[
    /* host */ java.lang.String, 
    /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
    WebsocketProvider
  ]
}

