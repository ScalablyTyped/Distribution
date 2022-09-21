package typings.web3Core.mod

import org.scalablytyped.runtime.Instantiable2
import typings.web3CoreHelpers.mod.HttpProviderOptions
import typings.web3CoreHelpers.mod.WebsocketProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Providers extends StObject {
  
  var HttpProvider: Instantiable2[
    /* host */ String, 
    /* options */ js.UndefOr[HttpProviderOptions], 
    typings.web3Core.mod.HttpProvider
  ]
  
  var IpcProvider: Instantiable2[/* path */ String, /* net */ Any, typings.web3Core.mod.IpcProvider]
  
  var WebsocketProvider: Instantiable2[
    /* host */ String, 
    /* options */ js.UndefOr[WebsocketProviderOptions], 
    typings.web3Core.mod.WebsocketProvider
  ]
}
object Providers {
  
  inline def apply(
    HttpProvider: Instantiable2[/* host */ String, /* options */ js.UndefOr[HttpProviderOptions], HttpProvider],
    IpcProvider: Instantiable2[/* path */ String, /* net */ Any, IpcProvider],
    WebsocketProvider: Instantiable2[
      /* host */ String, 
      /* options */ js.UndefOr[WebsocketProviderOptions], 
      WebsocketProvider
    ]
  ): Providers = {
    val __obj = js.Dynamic.literal(HttpProvider = HttpProvider.asInstanceOf[js.Any], IpcProvider = IpcProvider.asInstanceOf[js.Any], WebsocketProvider = WebsocketProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Providers]
  }
  
  extension [Self <: Providers](x: Self) {
    
    inline def setHttpProvider(
      value: Instantiable2[/* host */ String, /* options */ js.UndefOr[HttpProviderOptions], HttpProvider]
    ): Self = StObject.set(x, "HttpProvider", value.asInstanceOf[js.Any])
    
    inline def setIpcProvider(value: Instantiable2[/* path */ String, /* net */ Any, IpcProvider]): Self = StObject.set(x, "IpcProvider", value.asInstanceOf[js.Any])
    
    inline def setWebsocketProvider(
      value: Instantiable2[
          /* host */ String, 
          /* options */ js.UndefOr[WebsocketProviderOptions], 
          WebsocketProvider
        ]
    ): Self = StObject.set(x, "WebsocketProvider", value.asInstanceOf[js.Any])
  }
}
