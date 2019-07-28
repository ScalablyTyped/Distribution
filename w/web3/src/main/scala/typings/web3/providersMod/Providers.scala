package typings.web3.providersMod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Providers extends js.Object {
  var HttpProvider: Instantiable2[
    /* host */ String, 
    js.UndefOr[/* timeout */ Double], 
    typings.web3.providersMod.HttpProvider
  ]
  var IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, typings.web3.providersMod.IpcProvider]
  var WebsocketProvider: Instantiable2[
    /* host */ String, 
    js.UndefOr[/* timeout */ Double], 
    typings.web3.providersMod.WebsocketProvider
  ]
}

object Providers {
  @scala.inline
  def apply(
    HttpProvider: Instantiable2[/* host */ String, js.UndefOr[/* timeout */ Double], HttpProvider],
    IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider],
    WebsocketProvider: Instantiable2[/* host */ String, js.UndefOr[/* timeout */ Double], WebsocketProvider]
  ): Providers = {
    val __obj = js.Dynamic.literal(HttpProvider = HttpProvider, IpcProvider = IpcProvider, WebsocketProvider = WebsocketProvider)
  
    __obj.asInstanceOf[Providers]
  }
}

