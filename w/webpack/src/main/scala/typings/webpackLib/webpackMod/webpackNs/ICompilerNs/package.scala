package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ICompilerNs {
  type Handler = js.Function2[
    /* err */ nodeLib.Error, 
    /* stats */ webpackLib.webpackMod.webpackNs.Stats, 
    scala.Unit
  ]
}
