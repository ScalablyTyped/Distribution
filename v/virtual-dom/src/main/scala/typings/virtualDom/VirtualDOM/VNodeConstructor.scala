package typings.virtualDom.VirtualDOM

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeConstructor
  extends Instantiable3[
      /* tagName */ String, 
      /* properties */ VProperties, 
      /* children */ js.Array[VTree], 
      VNode
    ]
     with Instantiable4[
      /* tagName */ String, 
      /* properties */ VProperties, 
      /* children */ js.Array[VTree], 
      /* key */ String, 
      VNode
    ]
     with Instantiable5[
      /* tagName */ String, 
      /* properties */ VProperties, 
      /* children */ js.Array[VTree], 
      js.UndefOr[/* key */ String], 
      /* namespace */ String, 
      VNode
    ]

