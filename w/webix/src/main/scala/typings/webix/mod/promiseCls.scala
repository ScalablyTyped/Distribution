package typings.webix.mod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("webix", "promise")
@js.native
open class promiseCls protected ()
  extends StObject
     with Promise[Any] {
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[Any], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ]) = this()
}
