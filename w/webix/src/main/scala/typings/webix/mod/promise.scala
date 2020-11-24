package typings.webix.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait promise
  extends Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      js.Promise[js.Any]
    ] {
  
  def all(promises: js.Array[js.Promise[_]]): js.Promise[_] = js.native
  
  def defer(): js.Promise[_] = js.native
  
  def race(promises: js.Array[js.Promise[_]]): js.Promise[_] = js.native
  
  def reject(value: js.Any): js.Promise[_] = js.native
  
  def resolve(value: js.Any): js.Promise[_] = js.native
}
@JSImport("webix", "promise")
@js.native
object promise
  extends TopLevel[typings.webix.webix.promise]
