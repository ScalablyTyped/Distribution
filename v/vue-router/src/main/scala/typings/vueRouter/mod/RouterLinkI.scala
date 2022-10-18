package typings.vueRouter.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vueRouter.anon.IsExactActive
import typings.vueRouter.anon.Slots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterLinkI
  extends StObject
     with Instantiable0[Slots] {
  
  /**
    * Access to `useLink()` without depending on using vue-router
    *
    * @internal
    */
  def useLink(props: UseLinkOptions): IsExactActive = js.native
  /**
    * Access to `useLink()` without depending on using vue-router
    *
    * @internal
    */
  @JSName("useLink")
  var useLink_Original: js.Function1[/* props */ UseLinkOptions, IsExactActive] = js.native
}
