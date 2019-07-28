package typings.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.wepy.appMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wepyMod {
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
