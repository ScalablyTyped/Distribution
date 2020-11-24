package typings.web3Core.mod

import org.scalablytyped.runtime.Instantiable2
import typings.web3CoreHelpers.mod.HttpProviderOptions
import typings.web3CoreHelpers.mod.WebsocketProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Providers extends js.Object {
  
  var HttpProvider: Instantiable2[
    /* host */ String, 
    /* options */ js.UndefOr[HttpProviderOptions], 
    typings.web3Core.mod.HttpProvider
  ] = js.native
  
  var IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, typings.web3Core.mod.IpcProvider] = js.native
  
  var WebsocketProvider: Instantiable2[
    /* host */ String, 
    /* options */ js.UndefOr[WebsocketProviderOptions], 
    typings.web3Core.mod.WebsocketProvider
  ] = js.native
}
object Providers {
  
  @scala.inline
  def apply(
    HttpProvider: Instantiable2[/* host */ String, /* options */ js.UndefOr[HttpProviderOptions], HttpProvider],
    IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider],
    WebsocketProvider: Instantiable2[
      /* host */ String, 
      /* options */ js.UndefOr[WebsocketProviderOptions], 
      WebsocketProvider
    ]
  ): Providers = {
    val __obj = js.Dynamic.literal(HttpProvider = HttpProvider.asInstanceOf[js.Any], IpcProvider = IpcProvider.asInstanceOf[js.Any], WebsocketProvider = WebsocketProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Providers]
  }
  
  @scala.inline
  implicit class ProvidersOps[Self <: Providers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpProvider(
      value: Instantiable2[/* host */ String, /* options */ js.UndefOr[HttpProviderOptions], HttpProvider]
    ): Self = this.set("HttpProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpcProvider(value: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider]): Self = this.set("IpcProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocketProvider(
      value: Instantiable2[
          /* host */ String, 
          /* options */ js.UndefOr[WebsocketProviderOptions], 
          WebsocketProvider
        ]
    ): Self = this.set("WebsocketProvider", value.asInstanceOf[js.Any])
  }
}
