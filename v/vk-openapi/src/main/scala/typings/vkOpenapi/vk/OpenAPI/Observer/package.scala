package typings.vkOpenapi.vk.OpenAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Observer {
  
  type ObserverEventHandler[E /* <: typings.vkOpenapi.vk.OpenAPI.Observer.ObserverEvent */] = js.Function0[scala.Unit] | (js.Function1[/* uid */ scala.Double, scala.Unit]) | (js.Function4[
    /* num */ scala.Double, 
    /* lastComment */ java.lang.String, 
    /* date */ java.lang.String, 
    /* sign */ java.lang.String, 
    scala.Unit
  ])
}
