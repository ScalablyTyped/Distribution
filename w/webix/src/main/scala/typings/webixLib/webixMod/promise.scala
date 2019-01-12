package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait promise
  extends org.scalablytyped.runtime.Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      js.Promise[js.Any]
    ] {
  def all(promises: js.Array[js.Promise[_]]): js.Promise[_] = js.native
  def defer(): js.Promise[_] = js.native
  def race(promises: js.Array[js.Promise[_]]): js.Promise[_] = js.native
  def reject(value: js.Any): js.Promise[_] = js.native
  def resolve(value: js.Any): js.Promise[_] = js.native
}

