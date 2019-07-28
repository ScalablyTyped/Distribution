package typings.stylus.stylusMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StylusNs {
  type Dictionary[T] = StringDictionary[T]
  type Middleware = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* repeated */ js.Any, js.Any], 
    Unit
  ]
  type RenderCallback = js.Function3[/* err */ Error, /* css */ String, /* js */ String, Unit]
}
