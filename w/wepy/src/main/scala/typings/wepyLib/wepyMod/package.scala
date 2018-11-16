package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wepyMod {
  type App = ScalablyTyped.runtime.Instantiable0[wepyLib.appMod.default]
  type Component = ScalablyTyped.runtime.Instantiable0[wepyLib.componentMod.default]
  type Event = ScalablyTyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* source */ js.Any, 
    /* type */ js.Any, 
    wepyLib.eventMod.default
  ]
  type Mixin = ScalablyTyped.runtime.Instantiable0[wepyLib.mixinMod.default]
  type Page = ScalablyTyped.runtime.Instantiable0[wepyLib.pageMod.default]
}
