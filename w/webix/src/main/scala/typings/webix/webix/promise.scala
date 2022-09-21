package typings.webix.webix

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait promise
  extends StObject
     with Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[Any], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      js.Promise[Any]
    ] {
  
  def all(promises: js.Array[js.Promise[Any]]): js.Promise[Any] = js.native
  
  def defer(): js.Promise[Any] = js.native
  
  def race(promises: js.Array[js.Promise[Any]]): js.Promise[Any] = js.native
  
  def reject(value: Any): js.Promise[Any] = js.native
  
  def resolve(value: Any): js.Promise[Any] = js.native
}
