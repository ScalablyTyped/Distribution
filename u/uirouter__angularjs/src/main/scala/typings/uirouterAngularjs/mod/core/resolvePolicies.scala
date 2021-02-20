package typings.uirouterAngularjs.mod.core

import typings.uirouterCore.anon.EAGER
import typings.uirouterCore.anon.NOWAIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolvePolicies {
  
  @JSImport("@uirouter/angularjs", "core.resolvePolicies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/angularjs", "core.resolvePolicies.async")
  @js.native
  def async: NOWAIT = js.native
  @scala.inline
  def async_=(x: NOWAIT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
  
  @JSImport("@uirouter/angularjs", "core.resolvePolicies.when")
  @js.native
  def when: EAGER = js.native
  @scala.inline
  def when_=(x: EAGER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("when")(x.asInstanceOf[js.Any])
}
