package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait promise
  extends ScalablyTyped.runtime.Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      stdLib.Promise[js.Any]
    ] {
  def all(promises: js.Array[stdLib.Promise[_]]): stdLib.Promise[_] = js.native
  def defer(): stdLib.Promise[_] = js.native
  def race(promises: js.Array[stdLib.Promise[_]]): stdLib.Promise[_] = js.native
  def reject(value: js.Any): stdLib.Promise[_] = js.native
  def resolve(value: js.Any): stdLib.Promise[_] = js.native
}

