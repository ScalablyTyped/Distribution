package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Providers extends js.Object {
  var HttpProvider: org.scalablytyped.runtime.Instantiable2[
    /* host */ java.lang.String, 
    /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
    HttpProvider
  ]
  var IpcProvider: org.scalablytyped.runtime.Instantiable2[/* path */ java.lang.String, /* net */ js.Any, IpcProvider]
  var WebsocketProvider: org.scalablytyped.runtime.Instantiable2[
    /* host */ java.lang.String, 
    /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
    WebsocketProvider
  ]
}

object Providers {
  @scala.inline
  def apply(
    HttpProvider: org.scalablytyped.runtime.Instantiable2[
      /* host */ java.lang.String, 
      /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
      HttpProvider
    ],
    IpcProvider: org.scalablytyped.runtime.Instantiable2[/* path */ java.lang.String, /* net */ js.Any, IpcProvider],
    WebsocketProvider: org.scalablytyped.runtime.Instantiable2[
      /* host */ java.lang.String, 
      /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
      WebsocketProvider
    ]
  ): Providers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HttpProvider")(HttpProvider)
    __obj.updateDynamic("IpcProvider")(IpcProvider)
    __obj.updateDynamic("WebsocketProvider")(WebsocketProvider)
    __obj.asInstanceOf[Providers]
  }
}

