package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object abstractMod {
  type TraverseCallback = js.Function2[
    /* reflection */ typings.typedoc.abstractMod.Reflection, 
    /* property */ typings.typedoc.abstractMod.TraverseProperty, 
    scala.Boolean | scala.Unit
  ]
}
