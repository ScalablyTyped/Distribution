package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wepyMod {
  import org.scalablytyped.runtime.Instantiable0
  import org.scalablytyped.runtime.Instantiable3
  import typings.wepy.appMod.default

  type App = Instantiable0[default]
  type Component = Instantiable0[typings.wepy.componentMod.default]
  type Event = Instantiable3[
    /* name */ String, 
    /* source */ js.Any, 
    /* type */ js.Any, 
    typings.wepy.eventMod.default
  ]
  type Mixin = Instantiable0[typings.wepy.mixinMod.default]
  type Page = Instantiable0[typings.wepy.pageMod.default]
}
